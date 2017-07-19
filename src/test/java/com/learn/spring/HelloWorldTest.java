package com.learn.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testHelloWorldXMLBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        assertTrue(helloWorld.getMessage().equals("DUPA"));
    }

    @Test
    public void testHelloWorldBean() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldContextTest.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("DUPA");
        assertTrue(helloWorld.getMessage().equals("DUPA"));
    }

}