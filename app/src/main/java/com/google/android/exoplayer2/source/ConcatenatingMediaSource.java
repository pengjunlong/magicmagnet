package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM = null;
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private Set<HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    private final Set<HandlerAndRunnable> pendingOnCompletionActions;
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    private static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, ShuffleOrder shuffleOrder, boolean z) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(Object obj) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected Object getChildUidByChildIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected Timeline getTimelineByChildIndex(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    private static final class FakeMediaSource extends BaseMediaSource {
        private FakeMediaSource() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaItem getMediaItem() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected void prepareSourceInternal(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        protected void releaseSourceInternal() {
        }

        /* synthetic */ FakeMediaSource(C01601 c01601) {
        }
    }

    private static final class HandlerAndRunnable {
        private final Handler handler;
        private final Runnable runnable;

        public HandlerAndRunnable(Handler handler, Runnable runnable) {
        }

        public void dispatch() {
        }
    }

    static final class MediaSourceHolder {
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds;
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final Object uid;

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
        }

        public void reset(int i, int i2) {
        }
    }

    private static final class MessageData<T> {
        public final T customData;
        public final int index;
        public final HandlerAndRunnable onCompletionAction;

        public MessageData(int i, T t, HandlerAndRunnable handlerAndRunnable) {
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
    }

    static /* synthetic */ MediaItem access$100() {
    }

    private void addMediaSourceInternal(int i, MediaSourceHolder mediaSourceHolder) {
    }

    private void addMediaSourcesInternal(int i, Collection<MediaSourceHolder> collection) {
    }

    private void addPublicMediaSources(int i, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
    }

    private void correctOffsets(int i, int i2, int i3) {
    }

    private HandlerAndRunnable createOnCompletionAction(Handler handler, Runnable runnable) {
    }

    private void disableUnusedMediaSources() {
    }

    private synchronized void dispatchOnCompletionActions(Set<HandlerAndRunnable> set) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(ConcatenatingMediaSource concatenatingMediaSource, Message message) {
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
    }

    private static Object getChildPeriodUid(Object obj) {
    }

    private static Object getMediaSourceHolderUid(Object obj) {
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
    }

    private boolean handleMessage(Message message) {
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
    }

    private void moveMediaSourceInternal(int i, int i2) {
    }

    private void movePublicMediaSource(int i, int i2, Handler handler, Runnable runnable) {
    }

    private void removeMediaSourceInternal(int i) {
    }

    private void removePublicMediaSources(int i, int i2, Handler handler, Runnable runnable) {
    }

    private void scheduleTimelineUpdate() {
    }

    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
    }

    public synchronized void clear() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public synchronized MediaSource getMediaSource(int i) {
    }

    public synchronized int getSize() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
    }

    public synchronized void moveMediaSource(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected synchronized void prepareSourceInternal(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected synchronized void releaseSourceInternal() {
    }

    public synchronized MediaSource removeMediaSource(int i) {
    }

    public synchronized void removeMediaSourceRange(int i, int i2) {
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
    }

    private void scheduleTimelineUpdate(HandlerAndRunnable handlerAndRunnable) {
    }

    /* renamed from: getMediaPeriodIdForChildMediaPeriodId, reason: avoid collision after fix types in other method */
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: getWindowIndexForChildWindowIndex, reason: avoid collision after fix types in other method */
    protected int getWindowIndexForChildWindowIndex2(MediaSourceHolder mediaSourceHolder, int i) {
    }

    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method */
    protected void onChildSourceInfoRefreshed2(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
    }

    public synchronized void moveMediaSource(int i, int i2, Handler handler, Runnable runnable) {
    }

    public synchronized void removeMediaSourceRange(int i, int i2, Handler handler, Runnable runnable) {
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
    }

    public synchronized MediaSource removeMediaSource(int i, Handler handler, Runnable runnable) {
    }

    public synchronized void addMediaSource(int i, MediaSource mediaSource) {
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
    }

    public synchronized void addMediaSources(int i, Collection<MediaSource> collection) {
    }

    public synchronized void addMediaSource(int i, MediaSource mediaSource, Handler handler, Runnable runnable) {
    }

    public synchronized void addMediaSources(int i, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
    }
}
