package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.magicmagnet.data.bean.xlFilmReview.CinecismInfo;
import com.magicmagnet.data.bean.xlFilmReview.UserInfo;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class XLBannerResponse implements Parcelable {
    public static final Parcelable.Creator<XLBannerResponse> CREATOR = null;
    private final DataCollection data;

    @xc0
    public static final class Creator implements Parcelable.Creator<XLBannerResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XLBannerResponse createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ XLBannerResponse createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XLBannerResponse[] newArray(int i) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ XLBannerResponse[] newArray(int i) {
        }
    }

    @Metadata
    public static final class DataCollection implements Parcelable {
        public static final Parcelable.Creator<DataCollection> CREATOR = null;

        @SerializedName("01")
        private final List<Data> _1;

        @SerializedName("10")
        private final List<Data> _10;

        @SerializedName("11")
        private final List<Data> _11;

        @SerializedName("12")
        private final List<Data> _12;

        @SerializedName("02")
        private final List<Data> _2;

        @SerializedName("03")
        private final List<Data> _3;

        @SerializedName("04")
        private final List<Data> _4;

        @SerializedName("05")
        private final List<Data> _5;

        @SerializedName("06")
        private final List<Data> _6;

        @SerializedName("07")
        private final List<Data> _7;

        @SerializedName("08")
        private final List<Data> _8;

        @SerializedName("09")
        private final List<Data> _9;

        @xc0
        public static final class Creator implements Parcelable.Creator<DataCollection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataCollection createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ DataCollection createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataCollection[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ DataCollection[] newArray(int i) {
            }
        }

        @Metadata
        public static final class Data implements Parcelable {
            public static final Parcelable.Creator<Data> CREATOR = null;
            private final CinecismInfo cinecism_info;
            private final RecommendInfo recommend_info;
            private final UserInfo user_info;

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

            @Metadata
            public static final class RecommendInfo implements Parcelable {
                public static final Parcelable.Creator<RecommendInfo> CREATOR = null;
                private final String poster;
                private final String time_str;

                @xc0
                public static final class Creator implements Parcelable.Creator<RecommendInfo> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecommendInfo createFromParcel(Parcel parcel) {
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* bridge */ /* synthetic */ RecommendInfo createFromParcel(Parcel parcel) {
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecommendInfo[] newArray(int i) {
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* bridge */ /* synthetic */ RecommendInfo[] newArray(int i) {
                    }
                }

                public RecommendInfo(String str, String str2) {
                }

                public static /* synthetic */ RecommendInfo copy$default(RecommendInfo recommendInfo, String str, String str2, int i, Object obj) {
                }

                public final String component1() {
                }

                public final String component2() {
                }

                public final RecommendInfo copy(String str, String str2) {
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                }

                public boolean equals(Object obj) {
                }

                public final String getPoster() {
                }

                public final String getTime_str() {
                }

                public int hashCode() {
                }

                public String toString() {
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                }
            }

            public Data(UserInfo userInfo, CinecismInfo cinecismInfo, RecommendInfo recommendInfo) {
            }

            public static /* synthetic */ Data copy$default(Data data, UserInfo userInfo, CinecismInfo cinecismInfo, RecommendInfo recommendInfo, int i, Object obj) {
            }

            public final UserInfo component1() {
            }

            public final CinecismInfo component2() {
            }

            public final RecommendInfo component3() {
            }

            public final Data copy(UserInfo userInfo, CinecismInfo cinecismInfo, RecommendInfo recommendInfo) {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public boolean equals(Object obj) {
            }

            public final CinecismInfo getCinecism_info() {
            }

            public final RecommendInfo getRecommend_info() {
            }

            public final UserInfo getUser_info() {
            }

            public int hashCode() {
            }

            public String toString() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
            }
        }

        public DataCollection(List<Data> list, List<Data> list2, List<Data> list3, List<Data> list4, List<Data> list5, List<Data> list6, List<Data> list7, List<Data> list8, List<Data> list9, List<Data> list10, List<Data> list11, List<Data> list12) {
        }

        public static /* synthetic */ DataCollection copy$default(DataCollection dataCollection, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, int i, Object obj) {
        }

        public final List<Data> component1() {
        }

        public final List<Data> component10() {
        }

        public final List<Data> component11() {
        }

        public final List<Data> component12() {
        }

        public final List<Data> component2() {
        }

        public final List<Data> component3() {
        }

        public final List<Data> component4() {
        }

        public final List<Data> component5() {
        }

        public final List<Data> component6() {
        }

        public final List<Data> component7() {
        }

        public final List<Data> component8() {
        }

        public final List<Data> component9() {
        }

        public final DataCollection copy(List<Data> list, List<Data> list2, List<Data> list3, List<Data> list4, List<Data> list5, List<Data> list6, List<Data> list7, List<Data> list8, List<Data> list9, List<Data> list10, List<Data> list11, List<Data> list12) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public boolean equals(Object obj) {
        }

        public final List<Data> get_1() {
        }

        public final List<Data> get_10() {
        }

        public final List<Data> get_11() {
        }

        public final List<Data> get_12() {
        }

        public final List<Data> get_2() {
        }

        public final List<Data> get_3() {
        }

        public final List<Data> get_4() {
        }

        public final List<Data> get_5() {
        }

        public final List<Data> get_6() {
        }

        public final List<Data> get_7() {
        }

        public final List<Data> get_8() {
        }

        public final List<Data> get_9() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public XLBannerResponse(DataCollection dataCollection) {
    }

    public static /* synthetic */ XLBannerResponse copy$default(XLBannerResponse xLBannerResponse, DataCollection dataCollection, int i, Object obj) {
    }

    public final DataCollection component1() {
    }

    public final XLBannerResponse copy(DataCollection dataCollection) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final DataCollection getData() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
