package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AviStreamHeaderChunk implements AviChunk {
    private static final String TAG = "AviStreamHeaderChunk";
    public final int initialFrames;
    public final int length;
    public final int rate;
    public final int scale;
    public final int streamType;
    public final int suggestedBufferSize;

    private AviStreamHeaderChunk(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    public static AviStreamHeaderChunk parseFrom(ParsableByteArray parsableByteArray) {
    }

    public long getDurationUs() {
    }

    public float getFrameRate() {
    }

    public int getTrackType() {
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
    }
}
