package com.learn.designpatterns.builder;

public class Camera {

    private String opticalZoom;
    private String digitalZoom;


    void setOpticalZoom(String opticalZoom) {
        this.opticalZoom = opticalZoom;
    }

    void setDigitalZoom(String digitalZoom) {
        this.digitalZoom = digitalZoom;
    }

    String getOpticalZoom() {
        return opticalZoom;
    }

    public String getDigitalZoom() {
        return digitalZoom;
    }
}
