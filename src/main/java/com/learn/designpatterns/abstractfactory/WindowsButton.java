package com.learn.designpatterns.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint Windows Button");
    }
}
