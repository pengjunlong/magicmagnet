package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class InactivityTimer {
    private static final long INACTIVITY_DELAY_MS = 300000;
    private static final String TAG = "InactivityTimer";
    private Runnable callback;
    private final Context context;
    private Handler handler;
    private boolean onBattery;
    private final BroadcastReceiver powerStatusReceiver;
    private boolean registered;

    /* JADX INFO: Access modifiers changed from: private */
    final class PowerStatusReceiver extends BroadcastReceiver {
        final /* synthetic */ InactivityTimer this$0;

        private PowerStatusReceiver(InactivityTimer inactivityTimer) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(PowerStatusReceiver powerStatusReceiver, boolean z) {
        }

        private /* synthetic */ void lambda$onReceive$0(boolean z) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ PowerStatusReceiver(InactivityTimer inactivityTimer, C13811 c13811) {
        }
    }

    public InactivityTimer(Context context, Runnable runnable) {
    }

    static /* synthetic */ Handler access$100(InactivityTimer inactivityTimer) {
    }

    static /* synthetic */ void access$200(InactivityTimer inactivityTimer, boolean z) {
    }

    private void cancelCallback() {
    }

    private void onBattery(boolean z) {
    }

    private void registerReceiver() {
    }

    private void unregisterReceiver() {
    }

    public void activity() {
    }

    public void cancel() {
    }

    public void start() {
    }
}
