package com.magicmagnet.data.bean.newxlbanner;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = null;
    private final String nick_name;
    private final String portrait_url;
    private final String uid;

    @xc0
    public static final class Creator implements Parcelable.Creator<UserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserInfo createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ UserInfo[] newArray(int i) {
        }
    }

    public UserInfo(String str, String str2, String str3) {
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final UserInfo copy(String str, String str2, String str3) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getNick_name() {
    }

    public final String getPortrait_url() {
    }

    public final String getUid() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
