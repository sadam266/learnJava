package com.learn.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by adam.rabczuk on 2017-07-21.
 */
public class BeanTest {

    @Test
    public void beanTest() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanContextTest.class);
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.setMessage("DUPA");
        assertTrue(helloWorld.getMessage().equals("DUPA"));
    }
}
