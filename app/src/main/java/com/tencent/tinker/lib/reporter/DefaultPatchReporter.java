package com.tencent.tinker.lib.reporter;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DefaultPatchReporter implements PatchReporter {
    private static final String TAG = "Tinker.DefaultPatchReporter";
    private static boolean shouldRetry = false;
    protected final Context context;

    public DefaultPatchReporter(Context context) {
    }

    private void deleteOptFiles(List<File> list) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchDexOptFail(File file, List<File> list, Throwable th) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchException(File file, Throwable th) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchInfoCorrupted(File file, String str, String str2) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchPackageCheckFail(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchResult(File file, boolean z, long j) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchServiceStart(Intent intent) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchTypeExtractFail(File file, File file2, String str, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.PatchReporter
    public void onPatchVersionCheckFail(File file, SharePatchInfo sharePatchInfo, String str) {
    }
}
