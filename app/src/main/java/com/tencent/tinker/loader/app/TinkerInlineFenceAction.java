package com.tencent.tinker.loader.app;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TinkerInlineFenceAction {
    public static final int ACTION_GET_ASSETS = 9;
    public static final int ACTION_GET_BASE_CONTEXT = 8;
    public static final int ACTION_GET_CLASSLOADER = 7;
    public static final int ACTION_GET_RESOURCES = 10;
    public static final int ACTION_GET_SYSTEM_SERVICE = 11;
    public static final int ACTION_MZ_NIGHTMODE_USE_OF = 12;
    public static final int ACTION_ON_BASE_CONTEXT_ATTACHED = 1;
    public static final int ACTION_ON_CONFIGURATION_CHANGED = 3;
    public static final int ACTION_ON_CREATE = 2;
    public static final int ACTION_ON_LOW_MEMORY = 5;
    public static final int ACTION_ON_TERMINATE = 6;
    public static final int ACTION_ON_TRIM_MEMORY = 4;

    static AssetManager callGetAssets(Handler handler, AssetManager assetManager) {
    }

    static Context callGetBaseContext(Handler handler, Context context) {
    }

    static ClassLoader callGetClassLoader(Handler handler, ClassLoader classLoader) {
    }

    static Resources callGetResources(Handler handler, Resources resources) {
    }

    static Object callGetSystemService(Handler handler, String str, Object obj) {
    }

    static int callMZNightModeUseOf(Handler handler) {
    }

    static void callOnBaseContextAttached(Handler handler, Context context) {
    }

    static void callOnConfigurationChanged(Handler handler, Configuration configuration) {
    }

    static void callOnCreate(Handler handler) {
    }

    static void callOnLowMemory(Handler handler) {
    }

    static void callOnTerminate(Handler handler) {
    }

    static void callOnTrimMemory(Handler handler, int i) {
    }
}
