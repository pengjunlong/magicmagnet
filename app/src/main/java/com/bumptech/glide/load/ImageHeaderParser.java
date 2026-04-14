package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.bqqqdboFHPLTwaMWMSXnDNNlll11l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface ImageHeaderParser {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ImageType {
        private static final /* synthetic */ ImageType[] $VALUES = null;
        public static final ImageType GIF = null;
        public static final ImageType JPEG = null;
        public static final ImageType PNG = null;
        public static final ImageType PNG_A = null;
        public static final ImageType RAW = null;
        public static final ImageType UNKNOWN = null;
        public static final ImageType WEBP = null;
        public static final ImageType WEBP_A = null;
        private final boolean dpbdpqRKAscW1lll1l;

        private ImageType(String str, int i, boolean z) {
        }

        public static ImageType valueOf(String str) {
        }

        public static ImageType[] values() {
        }

        public boolean hasAlpha() {
        }
    }

    int dbpqdHhmDSIHIJiwc1ll1l1(InputStream inputStream, bqqqdboFHPLTwaMWMSXnDNNlll11l1 bqqqdbofhpltwamwmsxndnnlll11l1) throws IOException;

    ImageType dpbdbdpbLwkLpObyKsq1lll1(ByteBuffer byteBuffer) throws IOException;

    ImageType dqqppqiKzJi1l1lll1l(InputStream inputStream) throws IOException;
}
