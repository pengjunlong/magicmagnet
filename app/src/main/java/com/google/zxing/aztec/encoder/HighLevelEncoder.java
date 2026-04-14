package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP = null;
    static final int[][] LATCH_TABLE = null;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final String[] MODE_NAMES = null;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int[][] SHIFT_TABLE = null;
    private final byte[] text;

    /* renamed from: com.google.zxing.aztec.encoder.HighLevelEncoder$1 */
    class C13801 implements Comparator<State> {
        final /* synthetic */ HighLevelEncoder this$0;

        C13801(HighLevelEncoder highLevelEncoder) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(State state, State state2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(State state, State state2) {
        }
    }

    public HighLevelEncoder(byte[] bArr) {
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
    }

    private void updateStateForChar(State state, int i, Collection<State> collection) {
    }

    private static void updateStateForPair(State state, int i, int i2, Collection<State> collection) {
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i) {
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i, int i2) {
    }

    public BitArray encode() {
    }
}
