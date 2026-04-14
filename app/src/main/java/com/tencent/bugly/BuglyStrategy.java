package com.tencent.bugly;

import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BuglyStrategy {

    /* renamed from: a */
    private String f211a;

    /* renamed from: b */
    private String f212b;

    /* renamed from: c */
    private String f213c;

    /* renamed from: d */
    private long f214d;

    /* renamed from: e */
    private String f215e;

    /* renamed from: f */
    private String f216f;

    /* renamed from: g */
    private boolean f217g;

    /* renamed from: h */
    private boolean f218h;

    /* renamed from: i */
    private boolean f219i;

    /* renamed from: j */
    private boolean f220j;

    /* renamed from: k */
    private Class<?> f221k;

    /* renamed from: l */
    private boolean f222l;

    /* renamed from: m */
    private boolean f223m;

    /* renamed from: n */
    private boolean f224n;

    /* renamed from: o */
    private boolean f225o;

    /* renamed from: p */
    private boolean f226p;

    /* renamed from: q */
    private C1499a f227q;

    /* renamed from: r */
    protected int f228r;

    /* renamed from: s */
    protected boolean f229s;

    /* renamed from: t */
    private boolean f230t;

    /* renamed from: com.tencent.bugly.BuglyStrategy$a */
    public static class C1499a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i, String str, String str2, String str3) {
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i, String str, String str2, String str3) {
        }
    }

    public synchronized String getAppChannel() {
    }

    public synchronized String getAppPackageName() {
    }

    public synchronized long getAppReportDelay() {
    }

    public synchronized String getAppVersion() {
    }

    public synchronized int getCallBackType() {
    }

    public synchronized boolean getCloseErrorCallback() {
    }

    public synchronized C1499a getCrashHandleCallback() {
    }

    public synchronized String getDeviceID() {
    }

    public synchronized String getLibBuglySOFilePath() {
    }

    public synchronized Class<?> getUserInfoActivity() {
    }

    public synchronized boolean isBuglyLogUpload() {
    }

    public synchronized boolean isEnableANRCrashMonitor() {
    }

    public synchronized boolean isEnableCatchAnrTrace() {
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
    }

    public synchronized boolean isEnableUserInfo() {
    }

    public boolean isMerged() {
    }

    public boolean isReplaceOldChannel() {
    }

    public synchronized boolean isUploadProcess() {
    }

    public synchronized boolean isUploadSpotCrash() {
    }

    public synchronized boolean recordUserInfoOnceADay() {
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
    }

    public synchronized BuglyStrategy setAppReportDelay(long j) {
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z) {
    }

    public synchronized void setCallBackType(int i) {
    }

    public synchronized void setCloseErrorCallback(boolean z) {
    }

    public synchronized BuglyStrategy setCrashHandleCallback(C1499a c1499a) {
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z) {
    }

    public void setEnableCatchAnrTrace(boolean z) {
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z) {
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z) {
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
    }

    public void setMerged(boolean z) {
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z) {
    }

    public void setReplaceOldChannel(boolean z) {
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z) {
    }

    public synchronized void setUploadSpotCrash(boolean z) {
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
    }
}
