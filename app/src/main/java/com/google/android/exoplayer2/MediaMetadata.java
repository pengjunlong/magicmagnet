package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaMetadata implements Bundleable {
    public static final Bundleable.Creator<MediaMetadata> CREATOR = null;
    public static final MediaMetadata EMPTY = null;
    private static final String FIELD_ALBUM_ARTIST = null;
    private static final String FIELD_ALBUM_TITLE = null;
    private static final String FIELD_ARTIST = null;
    private static final String FIELD_ARTWORK_DATA = null;
    private static final String FIELD_ARTWORK_DATA_TYPE = null;
    private static final String FIELD_ARTWORK_URI = null;
    private static final String FIELD_COMPILATION = null;
    private static final String FIELD_COMPOSER = null;
    private static final String FIELD_CONDUCTOR = null;
    private static final String FIELD_DESCRIPTION = null;
    private static final String FIELD_DISC_NUMBER = null;
    private static final String FIELD_DISPLAY_TITLE = null;
    private static final String FIELD_EXTRAS = null;
    private static final String FIELD_FOLDER_TYPE = null;
    private static final String FIELD_GENRE = null;
    private static final String FIELD_IS_BROWSABLE = null;
    private static final String FIELD_IS_PLAYABLE = null;
    private static final String FIELD_MEDIA_TYPE = null;
    private static final String FIELD_OVERALL_RATING = null;
    private static final String FIELD_RECORDING_DAY = null;
    private static final String FIELD_RECORDING_MONTH = null;
    private static final String FIELD_RECORDING_YEAR = null;
    private static final String FIELD_RELEASE_DAY = null;
    private static final String FIELD_RELEASE_MONTH = null;
    private static final String FIELD_RELEASE_YEAR = null;
    private static final String FIELD_STATION = null;
    private static final String FIELD_SUBTITLE = null;
    private static final String FIELD_TITLE = null;
    private static final String FIELD_TOTAL_DISC_COUNT = null;
    private static final String FIELD_TOTAL_TRACK_COUNT = null;
    private static final String FIELD_TRACK_NUMBER = null;
    private static final String FIELD_USER_RATING = null;
    private static final String FIELD_WRITER = null;
    public static final int FOLDER_TYPE_ALBUMS = 2;
    public static final int FOLDER_TYPE_ARTISTS = 3;
    public static final int FOLDER_TYPE_GENRES = 4;
    public static final int FOLDER_TYPE_MIXED = 0;
    public static final int FOLDER_TYPE_NONE = -1;
    public static final int FOLDER_TYPE_PLAYLISTS = 5;
    public static final int FOLDER_TYPE_TITLES = 1;
    public static final int FOLDER_TYPE_YEARS = 6;
    public static final int MEDIA_TYPE_ALBUM = 10;
    public static final int MEDIA_TYPE_ARTIST = 11;
    public static final int MEDIA_TYPE_AUDIO_BOOK = 15;
    public static final int MEDIA_TYPE_AUDIO_BOOK_CHAPTER = 2;
    public static final int MEDIA_TYPE_FOLDER_ALBUMS = 21;
    public static final int MEDIA_TYPE_FOLDER_ARTISTS = 22;
    public static final int MEDIA_TYPE_FOLDER_AUDIO_BOOKS = 26;
    public static final int MEDIA_TYPE_FOLDER_GENRES = 23;
    public static final int MEDIA_TYPE_FOLDER_MIXED = 20;
    public static final int MEDIA_TYPE_FOLDER_MOVIES = 35;
    public static final int MEDIA_TYPE_FOLDER_NEWS = 32;
    public static final int MEDIA_TYPE_FOLDER_PLAYLISTS = 24;
    public static final int MEDIA_TYPE_FOLDER_PODCASTS = 27;
    public static final int MEDIA_TYPE_FOLDER_RADIO_STATIONS = 31;
    public static final int MEDIA_TYPE_FOLDER_TRAILERS = 34;
    public static final int MEDIA_TYPE_FOLDER_TV_CHANNELS = 28;
    public static final int MEDIA_TYPE_FOLDER_TV_SERIES = 29;
    public static final int MEDIA_TYPE_FOLDER_TV_SHOWS = 30;
    public static final int MEDIA_TYPE_FOLDER_VIDEOS = 33;
    public static final int MEDIA_TYPE_FOLDER_YEARS = 25;
    public static final int MEDIA_TYPE_GENRE = 12;
    public static final int MEDIA_TYPE_MIXED = 0;
    public static final int MEDIA_TYPE_MOVIE = 8;
    public static final int MEDIA_TYPE_MUSIC = 1;
    public static final int MEDIA_TYPE_NEWS = 5;
    public static final int MEDIA_TYPE_PLAYLIST = 13;
    public static final int MEDIA_TYPE_PODCAST = 16;
    public static final int MEDIA_TYPE_PODCAST_EPISODE = 3;
    public static final int MEDIA_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_TYPE_TRAILER = 7;
    public static final int MEDIA_TYPE_TV_CHANNEL = 17;
    public static final int MEDIA_TYPE_TV_SEASON = 19;
    public static final int MEDIA_TYPE_TV_SERIES = 18;
    public static final int MEDIA_TYPE_TV_SHOW = 9;
    public static final int MEDIA_TYPE_VIDEO = 6;
    public static final int MEDIA_TYPE_YEAR = 14;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;
    public final CharSequence albumArtist;
    public final CharSequence albumTitle;
    public final CharSequence artist;
    public final byte[] artworkData;
    public final Integer artworkDataType;
    public final Uri artworkUri;
    public final CharSequence compilation;
    public final CharSequence composer;
    public final CharSequence conductor;
    public final CharSequence description;
    public final Integer discNumber;
    public final CharSequence displayTitle;
    public final Bundle extras;
    public final Integer folderType;
    public final CharSequence genre;
    public final Boolean isBrowsable;
    public final Boolean isPlayable;
    public final Integer mediaType;
    public final Rating overallRating;
    public final Integer recordingDay;
    public final Integer recordingMonth;
    public final Integer recordingYear;
    public final Integer releaseDay;
    public final Integer releaseMonth;
    public final Integer releaseYear;
    public final CharSequence station;
    public final CharSequence subtitle;
    public final CharSequence title;
    public final Integer totalDiscCount;
    public final Integer totalTrackCount;
    public final Integer trackNumber;
    public final Rating userRating;
    public final CharSequence writer;

    @Deprecated
    public final Integer year;

    public static final class Builder {
        private CharSequence albumArtist;
        private CharSequence albumTitle;
        private CharSequence artist;
        private byte[] artworkData;
        private Integer artworkDataType;
        private Uri artworkUri;
        private CharSequence compilation;
        private CharSequence composer;
        private CharSequence conductor;
        private CharSequence description;
        private Integer discNumber;
        private CharSequence displayTitle;
        private Bundle extras;
        private Integer folderType;
        private CharSequence genre;
        private Boolean isBrowsable;
        private Boolean isPlayable;
        private Integer mediaType;
        private Rating overallRating;
        private Integer recordingDay;
        private Integer recordingMonth;
        private Integer recordingYear;
        private Integer releaseDay;
        private Integer releaseMonth;
        private Integer releaseYear;
        private CharSequence station;
        private CharSequence subtitle;
        private CharSequence title;
        private Integer totalDiscCount;
        private Integer totalTrackCount;
        private Integer trackNumber;
        private Rating userRating;
        private CharSequence writer;

        /* synthetic */ Builder(MediaMetadata mediaMetadata, C00751 c00751) {
        }

        static /* synthetic */ Boolean access$100(Builder builder) {
        }

        static /* synthetic */ CharSequence access$1000(Builder builder) {
        }

        static /* synthetic */ Rating access$1100(Builder builder) {
        }

        static /* synthetic */ Rating access$1200(Builder builder) {
        }

        static /* synthetic */ byte[] access$1300(Builder builder) {
        }

        static /* synthetic */ Integer access$1400(Builder builder) {
        }

        static /* synthetic */ Uri access$1500(Builder builder) {
        }

        static /* synthetic */ Integer access$1600(Builder builder) {
        }

        static /* synthetic */ Integer access$1700(Builder builder) {
        }

        static /* synthetic */ Boolean access$1800(Builder builder) {
        }

        static /* synthetic */ Integer access$1900(Builder builder) {
        }

        static /* synthetic */ Integer access$200(Builder builder) {
        }

        static /* synthetic */ Integer access$2000(Builder builder) {
        }

        static /* synthetic */ Integer access$2100(Builder builder) {
        }

        static /* synthetic */ Integer access$2200(Builder builder) {
        }

        static /* synthetic */ Integer access$2300(Builder builder) {
        }

        static /* synthetic */ Integer access$2400(Builder builder) {
        }

        static /* synthetic */ CharSequence access$2500(Builder builder) {
        }

        static /* synthetic */ CharSequence access$2600(Builder builder) {
        }

        static /* synthetic */ CharSequence access$2700(Builder builder) {
        }

        static /* synthetic */ Integer access$2800(Builder builder) {
        }

        static /* synthetic */ Integer access$2900(Builder builder) {
        }

        static /* synthetic */ Integer access$300(Builder builder) {
        }

        static /* synthetic */ CharSequence access$3000(Builder builder) {
        }

        static /* synthetic */ CharSequence access$3100(Builder builder) {
        }

        static /* synthetic */ CharSequence access$3200(Builder builder) {
        }

        static /* synthetic */ Bundle access$3300(Builder builder) {
        }

        static /* synthetic */ CharSequence access$400(Builder builder) {
        }

        static /* synthetic */ CharSequence access$500(Builder builder) {
        }

        static /* synthetic */ CharSequence access$600(Builder builder) {
        }

        static /* synthetic */ CharSequence access$700(Builder builder) {
        }

        static /* synthetic */ CharSequence access$800(Builder builder) {
        }

        static /* synthetic */ CharSequence access$900(Builder builder) {
        }

        public MediaMetadata build() {
        }

        @CanIgnoreReturnValue
        public Builder maybeSetArtworkData(byte[] bArr, int i) {
        }

        @CanIgnoreReturnValue
        public Builder populate(MediaMetadata mediaMetadata) {
        }

        @CanIgnoreReturnValue
        public Builder populateFromMetadata(Metadata metadata) {
        }

        @CanIgnoreReturnValue
        public Builder setAlbumArtist(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setAlbumTitle(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setArtist(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setArtworkData(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setArtworkUri(Uri uri) {
        }

        @CanIgnoreReturnValue
        public Builder setCompilation(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setComposer(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setConductor(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setDescription(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setDiscNumber(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setDisplayTitle(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setExtras(Bundle bundle) {
        }

        @CanIgnoreReturnValue
        public Builder setFolderType(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setGenre(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setIsBrowsable(Boolean bool) {
        }

        @CanIgnoreReturnValue
        public Builder setIsPlayable(Boolean bool) {
        }

        @CanIgnoreReturnValue
        public Builder setMediaType(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setOverallRating(Rating rating) {
        }

        @CanIgnoreReturnValue
        public Builder setRecordingDay(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setRecordingMonth(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setRecordingYear(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setReleaseDay(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setReleaseMonth(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setReleaseYear(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setStation(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setSubtitle(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setTitle(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setTotalDiscCount(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setTotalTrackCount(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setTrackNumber(Integer num) {
        }

        @CanIgnoreReturnValue
        public Builder setUserRating(Rating rating) {
        }

        @CanIgnoreReturnValue
        public Builder setWriter(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder setYear(Integer num) {
        }

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setArtworkData(byte[] bArr, Integer num) {
        }

        private Builder(MediaMetadata mediaMetadata) {
        }

        @CanIgnoreReturnValue
        public Builder populateFromMetadata(List<Metadata> list) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    /* synthetic */ MediaMetadata(Builder builder, C00751 c00751) {
    }

    public static /* synthetic */ MediaMetadata dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static MediaMetadata fromBundle(Bundle bundle) {
    }

    private static int getFolderTypeFromMediaType(int i) {
    }

    private static int getMediaTypeFromFolderType(int i) {
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

    private MediaMetadata(Builder builder) {
    }
}
