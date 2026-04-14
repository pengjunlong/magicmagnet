package com.tencent.bugly.beta.tinker;

import android.app.Application;
import android.content.Context;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.listener.PatchListener;
import com.tencent.tinker.lib.patch.AbstractPatch;
import com.tencent.tinker.lib.reporter.LoadReporter;
import com.tencent.tinker.lib.reporter.PatchReporter;
import com.tencent.tinker.lib.service.PatchResult;
import java.io.File;
import java.lang.Thread;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerManager {
    public static final String MF_FILE = "YAPATCH.MF";
    public static final String PATCH_DIR = "dex";
    public static final String PATCH_NAME = "patch.apk";
    private static final String TAG = "Tinker.TinkerManager";
    public static String apkOriginalBuildNum = null;
    private static boolean isInstalled = false;
    public static String patchCurBuildNum;
    public static boolean patchRestartOnScreenOff;
    static TinkerPatchResultListener patchResultListener;
    private static Thread.UncaughtExceptionHandler systemExceptionHandler;
    private static TinkerManager tinkerManager;
    public static TinkerReport tinkerReport;
    private static TinkerUncaughtExceptionHandler uncaughtExceptionHandler;
    static LoadReporter userLoadReporter;
    static PatchListener userPatchListener;
    static PatchReporter userPatchReporter;
    static AbstractPatch userUpgradePatchProcessor;
    private Application application;
    private ApplicationLike applicationLike;
    private TinkerListener tinkerListener;

    /* renamed from: com.tencent.bugly.beta.tinker.TinkerManager$1 */
    class C15151 implements TinkerUtils.ScreenState.IOnScreenOff {
        final /* synthetic */ TinkerManager this$0;

        C15151(TinkerManager tinkerManager) {
        }

        @Override // com.tencent.bugly.beta.tinker.TinkerUtils.ScreenState.IOnScreenOff
        public void onScreenOff() {
        }
    }

    /* renamed from: com.tencent.bugly.beta.tinker.TinkerManager$2 */
    class RunnableC15162 implements Runnable {
        final /* synthetic */ TinkerManager this$0;

        RunnableC15162(TinkerManager tinkerManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface TinkerListener {
        void onApplyFailure(String str);

        void onApplySuccess(String str);

        void onDownloadFailure(String str);

        void onDownloadSuccess(String str);

        void onPatchRollback();

        void onPatchStart();
    }

    public interface TinkerPatchResultListener {
        void onPatchResult(PatchResult patchResult);
    }

    static /* synthetic */ TinkerListener access$000(TinkerManager tinkerManager2) {
    }

    public static Application getApplication() {
    }

    public static TinkerManager getInstance() {
    }

    public static String getNewTinkerId() {
    }

    public static ApplicationLike getTinkerApplicationLike() {
    }

    public static String getTinkerId() {
    }

    private static void installDefaultTinker(ApplicationLike applicationLike) {
    }

    public static void installTinker(Object obj) {
    }

    public static boolean isPatchRestartOnScreenOff() {
    }

    public static boolean isTinkerManagerInstalled() {
    }

    public static void loadArmLibrary(Context context, String str) {
    }

    public static void loadArmV7Library(Context context, String str) {
    }

    public static boolean loadLibraryFromTinker(Context context, String str, String str2) {
    }

    public static void registJavaCrashHandler() {
    }

    public static void setPatchRestartOnScreenOff(boolean z) {
    }

    private void setTinkerApplicationLike(ApplicationLike applicationLike) {
    }

    public static void setUpgradeRetryEnable(boolean z) {
    }

    public static void unregistJavaCrashHandler() {
    }

    public void applyPatch(Context context, String str) {
    }

    public boolean checkNewPatch(String str) {
    }

    public void cleanPatch(boolean z) {
    }

    public File getPatchDirectory(Context context) {
    }

    public TinkerListener getTinkerListener() {
    }

    public void onApplyFailure(String str) {
    }

    public void onApplySuccess(String str) {
    }

    public void onDownloadFailure(String str) {
    }

    public void onDownloadSuccess(String str, boolean z) {
    }

    public void onPatchRollback(boolean z) {
    }

    public void setTinkerListener(TinkerListener tinkerListener) {
    }

    public void setTinkerReport(TinkerReport.Reporter reporter) {
    }

    public static void installTinker(Object obj, Object obj2, Object obj3, Object obj4, TinkerPatchResultListener tinkerPatchResultListener, Object obj5) {
    }

    public void applyPatch(String str, boolean z) {
    }
}
