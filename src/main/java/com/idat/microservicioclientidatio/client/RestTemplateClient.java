package com.idat.microservicioclientidatio.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateClient {
    @Bean("clientRest")
    public RestTemplate registrarTemplate(){
            return new RestTemplate();
    }
}
