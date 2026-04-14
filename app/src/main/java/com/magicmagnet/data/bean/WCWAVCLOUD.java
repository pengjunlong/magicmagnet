package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class WCWAVCLOUD {
    private final List<Data> results;

    @xc0
    public static final class Data {
        private final String hash;
        private final int recordid;
        private final String splist;
        private final String uid;

        public Data(int i, String str, String str2, String str3) {
        }

        public static /* synthetic */ Data copy$default(Data data, int i, String str, String str2, String str3, int i2, Object obj) {
        }

        public final int component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final String component4() {
        }

        public final Data copy(int i, String str, String str2, String str3) {
        }

        public boolean equals(Object obj) {
        }

        public final String getHash() {
        }

        public final int getRecordid() {
        }

        public final String getSplist() {
        }

        public final String getUid() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @Metadata
    public static final class Sp implements IData {
        public static final Parcelable.Creator<Sp> CREATOR = null;
        private final String filename;
        private final String filesize;
        private String hash;
        private final String sha;
        private final String sp;
        private final int type;
        private String uid;

        @xc0
        public static final class Creator implements Parcelable.Creator<Sp> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sp createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Sp createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sp[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Sp[] newArray(int i) {
            }
        }

        public Sp(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        }

        public static /* synthetic */ Sp copy$default(Sp sp, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final String component4() {
        }

        public final int component5() {
        }

        public final String component6() {
        }

        public final String component7() {
        }

        public final Sp copy(String str, String str2, String str3, String str4, int i, String str5, String str6) {
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

        public final String getFilename() {
        }

        public final String getFilesize() {
        }

        public final String getHash() {
        }

        public final String getSha() {
        }

        public final String getSp() {
        }

        public final int getType() {
        }

        public final String getUid() {
        }

        @Override // com.magicmagnet.data.bean.IData
        public String hash() {
        }

        public int hashCode() {
        }

        @Override // com.magicmagnet.data.bean.IData
        public String name() {
        }

        public final void setHash(String str) {
        }

        public final void setUid(String str) {
        }

        @Override // com.magicmagnet.data.bean.IData
        public String size() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public WCWAVCLOUD(List<Data> list) {
    }

    public static /* synthetic */ WCWAVCLOUD copy$default(WCWAVCLOUD wcwavcloud, List list, int i, Object obj) {
    }

    public final List<Data> component1() {
    }

    public final WCWAVCLOUD copy(List<Data> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<Data> getResults() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
