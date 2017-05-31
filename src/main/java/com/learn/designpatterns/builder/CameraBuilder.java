package com.learn.designpatterns.builder;

public abstract class CameraBuilder {

    Camera camera;

    Camera getCamera() {
        return camera;
    }

    void createNewCamera() {
        this.camera = new Camera();
    }

    public abstract void buildOpticalZoom();
    public abstract void buildDigitalZoom();
}
