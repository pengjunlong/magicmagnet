package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m1003deprecated_body() {
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m1004deprecated_cacheControl() {
    }

    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m1005deprecated_cacheResponse() {
    }

    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m1006deprecated_code() {
    }

    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m1007deprecated_handshake() {
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m1008deprecated_headers() {
    }

    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m1009deprecated_message() {
    }

    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m1010deprecated_networkResponse() {
    }

    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m1011deprecated_priorResponse() {
    }

    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m1012deprecated_protocol() {
    }

    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m1013deprecated_receivedResponseAtMillis() {
    }

    /* renamed from: -deprecated_request, reason: not valid java name */
    public final Request m1014deprecated_request() {
    }

    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m1015deprecated_sentRequestAtMillis() {
    }

    public final ResponseBody body() {
    }

    public final CacheControl cacheControl() {
    }

    public final Response cacheResponse() {
    }

    public final List<Challenge> challenges() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final int code() {
    }

    public final Exchange exchange() {
    }

    public final Handshake handshake() {
    }

    public final String header(String str) {
    }

    public final String header(String str, String str2) {
    }

    public final Headers headers() {
    }

    public final boolean isRedirect() {
    }

    public final boolean isSuccessful() {
    }

    public final String message() {
    }

    public final Response networkResponse() {
    }

    public final Builder newBuilder() {
    }

    public final ResponseBody peekBody(long j) throws IOException {
    }

    public final Response priorResponse() {
    }

    public final Protocol protocol() {
    }

    public final long receivedResponseAtMillis() {
    }

    public final Request request() {
    }

    public final long sentRequestAtMillis() {
    }

    public String toString() {
    }

    public final Headers trailers() throws IOException {
    }

    public final List<String> headers(String str) {
    }

    @Metadata
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
        }

        private final void checkPriorResponse(Response response) {
        }

        private final void checkSupportResponse(String str, Response response) {
        }

        public Builder addHeader(String str, String str2) {
        }

        public Builder body(ResponseBody responseBody) {
        }

        public Response build() {
        }

        public Builder cacheResponse(Response response) {
        }

        public Builder code(int i) {
        }

        public final ResponseBody getBody$okhttp() {
        }

        public final Response getCacheResponse$okhttp() {
        }

        public final int getCode$okhttp() {
        }

        public final Exchange getExchange$okhttp() {
        }

        public final Handshake getHandshake$okhttp() {
        }

        public final Headers.Builder getHeaders$okhttp() {
        }

        public final String getMessage$okhttp() {
        }

        public final Response getNetworkResponse$okhttp() {
        }

        public final Response getPriorResponse$okhttp() {
        }

        public final Protocol getProtocol$okhttp() {
        }

        public final long getReceivedResponseAtMillis$okhttp() {
        }

        public final Request getRequest$okhttp() {
        }

        public final long getSentRequestAtMillis$okhttp() {
        }

        public Builder handshake(Handshake handshake) {
        }

        public Builder header(String str, String str2) {
        }

        public Builder headers(Headers headers) {
        }

        public final void initExchange$okhttp(Exchange exchange) {
        }

        public Builder message(String str) {
        }

        public Builder networkResponse(Response response) {
        }

        public Builder priorResponse(Response response) {
        }

        public Builder protocol(Protocol protocol) {
        }

        public Builder receivedResponseAtMillis(long j) {
        }

        public Builder removeHeader(String str) {
        }

        public Builder request(Request request) {
        }

        public Builder sentRequestAtMillis(long j) {
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
        }

        public final void setCacheResponse$okhttp(Response response) {
        }

        public final void setCode$okhttp(int i) {
        }

        public final void setExchange$okhttp(Exchange exchange) {
        }

        public final void setHandshake$okhttp(Handshake handshake) {
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
        }

        public final void setMessage$okhttp(String str) {
        }

        public final void setNetworkResponse$okhttp(Response response) {
        }

        public final void setPriorResponse$okhttp(Response response) {
        }

        public final void setProtocol$okhttp(Protocol protocol) {
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
        }

        public final void setRequest$okhttp(Request request) {
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
        }

        public Builder(Response response) {
        }
    }
}
