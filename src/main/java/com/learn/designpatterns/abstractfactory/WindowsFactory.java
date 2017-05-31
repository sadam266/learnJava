package com.learn.designpatterns.abstractfactory;

public class WindowsFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        System.out.println("Create Windows Button");
        return new WindowsButton();
    }
}
