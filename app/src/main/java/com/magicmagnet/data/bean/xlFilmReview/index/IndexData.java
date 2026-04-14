package com.magicmagnet.data.bean.xlFilmReview.index;

import android.os.Parcel;
import android.os.Parcelable;
import com.magicmagnet.data.bean.IData;
import com.magicmagnet.data.bean.IFilmReviewData;
import com.magicmagnet.data.bean.xlFilmReview.MediaInfo;
import com.magicmagnet.data.bean.xlFilmReview.UserInfo;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class IndexData implements IData, IFilmReviewData {
    public static final Parcelable.Creator<IndexData> CREATOR = null;
    private final String id;
    private final String media_id;
    private final MediaInfo media_info;
    private final ResInfo res_info;
    private final String res_type;
    private final String uid;
    private final UserInfo user_info;

    @xc0
    public static final class Creator implements Parcelable.Creator<IndexData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndexData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IndexData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndexData[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IndexData[] newArray(int i) {
        }
    }

    public IndexData(String str, String str2, String str3, String str4, UserInfo userInfo, MediaInfo mediaInfo, ResInfo resInfo) {
    }

    public static /* synthetic */ IndexData copy$default(IndexData indexData, String str, String str2, String str3, String str4, UserInfo userInfo, MediaInfo mediaInfo, ResInfo resInfo, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final UserInfo component5() {
    }

    public final MediaInfo component6() {
    }

    public final ResInfo component7() {
    }

    public final IndexData copy(String str, String str2, String str3, String str4, UserInfo userInfo, MediaInfo mediaInfo, ResInfo resInfo) {
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

    public final String getId() {
    }

    public final String getMedia_id() {
    }

    public final MediaInfo getMedia_info() {
    }

    public final ResInfo getRes_info() {
    }

    public final String getRes_type() {
    }

    public final String getUid() {
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
