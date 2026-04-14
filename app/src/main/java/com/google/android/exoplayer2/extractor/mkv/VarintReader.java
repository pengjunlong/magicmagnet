package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = null;
    private int length;
    private final byte[] scratch;
    private int state;

    public static long assembleVarint(byte[] bArr, int i, boolean z) {
    }

    public static int parseUnsignedVarintLength(int i) {
    }

    public int getLastLength() {
    }

    public long readUnsignedVarint(ExtractorInput extractorInput, boolean z, boolean z2, int i) throws IOException {
    }

    public void reset() {
    }
}
