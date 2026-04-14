package com.magicmagnet.data.bean.newxlbanner;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CinecismData implements Parcelable {
    public static final Parcelable.Creator<CinecismData> CREATOR = null;
    private final String cinecism_abstruct;
    private final String cinecism_id;
    private final int movie_id;
    private final String movie_name;
    private final UserInfo user_info;

    @xc0
    public static final class Creator implements Parcelable.Creator<CinecismData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CinecismData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CinecismData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CinecismData[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CinecismData[] newArray(int i) {
        }
    }

    public CinecismData(String str, String str2, int i, String str3, UserInfo userInfo) {
    }

    public static /* synthetic */ CinecismData copy$default(CinecismData cinecismData, String str, String str2, int i, String str3, UserInfo userInfo, int i2, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final String component4() {
    }

    public final UserInfo component5() {
    }

    public final CinecismData copy(String str, String str2, int i, String str3, UserInfo userInfo) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getCinecism_abstruct() {
    }

    public final String getCinecism_id() {
    }

    public final int getMovie_id() {
    }

    public final String getMovie_name() {
    }

    public final UserInfo getUser_info() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
