package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Huffman {
    private static final int[] CODES = null;
    private static final byte[] CODE_BIT_COUNTS = null;
    public static final Huffman INSTANCE = null;
    private static final Node root = null;

    private Huffman() {
    }

    private final void addCode(int i, int i2, int i3) {
    }

    public final void decode(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, long j, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) {
    }

    public final void encode(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) throws IOException {
    }

    public final int encodedLength(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    @xc0
    private static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
        }

        public final Node[] getChildren() {
        }

        public final int getSymbol() {
        }

        public final int getTerminalBitCount() {
        }

        public Node(int i, int i2) {
        }
    }
}
