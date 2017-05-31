package com.learn.designpatterns.builder;

public class OpticalZoomCameraBuilder extends CameraBuilder {
    @Override
    public void buildOpticalZoom() {
        this.camera.setOpticalZoom("12x");
    }

    @Override
    public void buildDigitalZoom() {
        this.camera.setDigitalZoom("None");
    }
}
