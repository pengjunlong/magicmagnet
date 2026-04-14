package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.cq;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.vr;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class SearchResult implements IData, Parcelable, vr, cq {
    public static final Parcelable.Creator<SearchResult> CREATOR = null;
    private String date;
    private String hash;
    private String magnet;
    private String name;
    private String size;

    @xc0
    public static final class Creator implements Parcelable.Creator<SearchResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchResult createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchResult createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchResult[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchResult[] newArray(int i) {
        }
    }

    public SearchResult(String str, String str2, String str3, String str4, String str5) {
    }

    public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final String component5() {
    }

    public final SearchResult copy(String str, String str2, String str3, String str4, String str5) {
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

    public final String getDate() {
    }

    public final String getHash() {
    }

    public final String getMagnet() {
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

    public final void setDate(String str) {
    }

    public final void setHash(String str) {
    }

    public final void setMagnet(String str) {
    }

    public final void setName(String str) {
    }

    public final void setSize(String str) {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String size() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public /* synthetic */ SearchResult(String str, String str2, String str3, String str4, String str5, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }
}
