package com.learn.designpatterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class CameraMakerTest {

    @Test
    public void testOpticalCamera() throws Exception {
        CameraMaker maker = new CameraMaker();
        CameraBuilder builder = new OpticalZoomCameraBuilder();
        maker.setCameraBuilder(builder);
        maker.constructCamera();
        Camera camera = maker.getCamera();

        Assert.assertTrue(camera.getOpticalZoom().equals("12x"));
    }

}