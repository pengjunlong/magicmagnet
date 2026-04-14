package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.cq;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class NewMagnetData implements Parcelable, IAutoCheckData, cq {
    public static final Parcelable.Creator<NewMagnetData> CREATOR = null;
    private final String data;
    private String hash;
    private final String name;
    private final String size;
    private AutoCheckState state;

    @xc0
    public static final class Creator implements Parcelable.Creator<NewMagnetData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewMagnetData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NewMagnetData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewMagnetData[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NewMagnetData[] newArray(int i) {
        }
    }

    public NewMagnetData(String str, String str2, String str3, String str4, AutoCheckState autoCheckState) {
    }

    public static /* synthetic */ NewMagnetData copy$default(NewMagnetData newMagnetData, String str, String str2, String str3, String str4, AutoCheckState autoCheckState, int i, Object obj) {
    }

    @Override // com.magicmagnet.data.bean.IAutoCheckData
    public void available() {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final AutoCheckState component5() {
    }

    public final NewMagnetData copy(String str, String str2, String str3, String str4, AutoCheckState autoCheckState) {
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

    @Override // com.magicmagnet.data.bean.IAutoCheckData
    public void finisLoading() {
    }

    public final String getData() {
    }

    public final String getHash() {
    }

    public final String getName() {
    }

    public final String getSize() {
    }

    public final AutoCheckState getState() {
    }

    @Override // com.magicmagnet.data.bean.IAutoCheckData
    public AutoCheckState getState_() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String hash() {
    }

    public int hashCode() {
    }

    @Override // com.magicmagnet.data.bean.IAutoCheckData
    public void loading() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String name() {
    }

    public final void setHash(String str) {
    }

    public final void setState(AutoCheckState autoCheckState) {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String size() {
    }

    public String toString() {
    }

    @Override // com.magicmagnet.data.bean.IAutoCheckData
    public void unavailable() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
