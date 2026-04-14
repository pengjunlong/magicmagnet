package com.magicmagnet.data.bean.xlFilmReview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PubExtra implements Parcelable {
    public static final Parcelable.Creator<PubExtra> CREATOR = null;
    private final int uid;
    private final String v_comment;
    private final int v_status;
    private final String v_url;

    @xc0
    public static final class Creator implements Parcelable.Creator<PubExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PubExtra createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PubExtra createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PubExtra[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PubExtra[] newArray(int i) {
        }
    }

    public PubExtra(String str, int i, String str2, int i2) {
    }

    public static /* synthetic */ PubExtra copy$default(PubExtra pubExtra, String str, int i, String str2, int i2, int i3, Object obj) {
    }

    public final String component1() {
    }

    public final int component2() {
    }

    public final String component3() {
    }

    public final int component4() {
    }

    public final PubExtra copy(String str, int i, String str2, int i2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int getUid() {
    }

    public final String getV_comment() {
    }

    public final int getV_status() {
    }

    public final String getV_url() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
