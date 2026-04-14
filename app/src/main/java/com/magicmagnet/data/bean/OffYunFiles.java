package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class OffYunFiles {
    private final int code;
    private final List<Data> data;
    private final int status;

    @Metadata
    public static final class Data implements IData {
        public static final Parcelable.Creator<Data> CREATOR = null;
        private String hash;
        private final int index;
        private final String name;
        private final long size;

        @xc0
        public static final class Creator implements Parcelable.Creator<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Data createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Data[] newArray(int i) {
            }
        }

        public Data(int i, String str, long j, String str2) {
        }

        public static /* synthetic */ Data copy$default(Data data, int i, String str, long j, String str2, int i2, Object obj) {
        }

        public final int component1() {
        }

        public final String component2() {
        }

        public final long component3() {
        }

        public final String component4() {
        }

        public final Data copy(int i, String str, long j, String str2) {
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

        public final String getHash() {
        }

        public final int getIndex() {
        }

        public final String getName() {
        }

        public final long getSize() {
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

        @Override // com.magicmagnet.data.bean.IData
        public String size() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public OffYunFiles(int i, int i2, List<Data> list) {
    }

    public static /* synthetic */ OffYunFiles copy$default(OffYunFiles offYunFiles, int i, int i2, List list, int i3, Object obj) {
    }

    public final int component1() {
    }

    public final int component2() {
    }

    public final List<Data> component3() {
    }

    public final OffYunFiles copy(int i, int i2, List<Data> list) {
    }

    public boolean equals(Object obj) {
    }

    public final int getCode() {
    }

    public final List<Data> getData() {
    }

    public final int getStatus() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
