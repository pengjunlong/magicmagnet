package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SampleQueue implements TrackOutput {
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private int capacity;
    private TrackOutput.CryptoData[] cryptoDatas;
    private DrmSession currentDrmSession;
    private Format downstreamFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final SampleExtrasHolder extrasHolder;
    private int[] flags;
    private boolean isLastSampleQueued;
    private long largestDiscardedTimestampUs;
    private long largestQueuedTimestampUs;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private long[] offsets;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata;
    private int[] sizes;
    private int[] sourceIds;
    private long startTimeUs;
    private long[] timesUs;
    private Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private boolean upstreamFormatRequired;
    private boolean upstreamKeyframeRequired;
    private int upstreamSourceId;

    static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;

        SampleExtrasHolder() {
        }
    }

    private static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        /* synthetic */ SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference, C01641 c01641) {
        }

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
        }
    }

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    protected SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private synchronized boolean attemptSplice(long j) {
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, TrackOutput.CryptoData cryptoData) {
    }

    private int countUnreadSamplesBefore(long j) {
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(SharedSampleMetadata sharedSampleMetadata) {
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
    }

    private synchronized long discardSampleMetadataToEnd() {
    }

    private long discardSamples(int i) {
    }

    private long discardUpstreamSampleMetadata(int i) {
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
    }

    private long getLargestTimestamp(int i) {
    }

    private int getRelativeIndex(int i) {
    }

    private boolean hasNextSample() {
    }

    private static /* synthetic */ void lambda$new$0(SharedSampleMetadata sharedSampleMetadata) {
    }

    private boolean mayReadSample(int i) {
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, SampleExtrasHolder sampleExtrasHolder) {
    }

    private void releaseDrmSessionReferences() {
    }

    private synchronized void rewind() {
    }

    private synchronized boolean setUpstreamFormat(Format format) {
    }

    public synchronized long discardSampleMetadataToRead() {
    }

    public final void discardTo(long j, boolean z, boolean z2) {
    }

    public final void discardToEnd() {
    }

    public final void discardToRead() {
    }

    public final void discardUpstreamFrom(long j) {
    }

    public final void discardUpstreamSamples(int i) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
    }

    protected Format getAdjustedUpstreamFormat(Format format) {
    }

    public final int getFirstIndex() {
    }

    public final synchronized long getFirstTimestampUs() {
    }

    public final synchronized long getLargestQueuedTimestampUs() {
    }

    public final synchronized long getLargestReadTimestampUs() {
    }

    public final int getReadIndex() {
    }

    public final synchronized int getSkipCount(long j, boolean z) {
    }

    public final synchronized Format getUpstreamFormat() {
    }

    public final int getWriteIndex() {
    }

    protected final void invalidateUpstreamFormatAdjustment() {
    }

    public final synchronized boolean isLastSampleQueued() {
    }

    public synchronized boolean isReady(boolean z) {
    }

    public void maybeThrowError() throws IOException {
    }

    public final synchronized int peekSourceId() {
    }

    public void preRelease() {
    }

    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
    }

    public void release() {
    }

    public final void reset() {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
    }

    public final synchronized boolean seekTo(int i) {
    }

    public final void setSampleOffsetUs(long j) {
    }

    public final void setStartTimeUs(long j) {
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
    }

    public final synchronized void skip(int i) {
    }

    public final void sourceId(int i) {
    }

    public final void splice() {
    }

    public void reset(boolean z) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    public final synchronized boolean seekTo(long j, boolean z) {
    }
}
