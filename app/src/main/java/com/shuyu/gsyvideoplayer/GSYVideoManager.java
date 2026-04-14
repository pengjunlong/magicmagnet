package com.shuyu.gsyvideoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GSYVideoManager extends GSYVideoBaseManager {
    public static final int FULLSCREEN_ID = 0;
    public static final int SMALL_ID = 0;
    public static String TAG;

    @SuppressLint({"StaticFieldLeak"})
    private static GSYVideoManager videoManager;

    private GSYVideoManager() {
    }

    public static boolean backFromWindowFull(Context context) {
    }

    public static synchronized void changeManager(GSYVideoManager gSYVideoManager) {
    }

    public static synchronized GSYVideoManager instance() {
    }

    public static boolean isFullState(Activity activity) {
    }

    public static void onPause() {
    }

    public static void onResume() {
    }

    public static void releaseAllVideos() {
    }

    public static synchronized GSYVideoManager tmpInstance(GSYMediaPlayerListener gSYMediaPlayerListener) {
    }

    public static void onResume(boolean z) {
    }
}
