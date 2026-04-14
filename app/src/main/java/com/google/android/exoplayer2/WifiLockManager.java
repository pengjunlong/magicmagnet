package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private WifiManager.WifiLock wifiLock;
    private final WifiManager wifiManager;

    public WifiLockManager(Context context) {
    }

    private void updateWifiLock() {
    }

    public void setEnabled(boolean z) {
    }

    public void setStayAwake(boolean z) {
    }
}
