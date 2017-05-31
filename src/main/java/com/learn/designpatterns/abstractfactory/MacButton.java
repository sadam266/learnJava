package com.learn.designpatterns.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint Mac Button");
    }
}
