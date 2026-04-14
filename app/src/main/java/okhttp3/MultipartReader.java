package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.ep0;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = null;
    private static final ep0 afterBoundaryOptions = null;
    private final String boundary;
    private boolean closed;
    private final qqbddbbsOSPMeeOGlgesDt1l1l1 crlfDashDashBoundary;
    private PartSource currentPart;
    private final qqbddbbsOSPMeeOGlgesDt1l1l1 dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final qbbbpbbbiFxIAmEwllll11 source;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final ep0 getAfterBoundaryOptions() {
        }
    }

    @Metadata
    public static final class Part implements Closeable {
        private final qbbbpbbbiFxIAmEwllll11 body;
        private final Headers headers;

        public Part(Headers headers, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) {
        }

        public final qbbbpbbbiFxIAmEwllll11 body() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final Headers headers() {
        }
    }

    @Metadata
    private final class PartSource implements cl1 {
        final /* synthetic */ MultipartReader this$0;
        private final dpbdbdpbLwkLpObyKsq1lll1 timeout;

        public PartSource(MultipartReader multipartReader) {
        }

        @Override // p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
        }

        @Override // p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }

        @Override // p000.cl1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }
    }

    public MultipartReader(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, String str) throws IOException {
    }

    public static final /* synthetic */ long access$currentPartBytesRemaining(MultipartReader multipartReader, long j) {
    }

    public static final /* synthetic */ ep0 access$getAfterBoundaryOptions$cp() {
    }

    public static final /* synthetic */ PartSource access$getCurrentPart$p(MultipartReader multipartReader) {
    }

    public static final /* synthetic */ qbbbpbbbiFxIAmEwllll11 access$getSource$p(MultipartReader multipartReader) {
    }

    public static final /* synthetic */ void access$setCurrentPart$p(MultipartReader multipartReader, PartSource partSource) {
    }

    private final long currentPartBytesRemaining(long j) {
    }

    public final String boundary() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final Part nextPart() throws IOException {
    }

    public MultipartReader(ResponseBody responseBody) throws IOException {
    }
}
