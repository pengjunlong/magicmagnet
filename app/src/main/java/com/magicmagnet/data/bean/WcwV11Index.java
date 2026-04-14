package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class WcwV11Index {
    private final List<SpInfo> splist;
    private final String uid;

    @Metadata
    public static final class SpInfo implements IData {
        public static final Parcelable.Creator<SpInfo> CREATOR = null;
        private final String filename;
        private final String filesize;
        private String hash;
        private final String sp;
        private final int type;
        private String uid;

        @xc0
        public static final class Creator implements Parcelable.Creator<SpInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpInfo createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SpInfo createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpInfo[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SpInfo[] newArray(int i) {
            }
        }

        public SpInfo(String str, String str2, String str3, int i, String str4, String str5) {
        }

        public static /* synthetic */ SpInfo copy$default(SpInfo spInfo, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        }

        public final String component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final int component4() {
        }

        public final String component5() {
        }

        public final String component6() {
        }

        public final SpInfo copy(String str, String str2, String str3, int i, String str4, String str5) {
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

    public WcwV11Index(String str, List<SpInfo> list) {
    }

    public static /* synthetic */ WcwV11Index copy$default(WcwV11Index wcwV11Index, String str, List list, int i, Object obj) {
    }

    public final String component1() {
    }

    public final List<SpInfo> component2() {
    }

    public final WcwV11Index copy(String str, List<SpInfo> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<SpInfo> getSplist() {
    }

    public final String getUid() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
