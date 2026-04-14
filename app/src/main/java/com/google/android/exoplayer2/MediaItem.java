package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaItem implements Bundleable {
    public static final Bundleable.Creator<MediaItem> CREATOR = null;
    public static final String DEFAULT_MEDIA_ID = "";
    public static final MediaItem EMPTY = null;
    private static final String FIELD_CLIPPING_PROPERTIES = null;
    private static final String FIELD_LIVE_CONFIGURATION = null;
    private static final String FIELD_MEDIA_ID = null;
    private static final String FIELD_MEDIA_METADATA = null;
    private static final String FIELD_REQUEST_METADATA = null;
    public final ClippingConfiguration clippingConfiguration;

    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;

    @Deprecated
    public final PlaybackProperties playbackProperties;
    public final RequestMetadata requestMetadata;

    public static final class AdsConfiguration {
        public final Uri adTagUri;
        public final Object adsId;

        public static final class Builder {
            private Uri adTagUri;
            private Object adsId;

            public Builder(Uri uri) {
            }

            static /* synthetic */ Uri access$1600(Builder builder) {
            }

            static /* synthetic */ Object access$1700(Builder builder) {
            }

            public AdsConfiguration build() {
            }

            @CanIgnoreReturnValue
            public Builder setAdTagUri(Uri uri) {
            }

            @CanIgnoreReturnValue
            public Builder setAdsId(Object obj) {
            }
        }

        /* synthetic */ AdsConfiguration(Builder builder, C00741 c00741) {
        }

        public Builder buildUpon() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private AdsConfiguration(Builder builder) {
        }
    }

    public static final class Builder {
        private AdsConfiguration adsConfiguration;
        private ClippingConfiguration.Builder clippingConfiguration;
        private String customCacheKey;
        private DrmConfiguration.Builder drmConfiguration;
        private LiveConfiguration.Builder liveConfiguration;
        private String mediaId;
        private MediaMetadata mediaMetadata;
        private String mimeType;
        private RequestMetadata requestMetadata;
        private List<StreamKey> streamKeys;
        private ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        private Object tag;
        private Uri uri;

        /* synthetic */ Builder(MediaItem mediaItem, C00741 c00741) {
        }

        public MediaItem build() {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAdTagUri(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setAdsConfiguration(AdsConfiguration adsConfiguration) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipEndPositionMs(long j) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipRelativeToDefaultPosition(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipRelativeToLiveWindow(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipStartPositionMs(long j) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setClipStartsAtKeyFrame(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setClippingConfiguration(ClippingConfiguration clippingConfiguration) {
        }

        @CanIgnoreReturnValue
        public Builder setCustomCacheKey(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setDrmConfiguration(DrmConfiguration drmConfiguration) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmForceDefaultLicenseUri(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmKeySetId(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmLicenseRequestHeaders(Map<String, String> map) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmLicenseUri(Uri uri) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmMultiSession(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmPlayClearContentWithoutKey(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmSessionForClearPeriods(boolean z) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmSessionForClearTypes(List<Integer> list) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmUuid(UUID uuid) {
        }

        @CanIgnoreReturnValue
        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMaxOffsetMs(long j) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMaxPlaybackSpeed(float f) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMinOffsetMs(long j) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveMinPlaybackSpeed(float f) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setLiveTargetOffsetMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setMediaId(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
        }

        @CanIgnoreReturnValue
        public Builder setMimeType(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
        }

        @CanIgnoreReturnValue
        public Builder setStreamKeys(List<StreamKey> list) {
        }

        @CanIgnoreReturnValue
        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setSubtitles(List<Subtitle> list) {
        }

        @CanIgnoreReturnValue
        public Builder setTag(Object obj) {
        }

        @CanIgnoreReturnValue
        public Builder setUri(String str) {
        }

        public Builder() {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAdTagUri(Uri uri) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setDrmLicenseUri(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setUri(Uri uri) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setAdTagUri(Uri uri, Object obj) {
        }

        private Builder(MediaItem mediaItem) {
        }
    }

    public static class ClippingConfiguration implements Bundleable {
        public static final Bundleable.Creator<ClippingProperties> CREATOR = null;
        private static final String FIELD_END_POSITION_MS = null;
        private static final String FIELD_RELATIVE_TO_DEFAULT_POSITION = null;
        private static final String FIELD_RELATIVE_TO_LIVE_WINDOW = null;
        private static final String FIELD_STARTS_AT_KEY_FRAME = null;
        private static final String FIELD_START_POSITION_MS = null;
        public static final ClippingConfiguration UNSET = null;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;

        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            /* synthetic */ Builder(ClippingConfiguration clippingConfiguration, C00741 c00741) {
            }

            static /* synthetic */ long access$3900(Builder builder) {
            }

            static /* synthetic */ long access$4000(Builder builder) {
            }

            static /* synthetic */ boolean access$4100(Builder builder) {
            }

            static /* synthetic */ boolean access$4200(Builder builder) {
            }

            static /* synthetic */ boolean access$4300(Builder builder) {
            }

            public ClippingConfiguration build() {
            }

            @Deprecated
            public ClippingProperties buildClippingProperties() {
            }

            @CanIgnoreReturnValue
            public Builder setEndPositionMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToDefaultPosition(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setRelativeToLiveWindow(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setStartPositionMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setStartsAtKeyFrame(boolean z) {
            }

            public Builder() {
            }

            private Builder(ClippingConfiguration clippingConfiguration) {
            }
        }

        /* synthetic */ ClippingConfiguration(Builder builder, C00741 c00741) {
        }

        public static /* synthetic */ ClippingProperties dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static /* synthetic */ ClippingProperties lambda$static$0(Bundle bundle) {
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

        private ClippingConfiguration(Builder builder) {
        }
    }

    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = null;

        /* synthetic */ ClippingProperties(ClippingConfiguration.Builder builder, C00741 c00741) {
        }

        private ClippingProperties(ClippingConfiguration.Builder builder) {
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;
        private final byte[] keySetId;
        public final ImmutableMap<String, String> licenseRequestHeaders;
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;

        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;

        @Deprecated
        public final UUID uuid;

        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private ImmutableList<Integer> forcedSessionTrackTypes;
            private byte[] keySetId;
            private ImmutableMap<String, String> licenseRequestHeaders;
            private Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            private UUID scheme;

            /* synthetic */ Builder(C00741 c00741) {
            }

            static /* synthetic */ Builder access$100(Builder builder, UUID uuid) {
            }

            static /* synthetic */ boolean access$1000(Builder builder) {
            }

            static /* synthetic */ boolean access$1100(Builder builder) {
            }

            static /* synthetic */ ImmutableList access$1200(Builder builder) {
            }

            static /* synthetic */ byte[] access$1300(Builder builder) {
            }

            static /* synthetic */ Uri access$200(Builder builder) {
            }

            static /* synthetic */ UUID access$300(Builder builder) {
            }

            static /* synthetic */ boolean access$800(Builder builder) {
            }

            static /* synthetic */ ImmutableMap access$900(Builder builder) {
            }

            @CanIgnoreReturnValue
            @Deprecated
            private Builder setNullableScheme(UUID uuid) {
            }

            public DrmConfiguration build() {
            }

            @CanIgnoreReturnValue
            @InlineMe(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @Deprecated
            public Builder forceSessionsForAudioAndVideoTracks(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setForceDefaultLicenseUri(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setForcedSessionTrackTypes(List<Integer> list) {
            }

            @CanIgnoreReturnValue
            public Builder setKeySetId(byte[] bArr) {
            }

            @CanIgnoreReturnValue
            public Builder setLicenseRequestHeaders(Map<String, String> map) {
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(Uri uri) {
            }

            @CanIgnoreReturnValue
            public Builder setMultiSession(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setPlayClearContentWithoutKey(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setScheme(UUID uuid) {
            }

            /* synthetic */ Builder(DrmConfiguration drmConfiguration, C00741 c00741) {
            }

            @CanIgnoreReturnValue
            public Builder setLicenseUri(String str) {
            }

            public Builder(UUID uuid) {
            }

            @Deprecated
            private Builder() {
            }

            private Builder(DrmConfiguration drmConfiguration) {
            }
        }

        /* synthetic */ DrmConfiguration(Builder builder, C00741 c00741) {
        }

        static /* synthetic */ byte[] access$600(DrmConfiguration drmConfiguration) {
        }

        public Builder buildUpon() {
        }

        public boolean equals(Object obj) {
        }

        public byte[] getKeySetId() {
        }

        public int hashCode() {
        }

        private DrmConfiguration(Builder builder) {
        }
    }

    public static final class LiveConfiguration implements Bundleable {
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = null;
        private static final String FIELD_MAX_OFFSET_MS = null;
        private static final String FIELD_MAX_PLAYBACK_SPEED = null;
        private static final String FIELD_MIN_OFFSET_MS = null;
        private static final String FIELD_MIN_PLAYBACK_SPEED = null;
        private static final String FIELD_TARGET_OFFSET_MS = null;
        public static final LiveConfiguration UNSET = null;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;

        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            /* synthetic */ Builder(LiveConfiguration liveConfiguration, C00741 c00741) {
            }

            static /* synthetic */ long access$2100(Builder builder) {
            }

            static /* synthetic */ long access$2200(Builder builder) {
            }

            static /* synthetic */ long access$2300(Builder builder) {
            }

            static /* synthetic */ float access$2400(Builder builder) {
            }

            static /* synthetic */ float access$2500(Builder builder) {
            }

            public LiveConfiguration build() {
            }

            @CanIgnoreReturnValue
            public Builder setMaxOffsetMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setMaxPlaybackSpeed(float f) {
            }

            @CanIgnoreReturnValue
            public Builder setMinOffsetMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setMinPlaybackSpeed(float f) {
            }

            @CanIgnoreReturnValue
            public Builder setTargetOffsetMs(long j) {
            }

            public Builder() {
            }

            private Builder(LiveConfiguration liveConfiguration) {
            }
        }

        /* synthetic */ LiveConfiguration(Builder builder, C00741 c00741) {
        }

        public static /* synthetic */ LiveConfiguration dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static /* synthetic */ LiveConfiguration lambda$static$0(Bundle bundle) {
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

        private LiveConfiguration(Builder builder) {
        }

        @Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
        }
    }

    public static class LocalConfiguration {
        public final AdsConfiguration adsConfiguration;
        public final String customCacheKey;
        public final DrmConfiguration drmConfiguration;
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;

        @Deprecated
        public final List<Subtitle> subtitles;
        public final Object tag;
        public final Uri uri;

        /* synthetic */ LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List list, String str2, ImmutableList immutableList, Object obj, C00741 c00741) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List<StreamKey> list, String str2, ImmutableList<SubtitleConfiguration> immutableList, Object obj) {
        }
    }

    @Deprecated
    public static final class PlaybackProperties extends LocalConfiguration {
        /* synthetic */ PlaybackProperties(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List list, String str2, ImmutableList immutableList, Object obj, C00741 c00741) {
        }

        private PlaybackProperties(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List<StreamKey> list, String str2, ImmutableList<SubtitleConfiguration> immutableList, Object obj) {
        }
    }

    public static final class RequestMetadata implements Bundleable {
        public static final Bundleable.Creator<RequestMetadata> CREATOR = null;
        public static final RequestMetadata EMPTY = null;
        private static final String FIELD_EXTRAS = null;
        private static final String FIELD_MEDIA_URI = null;
        private static final String FIELD_SEARCH_QUERY = null;
        public final Bundle extras;
        public final Uri mediaUri;
        public final String searchQuery;

        public static final class Builder {
            private Bundle extras;
            private Uri mediaUri;
            private String searchQuery;

            /* synthetic */ Builder(RequestMetadata requestMetadata, C00741 c00741) {
            }

            static /* synthetic */ Uri access$4700(Builder builder) {
            }

            static /* synthetic */ String access$4800(Builder builder) {
            }

            static /* synthetic */ Bundle access$4900(Builder builder) {
            }

            public RequestMetadata build() {
            }

            @CanIgnoreReturnValue
            public Builder setExtras(Bundle bundle) {
            }

            @CanIgnoreReturnValue
            public Builder setMediaUri(Uri uri) {
            }

            @CanIgnoreReturnValue
            public Builder setSearchQuery(String str) {
            }

            public Builder() {
            }

            private Builder(RequestMetadata requestMetadata) {
            }
        }

        /* synthetic */ RequestMetadata(Builder builder, C00741 c00741) {
        }

        public static /* synthetic */ RequestMetadata dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
        }

        private static /* synthetic */ RequestMetadata lambda$static$0(Bundle bundle) {
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

        private RequestMetadata(Builder builder) {
        }
    }

    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
        /* synthetic */ Subtitle(SubtitleConfiguration.Builder builder, C00741 c00741) {
        }

        @Deprecated
        public Subtitle(Uri uri, String str, String str2) {
        }

        @Deprecated
        public Subtitle(Uri uri, String str, String str2, int i) {
        }

        @Deprecated
        public Subtitle(Uri uri, String str, String str2, int i, int i2, String str3) {
        }

        private Subtitle(SubtitleConfiguration.Builder builder) {
        }
    }

    public static class SubtitleConfiguration {
        public final String id;
        public final String label;
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        public static final class Builder {
            private String id;
            private String label;
            private String language;
            private String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private Uri uri;

            /* synthetic */ Builder(SubtitleConfiguration subtitleConfiguration, C00741 c00741) {
            }

            static /* synthetic */ Subtitle access$1800(Builder builder) {
            }

            static /* synthetic */ Uri access$2900(Builder builder) {
            }

            static /* synthetic */ String access$3000(Builder builder) {
            }

            static /* synthetic */ String access$3100(Builder builder) {
            }

            static /* synthetic */ int access$3200(Builder builder) {
            }

            static /* synthetic */ int access$3300(Builder builder) {
            }

            static /* synthetic */ String access$3400(Builder builder) {
            }

            static /* synthetic */ String access$3500(Builder builder) {
            }

            private Subtitle buildSubtitle() {
            }

            public SubtitleConfiguration build() {
            }

            @CanIgnoreReturnValue
            public Builder setId(String str) {
            }

            @CanIgnoreReturnValue
            public Builder setLabel(String str) {
            }

            @CanIgnoreReturnValue
            public Builder setLanguage(String str) {
            }

            @CanIgnoreReturnValue
            public Builder setMimeType(String str) {
            }

            @CanIgnoreReturnValue
            public Builder setRoleFlags(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setSelectionFlags(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setUri(Uri uri) {
            }

            public Builder(Uri uri) {
            }

            private Builder(SubtitleConfiguration subtitleConfiguration) {
            }
        }

        /* synthetic */ SubtitleConfiguration(Uri uri, String str, String str2, int i, int i2, String str3, String str4, C00741 c00741) {
        }

        public Builder buildUpon() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        /* synthetic */ SubtitleConfiguration(Builder builder, C00741 c00741) {
        }

        private SubtitleConfiguration(Uri uri, String str, String str2, int i, int i2, String str3, String str4) {
        }

        private SubtitleConfiguration(Builder builder) {
        }
    }

    /* synthetic */ MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata, C00741 c00741) {
    }

    public static /* synthetic */ MediaItem dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static MediaItem fromBundle(Bundle bundle) {
    }

    public static MediaItem fromUri(String str) {
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

    private MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
    }

    public static MediaItem fromUri(Uri uri) {
    }
}
