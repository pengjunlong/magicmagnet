package com.magicmagnet.data.bean.xlFilmReview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CinecismInfo implements Parcelable {
    public static final Parcelable.Creator<CinecismInfo> CREATOR = null;
    private final String body_url;
    private final int comment_count;
    private String cover_url;
    private final Long create_time;
    private final boolean have_fav;
    private final int id;
    private final String media_id;
    private final MediaInfo media_info;
    private final int origin;
    private final int show_count;
    private final String summary;
    private final String tag;
    private final String title;
    private final int uid;

    @xc0
    public static final class Creator implements Parcelable.Creator<CinecismInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CinecismInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CinecismInfo createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CinecismInfo[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CinecismInfo[] newArray(int i) {
        }
    }

    public CinecismInfo(int i, int i2, String str, boolean z, int i3, String str2, int i4, String str3, String str4, String str5, int i5, String str6, Long l, MediaInfo mediaInfo) {
    }

    public static /* synthetic */ CinecismInfo copy$default(CinecismInfo cinecismInfo, int i, int i2, String str, boolean z, int i3, String str2, int i4, String str3, String str4, String str5, int i5, String str6, Long l, MediaInfo mediaInfo, int i6, Object obj) {
    }

    public final int component1() {
    }

    public final String component10() {
    }

    public final int component11() {
    }

    public final String component12() {
    }

    public final Long component13() {
    }

    public final MediaInfo component14() {
    }

    public final int component2() {
    }

    public final String component3() {
    }

    public final boolean component4() {
    }

    public final int component5() {
    }

    public final String component6() {
    }

    public final int component7() {
    }

    public final String component8() {
    }

    public final String component9() {
    }

    public final CinecismInfo copy(int i, int i2, String str, boolean z, int i3, String str2, int i4, String str3, String str4, String str5, int i5, String str6, Long l, MediaInfo mediaInfo) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getBody_url() {
    }

    public final int getComment_count() {
    }

    public final String getCover_url() {
    }

    public final Long getCreate_time() {
    }

    public final boolean getHave_fav() {
    }

    public final int getId() {
    }

    public final String getMedia_id() {
    }

    public final MediaInfo getMedia_info() {
    }

    public final int getOrigin() {
    }

    public final int getShow_count() {
    }

    public final String getSummary() {
    }

    public final String getTag() {
    }

    public final String getTitle() {
    }

    public final int getUid() {
    }

    public int hashCode() {
    }

    public final void setCover_url(String str) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
