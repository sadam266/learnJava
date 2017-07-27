package com.learn.designpatterns.abstractfactory;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void testCreateWindowsButton() throws Exception {
        ButtonFactory factory = ButtonFactory.getFactory("Windows");
        Button windowsButton = factory.createButton();
        windowsButton.paint();
    }
}
