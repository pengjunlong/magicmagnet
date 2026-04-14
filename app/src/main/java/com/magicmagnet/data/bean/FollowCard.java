package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.magicmagnet.data.bean.KaiyanResponse;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FollowCard implements Parcelable {
    public static final Parcelable.Creator<FollowCard> CREATOR = null;
    private final KaiyanResponse.Item.Data.Content content;
    private final String dataType;
    private final Header header;

    @xc0
    public static final class Creator implements Parcelable.Creator<FollowCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowCard createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FollowCard createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowCard[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FollowCard[] newArray(int i) {
        }
    }

    public FollowCard(String str, Header header, KaiyanResponse.Item.Data.Content content) {
    }

    public static /* synthetic */ FollowCard copy$default(FollowCard followCard, String str, Header header, KaiyanResponse.Item.Data.Content content, int i, Object obj) {
    }

    public final String component1() {
    }

    public final Header component2() {
    }

    public final KaiyanResponse.Item.Data.Content component3() {
    }

    public final FollowCard copy(String str, Header header, KaiyanResponse.Item.Data.Content content) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final KaiyanResponse.Item.Data.Content getContent() {
    }

    public final String getDataType() {
    }

    public final Header getHeader() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
