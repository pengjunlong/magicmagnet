package com.tencent.tinker.loader.shareutil;

import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SharePatchInfo {
    public static final String DEFAULT_DIR = "odex";
    public static final String FINGER_PRINT = "print";
    public static final String IS_PROTECTED_APP = "is_protected_app";
    public static final String IS_REMOVE_INTERPRET_OAT_DIR = "is_remove_interpret_oat_dir";
    public static final String IS_REMOVE_NEW_VERSION = "is_remove_new_version";
    public static final int MAX_EXTRACT_ATTEMPTS = 2;
    public static final String NEW_VERSION = "new";
    public static final String OAT_DIR = "dir";
    public static final String OLD_VERSION = "old";
    private static final String TAG = "Tinker.PatchInfo";
    public String fingerPrint;
    public boolean isProtectedApp;
    public boolean isRemoveInterpretOATDir;
    public boolean isRemoveNewVersion;
    public String newVersion;
    public String oatDir;
    public String oldVersion;

    public SharePatchInfo(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3) {
    }

    private static SharePatchInfo readAndCheckProperty(File file) {
    }

    public static SharePatchInfo readAndCheckPropertyWithLock(File file, File file2) {
    }

    private static boolean rewritePatchInfoFile(File file, SharePatchInfo sharePatchInfo) {
    }

    public static boolean rewritePatchInfoFileWithLock(File file, SharePatchInfo sharePatchInfo, File file2) {
    }
}
