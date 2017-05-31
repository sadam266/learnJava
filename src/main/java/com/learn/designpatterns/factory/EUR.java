package com.learn.designpatterns.factory;

public class EUR implements Currency {

    @Override
    public String getCurrency() {
        return "Euro";
    }

    @Override
    public String getSymbol() {
        return "EUR";
    }
}
