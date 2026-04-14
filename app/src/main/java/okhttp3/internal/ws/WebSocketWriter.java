package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final dppbpdpFXDhtOnccosy1lll1l.dbpqdHhmDSIHIJiwc1ll1l1 maskCursor;
    private final byte[] maskKey;
    private final dppbpdpFXDhtOnccosy1lll1l messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll sink;
    private final dppbpdpFXDhtOnccosy1lll1l sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, Random random, boolean z2, boolean z3, long j) {
    }

    private final void writeControlFrame(int i, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final Random getRandom() {
    }

    public final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll getSink() {
    }

    public final void writeClose(int i, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }

    public final void writeMessageFrame(int i, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }

    public final void writePing(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }

    public final void writePong(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }
}
