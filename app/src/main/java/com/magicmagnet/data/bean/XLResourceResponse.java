package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class XLResourceResponse {
    private final int result;
    private final Site site;

    @xc0
    public static final class Site {
        private final int count;
        private final List<Data> list;
        private final int total;

        @Metadata
        public static final class Data implements IData {
            public static final Parcelable.Creator<Data> CREATOR = null;
            private final int id;
            private final String poster;
            private final String title;
            private final String url;

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

            public final int getId() {
            }

            public final String getPoster() {
            }

            public final String getTitle() {
            }

            public final String getUrl() {
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

        public Site(int i, int i2, List<Data> list) {
        }

        public static /* synthetic */ Site copy$default(Site site, int i, int i2, List list, int i3, Object obj) {
        }

        public final int component1() {
        }

        public final int component2() {
        }

        public final List<Data> component3() {
        }

        public final Site copy(int i, int i2, List<Data> list) {
        }

        public boolean equals(Object obj) {
        }

        public final int getCount() {
        }

        public final List<Data> getList() {
        }

        public final int getTotal() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public XLResourceResponse(int i, Site site) {
    }

    public static /* synthetic */ XLResourceResponse copy$default(XLResourceResponse xLResourceResponse, int i, Site site, int i2, Object obj) {
    }

    public final int component1() {
    }

    public final Site component2() {
    }

    public final XLResourceResponse copy(int i, Site site) {
    }

    public boolean equals(Object obj) {
    }

    public final int getResult() {
    }

    public final Site getSite() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
