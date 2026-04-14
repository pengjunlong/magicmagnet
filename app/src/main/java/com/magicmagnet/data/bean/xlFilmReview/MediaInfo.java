package com.magicmagnet.data.bean.xlFilmReview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MediaInfo implements Parcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = null;
    private final String actors;
    private final String areas;
    private final String categories;
    private final String created_at;
    private final String description;
    private final String directors;
    private final Integer id;
    private final String name;
    private final String release_time;
    private final String type;
    private final String updated_at;
    private final String vertical_cover_url;
    private final String year;

    @xc0
    public static final class Creator implements Parcelable.Creator<MediaInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MediaInfo createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaInfo[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MediaInfo[] newArray(int i) {
        }
    }

    public MediaInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12) {
    }

    public static /* synthetic */ MediaInfo copy$default(MediaInfo mediaInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component10() {
    }

    public final Integer component11() {
    }

    public final String component12() {
    }

    public final String component13() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final String component6() {
    }

    public final String component7() {
    }

    public final String component8() {
    }

    public final String component9() {
    }

    public final MediaInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getActors() {
    }

    public final String getAreas() {
    }

    public final String getCategories() {
    }

    public final String getCreated_at() {
    }

    public final String getDescription() {
    }

    public final String getDirectors() {
    }

    public final Integer getId() {
    }

    public final String getName() {
    }

    public final String getRelease_time() {
    }

    public final String getType() {
    }

    public final String getUpdated_at() {
    }

    public final String getVertical_cover_url() {
    }

    public final String getYear() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
