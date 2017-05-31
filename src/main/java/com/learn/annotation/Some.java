package com.learn.annotation;

@Comment("Some")
public class Some {
    private String string;

    Some() {
        this.string = "";
    }

    public void setString(String string){
        this.string = string;
    }

    public String getString() {
        return this.string;
    }
}
