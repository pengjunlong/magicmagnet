package com.magicmagnet.data.db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.magicmagnet.data.bean.IData;
import io.realm.dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
import java.util.Date;
import p000.cq;
import p000.tb2;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class History extends dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 implements IData, cq, tb2 {
    public static final Parcelable.Creator CREATOR = null;

    @SerializedName("a")
    private String cookie;

    @SerializedName("date")
    private Date date;

    @SerializedName("f")
    private String hash;

    @SerializedName("c")
    private String name;

    @SerializedName("d")
    private String shaData;

    @SerializedName("e")
    private String size;

    @SerializedName("b")
    private String url;

    /* renamed from: com.magicmagnet.data.db.History$1 */
    class C14031 implements Parcelable.Creator<History> {
        C14031() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ History createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ History[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public History createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public History[] newArray(int i) {
        }
    }

    public History(String str, String str2, String str3, String str4, String str5, String str6, Date date) {
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

    public String getCookie() {
    }

    public Date getDate() {
    }

    public String getHash() {
    }

    public String getName() {
    }

    public String getShaData() {
    }

    public String getSize() {
    }

    public String getUrl() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String hash() {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String name() {
    }

    @Override // p000.tb2
    public String realmGet$cookie() {
    }

    @Override // p000.tb2
    public Date realmGet$date() {
    }

    @Override // p000.tb2
    public String realmGet$hash() {
    }

    @Override // p000.tb2
    public String realmGet$name() {
    }

    @Override // p000.tb2
    public String realmGet$shaData() {
    }

    @Override // p000.tb2
    public String realmGet$size() {
    }

    @Override // p000.tb2
    public String realmGet$url() {
    }

    @Override // p000.tb2
    public void realmSet$cookie(String str) {
    }

    @Override // p000.tb2
    public void realmSet$date(Date date) {
    }

    @Override // p000.tb2
    public void realmSet$hash(String str) {
    }

    @Override // p000.tb2
    public void realmSet$name(String str) {
    }

    @Override // p000.tb2
    public void realmSet$shaData(String str) {
    }

    @Override // p000.tb2
    public void realmSet$size(String str) {
    }

    @Override // p000.tb2
    public void realmSet$url(String str) {
    }

    public void setCookie(String str) {
    }

    public void setDate(Date date) {
    }

    public void setHash(String str) {
    }

    public void setName(String str) {
    }

    public void setShaData(String str) {
    }

    public void setSize(String str) {
    }

    public void setUrl(String str) {
    }

    @Override // com.magicmagnet.data.bean.IData
    public String size() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public History() {
    }
}
