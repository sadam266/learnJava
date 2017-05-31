package com.learn.designpatterns.factory;

public class PLN implements Currency {

    @Override
    public String getCurrency() {
        return "Złoty";
    }

    @Override
    public String getSymbol() {
        return "PLN";
    }
}
