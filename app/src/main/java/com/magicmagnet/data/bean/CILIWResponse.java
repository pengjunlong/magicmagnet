package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CILIWResponse {
    private final Data data;
    private final int status;

    @xc0
    public static final class Data {
        private final List<Item> data;
        private final int page;
        private final int page_size;
        private final int time;
        private final int total;

        @Metadata
        public static final class Item implements IData {
            public static final Parcelable.Creator<Item> CREATOR = null;
            private final String file_size;
            private final String name;
            private final String time;
            private final String uri;

            @xc0
            public static final class Creator implements Parcelable.Creator<Item> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Item createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Item createFromParcel(Parcel parcel) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Item[] newArray(int i) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Item[] newArray(int i) {
                }
            }

            public Item(String str, String str2, String str3, String str4) {
            }

            public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, int i, Object obj) {
            }

            public final String component1() {
            }

            public final String component2() {
            }

            public final String component3() {
            }

            public final String component4() {
            }

            public final Item copy(String str, String str2, String str3, String str4) {
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

            public final String getFile_size() {
            }

            public final String getName() {
            }

            public final String getTime() {
            }

            public final String getUri() {
            }

            @Override // com.magicmagnet.data.bean.IData
            public String hash() {
            }

            public int hashCode() {
            }

            @Override // com.magicmagnet.data.bean.IData
            public String name() {
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

        public Data(int i, int i2, int i3, int i4, List<Item> list) {
        }

        public static /* synthetic */ Data copy$default(Data data, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        }

        public final int component1() {
        }

        public final int component2() {
        }

        public final int component3() {
        }

        public final int component4() {
        }

        public final List<Item> component5() {
        }

        public final Data copy(int i, int i2, int i3, int i4, List<Item> list) {
        }

        public boolean equals(Object obj) {
        }

        public final List<Item> getData() {
        }

        public final int getPage() {
        }

        public final int getPage_size() {
        }

        public final int getTime() {
        }

        public final int getTotal() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public CILIWResponse(int i, Data data) {
    }

    public static /* synthetic */ CILIWResponse copy$default(CILIWResponse cILIWResponse, int i, Data data, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final Data component2() {
    }

    public final CILIWResponse copy(int i, Data data) {
    }

    public boolean equals(Object obj) {
    }

    public final Data getData() {
    }

    public final int getStatus() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
