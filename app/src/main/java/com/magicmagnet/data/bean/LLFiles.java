package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LLFiles {
    private final int code;

    @SerializedName("Result")
    private final Result results;

    @xc0
    public static final class Result {

        @SerializedName(AVTransport.RECORD)
        private final List<Record> record;

        @Metadata
        public static final class Record implements IData {
            public static final Parcelable.Creator<Record> CREATOR = null;
            private final String hash_index;
            private String title;

            @xc0
            public static final class Creator implements Parcelable.Creator<Record> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Record createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Record createFromParcel(Parcel parcel) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Record[] newArray(int i) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Record[] newArray(int i) {
                }
            }

            public Record(String str, String str2) {
            }

            public static /* synthetic */ Record copy$default(Record record, String str, String str2, int i, Object obj) {
            }

            public final String component1() {
            }

            public final String component2() {
            }

            public final Record copy(String str, String str2) {
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

            public final String getHash_index() {
            }

            public final String getTitle() {
            }

            @Override // com.magicmagnet.data.bean.IData
            public String hash() {
            }

            public int hashCode() {
            }

            @Override // com.magicmagnet.data.bean.IData
            public String name() {
            }

            public final void setTitle(String str) {
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

        public Result(List<Record> list) {
        }

        public static /* synthetic */ Result copy$default(Result result, List list, int i, Object obj) {
        }

        public final List<Record> component1() {
        }

        public final Result copy(List<Record> list) {
        }

        public boolean equals(Object obj) {
        }

        public final List<Record> getRecord() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public LLFiles(int i, Result result) {
    }

    public static /* synthetic */ LLFiles copy$default(LLFiles lLFiles, int i, Result result, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final Result component2() {
    }

    public final LLFiles copy(int i, Result result) {
    }

    public boolean equals(Object obj) {
    }

    public final int getCode() {
    }

    public final Result getResults() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
