package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class StreamFormatChunk implements AviChunk {
    private static final String TAG = "StreamFormatChunk";
    public final Format format;

    public StreamFormatChunk(Format format) {
    }

    private static String getMimeTypeFromCompression(int i) {
    }

    private static String getMimeTypeFromTag(int i) {
    }

    private static AviChunk parseBitmapInfoHeader(ParsableByteArray parsableByteArray) {
    }

    public static AviChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
    }

    private static AviChunk parseWaveFormatEx(ParsableByteArray parsableByteArray) {
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
    }
}
