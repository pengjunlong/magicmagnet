package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.MediaPeriodId;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j, long j2, long... jArr) {
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i, long j, long j2) {
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i) {
    }

    public static long getMediaPeriodPositionUs(long j, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
    }

    public static long getMediaPeriodPositionUsForAd(long j, int i, int i2, AdPlaybackState adPlaybackState) {
    }

    public static long getMediaPeriodPositionUsForContent(long j, int i, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUsForAd(long j, int i, int i2, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUsForContent(long j, int i, AdPlaybackState adPlaybackState) {
    }

    public static long getStreamPositionUs(long j, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
    }
}
