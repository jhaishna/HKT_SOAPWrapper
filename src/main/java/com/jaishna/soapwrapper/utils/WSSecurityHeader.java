package com.jaishna.soapwrapper.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.transport.TransportConstants;

import javax.xml.soap.*;

import javax.xml.soap.SOAPException;

import javax.xml.soap.SOAPHeader;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
public class WSSecurityHeader implements WebServiceMessageCallback {
    private static final Logger LOGGER = LoggerFactory.getLogger(WSSecurityHeader.class);

    @Value("${soap.auth.username}")
    private String userName;

    @Value("${soap.auth.password}")
    private String password;

    @Override
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
        LOGGER.info("doWithMessage..."+((SoapMessage)message).toString());

        SaajSoapMessage saajSoapMessage = (SaajSoapMessage)message;
       /* MimeHeaders mimeHeaders = soapMessage.getSaajMessage().getMimeHeaders();
        mimeHeaders.setHeader(TransportConstants.HEADER_CONTENT_TYPE, "text/xml; charset=utf-8");
        mimeHeaders.setHeader("Accept", "text/xml; charset=utf-8");*/
       try {
            SOAPHeader headers = saajSoapMessage.getSaajMessage().getSOAPHeader();
            headers.setAttribute("Accept", "text/xml; charset=utf-8");
            headers.setAttribute(TransportConstants.HEADER_CONTENT_TYPE, "text/xml; charset=utf-8");
            SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();

           SOAPPart soapPart = soapMessage.getSOAPPart();

           SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

           SOAPHeader soapHeader = soapEnvelope.getHeader();

           Name headerElementName = soapEnvelope.createName(
                   "Security",
                   "wsse",
                   "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
           );
           SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(headerElementName);

           SOAPElement usernameTokenSOAPElement = soapHeaderElement.addChildElement("UsernameToken", "wsse");

           SOAPElement userNameSOAPElement = usernameTokenSOAPElement.addChildElement("Username", "wsse");
           LOGGER.info(userName);
           userNameSOAPElement.addTextNode(userName);

           SOAPElement passwordSOAPElement = usernameTokenSOAPElement.addChildElement("Password", "wsse");
           Name type = soapEnvelope.createName("type");
           passwordSOAPElement.addAttribute(type,"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

           passwordSOAPElement.addTextNode(password);

           soapMessage.saveChanges();
        } catch (SOAPException e) {
            e.printStackTrace();
           LOGGER.info("Exception occured while preparing the security Headers::"+e);
        }


        saajSoapMessage.writeTo(System.out);
        //SoapEnvelope soapEnv = soapMessage.getEnvelope();
       /* try {
            soapHeader = soapEnv.getHeader();
            if (soapHeader == null) {
                try {
                    soapHeader = soapEnv.addHeader();
                } catch (SOAPException e) {
                    e.printStackTrace();
                }
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }*/


        //if no header, add one

       /* try {
            JAXBContext context = JAXBContext.newInstance(Authentication.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(authentication, soapHeader.getResult());

        } catch (JAXBException e) {
            throw new IOException("error while marshalling authentication.");
        }*/
    }
}