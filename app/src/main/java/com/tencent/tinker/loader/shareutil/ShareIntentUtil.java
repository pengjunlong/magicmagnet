package com.tencent.tinker.loader.shareutil;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ShareIntentUtil {
    public static final String INTENT_IS_PROTECTED_APP = "intent_is_protected_app";
    public static final String INTENT_PATCH_COST_TIME = "intent_patch_cost_time";
    public static final String INTENT_PATCH_DEXES_PATH = "intent_patch_dexes_path";
    public static final String INTENT_PATCH_EXCEPTION = "intent_patch_exception";
    public static final String INTENT_PATCH_INTERPRET_EXCEPTION = "intent_patch_interpret_exception";
    public static final String INTENT_PATCH_LIBS_PATH = "intent_patch_libs_path";
    public static final String INTENT_PATCH_MISMATCH_DEX_PATH = "intent_patch_mismatch_dex_path";
    public static final String INTENT_PATCH_MISMATCH_LIB_PATH = "intent_patch_mismatch_lib_path";
    public static final String INTENT_PATCH_MISSING_DEX_PATH = "intent_patch_missing_dex_path";
    public static final String INTENT_PATCH_MISSING_LIB_PATH = "intent_patch_missing_lib_path";
    public static final String INTENT_PATCH_NEW_VERSION = "intent_patch_new_version";
    public static final String INTENT_PATCH_OAT_DIR = "intent_patch_oat_dir";
    public static final String INTENT_PATCH_OLD_VERSION = "intent_patch_old_version";
    public static final String INTENT_PATCH_PACKAGE_CONFIG = "intent_patch_package_config";
    public static final String INTENT_PATCH_PACKAGE_PATCH_CHECK = "intent_patch_package_patch_check";
    public static final String INTENT_PATCH_SYSTEM_OTA = "intent_patch_system_ota";
    public static final String INTENT_RETURN_CODE = "intent_return_code";
    private static final String TAG = "ShareIntentUtil";

    public static void fixIntentClassLoader(Intent intent, ClassLoader classLoader) {
    }

    public static boolean getBooleanExtra(Intent intent, String str, boolean z) {
    }

    public static int getIntExtra(Intent intent, String str, int i) {
    }

    public static Throwable getIntentInterpretException(Intent intent) {
    }

    public static HashMap<String, String> getIntentPackageConfig(Intent intent) {
    }

    public static long getIntentPatchCostTime(Intent intent) {
    }

    public static HashMap<String, String> getIntentPatchDexPaths(Intent intent) {
    }

    public static Throwable getIntentPatchException(Intent intent) {
    }

    public static HashMap<String, String> getIntentPatchLibsPaths(Intent intent) {
    }

    public static int getIntentReturnCode(Intent intent) {
    }

    public static long getLongExtra(Intent intent, String str, long j) {
    }

    public static Serializable getSerializableExtra(Intent intent, String str) {
    }

    public static ArrayList<String> getStringArrayListExtra(Intent intent, String str) {
    }

    public static String getStringExtra(Intent intent, String str) {
    }

    public static void setIntentPatchCostTime(Intent intent, long j) {
    }

    public static void setIntentReturnCode(Intent intent, int i) {
    }
}
