package com.learn.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertFalse;

public class PrototypeTest {

    @Test
    public void testPrototypeBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
        Prototype prototype1 = context.getBean(Prototype.class);
        prototype1.setText("prototype1");
        Prototype prototype2 = context.getBean(Prototype.class);
        prototype2.setText("prototype2");
        assertFalse(prototype1.getText().equals(prototype2.getText()));
    }
}
