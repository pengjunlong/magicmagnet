package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtpExtractor implements Extractor {
    private boolean firstPacketRead;
    private volatile int firstSequenceNumber;
    private volatile long firstTimestamp;
    private boolean isSeekPending;
    private final Object lock;
    private long nextRtpTimestamp;
    private ExtractorOutput output;
    private final RtpPayloadReader payloadReader;
    private long playbackStartTimeUs;
    private final RtpPacketReorderingQueue reorderingQueue;
    private final ParsableByteArray rtpPacketDataBuffer;
    private final ParsableByteArray rtpPacketScratchBuffer;
    private final int trackId;

    public RtpExtractor(RtpPayloadFormat rtpPayloadFormat, int i) {
    }

    private static long getCutoffTimeMs(long j) {
    }

    public boolean hasReadFirstRtpPacket() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
    }

    public void preSeek() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
    }

    public void setFirstSequenceNumber(int i) {
    }

    public void setFirstTimestamp(long j) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
    }
}
