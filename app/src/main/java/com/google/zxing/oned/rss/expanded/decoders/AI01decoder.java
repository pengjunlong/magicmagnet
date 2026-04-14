package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AI01decoder extends AbstractExpandedDecoder {
    static final int GTIN_SIZE = 40;

    AI01decoder(BitArray bitArray) {
    }

    private static void appendCheckDigit(StringBuilder sb, int i) {
    }

    final void encodeCompressedGtin(StringBuilder sb, int i) {
    }

    final void encodeCompressedGtinWithoutAI(StringBuilder sb, int i, int i2) {
    }
}
