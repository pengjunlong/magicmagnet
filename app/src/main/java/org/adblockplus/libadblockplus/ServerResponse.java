package org.adblockplus.libadblockplus;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ServerResponse {
    private String finalUrl;
    private String[] headers;
    private InputStream inputStream;
    private ByteBuffer response;
    private int responseStatus;
    private long status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class NsStatus {
        private static final /* synthetic */ NsStatus[] $VALUES = null;
        public static final NsStatus CUSTOM_ERROR_BASE = null;
        private static final HashMap<Long, NsStatus> ENUM_MAP = null;
        public static final NsStatus ERROR_CONNECTION_REFUSED = null;
        public static final NsStatus ERROR_FAILURE = null;
        public static final NsStatus ERROR_MALFORMED_URI = null;
        public static final NsStatus ERROR_NET_INTERRUPT = null;
        public static final NsStatus ERROR_NET_RESET = null;
        public static final NsStatus ERROR_NET_TIMEOUT = null;
        public static final NsStatus ERROR_NOT_INITIALIZED = null;
        public static final NsStatus ERROR_NO_CONTENT = null;
        public static final NsStatus ERROR_OUT_OF_MEMORY = null;
        public static final NsStatus ERROR_REDIRECT_LOOP = null;
        public static final NsStatus ERROR_UNKNOWN_HOST = null;
        public static final NsStatus ERROR_UNKNOWN_PROTOCOL = null;
        public static final NsStatus ERROR_UNKNOWN_PROXY_CONNECTION_REFUSED = null;
        public static final NsStatus ERROR_UNKNOWN_PROXY_HOST = null;
        public static final NsStatus OK = null;
        private final long statusCode;

        private static /* synthetic */ NsStatus[] $values() {
        }

        private NsStatus(String str, int i, long j) {
        }

        public static NsStatus fromStatusCode(long j) {
        }

        public static NsStatus valueOf(String str) {
        }

        public static NsStatus[] values() {
        }

        public long getStatusCode() {
        }
    }

    public String getFinalUrl() {
    }

    public InputStream getInputStream() {
    }

    public ByteBuffer getResponse() {
    }

    public List<HeaderEntry> getResponseHeaders() {
    }

    public int getResponseStatus() {
    }

    public NsStatus getStatus() {
    }

    public void setFinalUrl(String str) {
    }

    public void setInputStream(InputStream inputStream) {
    }

    public void setResponse(ByteBuffer byteBuffer) {
    }

    public void setResponseHeaders(List<HeaderEntry> list) {
    }

    public void setResponseStatus(int i) {
    }

    public void setStatus(NsStatus nsStatus) {
    }
}
