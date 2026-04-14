package com.magicmagnet.data.bean.newxlbanner;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PostData implements Parcelable {
    public static final Parcelable.Creator<PostData> CREATOR = null;
    private final String circle_id;
    private final String circle_name;
    private final String post_abstract;
    private final String post_id;
    private final UserInfoX user_info;

    @xc0
    public static final class Creator implements Parcelable.Creator<PostData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PostData createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostData[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PostData[] newArray(int i) {
        }
    }

    public PostData(String str, String str2, String str3, String str4, UserInfoX userInfoX) {
    }

    public static /* synthetic */ PostData copy$default(PostData postData, String str, String str2, String str3, String str4, UserInfoX userInfoX, int i, Object obj) {
    }

    public final String component1() {
    }

    public final String component2() {
    }

    public final String component3() {
    }

    public final String component4() {
    }

    public final UserInfoX component5() {
    }

    public final PostData copy(String str, String str2, String str3, String str4, UserInfoX userInfoX) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final String getCircle_id() {
    }

    public final String getCircle_name() {
    }

    public final String getPost_abstract() {
    }

    public final String getPost_id() {
    }

    public final UserInfoX getUser_info() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
