package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;
    public final MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }
}
