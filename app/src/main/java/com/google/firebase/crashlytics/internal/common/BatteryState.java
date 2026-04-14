package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class BatteryState {
    static final int VELOCITY_CHARGING = 2;
    static final int VELOCITY_FULL = 3;
    static final int VELOCITY_UNPLUGGED = 1;
    private final Float level;
    private final boolean powerConnected;

    private BatteryState(Float f, boolean z) {
    }

    public static BatteryState get(Context context) {
    }

    private static Float getLevel(Intent intent) {
    }

    public Float getBatteryLevel() {
    }

    public int getBatteryVelocity() {
    }

    boolean isPowerConnected() {
    }

    private static boolean isPowerConnected(Intent intent) {
    }
}
