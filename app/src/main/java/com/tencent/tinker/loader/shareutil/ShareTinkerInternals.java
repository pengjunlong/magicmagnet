package com.tencent.tinker.loader.shareutil;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.util.Properties;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ShareTinkerInternals {
    private static final String PATCH_PROCESS_NAME = ":patch";
    private static final String SAFEMODE_COUNT_REC_PREFIX = "safemode_count_rec_";
    private static final String TAG = "Tinker.TinkerInternals";
    private static final boolean VM_IS_ART = false;
    private static final boolean VM_IS_JIT = false;
    private static String currentInstructionSet;
    private static Boolean isARKHotRunning;
    private static Boolean isPatchProcess;
    private static String processName;
    private static String tinkerID;

    public static ShareDexDiffPatchInfo changeTestDexToClassN(ShareDexDiffPatchInfo shareDexDiffPatchInfo, int i) {
    }

    public static int checkPackageAndTinkerFlag(ShareSecurityCheck shareSecurityCheck, int i) {
    }

    public static int checkSignatureAndTinkerID(Context context, File file, ShareSecurityCheck shareSecurityCheck) {
    }

    public static int checkTinkerPackage(Context context, int i, File file, ShareSecurityCheck shareSecurityCheck) {
    }

    public static void cleanPatch(Application application) {
    }

    public static Properties fastGetPatchPackageMeta(File file) {
    }

    public static String getCurrentInstructionSet() throws Exception {
    }

    public static String getCurrentOatMode(Context context, String str) {
    }

    public static String getExceptionCauseString(Throwable th) {
    }

    public static String getManifestTinkerID(Context context) {
    }

    public static String getProcessName(Context context) {
    }

    private static String getProcessNameInternal(Context context) {
    }

    public static int getSafeModeCount(Context context) {
    }

    private static String getTinkerSwitchSPKey(Context context) {
    }

    public static String getTypeString(int i) {
    }

    public static boolean isAfterAndroidO() {
    }

    public static boolean isArkHotRuning() {
    }

    public static boolean isInMainProcess(Context context) {
    }

    public static boolean isInPatchProcess(Context context) {
    }

    public static boolean isNullOrNil(String str) {
    }

    public static boolean isSystemOTA(String str) {
    }

    public static boolean isTinkerEnableWithSharedPreferences(Context context) {
    }

    public static boolean isTinkerEnabled(int i) {
    }

    public static boolean isTinkerEnabledAll(int i) {
    }

    public static boolean isTinkerEnabledForArkHot(int i) {
    }

    public static boolean isTinkerEnabledForDex(int i) {
    }

    public static boolean isTinkerEnabledForNativeLib(int i) {
    }

    public static boolean isTinkerEnabledForResource(int i) {
    }

    public static boolean isVmArt() {
    }

    public static boolean isVmJit() {
    }

    private static boolean isVmJitInternal() {
    }

    public static void killAllOtherProcess(Context context) {
    }

    public static void killProcessExceptMain(Context context) {
    }

    public static void setSafeModeCount(Context context, int i) {
    }

    public static void setTinkerDisableWithSharedPreferences(Context context) {
    }

    public static String toVisualString(String str) {
    }

    private static boolean isVmArt(String str) {
    }
}
