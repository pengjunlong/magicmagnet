package org.adblockplus.libadblockplus;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class HttpClient {
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_CONTENT_LENGTH = "content-length";
    public static final String HEADER_CONTENT_TYPE = "content-type";
    public static final String HEADER_COOKIE = "Cookie";
    public static final String HEADER_CSP = "content-security-policy";
    public static final String HEADER_DATE = "date";
    public static final String HEADER_EXPIRES = "expires";
    public static final String HEADER_LAST_MODIFIED = "last-modified";
    public static final String HEADER_LOCATION = "Location";
    public static final String HEADER_PROXY_AUTHENTICATE = "proxy-authenticate";
    public static final String HEADER_REFERRER = "Referer";
    public static final String HEADER_REFRESH = "Refresh";
    public static final String HEADER_REQUESTED_RANGE = "Range";
    public static final String HEADER_REQUESTED_WITH = "X-Requested-With";
    public static final String HEADER_REQUESTED_WITH_XMLHTTPREQUEST = "XMLHttpRequest";
    public static final String HEADER_RETRY_AFTER = "retry-after";
    public static final String HEADER_SET_COOKIE = "set-cookie";
    public static final String HEADER_SITEKEY = "x-adblock-key";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String HEADER_VIA = "via";
    public static final String HEADER_WWW_AUTHENTICATE = "www-authenticate";
    public static final String MIME_TYPE_TEXT_HTML = "text/html";
    public static final String REQUEST_METHOD_DELETE = "DELETE";
    public static final String REQUEST_METHOD_GET = "GET";
    public static final String REQUEST_METHOD_HEAD = "HEAD";
    public static final String REQUEST_METHOD_OPTIONS = "OPTIONS";
    public static final String REQUEST_METHOD_POST = "POST";
    public static final String REQUEST_METHOD_PUT = "PUT";
    public static final String REQUEST_METHOD_TRACE = "TRACE";
    public static final int STATUS_CODE_OK = 200;

    public interface Callback {
        void onFinished(ServerResponse serverResponse);
    }

    public static class JniCallback implements Callback, Disposable {
        private final Disposer disposer;
        protected final long ptr;

        private static final class DisposeWrapper implements Disposable {
            private final long ptr;

            public DisposeWrapper(long j) {
            }

            @Override // org.adblockplus.libadblockplus.Disposable
            public void dispose() {
            }
        }

        public JniCallback(long j) {
        }

        @Override // org.adblockplus.libadblockplus.Disposable
        public void dispose() {
        }

        @Override // org.adblockplus.libadblockplus.HttpClient.Callback
        public void onFinished(ServerResponse serverResponse) {
        }
    }

    static /* synthetic */ void access$000(long j) {
    }

    static /* synthetic */ void access$100(long j, ServerResponse serverResponse) {
    }

    private static native void callbackDtor(long j);

    private static native void callbackOnFinished(long j, ServerResponse serverResponse);

    public static boolean isNoContentCode(int i) {
    }

    public static boolean isRedirectCode(int i) {
    }

    public static boolean isSuccessCode(int i) {
    }

    public static boolean isValidCode(int i) {
    }

    private static native void registerNatives();

    public abstract void request(HttpRequest httpRequest, Callback callback);
}
