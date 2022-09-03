package com.jaishna.soapwrapper.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {

        @Bean
        public Jaxb2Marshaller marshaller(){
            Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
            jaxb2Marshaller.setPackagesToScan("com.jaishna.soapwrapper");
            return jaxb2Marshaller;
        }

}
