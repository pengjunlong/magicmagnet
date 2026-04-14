package com.magicmagnet.data.bean.xlFilmReview;

import android.os.Parcel;
import android.os.Parcelable;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.IFilmReviewData;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FilmReview implements IData, IFilmReviewData {
    public static final Parcelable.Creator<FilmReview> CREATOR = null;
    private final CinecismInfo cinecism_info;
    private final UserInfo user_info;

    @xc0
    public static final class Creator implements Parcelable.Creator<FilmReview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilmReview createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FilmReview createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilmReview[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FilmReview[] newArray(int i) {
        }
    }

    public FilmReview(UserInfo userInfo, CinecismInfo cinecismInfo) {
    }

    public static /* synthetic */ FilmReview copy$default(FilmReview filmReview, UserInfo userInfo, CinecismInfo cinecismInfo, int i, Object obj) {
    }

    public final UserInfo component1() {
    }

    public final CinecismInfo component2() {
    }

    public final FilmReview copy(UserInfo userInfo, CinecismInfo cinecismInfo) {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String data() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String date() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final CinecismInfo getCinecism_info() {
    }

    public final UserInfo getUser_info() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String hash() {
    }

    public int hashCode() {
    }

    @Override // com.magicmagnet.data.bean.IFilmReviewData
    public String img() {
    }

    @Override // com.magicmagnet.data.bean.IFilmReviewData
    public String movieName() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String name() {
    }

    @Override // com.magicmagnet.data.bean.IFilmReviewData
    public Integer showCount() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String size() {
    }

    @Override // com.magicmagnet.data.bean.IFilmReviewData
    public String title() {
    }

    public String toString() {
    }

    @Override // com.magicmagnet.data.bean.IFilmReviewData
    public String uploaderImg() {
    }

    @Override // com.magicmagnet.data.bean.IFilmReviewData
    public String uploaderName() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
