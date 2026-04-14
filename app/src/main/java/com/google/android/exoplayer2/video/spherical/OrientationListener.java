package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.Display;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class OrientationListener implements SensorEventListener {
    private final float[] angles;
    private final float[] deviceOrientationMatrix4x4;
    private final Display display;
    private final Listener[] listeners;
    private final float[] recenterMatrix4x4;
    private boolean recenterMatrixComputed;
    private final float[] tempMatrix4x4;

    public interface Listener {
        void onOrientationChange(float[] fArr, float f);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
    }

    private float extractRoll(float[] fArr) {
    }

    private void notifyListeners(float[] fArr, float f) {
    }

    private void recenter(float[] fArr) {
    }

    private void rotateAroundZ(float[] fArr, int i) {
    }

    private static void rotateYtoSky(float[] fArr) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }
}
