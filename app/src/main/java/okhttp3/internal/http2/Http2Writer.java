package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.http2.Hpack;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = null;
    private static final Logger logger = null;
    private final boolean client;
    private boolean closed;
    private final dppbpdpFXDhtOnccosy1lll1l hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll sink;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    public Http2Writer(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, boolean z) {
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    public final synchronized void connectionPreface() throws IOException {
    }

    public final synchronized void data(boolean z, int i, dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, int i2) throws IOException {
    }

    public final void dataFrame(int i, int i2, dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, int i3) throws IOException {
    }

    public final synchronized void flush() throws IOException {
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
    }

    public final Hpack.Writer getHpackWriter() {
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) throws IOException {
    }

    public final int maxDataLength() {
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
    }

    public final synchronized void settings(Settings settings) throws IOException {
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
    }
}
