package com.example.sonartest;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public SomeService someService() {
        return new SomeService();
    }
}
