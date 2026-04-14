package okhttp3.internal.http2;

import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ErrorCode {
    private static final /* synthetic */ ErrorCode[] $VALUES = null;
    public static final ErrorCode CANCEL = null;
    public static final ErrorCode COMPRESSION_ERROR = null;
    public static final ErrorCode CONNECT_ERROR = null;
    public static final Companion Companion = null;
    public static final ErrorCode ENHANCE_YOUR_CALM = null;
    public static final ErrorCode FLOW_CONTROL_ERROR = null;
    public static final ErrorCode FRAME_SIZE_ERROR = null;
    public static final ErrorCode HTTP_1_1_REQUIRED = null;
    public static final ErrorCode INADEQUATE_SECURITY = null;
    public static final ErrorCode INTERNAL_ERROR = null;
    public static final ErrorCode NO_ERROR = null;
    public static final ErrorCode PROTOCOL_ERROR = null;
    public static final ErrorCode REFUSED_STREAM = null;
    public static final ErrorCode SETTINGS_TIMEOUT = null;
    public static final ErrorCode STREAM_CLOSED = null;
    private final int httpCode;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final ErrorCode fromHttp2(int i) {
        }
    }

    private static final /* synthetic */ ErrorCode[] $values() {
    }

    private ErrorCode(String str, int i, int i2) {
    }

    public static ErrorCode valueOf(String str) {
    }

    public static ErrorCode[] values() {
    }

    public final int getHttpCode() {
    }
}
