package com.tencent.bugly.beta;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.AbstractC1500a;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.interfaces.BetaPatchListener;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.ui.UILifecycleListener;
import com.tencent.bugly.beta.upgrade.ActiveListener;
import com.tencent.bugly.beta.upgrade.UpgradeListener;
import com.tencent.bugly.beta.upgrade.UpgradeStateListener;
import com.tencent.bugly.proguard.C1581B;
import java.io.File;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Beta extends AbstractC1500a {
    public static final String TAG_CANCEL_BUTTON = "beta_cancel_button";
    public static final String TAG_CONFIRM_BUTTON = "beta_confirm_button";
    public static final String TAG_IMG_BANNER = "beta_upgrade_banner";
    public static final String TAG_TIP_MESSAGE = "beta_tip_message";
    public static final String TAG_TITLE = "beta_title";
    public static final String TAG_UPGRADE_FEATURE = "beta_upgrade_feature";
    public static final String TAG_UPGRADE_INFO = "beta_upgrade_info";

    /* renamed from: a */
    private static DownloadTask f241a = null;
    public static ActiveListener activeListener = null;
    public static String appChannel = null;
    public static int appVersionCode = 0;
    public static String appVersionName = null;
    public static boolean autoCheckAppUpgrade = false;
    public static boolean autoCheckHotfix = false;
    public static boolean autoCheckUpgrade = true;
    public static boolean autoDownloadOn4g = false;
    public static boolean autoDownloadOnWifi = false;
    public static boolean autoInit = true;
    public static boolean autoInstallApk = false;
    public static BetaPatchListener betaPatchListener = null;
    public static boolean canAutoDownloadPatch = false;
    public static boolean canAutoPatch = false;
    public static List<Class<? extends Activity>> canNotShowUpgradeActs = null;
    public static boolean canNotifyUserRestart = false;
    public static boolean canShowApkInfo = false;
    public static List<Class<? extends Activity>> canShowUpgradeActs = null;
    public static int defaultBannerId = 0;
    public static boolean dialogFullScreen = false;
    public static DownloadListener downloadListener = null;
    public static boolean enableActiveH5Alert = false;
    public static boolean enableHotfix = false;
    public static boolean enableNotification = false;
    public static long initDelay = 3000;
    public static String initProcessName = null;
    public static Beta instance = null;
    public static int largeIconId = 0;
    public static boolean setPatchRestartOnScreenOff = false;
    public static boolean showInterruptedStrategy = true;
    public static int smallIconId = 0;
    public static List<String> soBlackList = null;
    public static File storageDir = null;
    public static String strNetworkTipsCancelBtn = "取消";
    public static String strNetworkTipsConfirmBtn = "继续下载";
    public static String strNetworkTipsMessage = "你已切换到移动网络，是否继续当前下载？";
    public static String strNetworkTipsTitle = "网络提示";
    public static String strNotificationClickToContinue = "继续下载";
    public static String strNotificationClickToInstall = "点击安装";
    public static String strNotificationClickToRetry = "点击重试";
    public static String strNotificationClickToView = "点击查看";
    public static String strNotificationDownloadError = "下载失败";
    public static String strNotificationDownloadSucc = "下载完成";
    public static String strNotificationDownloading = "正在下载";
    public static String strNotificationHaveNewVersion = "有新版本";
    public static String strToastCheckUpgradeError = "检查新版本失败，请稍后重试";
    public static String strToastCheckingUpgrade = "正在检查，请稍候...";
    public static String strToastYourAreTheLatestVersion = "你已经是最新版了";
    public static String strUpgradeDialogCancelBtn = "下次再说";
    public static String strUpgradeDialogContinueBtn = "继续";
    public static String strUpgradeDialogFeatureLabel = "更新说明";
    public static String strUpgradeDialogFileSizeLabel = "包大小";
    public static String strUpgradeDialogInstallBtn = "安装";
    public static String strUpgradeDialogRetryBtn = "重试";
    public static String strUpgradeDialogUpdateTimeLabel = "更新时间";
    public static String strUpgradeDialogUpgradeBtn = "立即更新";
    public static String strUpgradeDialogVersionLabel = "版本";
    public static int tipsDialogLayoutId;
    public static long upgradeCheckPeriod;
    public static int upgradeDialogLayoutId;
    public static UILifecycleListener<UpgradeInfo> upgradeDialogLifecycleListener;
    public static UpgradeListener upgradeListener;
    public static UpgradeStateListener upgradeStateListener;

    /* renamed from: a */
    private static void m68a(boolean z, boolean z2, int i) {
    }

    public static void applyDownloadedPatch() {
    }

    public static void applyTinkerPatch(Context context, String str) {
    }

    public static void cancelDownload() {
    }

    public static void checkAppUpgrade() {
    }

    public static void checkHotFix() {
    }

    public static void checkUpgrade() {
    }

    public static void cleanTinkerPatch(boolean z) {
    }

    public static void downloadPatch() {
    }

    public static UpgradeInfo getAppUpgradeInfo() {
    }

    public static UpgradeInfo getHotfixUpgradeInfo() {
    }

    public static Beta getInstance() {
    }

    public static DownloadTask getStrategyTask() {
    }

    public static UpgradeInfo getUpgradeInfo() {
    }

    public static synchronized C1581B getUpgradeStrategy() {
    }

    public static synchronized void init(Context context, boolean z) {
    }

    public static synchronized void installApk(File file) {
    }

    public static void installTinker() {
    }

    public static void loadArmLibrary(Context context, String str) {
    }

    public static void loadArmV7Library(Context context, String str) {
    }

    public static void loadLibrary(String str) {
    }

    public static void loadLibraryFromTinker(Context context, String str, String str2) {
    }

    public static synchronized void onUpgradeReceived(String str, int i, String str2, long j, int i2, int i3, String str3, String str4, long j2, String str5, String str6, int i4, int i5, long j3, String str7, boolean z, boolean z2, int i6, String str8, long j4) {
    }

    public static void registerDownloadListener(DownloadListener downloadListener2) {
    }

    public static synchronized void saveInstallEvent(boolean z) {
    }

    public static synchronized void showUpgradeDialog(String str, int i, String str2, long j, int i2, int i3, String str3, String str4, long j2, String str5, String str6, int i4, DownloadListener downloadListener2, Runnable runnable, Runnable runnable2, boolean z) {
    }

    public static DownloadTask startDownload() {
    }

    public static void unInit() {
    }

    public static void unregisterDownloadListener() {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public String[] getTables() {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static void checkAppUpgrade(boolean z, boolean z2) {
    }

    public static void checkUpgrade(boolean z, boolean z2) {
    }

    public static void installTinker(Object obj) {
    }

    public static void installTinker(Object obj, Object obj2, Object obj3, Object obj4, TinkerManager.TinkerPatchResultListener tinkerPatchResultListener, Object obj5) {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
    }
}
