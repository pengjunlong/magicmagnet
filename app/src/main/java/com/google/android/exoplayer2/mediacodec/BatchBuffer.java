package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    static final int MAX_SIZE_BYTES = 3072000;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    private boolean canAppendSampleBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    public boolean append(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
    }

    public long getFirstSampleTimeUs() {
    }

    public long getLastSampleTimeUs() {
    }

    public int getSampleCount() {
    }

    public boolean hasSamples() {
    }

    public void setMaxSampleCount(int i) {
    }
}
