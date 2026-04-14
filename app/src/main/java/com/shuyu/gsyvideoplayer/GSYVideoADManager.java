package com.shuyu.gsyvideoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GSYVideoADManager extends GSYVideoBaseManager {
    public static final int FULLSCREEN_ID = 0;
    public static final int SMALL_ID = 0;
    public static String TAG;

    @SuppressLint({"StaticFieldLeak"})
    private static GSYVideoADManager videoManager;

    private GSYVideoADManager() {
    }

    public static boolean backFromWindowFull(Context context) {
    }

    public static synchronized GSYVideoADManager instance() {
    }

    public static boolean isFullState(Activity activity) {
    }

    public static void onPause() {
    }

    public static void onResume() {
    }

    public static void releaseAllVideos() {
    }

    public static void onResume(boolean z) {
    }
}
