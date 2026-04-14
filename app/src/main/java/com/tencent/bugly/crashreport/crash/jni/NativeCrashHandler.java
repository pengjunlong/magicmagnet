package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tencent.bugly.crashreport.InterfaceC1535b;
import com.tencent.bugly.crashreport.common.info.C1543a;
import com.tencent.bugly.crashreport.common.strategy.C1548c;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.C1565e;
import com.tencent.bugly.proguard.C1601W;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NativeCrashHandler implements InterfaceC1535b {

    /* renamed from: a */
    private static NativeCrashHandler f732a = null;

    /* renamed from: b */
    private static int f733b = 1;

    /* renamed from: c */
    private static boolean f734c = false;

    /* renamed from: d */
    private static boolean f735d = false;

    /* renamed from: e */
    private static boolean f736e = true;

    /* renamed from: f */
    private final Context f737f;

    /* renamed from: g */
    private final C1543a f738g;

    /* renamed from: h */
    private final C1601W f739h;

    /* renamed from: i */
    private NativeExceptionHandler f740i;

    /* renamed from: j */
    private String f741j;

    /* renamed from: k */
    private final boolean f742k;

    /* renamed from: l */
    private boolean f743l;

    /* renamed from: m */
    private boolean f744m;

    /* renamed from: n */
    private boolean f745n;

    /* renamed from: o */
    private boolean f746o;

    /* renamed from: p */
    private C1565e f747p;

    @SuppressLint({"SdCardPath"})
    protected NativeCrashHandler(Context context, C1543a c1543a, C1565e c1565e, C1548c c1548c, C1601W c1601w, boolean z, String str) {
    }

    /* renamed from: a */
    static /* synthetic */ Context m450a(NativeCrashHandler nativeCrashHandler) {
    }

    /* renamed from: b */
    static /* synthetic */ String m456b(NativeCrashHandler nativeCrashHandler) {
    }

    /* renamed from: c */
    static /* synthetic */ NativeExceptionHandler m457c(NativeCrashHandler nativeCrashHandler) {
    }

    /* renamed from: d */
    static /* synthetic */ C1565e m459d(NativeCrashHandler nativeCrashHandler) {
    }

    public static synchronized NativeCrashHandler getInstance(Context context, C1543a c1543a, C1565e c1565e, C1548c c1548c, C1601W c1601w, boolean z, String str) {
    }

    public static boolean isShouldHandleInJava() {
    }

    public static void setShouldHandleInJava(boolean z) {
    }

    @Override // com.tencent.bugly.crashreport.InterfaceC1535b
    public boolean appendLogToNative(String str, String str2, String str3) {
    }

    protected native boolean appendNativeLog(String str, String str2, String str3);

    protected native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
    }

    public void dumpAnrNativeStack() {
    }

    public void enableCatchAnrTrace() {
    }

    public boolean filterSigabrtSysLog() {
    }

    public synchronized String getDumpFilePath() {
    }

    @Override // com.tencent.bugly.crashreport.InterfaceC1535b
    public String getLogFromNative() {
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
    }

    protected native String getNativeKeyValueList();

    protected native String getNativeLog();

    public boolean isEnableCatchAnrTrace() {
    }

    public synchronized boolean isUserOpened() {
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
    }

    public boolean putKeyValueToNative(String str, String str2) {
    }

    protected native boolean putNativeKeyValue(String str, String str2);

    protected native String regist(String str, boolean z, int i);

    public void removeEmptyNativeRecordFiles() {
    }

    protected native String removeNativeKeyValue(String str);

    public synchronized void setDumpFilePath(String str) {
    }

    public boolean setNativeAppChannel(String str) {
    }

    public boolean setNativeAppPackage(String str) {
    }

    public boolean setNativeAppVersion(String str) {
    }

    protected native void setNativeInfo(int i, String str);

    @Override // com.tencent.bugly.crashreport.InterfaceC1535b
    public boolean setNativeIsAppForeground(boolean z) {
    }

    public boolean setNativeLaunchTime(long j) {
    }

    public boolean setNativeUserId(String str) {
    }

    public synchronized void setUserOpened(boolean z) {
    }

    public synchronized void startNativeMonitor() {
    }

    protected native void testCrash();

    public void testNativeCrash() {
    }

    protected native String unregist();

    /* renamed from: a */
    static /* synthetic */ boolean m452a() {
    }

    /* renamed from: b */
    protected void m461b() {
    }

    /* renamed from: c */
    protected synchronized void m463c() {
    }

    /* renamed from: a */
    static /* synthetic */ boolean m454a(NativeCrashHandler nativeCrashHandler, int i, String str) {
    }

    /* renamed from: a */
    private static void m451a(String str) {
    }

    public static synchronized NativeCrashHandler getInstance() {
    }

    public void testNativeCrash(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: c */
    private synchronized void m458c(boolean z) {
    }

    /* renamed from: b */
    protected synchronized void m462b(boolean z) {
    }

    /* renamed from: a */
    protected synchronized void m460a(boolean z) {
    }

    /* renamed from: a */
    private boolean m455a(String str, boolean z) {
    }

    /* renamed from: a */
    private boolean m453a(int i, String str) {
    }
}
