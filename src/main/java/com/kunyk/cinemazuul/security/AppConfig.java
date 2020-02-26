package com.kunyk.cinemazuul.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public JwtConfig jwtConfig() {
        return new JwtConfig();
    }
}
