package com.tencent.bugly.crashreport;

import android.webkit.WebView;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;

/* renamed from: com.tencent.bugly.crashreport.a */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class C1534a implements CrashReport.WebViewInterface {

    /* renamed from: a */
    final /* synthetic */ WebView f419a;

    C1534a(WebView webView) {
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str) {
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public CharSequence getContentDescription() {
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public String getUrl() {
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public void loadUrl(String str) {
    }

    @Override // com.tencent.bugly.crashreport.CrashReport.WebViewInterface
    public void setJavaScriptEnabled(boolean z) {
    }
}
