package com.learn.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void testSingletonBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
        Singleton singleton1 = context.getBean(Singleton.class);
        singleton1.setText("singleton1");
        Singleton singleton2 = context.getBean(Singleton.class);
//        singleton2.setText("singleton2");
        assertTrue(singleton1.getText().equals(singleton2.getText()));
    }
}
