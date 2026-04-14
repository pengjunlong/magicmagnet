package com.magicmagnet.data.bean.newxlbanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.IFilmReviewData;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class XLBannerItem implements IData, IFilmReviewData {
    public static final Parcelable.Creator<XLBannerItem> CREATOR = null;
    private final String banner_type;
    private final CinecismData cinecism_data;
    private final String cover_url;
    private final String date;
    private final int id;
    private final PostData post_data;
    private final String title;

    @xc0
    public static final class Creator implements Parcelable.Creator<XLBannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XLBannerItem createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ XLBannerItem createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XLBannerItem[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ XLBannerItem[] newArray(int i) {
        }
    }

    public XLBannerItem(int i, String str, String str2, String str3, String str4, CinecismData cinecismData, PostData postData) {
    }

    public static /* synthetic */ XLBannerItem copy$default(XLBannerItem xLBannerItem, int i, String str, String str2, String str3, String str4, CinecismData cinecismData, PostData postData, int i2, Object obj) {
    }

    private final boolean isFilmReview() {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final CinecismData component6() {
    }

    public final PostData component7() {
    }

    public final XLBannerItem copy(int i, String str, String str2, String str3, String str4, CinecismData cinecismData, PostData postData) {
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

    public final String getBanner_type() {
    }

    public final CinecismData getCinecism_data() {
    }

    public final String getCover_url() {
    }

    public final String getDate() {
    }

    public final int getId() {
    }

    public final PostData getPost_data() {
    }

    public final String getTitle() {
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
