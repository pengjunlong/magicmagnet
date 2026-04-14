package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = null;
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$1 */
    class C00171 implements Parcelable.Creator<MediaDescriptionCompat> {
        C00171() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static MediaDescription build(MediaDescription.Builder builder) {
        }

        static MediaDescription.Builder createBuilder() {
        }

        static CharSequence getDescription(MediaDescription mediaDescription) {
        }

        static Bundle getExtras(MediaDescription mediaDescription) {
        }

        static Bitmap getIconBitmap(MediaDescription mediaDescription) {
        }

        static Uri getIconUri(MediaDescription mediaDescription) {
        }

        static String getMediaId(MediaDescription mediaDescription) {
        }

        static CharSequence getSubtitle(MediaDescription mediaDescription) {
        }

        static CharSequence getTitle(MediaDescription mediaDescription) {
        }

        static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {
        }

        static void setExtras(MediaDescription.Builder builder, Bundle bundle) {
        }

        static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {
        }

        static void setIconUri(MediaDescription.Builder builder, Uri uri) {
        }

        static void setMediaId(MediaDescription.Builder builder, String str) {
        }

        static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {
        }

        static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static Uri getMediaUri(MediaDescription mediaDescription) {
        }

        static void setMediaUri(MediaDescription.Builder builder, Uri uri) {
        }
    }

    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
        }

        public Builder setDescription(CharSequence charSequence) {
        }

        public Builder setExtras(Bundle bundle) {
        }

        public Builder setIconBitmap(Bitmap bitmap) {
        }

        public Builder setIconUri(Uri uri) {
        }

        public Builder setMediaId(String str) {
        }

        public Builder setMediaUri(Uri uri) {
        }

        public Builder setSubtitle(CharSequence charSequence) {
        }

        public Builder setTitle(CharSequence charSequence) {
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public CharSequence getDescription() {
    }

    public Bundle getExtras() {
    }

    public Bitmap getIconBitmap() {
    }

    public Uri getIconUri() {
    }

    public Object getMediaDescription() {
    }

    public String getMediaId() {
    }

    public Uri getMediaUri() {
    }

    public CharSequence getSubtitle() {
    }

    public CharSequence getTitle() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    MediaDescriptionCompat(Parcel parcel) {
    }
}
