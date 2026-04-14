package com.google.android.exoplayer2.decoder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedInputBufferCount;
    public int droppedToKeyframeCount;
    public int maxConsecutiveDroppedBufferCount;
    public int queuedInputBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;
    public long totalVideoFrameProcessingOffsetUs;
    public int videoFrameProcessingOffsetCount;

    private void addVideoFrameProcessingOffsets(long j, int i) {
    }

    public void addVideoFrameProcessingOffset(long j) {
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(DecoderCounters decoderCounters) {
    }

    public String toString() {
    }
}
