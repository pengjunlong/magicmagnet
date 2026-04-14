package com.magicmagnet.data.bean.bilibili;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Result implements Parcelable {
    public static final Parcelable.Creator<Result> CREATOR = null;
    private final String arcrank;
    private final String arcurl;
    private final String author;
    private final boolean badgepay;
    private final String description;
    private final int duration;
    private final int favorites;
    private final int id;
    private final int mid;
    private final String pic;
    private final String play;
    private final String pubdate;
    private final int review;
    private final int senddate;
    private final String tag;
    private final String title;
    private final String type;
    private final int video_review;

    @xc0
    public static final class Creator implements Parcelable.Creator<Result> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Result createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Result createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Result[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Result[] newArray(int i) {
        }
    }

    public Result(boolean z, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, String str6, String str7, int i4, String str8, int i5, int i6, String str9, String str10, int i7) {
    }

    public static /* synthetic */ Result copy$default(Result result, boolean z, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, String str6, String str7, int i4, String str8, int i5, int i6, String str9, String str10, int i7, int i8, Object obj) {
    }

    public final boolean component1() {
    }

    public final String component10() {
    }

    public final String component11() {
    }

    public final int component12() {
    }

    public final String component13() {
    }

    public final int component14() {
    }

    public final int component15() {
    }

    public final String component16() {
    }

    public final String component17() {
    }

    public final int component18() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final int component6() {
    }

    public final String component7() {
    }

    public final int component8() {
    }

    public final int component9() {
    }

    public final Result copy(boolean z, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, String str6, String str7, int i4, String str8, int i5, int i6, String str9, String str10, int i7) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getArcrank() {
    }

    public final String getArcurl() {
    }

    public final String getAuthor() {
    }

    public final boolean getBadgepay() {
    }

    public final String getDescription() {
    }

    public final int getDuration() {
    }

    public final int getFavorites() {
    }

    public final int getId() {
    }

    public final int getMid() {
    }

    public final String getPic() {
    }

    public final String getPlay() {
    }

    public final String getPubdate() {
    }

    public final int getReview() {
    }

    public final int getSenddate() {
    }

    public final String getTag() {
    }

    public final String getTitle() {
    }

    public final String getType() {
    }

    public final int getVideo_review() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
