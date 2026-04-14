package com.google.android.exoplayer2.source;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.IdentityHashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 0;
    private final MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final ImmutableList<MediaSourceHolder> mediaSourceHolders;
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    public static final class Builder {
        private int index;
        private MediaItem mediaItem;
        private MediaSource.Factory mediaSourceFactory;
        private final ImmutableList.Builder<MediaSourceHolder> mediaSourceHoldersBuilder;

        @CanIgnoreReturnValue
        public Builder add(MediaItem mediaItem) {
        }

        public ConcatenatingMediaSource2 build() {
        }

        @CanIgnoreReturnValue
        public Builder setMediaItem(MediaItem mediaItem) {
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
        }

        @CanIgnoreReturnValue
        public Builder useDefaultMediaSourceFactory(Context context) {
        }

        @CanIgnoreReturnValue
        public Builder add(MediaItem mediaItem, long j) {
        }

        @CanIgnoreReturnValue
        public Builder add(MediaSource mediaSource) {
        }

        @CanIgnoreReturnValue
        public Builder add(MediaSource mediaSource, long j) {
        }
    }

    private static final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final ImmutableList<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final Object manifest;
        private final MediaItem mediaItem;
        private final ImmutableList<Long> periodOffsetsInWindowUs;
        private final ImmutableList<Timeline> timelines;

        public ConcatenatedTimeline(MediaItem mediaItem, ImmutableList<Timeline> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Long> immutableList3, boolean z, boolean z2, long j, long j2, Object obj) {
        }

        private int getChildIndexByPeriodIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object getUidOfPeriod(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;

        public MediaSourceHolder(MediaSource mediaSource, int i, long j) {
        }
    }

    /* synthetic */ ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList immutableList, C01611 c01611) {
    }

    static /* synthetic */ int access$100(Object obj) {
    }

    static /* synthetic */ Object access$200(Object obj) {
    }

    static /* synthetic */ Object access$300(int i, Object obj) {
    }

    private void disableUnusedMediaSources() {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(ConcatenatingMediaSource2 concatenatingMediaSource2, Message message) {
    }

    private static int getChildIndex(Object obj) {
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
    }

    private static Object getChildPeriodUid(Object obj) {
    }

    private static long getChildWindowSequenceNumber(long j, int i, int i2) {
    }

    private static Object getPeriodUid(int i, Object obj) {
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
    }

    private boolean handleMessage(Message message) {
    }

    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
    }

    private void scheduleTimelineUpdate() {
    }

    private void updateTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public Timeline getInitialTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: getWindowIndexForChildWindowIndex, reason: avoid collision after fix types in other method */
    protected int getWindowIndexForChildWindowIndex2(Integer num, int i) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ int getWindowIndexForChildWindowIndex(Integer num, int i) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList<MediaSourceHolder> immutableList) {
    }

    /* renamed from: getMediaPeriodIdForChildMediaPeriodId, reason: avoid collision after fix types in other method */
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method */
    protected void onChildSourceInfoRefreshed2(Integer num, MediaSource mediaSource, Timeline timeline) {
    }
}
