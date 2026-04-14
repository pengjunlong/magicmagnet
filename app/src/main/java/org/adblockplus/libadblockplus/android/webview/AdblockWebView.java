package org.adblockplus.libadblockplus.android.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.adblockplus.libadblockplus.FilterEngine;
import org.adblockplus.libadblockplus.android.AdblockEngine;
import org.adblockplus.libadblockplus.android.AdblockEngineProvider;
import org.adblockplus.libadblockplus.android.webview.content_type.ContentTypeDetector;
import org.adblockplus.libadblockplus.android.webview.content_type.OrderedContentTypeDetector;
import org.adblockplus.libadblockplus.sitekey.SiteKeysConfiguration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AdblockWebView extends WebView {
    private static final String ASSETS_CHARSET_NAME = "UTF-8";
    private static final String BRIDGE = "jsBridge";
    private static final String BRIDGE_TOKEN = "{{BRIDGE}}";
    private static final String DEBUG_TOKEN = "{{DEBUG}}";
    private static final String EMPTY_ELEMHIDE_ARRAY_STRING = "[]";
    private static final String EMPTY_ELEMHIDE_STRING = "";
    private static final String HIDDEN_TOKEN = "{{HIDDEN_FLAG}}";
    private static final String HIDE_TOKEN = "{{HIDE}}";
    private static final String SITEKEY_EXTRACTED_TOKEN = "{{SITEKEY_EXTRACTED_FLAG}}";
    private final AtomicReference<OptionalBoolean> adblockEnabled;
    private OrderedContentTypeDetector contentTypeDetector;
    private String elementsHiddenFlag;
    private String elemhideBlockedJs;
    private final AdblockEngineProvider.EngineCreatedListener engineCreatedCb;
    private final AdblockEngineProvider.EngineDisposedListener engineDisposedCb;
    private final AdblockEngine.SettingsChangedListener engineSettingsChangedCb;
    private final AtomicReference<EventsListener> eventsListenerAtomicReference;
    private String injectJs;
    private ProxyWebChromeClient intWebChromeClient;
    private ProxyWebViewClient intWebViewClient;
    private final AtomicBoolean jsInIframesEnabled;
    private Integer loadError;
    private boolean loading;
    private final AtomicReference<String> navigationUrl;
    private final AtomicReference<AdblockEngineProvider> providerReference;
    private SiteKeyExtractor siteKeyExtractor;
    private final AtomicReference<SiteKeysConfiguration> siteKeysConfiguration;
    private String sitekeyExtractedFlag;
    private final Map<String, String> url2Referrer;
    private final Map<String, Pair<String, String>> url2Stylesheets;

    /* renamed from: org.adblockplus.libadblockplus.android.webview.AdblockWebView$1 */
    class C17591 implements AdblockEngine.SettingsChangedListener {
        final /* synthetic */ AdblockWebView this$0;

        /* renamed from: org.adblockplus.libadblockplus.android.webview.AdblockWebView$1$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ C17591 this$1;

            AnonymousClass1(C17591 c17591) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        C17591(AdblockWebView adblockWebView) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngine.SettingsChangedListener
        public void onEnableStateChanged(boolean z) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.webview.AdblockWebView$2 */
    class C17602 implements AdblockEngineProvider.EngineCreatedListener {
        final /* synthetic */ AdblockWebView this$0;

        C17602(AdblockWebView adblockWebView) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider.EngineCreatedListener
        public void onAdblockEngineCreated(AdblockEngine adblockEngine) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.webview.AdblockWebView$3 */
    class C17613 implements AdblockEngineProvider.EngineDisposedListener {
        final /* synthetic */ AdblockWebView this$0;

        C17613(AdblockWebView adblockWebView) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider.EngineDisposedListener
        public void onAdblockEngineDisposed() {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.webview.AdblockWebView$4 */
    class RunnableC17624 implements Runnable {
        final /* synthetic */ AdblockWebView this$0;
        final /* synthetic */ AdblockEngineProvider val$provider;

        RunnableC17624(AdblockWebView adblockWebView, AdblockEngineProvider adblockEngineProvider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.webview.AdblockWebView$5 */
    class RunnableC17635 implements Runnable {
        final /* synthetic */ AdblockWebView this$0;
        final /* synthetic */ StringBuilder val$selectorBuilder;
        final /* synthetic */ String val$url;

        RunnableC17635(AdblockWebView adblockWebView, String str, StringBuilder sb) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class AbpShouldBlockResult {
        private static final /* synthetic */ AbpShouldBlockResult[] $VALUES = null;
        public static final AbpShouldBlockResult ALLOW_LOAD = null;
        public static final AbpShouldBlockResult ALLOW_LOAD_NO_SITEKEY_CHECK = null;
        public static final AbpShouldBlockResult BLOCK_LOAD = null;
        public static final AbpShouldBlockResult NOT_ENABLED = null;

        private static /* synthetic */ AbpShouldBlockResult[] $values() {
        }

        private AbpShouldBlockResult(String str, int i) {
        }

        public static AbpShouldBlockResult valueOf(String str) {
        }

        public static AbpShouldBlockResult[] values() {
        }
    }

    private class AdblockWebWebChromeClient extends ProxyWebChromeClient {
        final /* synthetic */ AdblockWebView this$0;

        AdblockWebWebChromeClient(AdblockWebView adblockWebView, WebChromeClient webChromeClient) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebChromeClient, android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebChromeClient, android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }
    }

    private class DisposeRunnable implements Runnable {
        private final Runnable disposeFinished;
        final /* synthetic */ AdblockWebView this$0;

        /* synthetic */ DisposeRunnable(AdblockWebView adblockWebView, Runnable runnable, C17591 c17591) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        private DisposeRunnable(AdblockWebView adblockWebView, Runnable runnable) {
        }
    }

    public interface EventsListener {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class AllowlistReason {
            private static final /* synthetic */ AllowlistReason[] $VALUES = null;
            public static final AllowlistReason DOCUMENT = null;
            public static final AllowlistReason DOMAIN = null;
            public static final AllowlistReason FILTER = null;

            private static /* synthetic */ AllowlistReason[] $values() {
            }

            private AllowlistReason(String str, int i) {
            }

            public static AllowlistReason valueOf(String str) {
            }

            public static AllowlistReason[] values() {
            }
        }

        public static final class AllowlistedResourceInfo extends ResourceInfo {
            private final AllowlistReason reason;

            public AllowlistedResourceInfo(String str, List<String> list, AllowlistReason allowlistReason) {
            }

            public AllowlistReason getReason() {
            }
        }

        public static final class BlockedResourceInfo extends ResourceInfo {
            private final FilterEngine.ContentType contentType;

            BlockedResourceInfo(String str, List<String> list, FilterEngine.ContentType contentType) {
            }

            public FilterEngine.ContentType getContentType() {
            }
        }

        public static class ResourceInfo {
            private final List<String> parentFrameUrls;
            private final String requestUrl;

            ResourceInfo(String str, List<String> list) {
            }

            public List<String> getParentFrameUrls() {
            }

            public String getRequestUrl() {
            }
        }

        void onNavigation();

        void onResourceLoadingAllowlisted(AllowlistedResourceInfo allowlistedResourceInfo);

        void onResourceLoadingBlocked(BlockedResourceInfo blockedResourceInfo);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class OptionalBoolean {
        private static final /* synthetic */ OptionalBoolean[] $VALUES = null;
        public static final OptionalBoolean FALSE = null;
        public static final OptionalBoolean TRUE = null;
        public static final OptionalBoolean UNDEFINED = null;

        private static /* synthetic */ OptionalBoolean[] $values() {
        }

        private OptionalBoolean(String str, int i) {
        }

        public static OptionalBoolean from(boolean z) {
        }

        public static OptionalBoolean valueOf(String str) {
        }

        public static OptionalBoolean[] values() {
        }
    }

    public static class WebResponseResult {
        public static final WebResourceResponse ALLOW_LOAD = null;
        public static final WebResourceResponse BLOCK_LOAD = null;
        public static final String RESPONSE_CHARSET_NAME = "UTF-8";
        public static final String RESPONSE_MIME_TYPE = "text/plain";
    }

    public AdblockWebView(Context context) {
    }

    static /* synthetic */ AtomicReference access$000(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ AdblockEngine.SettingsChangedListener access$100(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ void access$1000(AdblockWebView adblockWebView, String str) {
    }

    static /* synthetic */ void access$1100(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ Integer access$1202(AdblockWebView adblockWebView, Integer num) {
    }

    static /* synthetic */ boolean access$1300(AdblockWebView adblockWebView, FilterEngine.ContentType contentType) {
    }

    static /* synthetic */ void access$1400(AdblockWebView adblockWebView, String str) {
    }

    static /* synthetic */ void access$1500(AdblockWebView adblockWebView, EventsListener.BlockedResourceInfo blockedResourceInfo) {
    }

    static /* synthetic */ Map access$1600(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ SiteKeyExtractor access$1700(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ void access$1800(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ List access$1900(AdblockWebView adblockWebView, String str) {
    }

    static /* synthetic */ AtomicReference access$200(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ ContentTypeDetector access$2000(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ void access$2100(AdblockWebView adblockWebView, EventsListener.AllowlistedResourceInfo allowlistedResourceInfo) {
    }

    static /* synthetic */ AtomicReference access$2200(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ String access$2300(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ void access$2400(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ AdblockEngineProvider access$300(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ AdblockEngineProvider.EngineCreatedListener access$400(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ AdblockEngineProvider.EngineDisposedListener access$500(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ void access$600(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ void access$700(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ boolean access$800(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ boolean access$802(AdblockWebView adblockWebView, boolean z) {
    }

    static /* synthetic */ void access$900(AdblockWebView adblockWebView) {
    }

    private List<String> buildFramesHierarchy(String str) {
    }

    private void buildInjectJs() {
    }

    private void clearReferrers() {
    }

    private void clearStylesheets() {
    }

    private void doDispose() {
    }

    private void elemhideBlockedResource(String str) {
    }

    private ContentTypeDetector ensureContentTypeDetectorCreatedAndGet() {
    }

    private void ensureProvider() {
    }

    private EventsListener getEventsListener() {
    }

    private AdblockEngineProvider getProvider() {
    }

    private Pair<String, String> getStylesheetsForUrl(String str) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void initAbp() {
    }

    private void initRandom() {
    }

    private boolean isVisibleResource(FilterEngine.ContentType contentType) {
    }

    private void loadUrlCommon() {
    }

    private void notifyNavigation() {
    }

    private void notifyResourceAllowlisted(EventsListener.AllowlistedResourceInfo allowlistedResourceInfo) {
    }

    private void notifyResourceBlocked(EventsListener.BlockedResourceInfo blockedResourceInfo) {
    }

    private String readScriptFile(String str) throws IOException {
    }

    private void runScript(String str) {
    }

    private void startAbpLoading(String str) {
    }

    private void stopAbpLoading() {
    }

    private void tryInjectJs() {
    }

    public void dispose(Runnable runnable) {
    }

    public void enableJsInIframes(boolean z) throws IllegalStateException {
    }

    public boolean generateStylesheetForUrl(String str, boolean z) {
    }

    @JavascriptInterface
    public String getElemhideEmulationSelectors(String str) {
    }

    @JavascriptInterface
    public String getElemhideStyleSheet(String str) {
    }

    public String getInjectJs() {
    }

    public boolean getJsInIframesEnabled() {
    }

    public String getNavigationUrl() {
    }

    public SiteKeyExtractor getSiteKeyExtractor() {
    }

    public SiteKeysConfiguration getSiteKeysConfiguration() {
    }

    @Override // android.webkit.WebView
    public void goBack() {
    }

    @Override // android.webkit.WebView
    public void goForward() {
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
    }

    @Override // android.webkit.WebView
    public void reload() {
    }

    @Override // android.webkit.WebView
    public WebBackForwardList restoreState(Bundle bundle) {
    }

    public void setEventsListener(EventsListener eventsListener) {
    }

    public void setProvider(AdblockEngineProvider adblockEngineProvider) {
    }

    public void setSiteKeyExtractor(SiteKeyExtractor siteKeyExtractor) {
    }

    public void setSiteKeysConfiguration(SiteKeysConfiguration siteKeysConfiguration) {
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
    }

    private class AdblockWebViewClient extends ProxyWebViewClient {
        final /* synthetic */ AdblockWebView this$0;

        AdblockWebViewClient(AdblockWebView adblockWebView, WebViewClient webViewClient) {
        }

        private String getFirstParent(List<String> list) {
        }

        private AbpShouldBlockResult notifyAndReturnBlockingResponse(String str, List<String> list, FilterEngine.ContentType contentType) {
        }

        private AbpShouldBlockResult shouldAbpBlockRequest(WebResourceRequest webResourceRequest) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.ProxyWebViewClient, android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
    }

    public AdblockWebView(Context context, AttributeSet attributeSet) {
    }

    public AdblockWebView(Context context, AttributeSet attributeSet, int i) {
    }
}
