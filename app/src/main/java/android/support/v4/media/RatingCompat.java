package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = null;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    /* renamed from: android.support.v4.media.RatingCompat$1 */
    class C00191 implements Parcelable.Creator<RatingCompat> {
        C00191() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RatingCompat createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RatingCompat[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
        }
    }

    private static class Api19Impl {
        private Api19Impl() {
        }

        static float getPercentRating(Rating rating) {
        }

        static int getRatingStyle(Rating rating) {
        }

        static float getStarRating(Rating rating) {
        }

        static boolean hasHeart(Rating rating) {
        }

        static boolean isRated(Rating rating) {
        }

        static boolean isThumbUp(Rating rating) {
        }

        static Rating newHeartRating(boolean z) {
        }

        static Rating newPercentageRating(float f) {
        }

        static Rating newStarRating(int i, float f) {
        }

        static Rating newThumbRating(boolean z) {
        }

        static Rating newUnratedRating(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    RatingCompat(int i, float f) {
    }

    public static RatingCompat fromRating(Object obj) {
    }

    public static RatingCompat newHeartRating(boolean z) {
    }

    public static RatingCompat newPercentageRating(float f) {
    }

    public static RatingCompat newStarRating(int i, float f) {
    }

    public static RatingCompat newThumbRating(boolean z) {
    }

    public static RatingCompat newUnratedRating(int i) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public float getPercentRating() {
    }

    public Object getRating() {
    }

    public int getRatingStyle() {
    }

    public float getStarRating() {
    }

    public boolean hasHeart() {
    }

    public boolean isRated() {
    }

    public boolean isThumbUp() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
