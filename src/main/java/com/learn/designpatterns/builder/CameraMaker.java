package com.learn.designpatterns.builder;

class CameraMaker {

    private CameraBuilder cameraBuilder;

    void setCameraBuilder(CameraBuilder cameraBuilder) {
        this.cameraBuilder = cameraBuilder;
    }

    Camera getCamera() {
        return this.cameraBuilder.getCamera();
    }

    void constructCamera() {
        this.cameraBuilder.createNewCamera();
        this.cameraBuilder.buildOpticalZoom();
        this.cameraBuilder.buildDigitalZoom();
    }
}
