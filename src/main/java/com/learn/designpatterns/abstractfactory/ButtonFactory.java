package com.learn.designpatterns.abstractfactory;

abstract class ButtonFactory {

    @SuppressWarnings("SameParameterValue")
    static ButtonFactory getFactory(String os) throws Exception {
        switch (os) {
            case "Windows":
                return new WindowsFactory();
            case "Mac":
                return new MacFactory();
            default:
                throw new Exception("Invalid OS");
        }
    }

    public abstract Button createButton();
}
