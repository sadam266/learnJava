package com.learn.designpatterns.factory;

import org.jetbrains.annotations.NotNull;

public class CurrencyFactory {

    @NotNull
    public static Currency getCurrency(String country) throws Exception {
        switch (country) {
            case "Europe":
                return new EUR();
            case "Poland":
                return new PLN();
            default:
                throw new Exception("Invalid country");
        }
    }
}
