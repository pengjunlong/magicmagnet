package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ListChunk implements AviChunk {
    public final ImmutableList<AviChunk> children;
    private final int type;

    private ListChunk(int i, ImmutableList<AviChunk> immutableList) {
    }

    private static AviChunk createBox(int i, int i2, ParsableByteArray parsableByteArray) {
    }

    public static ListChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
    }

    public <T extends AviChunk> T getChild(Class<T> cls) {
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
    }
}
