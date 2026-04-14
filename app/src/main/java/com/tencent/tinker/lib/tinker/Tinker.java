package com.tencent.tinker.lib.tinker;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.lib.listener.PatchListener;
import com.tencent.tinker.lib.patch.AbstractPatch;
import com.tencent.tinker.lib.reporter.LoadReporter;
import com.tencent.tinker.lib.reporter.PatchReporter;
import com.tencent.tinker.lib.service.AbstractResultService;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Tinker {
    private static final String TAG = "Tinker.Tinker";
    private static boolean sInstalled = false;
    private static Tinker sInstance;
    final Context context;
    final boolean isMainProcess;
    final boolean isPatchProcess;
    final PatchListener listener;
    final LoadReporter loadReporter;
    private boolean loaded;
    final File patchDirectory;
    final File patchInfoFile;
    final File patchInfoLockFile;
    final PatchReporter patchReporter;
    int tinkerFlags;
    TinkerLoadResult tinkerLoadResult;
    final boolean tinkerLoadVerifyFlag;

    public static class Builder {
        private final Context context;
        private PatchListener listener;
        private LoadReporter loadReporter;
        private final boolean mainProcess;
        private File patchDirectory;
        private File patchInfoFile;
        private File patchInfoLockFile;
        private final boolean patchProcess;
        private PatchReporter patchReporter;
        private int status;
        private Boolean tinkerLoadVerifyFlag;

        public Builder(Context context) {
        }

        public Tinker build() {
        }

        public Builder listener(PatchListener patchListener) {
        }

        public Builder loadReport(LoadReporter loadReporter) {
        }

        public Builder patchReporter(PatchReporter patchReporter) {
        }

        public Builder tinkerFlags(int i) {
        }

        public Builder tinkerLoadVerifyFlag(Boolean bool) {
        }
    }

    /* synthetic */ Tinker(Context context, int i, LoadReporter loadReporter, PatchReporter patchReporter, PatchListener patchListener, File file, File file2, File file3, boolean z, boolean z2, boolean z3, C16451 c16451) {
    }

    public static void create(Tinker tinker) {
    }

    public static boolean isTinkerInstalled() {
    }

    public static Tinker with(Context context) {
    }

    public void cleanPatch() {
    }

    public void cleanPatchByPatchApk(File file) {
    }

    public void cleanPatchByVersion(String str) {
    }

    public Context getContext() {
    }

    public LoadReporter getLoadReporter() {
    }

    public File getPatchDirectory() {
    }

    public File getPatchInfoFile() {
    }

    public File getPatchInfoLockFile() {
    }

    public PatchListener getPatchListener() {
    }

    public PatchReporter getPatchReporter() {
    }

    public int getTinkerFlags() {
    }

    public TinkerLoadResult getTinkerLoadResultIfPresent() {
    }

    public long getTinkerRomSpace() {
    }

    public void install(Intent intent, Class<? extends AbstractResultService> cls, AbstractPatch abstractPatch) {
    }

    public boolean isEnabledForDex() {
    }

    public boolean isEnabledForNativeLib() {
    }

    public boolean isEnabledForResource() {
    }

    public boolean isMainProcess() {
    }

    public boolean isPatchProcess() {
    }

    public boolean isTinkerEnabled() {
    }

    public boolean isTinkerLoadVerify() {
    }

    public boolean isTinkerLoaded() {
    }

    public void rollbackPatch() {
    }

    public void setPatchServiceNotificationId(int i) {
    }

    public void setTinkerDisable() {
    }

    public void setTinkerLoaded(boolean z) {
    }

    private Tinker(Context context, int i, LoadReporter loadReporter, PatchReporter patchReporter, PatchListener patchListener, File file, File file2, File file3, boolean z, boolean z2, boolean z3) {
    }

    public void install(Intent intent) {
    }
}
