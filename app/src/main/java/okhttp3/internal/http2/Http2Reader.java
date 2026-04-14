package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.http2.Hpack;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = null;
    private static final Logger logger = null;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final qbbbpbbbiFxIAmEwllll11 source;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final Logger getLogger() {
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
        }
    }

    @Metadata
    public static final class ContinuationSource implements cl1 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final qbbbpbbbiFxIAmEwllll11 source;
        private int streamId;

        public ContinuationSource(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) {
        }

        private final void readContinuationHeader() throws IOException {
        }

        @Override // p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        public final int getFlags() {
        }

        public final int getLeft() {
        }

        public final int getLength() {
        }

        public final int getPadding() {
        }

        public final int getStreamId() {
        }

        @Override // p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
        }

        public final void setFlags(int i) {
        }

        public final void setLeft(int i) {
        }

        public final void setLength(int i) {
        }

        public final void setPadding(int i) {
        }

        public final void setStreamId(int i) {
        }

        @Override // p000.cl1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }
    }

    @Metadata
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, String str2, int i2, long j);

        void data(boolean z, int i, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, boolean z) {
    }

    public static final /* synthetic */ Logger access$getLogger$cp() {
    }

    private final void readData(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) throws IOException {
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readPing(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readSettings(Handler handler, int i, int i2, int i3) throws IOException {
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
    }

    private final void readPriority(Handler handler, int i) throws IOException {
    }
}
