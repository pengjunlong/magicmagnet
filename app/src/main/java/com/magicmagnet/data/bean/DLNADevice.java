package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DLNADevice implements Parcelable {
    public static final Parcelable.Creator<DLNADevice> CREATOR = null;
    private final String icon;
    private final String id;
    private final String ip;
    private final String name;

    @xc0
    public static final class Creator implements Parcelable.Creator<DLNADevice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DLNADevice createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DLNADevice createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DLNADevice[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DLNADevice[] newArray(int i) {
        }
    }

    public DLNADevice(String str, String str2, String str3, String str4) {
    }

    public static /* synthetic */ DLNADevice copy$default(DLNADevice dLNADevice, String str, String str2, String str3, String str4, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final DLNADevice copy(String str, String str2, String str3, String str4) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getIcon() {
    }

    public final String getId() {
    }

    public final String getIp() {
    }

    public final String getName() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
