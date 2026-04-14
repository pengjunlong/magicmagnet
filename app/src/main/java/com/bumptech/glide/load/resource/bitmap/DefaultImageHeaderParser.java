package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.bqqqdboFHPLTwaMWMSXnDNNlll11l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    private static final int[] dpbdbdpbLwkLpObyKsq1lll1 = null;

    private interface Reader {

        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
            }
        }

        int dbpqdHhmDSIHIJiwc1ll1l1() throws IOException;

        short dpbdbdpbLwkLpObyKsq1lll1() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    private static final class dbpqdHhmDSIHIJiwc1ll1l1 implements Reader {
        private final ByteBuffer dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(ByteBuffer byteBuffer) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int dbpqdHhmDSIHIJiwc1ll1l1() throws Reader.EndOfFileException {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short dpbdbdpbLwkLpObyKsq1lll1() throws Reader.EndOfFileException {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
        }
    }

    private static final class dpbdbdpbLwkLpObyKsq1lll1 {
        private final ByteBuffer dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1(byte[] bArr, int i) {
        }

        private boolean dqqppqiKzJi1l1lll1l(int i, int i2) {
        }

        void bpdqqiQNVROMLC1ll1l1l11(ByteOrder byteOrder) {
        }

        short dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }

        int dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        int dpbdpqRKAscW1lll1l() {
        }
    }

    private static final class dqqppqiKzJi1l1lll1l implements Reader {
        private final InputStream dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(InputStream inputStream) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int dbpqdHhmDSIHIJiwc1ll1l1() throws IOException {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short dpbdbdpbLwkLpObyKsq1lll1() throws IOException {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) throws IOException {
        }
    }

    private int bpdqqiQNVROMLC1ll1l1l11(Reader reader, bqqqdboFHPLTwaMWMSXnDNNlll11l1 bqqqdbofhpltwamwmsxndnnlll11l1) throws IOException {
    }

    private static int dbppbdqpeLmcbs11l11(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    private boolean ddbbbeXHXx111ll(byte[] bArr, int i) {
    }

    private static int dpbdpqRKAscW1lll1l(int i, int i2) {
    }

    private int dqpdbEevAufTOvPphbjykClll1l11(Reader reader) throws IOException {
    }

    private static boolean dqpqqqbqQyjyB11111l1(int i) {
    }

    private int pbppbpqbamJRy11l1l1(Reader reader, byte[] bArr, int i) throws IOException {
    }

    private ImageHeaderParser.ImageType ppbdpwWWljzmXXdHNabfWhgjl111l11(Reader reader) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int dbpqdHhmDSIHIJiwc1ll1l1(InputStream inputStream, bqqqdboFHPLTwaMWMSXnDNNlll11l1 bqqqdbofhpltwamwmsxndnnlll11l1) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType dpbdbdpbLwkLpObyKsq1lll1(ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType dqqppqiKzJi1l1lll1l(InputStream inputStream) throws IOException {
    }
}
