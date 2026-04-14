package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.cq;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MagnetData implements IData, cq, Parcelable {
    public static final Parcelable.Creator<MagnetData> CREATOR = null;
    private final String data;
    private String hash;
    private final String name;
    private final String size;

    @xc0
    public static final class Creator implements Parcelable.Creator<MagnetData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MagnetData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MagnetData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MagnetData[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MagnetData[] newArray(int i) {
        }
    }

    public MagnetData(String str, String str2, String str3, String str4) {
    }

    public static /* synthetic */ MagnetData copy$default(MagnetData magnetData, String str, String str2, String str3, String str4, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final MagnetData copy(String str, String str2, String str3, String str4) {
    }

    @Override // p000.cq
    public String copyName() {
    }

    @Override // p000.cq
    public String copyable() {
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

    public final String getData() {
    }

    public final String getHash() {
    }

    public final String getName() {
    }

    public final String getSize() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String hash() {
    }

    public int hashCode() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String name() {
    }

    public final void setHash(String str) {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String size() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
