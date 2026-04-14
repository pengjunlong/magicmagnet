package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final SeekTable seekTable;
    public final long totalSamples;

    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] jArr, long[] jArr2) {
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i) {
    }

    private static Metadata concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
    }

    private static int getBitsPerSampleLookupKey(int i) {
    }

    private static int getSampleRateLookupKey(int i) {
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
    }

    public FlacStreamMetadata copyWithSeekTable(SeekTable seekTable) {
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
    }

    public long getApproxBytesPerFrame() {
    }

    public int getDecodedBitrate() {
    }

    public long getDurationUs() {
    }

    public Format getFormat(byte[] bArr, Metadata metadata) {
    }

    public int getMaxDecodedFrameSize() {
    }

    public Metadata getMetadataCopyWithAppendedEntriesFrom(Metadata metadata) {
    }

    public long getSampleNumber(long j) {
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
    }

    private FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, SeekTable seekTable, Metadata metadata) {
    }
}
