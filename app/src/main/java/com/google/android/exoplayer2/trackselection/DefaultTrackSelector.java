package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final Ordering<Integer> FORMAT_VALUE_ORDERING = null;
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private static final Ordering<Integer> NO_ORDER = null;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";
    private AudioAttributes audioAttributes;
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;
    private Parameters parameters;
    private SpatializerWrapperV32 spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;

    private static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, boolean z, Predicate<Format> predicate) {
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
        }

        public static ImmutableList<AudioTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z, Predicate<Format> predicate) {
        }

        private int evaluateSelectionEligibility(int i, boolean z) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(AudioTrackInfo audioTrackInfo) {
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(AudioTrackInfo audioTrackInfo) {
        }

        /* renamed from: isCompatibleForAdaptationWith, reason: avoid collision after fix types in other method */
        public boolean isCompatibleForAdaptationWith2(AudioTrackInfo audioTrackInfo) {
        }
    }

    private static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(OtherTrackScore otherTrackScore) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(OtherTrackScore otherTrackScore) {
        }
    }

    public static final class Parameters extends TrackSelectionParameters {
        public static final Bundleable.Creator<Parameters> CREATOR = null;

        @Deprecated
        public static final Parameters DEFAULT = null;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT = null;
        private static final String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = null;
        private static final String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = null;
        private static final String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = null;
        private static final String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = null;
        private static final String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = null;
        private static final String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = null;
        private static final String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = null;
        private static final String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = null;
        private static final String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = null;
        private static final String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = null;
        private static final String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = null;
        private static final String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = null;
        private static final String FIELD_RENDERER_DISABLED_INDICES = null;
        private static final String FIELD_SELECTION_OVERRIDES = null;
        private static final String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = null;
        private static final String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = null;
        private static final String FIELD_TUNNELING_ENABLED = null;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            /* synthetic */ Builder(Bundle bundle, C02041 c02041) {
            }

            static /* synthetic */ boolean access$2000(Builder builder) {
            }

            static /* synthetic */ boolean access$2100(Builder builder) {
            }

            static /* synthetic */ boolean access$2200(Builder builder) {
            }

            static /* synthetic */ boolean access$2300(Builder builder) {
            }

            static /* synthetic */ boolean access$2400(Builder builder) {
            }

            static /* synthetic */ boolean access$2500(Builder builder) {
            }

            static /* synthetic */ boolean access$2600(Builder builder) {
            }

            static /* synthetic */ boolean access$2700(Builder builder) {
            }

            static /* synthetic */ boolean access$2800(Builder builder) {
            }

            static /* synthetic */ boolean access$2900(Builder builder) {
            }

            static /* synthetic */ boolean access$3000(Builder builder) {
            }

            static /* synthetic */ boolean access$3100(Builder builder) {
            }

            static /* synthetic */ boolean access$3200(Builder builder) {
            }

            static /* synthetic */ SparseArray access$3300(Builder builder) {
            }

            static /* synthetic */ SparseBooleanArray access$3400(Builder builder) {
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            }

            private void init() {
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
            }

            private void setSelectionOverridesFromBundle(Bundle bundle) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public /* bridge */ /* synthetic */ TrackSelectionParameters build() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearOverride(TrackGroup trackGroup) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearOverrides() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearOverridesOfType(int i) {
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverrides(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearVideoSizeConstraints() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearViewportSizeConstraints() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            protected /* bridge */ /* synthetic */ TrackSelectionParameters.Builder set(TrackSelectionParameters trackSelectionParameters) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowMultipleAdaptiveSelections(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            @Deprecated
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            }

            @CanIgnoreReturnValue
            public Builder setExceedAudioConstraintsIfNecessary(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setExceedVideoConstraintsIfNecessary(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setForceLowestBitrate(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxAudioBitrate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxAudioChannelCount(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoBitrate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoFrameRate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoSize(int i, int i2) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoSizeSd() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoBitrate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoFrameRate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoSize(int i, int i2) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioLanguage(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioLanguages(String[] strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioMimeType(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioMimeTypes(String[] strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguage(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguages(String[] strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextRoleFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoMimeType(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoMimeTypes(String[] strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setRendererDisabled(int i, boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setTrackTypeDisabled(int i, boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setTunnelingEnabled(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setViewportSize(int i, int i2, boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            }

            /* synthetic */ Builder(Parameters parameters, C02041 c02041) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Parameters build() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverride(TrackGroup trackGroup) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverrides() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverridesOfType(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearVideoSizeConstraints() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearViewportSizeConstraints() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            protected Builder set(TrackSelectionParameters trackSelectionParameters) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            @Deprecated
            public Builder setDisabledTrackTypes(Set<Integer> set) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setForceHighestSupportedBitrate(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setForceLowestBitrate(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setIgnoredTextSelectionFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxAudioBitrate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxAudioChannelCount(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoBitrate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoFrameRate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoSize(int i, int i2) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoSizeSd() {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoBitrate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoFrameRate(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoSize(int i, int i2) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioLanguage(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioLanguages(String... strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioMimeType(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioMimeTypes(String... strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioRoleFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguage(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguages(String... strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextRoleFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoMimeType(String str) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoMimeTypes(String... strArr) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoRoleFlags(int i) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setSelectUndeterminedTextLanguage(boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setTrackTypeDisabled(int i, boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setViewportSize(int i, int i2, boolean z) {
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            }

            @Deprecated
            public Builder() {
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverrides() {
            }

            public Builder(Context context) {
            }

            private Builder(Parameters parameters) {
            }

            private Builder(Bundle bundle) {
            }
        }

        /* synthetic */ Parameters(Builder builder, C02041 c02041) {
        }

        static /* synthetic */ SparseArray access$000(Parameters parameters) {
        }

        static /* synthetic */ SparseBooleanArray access$100(Parameters parameters) {
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

        static /* synthetic */ String access$1700() {
        }

        static /* synthetic */ String access$1800() {
        }

        static /* synthetic */ String access$1900() {
        }

        static /* synthetic */ String access$200() {
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

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
        }

        public static /* synthetic */ Parameters dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        public static Parameters getDefaults(Context context) {
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
        }

        private static /* synthetic */ Parameters lambda$static$0(Bundle bundle) {
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder buildUpon() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(Object obj) {
        }

        public boolean getRendererDisabled(int i) {
        }

        @Deprecated
        public SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
        }

        @Deprecated
        public boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        private Parameters(Builder builder) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public Builder buildUpon() {
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate;

        @Deprecated
        public ParametersBuilder() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters build() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearOverride(TrackGroup trackGroup) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearOverrides() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearOverridesOfType(int i) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearVideoSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder clearViewportSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        protected /* bridge */ /* synthetic */ TrackSelectionParameters.Builder set(TrackSelectionParameters trackSelectionParameters) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        @Deprecated
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setForceLowestBitrate(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxAudioBitrate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxAudioChannelCount(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoBitrate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoFrameRate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoSize(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMaxVideoSizeSd() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoBitrate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoFrameRate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setMinVideoSize(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioLanguage(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioLanguages(String[] strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioMimeType(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioMimeTypes(String[] strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguage(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextLanguages(String[] strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredTextRoleFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoMimeType(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoMimeTypes(String[] strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int i) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setRendererDisabled(int i, boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setTrackTypeDisabled(int i, boolean z) {
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setTunnelingEnabled(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setViewportSize(int i, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverride(TrackGroup trackGroup) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverrides() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverridesOfType(int i) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearVideoSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearViewportSizeConstraints() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        protected ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setForceLowestBitrate(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setIgnoredTextSelectionFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxAudioBitrate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxAudioChannelCount(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoBitrate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoFrameRate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoSize(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoSizeSd() {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoBitrate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoFrameRate(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoSize(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioLanguage(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioMimeType(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioRoleFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguage(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextRoleFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoMimeType(String str) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoRoleFlags(int i) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setTrackTypeDisabled(int i, boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setViewportSize(int i, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
        }

        public ParametersBuilder(Context context) {
        }
    }

    public static final class SelectionOverride implements Bundleable {
        public static final Bundleable.Creator<SelectionOverride> CREATOR = null;
        private static final String FIELD_GROUP_INDEX = null;
        private static final String FIELD_TRACKS = null;
        private static final String FIELD_TRACK_TYPE = null;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i, int... iArr) {
        }

        public static /* synthetic */ SelectionOverride dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static /* synthetic */ SelectionOverride lambda$static$0(Bundle bundle) {
        }

        public boolean containsTrack(int i) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
        }
    }

    private static class SpatializerWrapperV32 {
        private Handler handler;
        private Spatializer.OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final Spatializer spatializer;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32$1 */
        class C02051 implements Spatializer.OnSpatializerStateChangedListener {
            final /* synthetic */ DefaultTrackSelector val$defaultTrackSelector;

            C02051(SpatializerWrapperV32 spatializerWrapperV32, DefaultTrackSelector defaultTrackSelector) {
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
            }
        }

        private SpatializerWrapperV32(Spatializer spatializer) {
        }

        public static SpatializerWrapperV32 tryCreateInstance(Context context) {
        }

        public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) {
        }

        public void ensureInitialized(DefaultTrackSelector defaultTrackSelector, Looper looper) {
        }

        public boolean isAvailable() {
        }

        public boolean isEnabled() {
        }

        public boolean isSpatializationSupported() {
        }

        public void release() {
        }
    }

    private static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str) {
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
        }

        public static ImmutableList<TextTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(TextTrackInfo textTrackInfo) {
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
        }

        /* renamed from: isCompatibleForAdaptationWith, reason: avoid collision after fix types in other method */
        public boolean isCompatibleForAdaptationWith2(TextTrackInfo textTrackInfo) {
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(TextTrackInfo textTrackInfo) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i, TrackGroup trackGroup, int i2) {
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);
    }

    private static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public VideoTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, int i4, boolean z) {
        }

        private static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
        }

        private static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
        }

        public static ImmutableList<VideoTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i2) {
        }

        public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
        }

        public static /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
        }

        private int evaluateSelectionEligibility(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
        }

        /* renamed from: isCompatibleForAdaptationWith, reason: avoid collision after fix types in other method */
        public boolean isCompatibleForAdaptationWith2(VideoTrackInfo videoTrackInfo) {
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
    }

    static /* synthetic */ int access$3700(TrackGroup trackGroup, int i, int i2, boolean z) {
    }

    static /* synthetic */ int access$3800(int i, int i2) {
    }

    static /* synthetic */ int access$3900(String str) {
    }

    static /* synthetic */ Ordering access$4000() {
    }

    static /* synthetic */ Ordering access$4100() {
    }

    static /* synthetic */ void access$4200(DefaultTrackSelector defaultTrackSelector) {
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
    }

    public static /* synthetic */ List bpdqqiQNVROMLC1ll1l1l11(DefaultTrackSelector defaultTrackSelector, Parameters parameters, boolean z, int i, TrackGroup trackGroup, int[] iArr) {
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Integer num, Integer num2) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(DefaultTrackSelector defaultTrackSelector, Format format) {
    }

    public static /* synthetic */ List dpbdpqRKAscW1lll1l(Parameters parameters, String str, int i, TrackGroup trackGroup, int[] iArr) {
    }

    public static /* synthetic */ List dqqppqiKzJi1l1lll1l(Parameters parameters, int[] iArr, int i, TrackGroup trackGroup, int[] iArr2) {
    }

    protected static int getFormatLanguageScore(Format format, String str, boolean z) {
    }

    private static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i, int i2, boolean z) {
    }

    private static Point getMaxVideoSizeInViewport(boolean z, int i, int i2, int i3, int i4) {
    }

    private static int getRoleFlagMatchScore(int i, int i2) {
    }

    private static int getVideoCodecPreferenceScore(String str) {
    }

    private boolean isAudioFormatWithinAudioChannelCountConstraints(Format format) {
    }

    private static boolean isDolbyAudio(Format format) {
    }

    protected static boolean isSupported(int i, boolean z) {
    }

    private /* synthetic */ List lambda$selectAudioTrack$3(Parameters parameters, boolean z, int i, TrackGroup trackGroup, int[] iArr) {
    }

    private static /* synthetic */ List lambda$selectTextTrack$4(Parameters parameters, String str, int i, TrackGroup trackGroup, int[] iArr) {
    }

    private static /* synthetic */ List lambda$selectVideoTrack$2(Parameters parameters, int[] iArr, int i, TrackGroup trackGroup, int[] iArr2) {
    }

    private static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
    }

    private static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
    }

    private void maybeInvalidateForAudioChannelCountConstraints() {
    }

    protected static String normalizeUndeterminedLanguageToNull(String str) {
    }

    public static /* synthetic */ int ppbdpwWWljzmXXdHNabfWhgjl111l11(Integer num, Integer num2) {
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
    }

    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
    }

    private void setParametersInternal(Parameters parameters) {
    }

    public Parameters.Builder buildUponParameters() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public /* bridge */ /* synthetic */ TrackSelectionParameters getParameters() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void release() {
    }

    protected ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
    }

    protected ExoTrackSelection.Definition selectOtherTrack(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters, String str) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
    }

    public DefaultTrackSelector(Context context) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public Parameters getParameters() {
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
    }

    public void setParameters(Parameters.Builder builder) {
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, Context context) {
    }
}
