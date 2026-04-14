package com.iflytek.voiceads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class IFLYVideoAd {
    public static final int NATIVE_VIDEO_AD = 0;
    public static final int PATCH_VIDEO_AD = 3;
    public static final int REWARDED_VIDEO_AD = 1;
    public static final int SCREEN_ORIENTATION_LANDSCAPE = 0;
    public static final int SCREEN_ORIENTATION_PORTRAIT = 1;
    public static final int SCREEN_WINDOW_FULLSCREEN = 1;
    public static final int SCREEN_WINDOW_NORMAL = 0;
    public static final int SPLASH_VIDEO_AD = 2;
    public static final String TAG = "IFLYVideoAd";
    private static Class<?> c_IFLYVideoAdImpl = null;
    private static boolean isClassLoaded = false;
    private IFLYVideoAd iFLYVideoAdImpl;
    private IFLYVideoAdListener mVideoAdListener;

    public IFLYVideoAd(Context context) {
    }

    public ViewGroup getAdView() {
    }

    public boolean isAdPlaying() {
    }

    public void loadAd(int i) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void releaseVideo() {
    }

    public void setParameter(String str, String str2) {
    }

    public void setShowWifiTip(boolean z) {
    }

    public void setSkipVisibility(int i) {
    }

    public void showAd(int i, int i2, Object... objArr) {
    }

    public void startPlay() {
    }

    public IFLYVideoAd(Context context, String str, IFLYVideoAdListener iFLYVideoAdListener, int i) {
    }
}
