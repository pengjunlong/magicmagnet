package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Header implements Parcelable {
    public static final Parcelable.Creator<Header> CREATOR = null;
    private final String icon;
    private final int id;
    private final String title;

    @xc0
    public static final class Creator implements Parcelable.Creator<Header> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Header createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Header createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Header[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Header[] newArray(int i) {
        }
    }

    public Header(int i, String str, String str2) {
    }

    public static /* synthetic */ Header copy$default(Header header, int i, String str, String str2, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final Header copy(int i, String str, String str2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getIcon() {
    }

    public final int getId() {
    }

    public final String getTitle() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
