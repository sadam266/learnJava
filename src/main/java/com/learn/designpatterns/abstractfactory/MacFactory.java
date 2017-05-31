package com.learn.designpatterns.abstractfactory;

public class MacFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        System.out.println("Create Mac Button");
        return new MacButton();
    }
}
