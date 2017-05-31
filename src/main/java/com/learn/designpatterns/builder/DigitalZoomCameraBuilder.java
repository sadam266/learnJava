package com.learn.designpatterns.builder;

public class DigitalZoomCameraBuilder extends CameraBuilder {
    @Override
    public void buildOpticalZoom() {
        this.camera.setOpticalZoom("None");
    }

    @Override
    public void buildDigitalZoom() {
        this.camera.setDigitalZoom("50x");
    }
}
