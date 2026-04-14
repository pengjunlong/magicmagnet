package com.tencent.tinker.lib.reporter;

import android.content.Context;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DefaultLoadReporter implements LoadReporter {
    private static final String TAG = "Tinker.DefaultLoadReporter";
    protected final Context context;

    public DefaultLoadReporter(Context context) {
    }

    public void checkAndCleanPatch() {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadException(Throwable th, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadFileMd5Mismatch(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadFileNotFound(File file, int i, boolean z) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadInterpret(int i, Throwable th) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPackageCheckFail(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPatchInfoCorrupted(String str, String str2, File file) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPatchListenerReceiveFail(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPatchVersionChanged(String str, String str2, File file, String str3) {
    }

    @Override // com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadResult(File file, int i, long j) {
    }

    public boolean retryPatch() {
    }
}
