package org.adblockplus.libadblockplus.android.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.adblockplus.libadblockplus.HttpClient;
import org.adblockplus.libadblockplus.ServerResponse;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HttpHeaderSiteKeyExtractor extends BaseSiteKeyExtractor {
    private final AtomicBoolean acceptThirdPartyCookies;

    /* renamed from: org.adblockplus.libadblockplus.android.webview.HttpHeaderSiteKeyExtractor$1 */
    class C17641 implements HttpClient.Callback {
        final /* synthetic */ HttpHeaderSiteKeyExtractor this$0;
        final /* synthetic */ CountDownLatch val$latch;
        final /* synthetic */ ResponseHolder val$responseHolder;

        C17641(HttpHeaderSiteKeyExtractor httpHeaderSiteKeyExtractor, ResponseHolder responseHolder, CountDownLatch countDownLatch) {
        }

        @Override // org.adblockplus.libadblockplus.HttpClient.Callback
        public void onFinished(ServerResponse serverResponse) {
        }
    }

    public static class ResourceInfo {
        private static final String[] BINARY_MIMES = null;
        private static final String CHARSET = "charset=";
        private static final int CHARSET_LENGTH = 8;
        private String encoding;
        private boolean isBinary;
        private String mimeType;

        static /* synthetic */ void access$000(ResourceInfo resourceInfo) {
        }

        public static ResourceInfo parse(String str) {
        }

        private void trim() {
        }

        public String getEncoding() {
        }

        public String getMimeType() {
        }

        public boolean isBinary() {
        }

        public void setEncoding(String str) {
        }

        public void setMimeType(String str) {
        }
    }

    private static class ResponseHolder {
        ServerResponse response;

        private ResponseHolder() {
        }

        /* synthetic */ ResponseHolder(C17641 c17641) {
        }
    }

    public static class ServerResponseProcessor {
        private static final String BODY_CLOSE_TAG = "</body>";
        private static final String CSP_SCRIPT_SRC_PARAM = "script-src";
        private static final String CSP_UNSAFE_INLINE = "'unsafe-inline'";
        private static final String NONCE = "nonce-";
        private static final Pattern NONCE_PATTERN = null;

        private boolean containsValidUnsafeInline(String str) {
        }

        protected boolean injectJavascript(AdblockWebView adblockWebView, String str, ServerResponse serverResponse, Map<String, String> map) {
        }

        public WebResourceResponse process(AdblockWebView adblockWebView, String str, ServerResponse serverResponse, Map<String, String> map) {
        }

        protected String readFileToString(InputStream inputStream) {
        }

        protected String updateCspHeader(Map<String, String> map) {
        }
    }

    public HttpHeaderSiteKeyExtractor(AdblockWebView adblockWebView) {
    }

    static /* synthetic */ String access$100(ServerResponse.NsStatus nsStatus) {
    }

    private static String getReasonPhrase(ServerResponse.NsStatus nsStatus) {
    }

    private ServerResponse sendRequest(WebResourceRequest webResourceRequest) throws InterruptedException {
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
