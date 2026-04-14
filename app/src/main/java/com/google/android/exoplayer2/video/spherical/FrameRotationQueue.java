package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.TimedValueQueue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class FrameRotationQueue {
    private final float[] recenterMatrix;
    private boolean recenterMatrixComputed;
    private final float[] rotationMatrix;
    private final TimedValueQueue<float[]> rotations;

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
    }

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
    }

    public boolean pollRotationMatrix(float[] fArr, long j) {
    }

    public void reset() {
    }

    public void setRotation(long j, float[] fArr) {
    }
}
