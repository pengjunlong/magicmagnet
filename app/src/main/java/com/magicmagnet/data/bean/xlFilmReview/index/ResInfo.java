package com.magicmagnet.data.bean.xlFilmReview.index;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ResInfo implements Parcelable {
    public static final Parcelable.Creator<ResInfo> CREATOR = null;
    private final String body_url;
    private final String cover_url;
    private final Long create_time;
    private final Integer duration;
    private final String dynamic_url;
    private final String id;
    private final List<String> image_list;
    private final Integer media_id;
    private final Integer play_count;
    private final String play_url;
    private final String title;
    private final int uid;

    @xc0
    public static final class Creator implements Parcelable.Creator<ResInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ResInfo createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResInfo[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ResInfo[] newArray(int i) {
        }
    }

    public ResInfo(String str, int i, String str2, String str3, Long l, List<String> list, Integer num, String str4, Integer num2, String str5, String str6, Integer num3) {
    }

    public static /* synthetic */ ResInfo copy$default(ResInfo resInfo, String str, int i, String str2, String str3, Long l, List list, Integer num, String str4, Integer num2, String str5, String str6, Integer num3, int i2, Object obj) {
    }

    public final String component1() {
    }

    public final String component10() {
    }

    public final String component11() {
    }

    public final Integer component12() {
    }

    public final int component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final Long component5() {
    }

    public final List<String> component6() {
    }

    public final Integer component7() {
    }

    public final String component8() {
    }

    public final Integer component9() {
    }

    public final ResInfo copy(String str, int i, String str2, String str3, Long l, List<String> list, Integer num, String str4, Integer num2, String str5, String str6, Integer num3) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getBody_url() {
    }

    public final String getCover_url() {
    }

    public final Long getCreate_time() {
    }

    public final Integer getDuration() {
    }

    public final String getDynamic_url() {
    }

    public final String getId() {
    }

    public final List<String> getImage_list() {
    }

    public final Integer getMedia_id() {
    }

    public final Integer getPlay_count() {
    }

    public final String getPlay_url() {
    }

    public final String getTitle() {
    }

    public final int getUid() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
