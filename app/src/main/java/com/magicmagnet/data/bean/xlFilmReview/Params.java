package com.magicmagnet.data.bean.xlFilmReview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Params implements Parcelable {
    public static final Parcelable.Creator<Params> CREATOR = null;
    private final int fav_count;
    private final String lastest_res_title;
    private final long play_count;
    private final long play_time;
    private final int pub_res_count;
    private final int res_update_time;
    private final long share_count;

    @xc0
    public static final class Creator implements Parcelable.Creator<Params> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Params createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Params createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Params[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Params[] newArray(int i) {
        }
    }

    public Params(String str, int i, long j, int i2, long j2, long j3, int i3) {
    }

    public static /* synthetic */ Params copy$default(Params params, String str, int i, long j, int i2, long j2, long j3, int i3, int i4, Object obj) {
    }

    public final String component1() {
    }

    public final int component2() {
    }

    public final long component3() {
    }

    public final int component4() {
    }

    public final long component5() {
    }

    public final long component6() {
    }

    public final int component7() {
    }

    public final Params copy(String str, int i, long j, int i2, long j2, long j3, int i3) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int getFav_count() {
    }

    public final String getLastest_res_title() {
    }

    public final long getPlay_count() {
    }

    public final long getPlay_time() {
    }

    public final int getPub_res_count() {
    }

    public final int getRes_update_time() {
    }

    public final long getShare_count() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
