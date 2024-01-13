package com.kyncu.beersystem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class FeignClientConfig {
    public BasicAuthenticationInterceptor basicAuthenticationInterceptor(@Value("${kyncu.brewery.inventory-user}") String inventoryUser,
                                                                         @Value("${kyncu.brewery.inventory-password}") String inventoryPassword) {
        return new BasicAuthenticationInterceptor(inventoryUser, inventoryPassword);
    }
}
