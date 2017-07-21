package com.learn.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
