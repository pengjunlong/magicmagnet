package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class Timeline implements Bundleable {
    public static final Bundleable.Creator<Timeline> CREATOR = null;
    public static final Timeline EMPTY = null;
    private static final String FIELD_PERIODS = null;
    private static final String FIELD_SHUFFLED_WINDOW_INDICES = null;
    private static final String FIELD_WINDOWS = null;

    /* renamed from: com.google.android.exoplayer2.Timeline$1 */
    class C00811 extends Timeline {
        C00811() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i, Window window, long j) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    public static final class Period implements Bundleable {
        public static final Bundleable.Creator<Period> CREATOR = null;
        private static final String FIELD_AD_PLAYBACK_STATE = null;
        private static final String FIELD_DURATION_US = null;
        private static final String FIELD_PLACEHOLDER = null;
        private static final String FIELD_POSITION_IN_WINDOW_US = null;
        private static final String FIELD_WINDOW_INDEX = null;
        private AdPlaybackState adPlaybackState;
        public long durationUs;
        public Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        static /* synthetic */ AdPlaybackState access$000(Period period) {
        }

        public static /* synthetic */ Period dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static Period fromBundle(Bundle bundle) {
        }

        public boolean equals(Object obj) {
        }

        public int getAdCountInAdGroup(int i) {
        }

        public long getAdDurationUs(int i, int i2) {
        }

        public int getAdGroupCount() {
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
        }

        public int getAdGroupIndexForPositionUs(long j) {
        }

        public long getAdGroupTimeUs(int i) {
        }

        public long getAdResumePositionUs() {
        }

        public int getAdState(int i, int i2) {
        }

        public Object getAdsId() {
        }

        public long getContentResumeOffsetUs(int i) {
        }

        public long getDurationMs() {
        }

        public long getDurationUs() {
        }

        public int getFirstAdIndexToPlay(int i) {
        }

        public int getNextAdIndexToPlay(int i, int i2) {
        }

        public long getPositionInWindowMs() {
        }

        public long getPositionInWindowUs() {
        }

        public int getRemovedAdGroupCount() {
        }

        public boolean hasPlayedAdGroup(int i) {
        }

        public int hashCode() {
        }

        public boolean isServerSideInsertedAdGroup(int i) {
        }

        @CanIgnoreReturnValue
        public Period set(Object obj, Object obj2, int i, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        @CanIgnoreReturnValue
        public Period set(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
        }
    }

    public static final class RemotableTimeline extends Timeline {
        private final ImmutableList<Period> periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final ImmutableList<Window> windows;

        public RemotableTimeline(ImmutableList<Window> immutableList, ImmutableList<Period> immutableList2, int[] iArr) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i, Window window, long j) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    public static final class Window implements Bundleable {
        public static final Bundleable.Creator<Window> CREATOR = null;
        private static final Object FAKE_WINDOW_UID = null;
        private static final String FIELD_DEFAULT_POSITION_US = null;
        private static final String FIELD_DURATION_US = null;
        private static final String FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = null;
        private static final String FIELD_FIRST_PERIOD_INDEX = null;
        private static final String FIELD_IS_DYNAMIC = null;
        private static final String FIELD_IS_PLACEHOLDER = null;
        private static final String FIELD_IS_SEEKABLE = null;
        private static final String FIELD_LAST_PERIOD_INDEX = null;
        private static final String FIELD_LIVE_CONFIGURATION = null;
        private static final String FIELD_MEDIA_ITEM = null;
        private static final String FIELD_POSITION_IN_FIRST_PERIOD_US = null;
        private static final String FIELD_PRESENTATION_START_TIME_MS = null;
        private static final String FIELD_WINDOW_START_TIME_MS = null;
        private static final MediaItem PLACEHOLDER_MEDIA_ITEM = null;
        public static final Object SINGLE_WINDOW_UID = null;
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;

        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public MediaItem.LiveConfiguration liveConfiguration;
        public Object manifest;
        public MediaItem mediaItem;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Deprecated
        public Object tag;
        public Object uid;
        public long windowStartTimeMs;

        public static /* synthetic */ Window dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static Window fromBundle(Bundle bundle) {
        }

        public boolean equals(Object obj) {
        }

        public long getCurrentUnixTimeMs() {
        }

        public long getDefaultPositionMs() {
        }

        public long getDefaultPositionUs() {
        }

        public long getDurationMs() {
        }

        public long getDurationUs() {
        }

        public long getPositionInFirstPeriodMs() {
        }

        public long getPositionInFirstPeriodUs() {
        }

        public int hashCode() {
        }

        public boolean isLive() {
        }

        @CanIgnoreReturnValue
        public Window set(Object obj, MediaItem mediaItem, Object obj2, long j, long j2, long j3, boolean z, boolean z2, MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }
    }

    protected Timeline() {
    }

    public static /* synthetic */ Timeline dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static Timeline fromBundle(Bundle bundle) {
    }

    private static <T extends Bundleable> ImmutableList<T> fromBundleListRetriever(Bundleable.Creator<T> creator, IBinder iBinder) {
    }

    private static int[] generateUnshuffledIndices(int i) {
    }

    public boolean equals(Object obj) {
    }

    public int getFirstWindowIndex(boolean z) {
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z) {
    }

    public final int getNextPeriodIndex(int i, Period period, Window window, int i2, boolean z) {
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
    }

    public final Period getPeriod(int i, Period period) {
    }

    public abstract Period getPeriod(int i, Period period, boolean z);

    public Period getPeriodByUid(Object obj, Period period) {
    }

    public abstract int getPeriodCount();

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j) {
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i, long j) {
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
    }

    public abstract Object getUidOfPeriod(int i);

    public final Window getWindow(int i, Window window) {
    }

    public abstract Window getWindow(int i, Window window, long j);

    public abstract int getWindowCount();

    public int hashCode() {
    }

    public final boolean isEmpty() {
    }

    public final boolean isLastPeriod(int i, Period period, Window window, int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
    }

    public final Bundle toBundleWithOneWindowOnly(int i) {
    }

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j, long j2) {
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i, long j, long j2) {
    }
}
