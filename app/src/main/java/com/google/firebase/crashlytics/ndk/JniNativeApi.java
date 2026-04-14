package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class JniNativeApi implements NativeApi {
    private static final FilenameFilter APK_FILTER = null;
    private static final boolean LIB_CRASHLYTICS_LOADED = false;
    private final Context context;

    public JniNativeApi(Context context) {
    }

    @TargetApi(21)
    public static void addSplitSourceDirs(List<String> list, PackageInfo packageInfo) {
    }

    public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(File file, String str) {
    }

    private static int getPackageInfoFlags() {
    }

    private static String getVersionCodeAsString(PackageInfo packageInfo) {
    }

    public static boolean isAtLeastLollipop() {
    }

    private static /* synthetic */ boolean lambda$static$0(File file, String str) {
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.NativeApi
    public boolean initialize(String str, AssetManager assetManager) {
    }

    public String[] makePackagePaths(String str) {
    }
}
