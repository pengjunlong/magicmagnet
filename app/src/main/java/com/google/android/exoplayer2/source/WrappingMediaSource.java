package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    private static final Void CHILD_SOURCE_ID = null;
    protected final MediaSource mediaSource;

    protected WrappingMediaSource(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    protected final void disableChildSource() {
    }

    protected final void enableChildSource() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public Timeline getInitialTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void r1, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    protected long getMediaTimeForChildMediaTime(long j) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ long getMediaTimeForChildMediaTime(Void r1, long j) {
    }

    protected int getWindowIndexForChildWindowIndex(int i) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ int getWindowIndexForChildWindowIndex(Void r1, int i) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(Void r1, MediaSource mediaSource, Timeline timeline) {
    }

    protected final void prepareChildSource() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected final void prepareSourceInternal(TransferListener transferListener) {
    }

    protected final void releaseChildSource() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    /* renamed from: getMediaPeriodIdForChildMediaPeriodId, reason: avoid collision after fix types in other method */
    protected final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(Void r1, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: getMediaTimeForChildMediaTime, reason: avoid collision after fix types in other method */
    protected final long getMediaTimeForChildMediaTime2(Void r1, long j) {
    }

    /* renamed from: getWindowIndexForChildWindowIndex, reason: avoid collision after fix types in other method */
    protected final int getWindowIndexForChildWindowIndex2(Void r1, int i) {
    }

    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method */
    protected final void onChildSourceInfoRefreshed2(Void r1, MediaSource mediaSource, Timeline timeline) {
    }

    protected void onChildSourceInfoRefreshed(Timeline timeline) {
    }

    protected void prepareSourceInternal() {
    }
}
