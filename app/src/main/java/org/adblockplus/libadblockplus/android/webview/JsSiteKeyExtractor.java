package org.adblockplus.libadblockplus.android.webview;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class JsSiteKeyExtractor extends BaseSiteKeyExtractor {
    private final Handler callerThreadHandler;
    private Runnable disableStateRunner;
    private Runnable enableStateRunner;
    private final AtomicBoolean isJavascriptInterfaceSet;
    private final AtomicBoolean isSiteKeyProcessingFinished;
    private volatile CountDownLatch latch;

    /* renamed from: org.adblockplus.libadblockplus.android.webview.JsSiteKeyExtractor$1 */
    class RunnableC17651 implements Runnable {
        final /* synthetic */ JsSiteKeyExtractor this$0;
        final /* synthetic */ AdblockWebView val$webView;

        RunnableC17651(JsSiteKeyExtractor jsSiteKeyExtractor, AdblockWebView adblockWebView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.webview.JsSiteKeyExtractor$2 */
    class RunnableC17662 implements Runnable {
        final /* synthetic */ JsSiteKeyExtractor this$0;
        final /* synthetic */ AdblockWebView val$webView;

        RunnableC17662(JsSiteKeyExtractor jsSiteKeyExtractor, AdblockWebView adblockWebView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class JsCallbackInterface {
        static final String NAME = "AbpCallback";
        private final WeakReference<JsSiteKeyExtractor> extractorRef;
        private final WeakReference<AdblockWebView> webViewRef;

        /* synthetic */ JsCallbackInterface(JsSiteKeyExtractor jsSiteKeyExtractor, RunnableC17651 runnableC17651) {
        }

        private JsSiteKeyExtractor getExtractorIfStillExist() {
        }

        @JavascriptInterface
        public void onDomNotReady(String str) {
        }

        @JavascriptInterface
        public void onSiteKeyDoesNotExist(String str) {
        }

        @JavascriptInterface
        public void onSiteKeyExtracted(String str, String str2, String str3) {
        }

        private JsCallbackInterface(JsSiteKeyExtractor jsSiteKeyExtractor) {
        }
    }

    JsSiteKeyExtractor(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ AtomicBoolean access$100(JsSiteKeyExtractor jsSiteKeyExtractor) {
    }

    static /* synthetic */ void access$200(JsSiteKeyExtractor jsSiteKeyExtractor, String str, String str2, String str3) {
    }

    static /* synthetic */ CountDownLatch access$300(JsSiteKeyExtractor jsSiteKeyExtractor) {
    }

    static /* synthetic */ AtomicBoolean access$400(JsSiteKeyExtractor jsSiteKeyExtractor) {
    }

    private void verifySiteKey(String str, String str2, String str3) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public WebResourceResponse extract(WebResourceRequest webResourceRequest) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.BaseSiteKeyExtractor, org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void setEnabled(boolean z) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void startNewPage() {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public boolean waitForSitekeyCheck(String str, boolean z) {
    }
}
