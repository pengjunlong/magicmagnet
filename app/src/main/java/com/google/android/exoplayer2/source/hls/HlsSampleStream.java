package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class HlsSampleStream implements SampleStream {
    private int sampleQueueIndex;
    private final HlsSampleStreamWrapper sampleStreamWrapper;
    private final int trackGroupIndex;

    public HlsSampleStream(HlsSampleStreamWrapper hlsSampleStreamWrapper, int i) {
    }

    private boolean hasValidSampleQueueIndex() {
    }

    public void bindSampleQueue() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long j) {
    }

    public void unbindSampleQueue() {
    }
}
