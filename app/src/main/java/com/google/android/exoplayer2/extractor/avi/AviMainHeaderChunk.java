package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AviMainHeaderChunk implements AviChunk {
    private static final int AVIF_HAS_INDEX = 16;
    public final int flags;
    public final int frameDurationUs;
    public final int streams;
    public final int totalFrames;

    private AviMainHeaderChunk(int i, int i2, int i3, int i4) {
    }

    public static AviMainHeaderChunk parseFrom(ParsableByteArray parsableByteArray) {
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
    }

    public boolean hasIndex() {
    }
}
