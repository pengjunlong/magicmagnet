package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final int streamHeaderChunkCount;
    protected final TrackOutput trackOutput;

    public ChunkReader(int i, int i2, long j, int i3, TrackOutput trackOutput) {
    }

    private static int getChunkIdFourCc(int i, int i2) {
    }

    private long getChunkTimestampUs(int i) {
    }

    private SeekPoint getSeekPoint(int i) {
    }

    public void advanceCurrentChunk() {
    }

    public void appendKeyFrameToIndex(long j) {
    }

    public void compactIndex() {
    }

    public long getCurrentChunkTimestampUs() {
    }

    public long getFrameDurationUs() {
    }

    public SeekMap.SeekPoints getSeekPoints(long j) {
    }

    public boolean handlesChunkId(int i) {
    }

    public void incrementIndexChunkCount() {
    }

    public boolean isAudio() {
    }

    public boolean isCurrentFrameAKeyFrame() {
    }

    public boolean isVideo() {
    }

    public boolean onChunkData(ExtractorInput extractorInput) throws IOException {
    }

    public void onChunkStart(int i) {
    }

    public void seekToPosition(long j) {
    }
}
