package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TrackSelectionParameters implements Bundleable {

    @Deprecated
    public static final Bundleable.Creator<TrackSelectionParameters> CREATOR = null;

    @Deprecated
    public static final TrackSelectionParameters DEFAULT = null;
    public static final TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT = null;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final String FIELD_DISABLED_TRACK_TYPE = null;
    private static final String FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = null;
    private static final String FIELD_FORCE_LOWEST_BITRATE = null;
    private static final String FIELD_IGNORED_TEXT_SELECTION_FLAGS = null;
    private static final String FIELD_MAX_AUDIO_BITRATE = null;
    private static final String FIELD_MAX_AUDIO_CHANNEL_COUNT = null;
    private static final String FIELD_MAX_VIDEO_BITRATE = null;
    private static final String FIELD_MAX_VIDEO_FRAMERATE = null;
    private static final String FIELD_MAX_VIDEO_HEIGHT = null;
    private static final String FIELD_MAX_VIDEO_WIDTH = null;
    private static final String FIELD_MIN_VIDEO_BITRATE = null;
    private static final String FIELD_MIN_VIDEO_FRAMERATE = null;
    private static final String FIELD_MIN_VIDEO_HEIGHT = null;
    private static final String FIELD_MIN_VIDEO_WIDTH = null;
    private static final String FIELD_PREFERRED_AUDIO_LANGUAGES = null;
    private static final String FIELD_PREFERRED_AUDIO_MIME_TYPES = null;
    private static final String FIELD_PREFERRED_AUDIO_ROLE_FLAGS = null;
    private static final String FIELD_PREFERRED_TEXT_LANGUAGES = null;
    private static final String FIELD_PREFERRED_TEXT_ROLE_FLAGS = null;
    private static final String FIELD_PREFERRED_VIDEO_MIMETYPES = null;
    private static final String FIELD_PREFERRED_VIDEO_ROLE_FLAGS = null;
    private static final String FIELD_SELECTION_OVERRIDES = null;
    private static final String FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = null;
    private static final String FIELD_VIEWPORT_HEIGHT = null;
    private static final String FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = null;
    private static final String FIELD_VIEWPORT_WIDTH = null;
    public final ImmutableSet<Integer> disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final ImmutableMap<TrackGroup, TrackSelectionOverride> overrides;
    public final ImmutableList<String> preferredAudioLanguages;
    public final ImmutableList<String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final ImmutableList<String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final ImmutableList<String> preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    protected TrackSelectionParameters(Builder builder) {
    }

    static /* synthetic */ String access$000() {
    }

    static /* synthetic */ String access$100() {
    }

    static /* synthetic */ String access$1000() {
    }

    static /* synthetic */ String access$1100() {
    }

    static /* synthetic */ String access$1200() {
    }

    static /* synthetic */ String access$1300() {
    }

    static /* synthetic */ String access$1400() {
    }

    static /* synthetic */ String access$1500() {
    }

    static /* synthetic */ String access$1600() {
    }

    static /* synthetic */ String access$1700() {
    }

    static /* synthetic */ String access$1800() {
    }

    static /* synthetic */ String access$1900() {
    }

    static /* synthetic */ String access$200() {
    }

    static /* synthetic */ String access$2000() {
    }

    static /* synthetic */ String access$2100() {
    }

    static /* synthetic */ String access$2200() {
    }

    static /* synthetic */ String access$2300() {
    }

    static /* synthetic */ String access$2400() {
    }

    static /* synthetic */ String access$2500() {
    }

    static /* synthetic */ String access$300() {
    }

    static /* synthetic */ String access$400() {
    }

    static /* synthetic */ String access$500() {
    }

    static /* synthetic */ String access$600() {
    }

    static /* synthetic */ String access$700() {
    }

    static /* synthetic */ String access$800() {
    }

    static /* synthetic */ String access$900() {
    }

    public static TrackSelectionParameters fromBundle(Bundle bundle) {
    }

    public static TrackSelectionParameters getDefaults(Context context) {
    }

    public Builder buildUpon() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public static class Builder {
        private HashSet<Integer> disabledTrackTypes;
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int ignoredTextSelectionFlags;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private HashMap<TrackGroup, TrackSelectionOverride> overrides;
        private ImmutableList<String> preferredAudioLanguages;
        private ImmutableList<String> preferredAudioMimeTypes;
        private int preferredAudioRoleFlags;
        private ImmutableList<String> preferredTextLanguages;
        private int preferredTextRoleFlags;
        private ImmutableList<String> preferredVideoMimeTypes;
        private int preferredVideoRoleFlags;
        private boolean selectUndeterminedTextLanguage;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        @Deprecated
        public Builder() {
        }

        static /* synthetic */ int access$2600(Builder builder) {
        }

        static /* synthetic */ int access$2700(Builder builder) {
        }

        static /* synthetic */ int access$2800(Builder builder) {
        }

        static /* synthetic */ int access$2900(Builder builder) {
        }

        static /* synthetic */ int access$3000(Builder builder) {
        }

        static /* synthetic */ int access$3100(Builder builder) {
        }

        static /* synthetic */ int access$3200(Builder builder) {
        }

        static /* synthetic */ int access$3300(Builder builder) {
        }

        static /* synthetic */ int access$3400(Builder builder) {
        }

        static /* synthetic */ int access$3500(Builder builder) {
        }

        static /* synthetic */ boolean access$3600(Builder builder) {
        }

        static /* synthetic */ ImmutableList access$3700(Builder builder) {
        }

        static /* synthetic */ int access$3800(Builder builder) {
        }

        static /* synthetic */ ImmutableList access$3900(Builder builder) {
        }

        static /* synthetic */ int access$4000(Builder builder) {
        }

        static /* synthetic */ int access$4100(Builder builder) {
        }

        static /* synthetic */ int access$4200(Builder builder) {
        }

        static /* synthetic */ ImmutableList access$4300(Builder builder) {
        }

        static /* synthetic */ ImmutableList access$4400(Builder builder) {
        }

        static /* synthetic */ int access$4500(Builder builder) {
        }

        static /* synthetic */ int access$4600(Builder builder) {
        }

        static /* synthetic */ boolean access$4700(Builder builder) {
        }

        static /* synthetic */ boolean access$4800(Builder builder) {
        }

        static /* synthetic */ boolean access$4900(Builder builder) {
        }

        static /* synthetic */ HashMap access$5000(Builder builder) {
        }

        static /* synthetic */ HashSet access$5100(Builder builder) {
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void init(TrackSelectionParameters trackSelectionParameters) {
        }

        private static ImmutableList<String> normalizeLanguageCodes(String[] strArr) {
        }

        /* renamed from: setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19 */
        private void m12x58dbf263(Context context) {
        }

        @CanIgnoreReturnValue
        public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
        }

        public TrackSelectionParameters build() {
        }

        @CanIgnoreReturnValue
        public Builder clearOverride(TrackGroup trackGroup) {
        }

        @CanIgnoreReturnValue
        public Builder clearOverrides() {
        }

        @CanIgnoreReturnValue
        public Builder clearOverridesOfType(int i) {
        }

        @CanIgnoreReturnValue
        public Builder clearVideoSizeConstraints() {
        }

        @CanIgnoreReturnValue
        public Builder clearViewportSizeConstraints() {
        }

        @CanIgnoreReturnValue
        protected Builder set(TrackSelectionParameters trackSelectionParameters) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDisabledTrackTypes(Set<Integer> set) {
        }

        @CanIgnoreReturnValue
        public Builder setForceHighestSupportedBitrate(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setForceLowestBitrate(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setIgnoredTextSelectionFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxAudioBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxAudioChannelCount(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxVideoBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxVideoFrameRate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxVideoSize(int i, int i2) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxVideoSizeSd() {
        }

        @CanIgnoreReturnValue
        public Builder setMinVideoBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMinVideoFrameRate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMinVideoSize(int i, int i2) {
        }

        @CanIgnoreReturnValue
        public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
        }

        public Builder setPreferredAudioLanguage(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredAudioLanguages(String... strArr) {
        }

        public Builder setPreferredAudioMimeType(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredAudioMimeTypes(String... strArr) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredAudioRoleFlags(int i) {
        }

        public Builder setPreferredTextLanguage(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredTextLanguages(String... strArr) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredTextRoleFlags(int i) {
        }

        public Builder setPreferredVideoMimeType(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredVideoMimeTypes(String... strArr) {
        }

        @CanIgnoreReturnValue
        public Builder setPreferredVideoRoleFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setSelectUndeterminedTextLanguage(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setTrackTypeDisabled(int i, boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setViewportSize(int i, int i2, boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
        }

        public Builder(Context context) {
        }

        protected Builder(TrackSelectionParameters trackSelectionParameters) {
        }

        protected Builder(Bundle bundle) {
        }
    }
}
