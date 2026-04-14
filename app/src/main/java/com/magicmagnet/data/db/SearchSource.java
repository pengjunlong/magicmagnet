package com.magicmagnet.data.db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import io.realm.dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
import java.util.Date;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;
import p000.yb2;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class SearchSource extends dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 implements Parcelable, yb2 {
    public static final Parcelable.Creator<SearchSource> CREATOR = null;
    public static final Companion Companion = null;
    private static final String GBK = null;
    private static final int INT_SHOW_AS_SUGGESTION = 0;
    private static final int METHOD_GET = 0;
    private static final int METHOD_POST = 0;
    private static final String PLACE_HOLDER = null;
    private static final String UTF_8 = null;

    @SerializedName("ـ")
    private String charset;

    @SerializedName("ˎ")
    private Date createTime;

    @SerializedName("ˏ")
    private int method;

    @SerializedName("ˑ")
    private String postBody;

    @SerializedName("י")
    private boolean showAsSuggestion;

    @SerializedName("ˋ")
    private String title;

    @SerializedName("ˊ")
    private String url;

    @SerializedName("ˉ")
    private String uuid;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final String getGBK() {
        }

        public final int getMETHOD_GET() {
        }

        public final int getMETHOD_POST() {
        }

        public final String getPLACE_HOLDER() {
        }

        public final String getUTF_8() {
        }
    }

    public SearchSource() {
    }

    public static final /* synthetic */ String access$getGBK$cp() {
    }

    public static final /* synthetic */ int access$getMETHOD_GET$cp() {
    }

    public static final /* synthetic */ int access$getMETHOD_POST$cp() {
    }

    public static final /* synthetic */ String access$getPLACE_HOLDER$cp() {
    }

    public static final /* synthetic */ String access$getUTF_8$cp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public final String getCharset() {
    }

    public final Date getCreateTime() {
    }

    public final int getMethod() {
    }

    public final String getPostBody() {
    }

    public final boolean getShowAsSuggestion() {
    }

    public final String getTitle() {
    }

    public final String getUrl() {
    }

    public final String getUuid() {
    }

    @Override // p000.yb2
    public String realmGet$charset() {
    }

    @Override // p000.yb2
    public Date realmGet$createTime() {
    }

    @Override // p000.yb2
    public int realmGet$method() {
    }

    @Override // p000.yb2
    public String realmGet$postBody() {
    }

    @Override // p000.yb2
    public boolean realmGet$showAsSuggestion() {
    }

    @Override // p000.yb2
    public String realmGet$title() {
    }

    @Override // p000.yb2
    public String realmGet$url() {
    }

    @Override // p000.yb2
    public String realmGet$uuid() {
    }

    @Override // p000.yb2
    public void realmSet$charset(String str) {
    }

    @Override // p000.yb2
    public void realmSet$createTime(Date date) {
    }

    @Override // p000.yb2
    public void realmSet$method(int i) {
    }

    @Override // p000.yb2
    public void realmSet$postBody(String str) {
    }

    @Override // p000.yb2
    public void realmSet$showAsSuggestion(boolean z) {
    }

    @Override // p000.yb2
    public void realmSet$title(String str) {
    }

    @Override // p000.yb2
    public void realmSet$url(String str) {
    }

    @Override // p000.yb2
    public void realmSet$uuid(String str) {
    }

    public final void setCharset(String str) {
    }

    public final void setCreateTime(Date date) {
    }

    public final void setMethod(int i) {
    }

    public final void setPostBody(String str) {
    }

    public final void setShowAsSuggestion(boolean z) {
    }

    public final void setTitle(String str) {
    }

    public final void setUrl(String str) {
    }

    public final void setUuid(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public SearchSource(Parcel parcel) {
    }

    public SearchSource(String str, String str2, String str3, Date date, int i, String str4, boolean z, String str5) {
    }

    public /* synthetic */ SearchSource(String str, String str2, String str3, Date date, int i, String str4, boolean z, String str5, int i2, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }
}
