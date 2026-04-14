package com.tencent.tinker.lib.util;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class UpgradePatchRetry {
    private static final String RETRY_COUNT_PROPERTY = "times";
    private static final String RETRY_FILE_MD5_PROPERTY = "md5";
    private static final String RETRY_INFO_NAME = "patch.retry";
    private static final int RETRY_MAX_COUNT = 20;
    private static final String TAG = "Tinker.UpgradePatchRetry";
    private static final String TEMP_PATCH_NAME = "temp.apk";
    private static UpgradePatchRetry sInstance;
    private Context context;
    private boolean isRetryEnable;
    private int maxRetryCount;
    private File retryInfoFile;
    private File tempPatchFile;

    static class RetryInfo {
        String md5;
        String times;

        RetryInfo(String str, String str2) {
        }

        static RetryInfo readRetryProperty(File file) {
        }

        static void writeRetryProperty(File file, RetryInfo retryInfo) {
        }
    }

    public UpgradePatchRetry(Context context) {
    }

    private void copyToTempFile(File file) {
    }

    public static UpgradePatchRetry getInstance(Context context) {
    }

    public boolean onPatchListenerCheck(String str) {
    }

    public boolean onPatchResetMaxCheck(String str) {
    }

    public boolean onPatchRetryLoad() {
    }

    public void onPatchServiceResult() {
    }

    public void onPatchServiceStart(Intent intent) {
    }

    public void setMaxRetryCount(int i) {
    }

    public void setRetryEnable(boolean z) {
    }
}
