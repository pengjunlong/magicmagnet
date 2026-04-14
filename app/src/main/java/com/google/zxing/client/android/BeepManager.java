package com.google.zxing.client.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BeepManager {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = "BeepManager";
    private static final long VIBRATE_DURATION = 200;
    private boolean beepEnabled;
    private final Context context;
    private boolean vibrateEnabled;

    public BeepManager(Activity activity) {
    }

    public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(MediaPlayer mediaPlayer, int i, int i2) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(MediaPlayer mediaPlayer) {
    }

    private static /* synthetic */ void lambda$playBeepSound$0(MediaPlayer mediaPlayer) {
    }

    private static /* synthetic */ boolean lambda$playBeepSound$1(MediaPlayer mediaPlayer, int i, int i2) {
    }

    public boolean isBeepEnabled() {
    }

    public boolean isVibrateEnabled() {
    }

    public MediaPlayer playBeepSound() {
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void playBeepSoundAndVibrate() {
    }

    public void setBeepEnabled(boolean z) {
    }

    public void setVibrateEnabled(boolean z) {
    }
}
