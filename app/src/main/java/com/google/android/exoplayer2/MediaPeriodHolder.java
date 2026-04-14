package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSourceList mediaSourceList;
    private MediaPeriodHolder next;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    private TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    private TrackSelectorResult trackSelectorResult;
    public final Object uid;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
    }

    private static MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, MediaSourceList mediaSourceList, Allocator allocator, long j, long j2) {
    }

    private void disableTrackSelectionsInResult() {
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
    }

    private void enableTrackSelectionsInResult() {
    }

    private boolean isLoadingMediaPeriod() {
    }

    private static void releaseMediaPeriod(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j, boolean z) {
    }

    public void continueLoading(long j) {
    }

    public long getBufferedPositionUs() {
    }

    public MediaPeriodHolder getNext() {
    }

    public long getNextLoadPositionUs() {
    }

    public long getRendererOffset() {
    }

    public long getStartPositionRendererTime() {
    }

    public TrackGroupArray getTrackGroups() {
    }

    public TrackSelectorResult getTrackSelectorResult() {
    }

    public void handlePrepared(float f, Timeline timeline) throws ExoPlaybackException {
    }

    public boolean isFullyBuffered() {
    }

    public void reevaluateBuffer(long j) {
    }

    public void release() {
    }

    public TrackSelectorResult selectTracks(float f, Timeline timeline) throws ExoPlaybackException {
    }

    public void setNext(MediaPeriodHolder mediaPeriodHolder) {
    }

    public void setRendererOffset(long j) {
    }

    public long toPeriodTime(long j) {
    }

    public long toRendererTime(long j) {
    }

    public void updateClipping() {
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j, boolean z, boolean[] zArr) {
    }
}
