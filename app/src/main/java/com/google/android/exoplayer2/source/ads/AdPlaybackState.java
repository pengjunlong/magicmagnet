package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AdPlaybackState implements Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final Bundleable.Creator<AdPlaybackState> CREATOR = null;
    private static final String FIELD_AD_GROUPS = null;
    private static final String FIELD_AD_RESUME_POSITION_US = null;
    private static final String FIELD_CONTENT_DURATION_US = null;
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = null;
    public static final AdPlaybackState NONE = null;
    private static final AdGroup REMOVED_AD_GROUP = null;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;

    public static final class AdGroup implements Bundleable {
        public static final Bundleable.Creator<AdGroup> CREATOR = null;
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = null;
        private static final String FIELD_COUNT = null;
        private static final String FIELD_DURATIONS_US = null;
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = null;
        private static final String FIELD_ORIGINAL_COUNT = null;
        private static final String FIELD_STATES = null;
        private static final String FIELD_TIME_US = null;
        private static final String FIELD_URIS = null;
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;
        public final Uri[] uris;

        /* synthetic */ AdGroup(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z, C01681 c01681) {
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
        }

        public static /* synthetic */ AdGroup dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static AdGroup fromBundle(Bundle bundle) {
        }

        public boolean equals(Object obj) {
        }

        public int getFirstAdIndexToPlay() {
        }

        public int getNextAdIndexToPlay(int i) {
        }

        public boolean hasUnplayedAds() {
        }

        public int hashCode() {
        }

        public boolean shouldPlayAdGroup() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        public AdGroup withAdCount(int i) {
        }

        public AdGroup withAdDurationsUs(long[] jArr) {
        }

        public AdGroup withAdState(int i, int i2) {
        }

        public AdGroup withAdUri(Uri uri, int i) {
        }

        public AdGroup withAllAdsReset() {
        }

        public AdGroup withAllAdsSkipped() {
        }

        public AdGroup withContentResumeOffsetUs(long j) {
        }

        public AdGroup withIsServerSideInserted(boolean z) {
        }

        public AdGroup withLastAdRemoved() {
        }

        public AdGroup withOriginalAdCount(int i) {
        }

        public AdGroup withTimeUs(long j) {
        }

        public AdGroup(long j) {
        }

        private AdGroup(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public AdPlaybackState(Object obj, long... jArr) {
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
    }

    public static /* synthetic */ AdPlaybackState dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
    }

    private static AdPlaybackState fromBundle(Bundle bundle) {
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
    }

    public boolean equals(Object obj) {
    }

    public AdGroup getAdGroup(int i) {
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
    }

    public int hashCode() {
    }

    public boolean isAdInErrorState(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public String toString() {
    }

    public AdPlaybackState withAdCount(int i, int i2) {
    }

    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
    }

    public AdPlaybackState withAdGroupTimeUs(int i, long j) {
    }

    public AdPlaybackState withAdLoadError(int i, int i2) {
    }

    public AdPlaybackState withAdResumePositionUs(long j) {
    }

    public AdPlaybackState withAvailableAd(int i, int i2) {
    }

    public AdPlaybackState withAvailableAdUri(int i, int i2, Uri uri) {
    }

    public AdPlaybackState withContentDurationUs(long j) {
    }

    public AdPlaybackState withContentResumeOffsetUs(int i, long j) {
    }

    public AdPlaybackState withIsServerSideInserted(int i, boolean z) {
    }

    public AdPlaybackState withLastAdRemoved(int i) {
    }

    public AdPlaybackState withNewAdGroup(int i, long j) {
    }

    public AdPlaybackState withOriginalAdCount(int i, int i2) {
    }

    public AdPlaybackState withPlayedAd(int i, int i2) {
    }

    public AdPlaybackState withRemovedAdGroupCount(int i) {
    }

    public AdPlaybackState withResetAdGroup(int i) {
    }

    public AdPlaybackState withSkippedAd(int i, int i2) {
    }

    public AdPlaybackState withSkippedAdGroup(int i) {
    }

    private AdPlaybackState(Object obj, AdGroup[] adGroupArr, long j, long j2, int i) {
    }

    public AdPlaybackState withAdDurationsUs(int i, long... jArr) {
    }
}
