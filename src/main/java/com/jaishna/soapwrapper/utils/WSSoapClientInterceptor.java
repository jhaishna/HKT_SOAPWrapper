package com.jaishna.soapwrapper.utils;

import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;
import org.springframework.ws.transport.http.HttpUrlConnection;

import java.io.IOException;
import java.util.Map;

public class WSSoapClientInterceptor implements ClientInterceptor {

        public boolean handleFault(MessageContext messageContext)
                throws WebServiceClientException {
            return true;
        }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

    }

    public boolean handleRequest(MessageContext messageContext)
                throws WebServiceClientException {
            TransportContext context = TransportContextHolder.getTransportContext();
        org.springframework.ws.transport.http.HttpUrlConnection connection =(org.springframework.ws.transport.http.HttpUrlConnection) context.getConnection();
            try {
                connection.addRequestHeader("name", "suman");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return true;
        }

        public boolean handleResponse(MessageContext messageContext)
                throws WebServiceClientException {
            return true;
        }

    /**
     * Adds all headers from the {@code headers} to the {@code connection}.
     */
    private void addHeadersToConnection(HttpUrlConnection connection, Map<String, String> headers){
        headers.forEach((name, value) -> {
            try {
                connection.addRequestHeader(name, value);
            } catch (IOException e) {
                e.printStackTrace(); // or whatever you want
            }
        });
    }

    }
