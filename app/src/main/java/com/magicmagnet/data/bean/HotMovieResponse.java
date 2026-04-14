package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.adblockplus.libadblockplus.android.settings.Utils;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HotMovieResponse {

    @SerializedName("data")
    private final List<String> data;

    @SerializedName("movieDetail")
    private final ArrayList<MovieDetail> movieDetail;

    public HotMovieResponse() {
    }

    public HotMovieResponse(List<String> list, ArrayList<MovieDetail> arrayList) {
    }

    public static /* synthetic */ HotMovieResponse copy$default(HotMovieResponse hotMovieResponse, List list, ArrayList arrayList, int i, Object obj) {
    }

    public final List<String> component1() {
    }

    public final ArrayList<MovieDetail> component2() {
    }

    public final HotMovieResponse copy(List<String> list, ArrayList<MovieDetail> arrayList) {
    }

    public boolean equals(Object obj) {
    }

    public final List<String> getData() {
    }

    public final ArrayList<MovieDetail> getMovieDetail() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public /* synthetic */ HotMovieResponse(List list, ArrayList arrayList, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    @Metadata
    public static final class MovieDetail implements Serializable, Parcelable {
        public static final Parcelable.Creator<MovieDetail> CREATOR = null;

        @SerializedName("data")
        private Parcelable data;

        @SerializedName("img")
        private String img;

        @SerializedName(Utils.SUBSCRIPTION_FIELD_TITLE)
        private String title;

        @SerializedName("type")
        private String type;

        @xc0
        public static final class Creator implements Parcelable.Creator<MovieDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MovieDetail createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MovieDetail createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MovieDetail[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ MovieDetail[] newArray(int i) {
            }
        }

        public MovieDetail(String str, String str2, String str3, Parcelable parcelable) {
        }

        public static /* synthetic */ MovieDetail copy$default(MovieDetail movieDetail, String str, String str2, String str3, Parcelable parcelable, int i, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final Parcelable component4() {
        }

        public final MovieDetail copy(String str, String str2, String str3, Parcelable parcelable) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(Object obj) {
        }

        public final Parcelable getData() {
        }

        public final String getImg() {
        }

        public final String getTitle() {
        }

        public final String getType() {
        }

        public int hashCode() {
        }

        public final void setData(Parcelable parcelable) {
        }

        public final void setImg(String str) {
        }

        public final void setTitle(String str) {
        }

        public final void setType(String str) {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public /* synthetic */ MovieDetail(String str, String str2, String str3, Parcelable parcelable, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }
}
