package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import p000.ddbqdqbpbdazxirdipJCyqXclllll1l;
import p000.dpddpbpwPsgYeCcGllll1l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AmbientLightManager implements SensorEventListener {
    private static final float BRIGHT_ENOUGH_LUX = 450.0f;
    private static final float TOO_DARK_LUX = 45.0f;
    private ddbqdqbpbdazxirdipJCyqXclllll1l cameraManager;
    private dpddpbpwPsgYeCcGllll1l cameraSettings;
    private Context context;
    private Handler handler;
    private Sensor lightSensor;

    public AmbientLightManager(Context context, ddbqdqbpbdazxirdipJCyqXclllll1l ddbqdqbpbdazxirdipjcyqxclllll1l, dpddpbpwPsgYeCcGllll1l dpddpbpwpsgyeccgllll1l) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AmbientLightManager ambientLightManager, boolean z) {
    }

    private /* synthetic */ void lambda$setTorch$0(boolean z) {
    }

    private void setTorch(boolean z) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public void start() {
    }

    public void stop() {
    }
}
