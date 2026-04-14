package com.tencent.bugly.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.HashSet;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class H5JavaScriptInterface {

    /* renamed from: a */
    private static HashSet<Integer> f707a;

    /* renamed from: b */
    private String f708b;

    /* renamed from: c */
    private Thread f709c;

    /* renamed from: d */
    private String f710d;

    /* renamed from: e */
    private Map<String, String> f711e;

    private H5JavaScriptInterface() {
    }

    /* renamed from: a */
    private static String m444a(Thread thread) {
    }

    public static H5JavaScriptInterface getInstance(CrashReport.WebViewInterface webViewInterface) {
    }

    @JavascriptInterface
    public void printLog(String str) {
    }

    @JavascriptInterface
    public void reportJSException(String str) {
    }

    /* renamed from: a */
    private static Map<String, String> m445a(CrashReport.WebViewInterface webViewInterface) {
    }

    /* renamed from: a */
    private C1569a m443a(String str) {
    }

    /* renamed from: a */
    private static void m446a(C1569a c1569a, Thread thread, Map<String, String> map) {
    }
}
