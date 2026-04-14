package okhttp3;

import java.net.URL;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    @xc0
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
        }

        public Builder addHeader(String str, String str2) {
        }

        public Request build() {
        }

        public Builder cacheControl(CacheControl cacheControl) {
        }

        public final Builder delete() {
        }

        public Builder delete(RequestBody requestBody) {
        }

        public Builder get() {
        }

        public final RequestBody getBody$okhttp() {
        }

        public final Headers.Builder getHeaders$okhttp() {
        }

        public final String getMethod$okhttp() {
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
        }

        public final HttpUrl getUrl$okhttp() {
        }

        public Builder head() {
        }

        public Builder header(String str, String str2) {
        }

        public Builder headers(Headers headers) {
        }

        public Builder method(String str, RequestBody requestBody) {
        }

        public Builder patch(RequestBody requestBody) {
        }

        public Builder post(RequestBody requestBody) {
        }

        public Builder put(RequestBody requestBody) {
        }

        public Builder removeHeader(String str) {
        }

        public final void setBody$okhttp(RequestBody requestBody) {
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
        }

        public final void setMethod$okhttp(String str) {
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
        }

        public Builder tag(Object obj) {
        }

        public Builder url(HttpUrl httpUrl) {
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
        }

        public Builder url(String str) {
        }

        public Builder(Request request) {
        }

        public Builder url(URL url) {
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m998deprecated_body() {
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m999deprecated_cacheControl() {
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m1000deprecated_headers() {
    }

    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m1001deprecated_method() {
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m1002deprecated_url() {
    }

    public final RequestBody body() {
    }

    public final CacheControl cacheControl() {
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
    }

    public final String header(String str) {
    }

    public final Headers headers() {
    }

    public final boolean isHttps() {
    }

    public final String method() {
    }

    public final Builder newBuilder() {
    }

    public final Object tag() {
    }

    public String toString() {
    }

    public final HttpUrl url() {
    }

    public final List<String> headers(String str) {
    }

    public final <T> T tag(Class<? extends T> cls) {
    }
}
