package com.tencent.bugly.beta.tinker;

import android.content.Context;
import android.os.MessageQueue;
import com.tencent.tinker.lib.reporter.DefaultLoadReporter;
import com.tencent.tinker.lib.reporter.LoadReporter;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerLoadReporter extends DefaultLoadReporter {
    private static final String TAG = "Tinker.TinkerLoadReporter";
    private final LoadReporter userLoadReporter;

    /* renamed from: com.tencent.bugly.beta.tinker.TinkerLoadReporter$1 */
    class C15141 implements MessageQueue.IdleHandler {
        final /* synthetic */ TinkerLoadReporter this$0;

        C15141(TinkerLoadReporter tinkerLoadReporter) {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
        }
    }

    public TinkerLoadReporter(Context context) {
    }

    static /* synthetic */ Context access$000(TinkerLoadReporter tinkerLoadReporter) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadException(Throwable th, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadFileMd5Mismatch(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadFileNotFound(File file, int i, boolean z) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadInterpret(int i, Throwable th) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPackageCheckFail(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPatchInfoCorrupted(String str, String str2, File file) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPatchListenerReceiveFail(File file, int i) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadPatchVersionChanged(String str, String str2, File file, String str3) {
    }

    @Override // com.tencent.tinker.lib.reporter.DefaultLoadReporter, com.tencent.tinker.lib.reporter.LoadReporter
    public void onLoadResult(File file, int i, long j) {
    }
}
