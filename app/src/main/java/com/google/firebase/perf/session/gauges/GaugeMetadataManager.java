package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class GaugeMetadataManager {
    private static final AndroidLogger logger = null;
    private final ActivityManager activityManager;
    private final Context appContext;
    private final String currentProcessName;
    private final ActivityManager.MemoryInfo memoryInfo;
    private final Runtime runtime;

    GaugeMetadataManager(Context context) {
    }

    private String getCurrentProcessName() {
    }

    public int getDeviceRamSizeKb() {
    }

    public int getMaxAppJavaHeapMemoryKb() {
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
    }

    public String getProcessName() {
    }

    int readTotalRAM(String str) {
    }

    GaugeMetadataManager(Runtime runtime, Context context) {
    }
}
