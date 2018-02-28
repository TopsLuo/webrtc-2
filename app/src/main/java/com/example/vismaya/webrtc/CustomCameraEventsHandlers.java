package com.example.vismaya.webrtc;

import android.util.Log;

import org.webrtc.CameraVideoCapturer;

import static android.content.ContentValues.TAG;

/**
 * Created by Vismaya on 16-Feb-18.
 */

public class CustomCameraEventsHandlers implements CameraVideoCapturer.CameraEventsHandler{

    private String logTag = this.getClass().getCanonicalName();


    @Override
    public void onCameraError(String s) {
        Log.d(logTag, "onCameraError() called with: s = [" + s + "]");
    }

    // Called when camera is disconnected.
    @Override
    public void onCameraDisconnected() {
        Log.d(TAG, "CameraEventsHandler.onCameraDisconnected");
    }

    @Override
    public void onCameraFreezed(String s) {
        Log.d(logTag, "onCameraFreezed() called with: s = [" + s + "]");
    }

    @Override
    public void onCameraOpening(String cameraName) {
        Log.d(logTag, String.format("CameraEventsHandler.onCameraOpening: cameraName=%s", cameraName));
    }

    @Override
    public void onFirstFrameAvailable() {
        Log.d(logTag, "onFirstFrameAvailable() called");
    }

    @Override
    public void onCameraClosed() {
        Log.d(logTag, "onCameraClosed() called");
    }

}
