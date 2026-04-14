package com.magicmagnet.data.bean.xlFilmReview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class VipExtra implements Parcelable {
    public static final Parcelable.Creator<VipExtra> CREATOR = null;
    private final String VIPLevel;
    private final String isVIP;
    private final String isYear;
    private final String uid;
    private final int vasID;
    private final String vasType;

    @xc0
    public static final class Creator implements Parcelable.Creator<VipExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExtra createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VipExtra createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExtra[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VipExtra[] newArray(int i) {
        }
    }

    public VipExtra(String str, String str2, int i, String str3, String str4, String str5) {
    }

    public static /* synthetic */ VipExtra copy$default(VipExtra vipExtra, String str, String str2, int i, String str3, String str4, String str5, int i2, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final String component6() {
    }

    public final VipExtra copy(String str, String str2, int i, String str3, String str4, String str5) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getUid() {
    }

    public final String getVIPLevel() {
    }

    public final int getVasID() {
    }

    public final String getVasType() {
    }

    public int hashCode() {
    }

    public final String isVIP() {
    }

    public final String isYear() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
