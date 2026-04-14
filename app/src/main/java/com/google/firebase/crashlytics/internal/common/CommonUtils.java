package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CommonUtils {
    static final int BYTES_IN_A_GIGABYTE = 1073741824;
    static final int BYTES_IN_A_KILOBYTE = 1024;
    static final int BYTES_IN_A_MEGABYTE = 1048576;
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    private static final String GOLDFISH = "goldfish";
    private static final char[] HEX_VALUES = null;
    static final String LEGACY_MAPPING_FILE_ID_RESOURCE_NAME = "com.crashlytics.android.build_id";
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    static final String MAPPING_FILE_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.mapping_file_id";
    private static final String RANCHU = "ranchu";
    private static final String SDK = "sdk";
    private static final String SHA1_INSTANCE = "SHA-1";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";
    private static final long UNCALCULATED_TOTAL_RAM = -1;
    private static final String UNITY_EDITOR_VERSION = "com.google.firebase.crashlytics.unity_version";
    private static long totalRamInBytes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class Architecture {
        private static final /* synthetic */ Architecture[] $VALUES = null;
        public static final Architecture ARM64 = null;
        public static final Architecture ARMV6 = null;
        public static final Architecture ARMV7 = null;
        public static final Architecture ARMV7S = null;
        public static final Architecture ARM_UNKNOWN = null;
        public static final Architecture PPC = null;
        public static final Architecture PPC64 = null;
        public static final Architecture UNKNOWN = null;
        public static final Architecture X86_32 = null;
        public static final Architecture X86_64 = null;
        private static final Map<String, Architecture> matcher = null;

        private Architecture(String str, int i) {
        }

        static Architecture getValue() {
        }

        public static Architecture valueOf(String str) {
        }

        public static Architecture[] values() {
        }
    }

    public static long calculateFreeRamInBytes(Context context) {
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
    }

    @SuppressLint({"MissingPermission"})
    public static boolean canTryConnection(Context context) {
    }

    public static boolean checkPermission(Context context, String str) {
    }

    public static void closeOrLog(Closeable closeable, String str) {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    static long convertMemInfoToBytes(String str, String str2, int i) {
    }

    public static String createInstanceIdFrom(String... strArr) {
    }

    public static String extractFieldFromSystemFile(File file, String str) {
    }

    public static ActivityManager.RunningAppProcessInfo getAppProcessInfo(String str, Context context) {
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z) {
    }

    public static int getCpuArchitectureInt() {
    }

    public static int getDeviceState(Context context) {
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) {
    }

    public static String getMappingFileId(Context context) {
    }

    public static boolean getProximitySensorEnabled(Context context) {
    }

    public static String getResourcePackageName(Context context) {
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
    }

    public static SharedPreferences getSharedPrefs(Context context) {
    }

    public static String getStringsFileValue(Context context, String str) {
    }

    public static synchronized long getTotalRamInBytes() {
    }

    private static String hash(String str, String str2) {
    }

    public static String hexify(byte[] bArr) {
    }

    public static boolean isAppDebuggable(Context context) {
    }

    public static boolean isDebuggerAttached() {
    }

    public static boolean isEmulator(Context context) {
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context context) {
    }

    public static boolean isRooted(Context context) {
    }

    public static String padWithZerosToMaxIntWidth(int i) {
    }

    public static String resolveUnityEditorVersion(Context context) {
    }

    public static String sha1(String str) {
    }

    public static String streamToString(InputStream inputStream) {
    }

    private static String hash(byte[] bArr, String str) {
    }
}
