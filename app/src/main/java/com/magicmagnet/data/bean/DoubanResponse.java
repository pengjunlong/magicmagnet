package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DoubanResponse {
    private List<Subjects> subjects;

    @Metadata
    public static final class Subjects implements Parcelable {
        public static final Parcelable.Creator<Subjects> CREATOR = null;
        private String cover;
        private int cover_x;
        private int cover_y;
        private String id;
        private boolean is_new;
        private boolean playable;
        private String rate;
        private String title;
        private String url;

        @xc0
        public static final class Creator implements Parcelable.Creator<Subjects> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subjects createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Subjects createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subjects[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Subjects[] newArray(int i) {
            }
        }

        public Subjects(String str, int i, String str2, String str3, boolean z, String str4, String str5, int i2, boolean z2) {
        }

        public static /* synthetic */ Subjects copy$default(Subjects subjects, String str, int i, String str2, String str3, boolean z, String str4, String str5, int i2, boolean z2, int i3, Object obj) {
        }

        public final String component1() {
        }

        public final int component2() {
        }

        public final String component3() {
        }

        public final String component4() {
        }

        public final boolean component5() {
        }

        public final String component6() {
        }

        public final String component7() {
        }

        public final int component8() {
        }

        public final boolean component9() {
        }

        public final Subjects copy(String str, int i, String str2, String str3, boolean z, String str4, String str5, int i2, boolean z2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(Object obj) {
        }

        public final String getCover() {
        }

        public final int getCover_x() {
        }

        public final int getCover_y() {
        }

        public final String getId() {
        }

        public final boolean getPlayable() {
        }

        public final String getRate() {
        }

        public final String getTitle() {
        }

        public final String getUrl() {
        }

        public int hashCode() {
        }

        public final boolean is_new() {
        }

        public final void setCover(String str) {
        }

        public final void setCover_x(int i) {
        }

        public final void setCover_y(int i) {
        }

        public final void setId(String str) {
        }

        public final void setPlayable(boolean z) {
        }

        public final void setRate(String str) {
        }

        public final void setTitle(String str) {
        }

        public final void setUrl(String str) {
        }

        public final void set_new(boolean z) {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public DoubanResponse(List<Subjects> list) {
    }

    public static /* synthetic */ DoubanResponse copy$default(DoubanResponse doubanResponse, List list, int i, Object obj) {
    }

    public final List<Subjects> component1() {
    }

    public final DoubanResponse copy(List<Subjects> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<Subjects> getSubjects() {
    }

    public int hashCode() {
    }

    public final void setSubjects(List<Subjects> list) {
    }

    public String toString() {
    }
}
