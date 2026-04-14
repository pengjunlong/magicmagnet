package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    public static final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        private String key;
        private long length;
        private long position;
        private Uri uri;
        private long uriPositionOffset;

        /* synthetic */ Builder(DataSpec dataSpec, C02241 c02241) {
        }

        public DataSpec build() {
        }

        @CanIgnoreReturnValue
        public Builder setCustomData(Object obj) {
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setHttpBody(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setHttpMethod(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setHttpRequestHeaders(Map<String, String> map) {
        }

        @CanIgnoreReturnValue
        public Builder setKey(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setLength(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setPosition(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setUri(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setUriPositionOffset(long j) {
        }

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setUri(Uri uri) {
        }

        private Builder(DataSpec dataSpec) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    /* synthetic */ DataSpec(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, C02241 c02241) {
    }

    public static String getStringForHttpMethod(int i) {
    }

    public Builder buildUpon() {
    }

    public final String getHttpMethodString() {
    }

    public boolean isFlagSet(int i) {
    }

    public DataSpec subrange(long j) {
    }

    public String toString() {
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
    }

    public DataSpec withUri(Uri uri) {
    }

    public DataSpec(Uri uri) {
    }

    public DataSpec subrange(long j, long j2) {
    }

    public DataSpec(Uri uri, long j, long j2) {
    }

    @Deprecated
    public DataSpec(Uri uri, int i) {
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, String str) {
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, String str, int i) {
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, String str, int i, Map<String, String> map) {
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, long j3, String str, int i) {
    }

    @Deprecated
    public DataSpec(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
    }

    @Deprecated
    public DataSpec(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
    }

    @Deprecated
    public DataSpec(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2, Map<String, String> map) {
    }

    private DataSpec(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
    }
}
