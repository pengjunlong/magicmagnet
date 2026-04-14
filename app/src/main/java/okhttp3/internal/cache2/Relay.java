package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Relay {
    public static final Companion Companion = null;
    private static final long FILE_HEADER_SIZE = 32;
    public static final qqbddbbsOSPMeeOGlgesDt1l1l1 PREFIX_CLEAN = null;
    public static final qqbddbbsOSPMeeOGlgesDt1l1l1 PREFIX_DIRTY = null;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final dppbpdpFXDhtOnccosy1lll1l buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final qqbddbbsOSPMeeOGlgesDt1l1l1 metadata;
    private int sourceCount;
    private cl1 upstream;
    private final dppbpdpFXDhtOnccosy1lll1l upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final Relay edit(File file, cl1 cl1Var, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, long j) throws IOException {
        }

        public final Relay read(File file) throws IOException {
        }
    }

    @Metadata
    public final class RelaySource implements cl1 {
        private FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ Relay this$0;
        private final dpbdbdpbLwkLpObyKsq1lll1 timeout;

        public RelaySource(Relay relay) {
        }

        @Override // p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        @Override // p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
        }

        @Override // p000.cl1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }
    }

    private Relay(RandomAccessFile randomAccessFile, cl1 cl1Var, long j, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, long j2) {
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, cl1 cl1Var, long j, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, long j2, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public static final /* synthetic */ void access$writeHeader(Relay relay, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, long j, long j2) {
    }

    private final void writeHeader(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, long j, long j2) throws IOException {
    }

    private final void writeMetadata(long j) throws IOException {
    }

    public final void commit(long j) throws IOException {
    }

    public final dppbpdpFXDhtOnccosy1lll1l getBuffer() {
    }

    public final long getBufferMaxSize() {
    }

    public final boolean getComplete() {
    }

    public final RandomAccessFile getFile() {
    }

    public final int getSourceCount() {
    }

    public final cl1 getUpstream() {
    }

    public final dppbpdpFXDhtOnccosy1lll1l getUpstreamBuffer() {
    }

    public final long getUpstreamPos() {
    }

    public final Thread getUpstreamReader() {
    }

    public final boolean isClosed() {
    }

    public final qqbddbbsOSPMeeOGlgesDt1l1l1 metadata() {
    }

    public final cl1 newSource() {
    }

    public final void setComplete(boolean z) {
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
    }

    public final void setSourceCount(int i) {
    }

    public final void setUpstream(cl1 cl1Var) {
    }

    public final void setUpstreamPos(long j) {
    }

    public final void setUpstreamReader(Thread thread) {
    }
}
