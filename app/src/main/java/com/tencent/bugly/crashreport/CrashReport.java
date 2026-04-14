package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CrashReport {

    /* renamed from: a */
    private static Context f417a;

    public static class CrashHandleCallback extends BuglyStrategy.C1499a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: u */
        CrashHandleCallback f418u;

        public UserStrategy(Context context) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public /* bridge */ /* synthetic */ BuglyStrategy.C1499a getCrashHandleCallback() {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int i) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean z) {
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized CrashHandleCallback getCrashHandleCallback() {
        }
    }

    public interface WebViewInterface {
        void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str);

        CharSequence getContentDescription();

        String getUrl();

        void loadUrl(String str);

        void setJavaScriptEnabled(boolean z);
    }

    public static void closeBugly() {
    }

    public static void closeCrashReport() {
    }

    public static void closeNativeReport() {
    }

    public static void enableBugly(boolean z) {
    }

    public static void enableObtainId(Context context, boolean z) {
    }

    public static Set<String> getAllUserDataKeys(Context context) {
    }

    public static String getAppChannel() {
    }

    public static String getAppID() {
    }

    public static String getAppVer() {
    }

    public static String getBuglyVersion(Context context) {
    }

    public static String getDeviceID(Context context) {
    }

    public static Proxy getHttpProxy() {
    }

    public static Map<String, String> getSdkExtraData() {
    }

    public static String getUserData(Context context, String str) {
    }

    public static int getUserDatasSize(Context context) {
    }

    public static String getUserId() {
    }

    public static int getUserSceneTagId(Context context) {
    }

    public static void initCrashReport(Context context) {
    }

    public static boolean isLastSessionCrash() {
    }

    public static void postCatchedException(Throwable th) {
    }

    public static void postException(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
    }

    private static void putSdkData(Context context, String str, String str2) {
    }

    public static void putUserData(Context context, String str, String str2) {
    }

    public static String removeUserData(Context context, String str) {
    }

    public static void setAppChannel(Context context, String str) {
    }

    public static void setAppPackage(Context context, String str) {
    }

    public static void setAppVersion(Context context, String str) {
    }

    public static void setBuglyDbName(String str) {
    }

    public static void setContext(Context context) {
    }

    public static void setCrashFilter(String str) {
    }

    public static void setCrashRegularFilter(String str) {
    }

    public static void setDeviceId(Context context, String str) {
    }

    public static void setHandleNativeCrashInJava(boolean z) {
    }

    public static void setHttpProxy(String str, int i) {
    }

    public static void setIsAppForeground(Context context, boolean z) {
    }

    public static void setIsDevelopmentDevice(Context context, boolean z) {
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z) {
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
    }

    public static void setServerUrl(String str) {
    }

    public static void setSessionIntervalMills(long j) {
    }

    public static void setUserId(String str) {
    }

    public static void setUserSceneTag(Context context, int i) {
    }

    public static void startCrashReport() {
    }

    public static void testANRCrash() {
    }

    public static void testJavaCrash() {
    }

    public static void testNativeCrash() {
    }

    public static void postCatchedException(Throwable th, Thread thread) {
    }

    public static void setHttpProxy(InetAddress inetAddress, int i) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebView webView, boolean z, boolean z2) {
    }

    public static void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z) {
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
    }

    public static void postException(int i, String str, String str2, String str3, Map<String, String> map) {
    }

    public static void setUserId(Context context, String str) {
    }

    public static Map<String, String> getSdkExtraData(Context context) {
    }

    public static void initCrashReport(Context context, String str, boolean z) {
    }

    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z) {
    }

    public static void initCrashReport(Context context, String str, boolean z, UserStrategy userStrategy) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z, boolean z2) {
    }
}
