package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Cover implements Parcelable {
    public static final Parcelable.Creator<Cover> CREATOR = null;
    private final String detail;

    @xc0
    public static final class Creator implements Parcelable.Creator<Cover> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cover createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Cover createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cover[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Cover[] newArray(int i) {
        }
    }

    public Cover(String str) {
    }

    public static /* synthetic */ Cover copy$default(Cover cover, String str, int i, Object obj) {
    }

    public final String component1() {
    }

    public final Cover copy(String str) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getDetail() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
