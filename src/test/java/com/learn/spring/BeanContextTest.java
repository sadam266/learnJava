package com.learn.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanContextTest {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
