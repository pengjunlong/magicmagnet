package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final dppbpdpFXDhtOnccosy1lll1l controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final dppbpdpFXDhtOnccosy1lll1l.dbpqdHhmDSIHIJiwc1ll1l1 maskCursor;
    private final byte[] maskKey;
    private final dppbpdpFXDhtOnccosy1lll1l messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final qbbbpbbbiFxIAmEwllll11 source;

    @Metadata
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException;

        void onReadPing(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1);

        void onReadPong(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1);
    }

    public WebSocketReader(boolean z, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, FrameCallback frameCallback, boolean z2, boolean z3) {
    }

    private final void readControlFrame() throws IOException {
    }

    private final void readHeader() throws IOException, ProtocolException {
    }

    private final void readMessage() throws IOException {
    }

    private final void readMessageFrame() throws IOException {
    }

    private final void readUntilNonControlFrame() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final qbbbpbbbiFxIAmEwllll11 getSource() {
    }

    public final void processNextFrame() throws IOException {
    }
}
