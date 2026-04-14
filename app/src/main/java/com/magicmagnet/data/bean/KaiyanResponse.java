package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class KaiyanResponse {
    private final List<Item> itemList;

    @Metadata
    public static final class Item implements IData, IKaiYanData {
        public static final Parcelable.Creator<Item> CREATOR = null;
        private final Data data;
        private final String type;

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

        @Metadata
        public static final class Data implements Parcelable {
            public static final Parcelable.Creator<Data> CREATOR = null;
            private final Author author;
            private final Content content;
            private final Cover cover;
            private final String dataType;
            private final Long duration;
            private final Header header;
            private final int id;
            private final String playUrl;
            private final String text;
            private final String title;

            @Metadata
            public static final class Content implements Parcelable {
                public static final Parcelable.Creator<Content> CREATOR = null;
                private final C2011Data data;
                private final String type;

                @xc0
                public static final class Creator implements Parcelable.Creator<Content> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Content createFromParcel(Parcel parcel) {
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* bridge */ /* synthetic */ Content createFromParcel(Parcel parcel) {
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Content[] newArray(int i) {
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* bridge */ /* synthetic */ Content[] newArray(int i) {
                    }
                }

                @Metadata
                /* renamed from: com.magicmagnet.data.bean.KaiyanResponse$Item$Data$Content$Data, reason: collision with other inner class name */
                public static final class C2011Data implements Parcelable {
                    public static final Parcelable.Creator<C2011Data> CREATOR = null;
                    private final Author author;
                    private final Cover cover;
                    private final String dataType;
                    private final long duration;
                    private final int id;
                    private final String playUrl;
                    private final String title;

                    @xc0
                    /* renamed from: com.magicmagnet.data.bean.KaiyanResponse$Item$Data$Content$Data$Creator */
                    public static final class Creator implements Parcelable.Creator<C2011Data> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final C2011Data createFromParcel(Parcel parcel) {
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ C2011Data createFromParcel(Parcel parcel) {
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final C2011Data[] newArray(int i) {
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ C2011Data[] newArray(int i) {
                        }
                    }

                    public C2011Data(String str, int i, String str2, Cover cover, String str3, long j, Author author) {
                    }

                    public static /* synthetic */ C2011Data copy$default(C2011Data c2011Data, String str, int i, String str2, Cover cover, String str3, long j, Author author, int i2, Object obj) {
                    }

                    public final String component1() {
                    }

                    public final int component2() {
                    }

                    public final String component3() {
                    }

                    public final Cover component4() {
                    }

                    public final String component5() {
                    }

                    public final long component6() {
                    }

                    public final Author component7() {
                    }

                    public final C2011Data copy(String str, int i, String str2, Cover cover, String str3, long j, Author author) {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                    }

                    public boolean equals(Object obj) {
                    }

                    public final Author getAuthor() {
                    }

                    public final Cover getCover() {
                    }

                    public final String getDataType() {
                    }

                    public final long getDuration() {
                    }

                    public final int getId() {
                    }

                    public final String getPlayUrl() {
                    }

                    public final String getTitle() {
                    }

                    public int hashCode() {
                    }

                    public String toString() {
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int i) {
                    }
                }

                public Content(String str, C2011Data c2011Data) {
                }

                public static /* synthetic */ Content copy$default(Content content, String str, C2011Data c2011Data, int i, Object obj) {
                }

                public final String component1() {
                }

                public final C2011Data component2() {
                }

                public final Content copy(String str, C2011Data c2011Data) {
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                }

                public boolean equals(Object obj) {
                }

                public final C2011Data getData() {
                }

                public final String getType() {
                }

                public int hashCode() {
                }

                public String toString() {
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                }
            }

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

            public Data(String str, Header header, Content content, int i, String str2, Cover cover, String str3, Long l, Author author, String str4) {
            }

            public static /* synthetic */ Data copy$default(Data data, String str, Header header, Content content, int i, String str2, Cover cover, String str3, Long l, Author author, String str4, int i2, Object obj) {
            }

            public final String component1() {
            }

            public final String component10() {
            }

            public final Header component2() {
            }

            public final Content component3() {
            }

            public final int component4() {
            }

            public final String component5() {
            }

            public final Cover component6() {
            }

            public final String component7() {
            }

            public final Long component8() {
            }

            public final Author component9() {
            }

            public final Data copy(String str, Header header, Content content, int i, String str2, Cover cover, String str3, Long l, Author author, String str4) {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public boolean equals(Object obj) {
            }

            public final Author getAuthor() {
            }

            public final Content getContent() {
            }

            public final Cover getCover() {
            }

            public final String getDataType() {
            }

            public final Long getDuration() {
            }

            public final Header getHeader() {
            }

            public final int getId() {
            }

            public final String getPlayUrl() {
            }

            public final String getText() {
            }

            public final String getTitle() {
            }

            public int hashCode() {
            }

            public String toString() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
            }
        }

        public Item(String str, Data data) {
        }

        public static /* synthetic */ Item copy$default(Item item, String str, Data data, int i, Object obj) {
        }

        public final String component1() {
        }

        public final Data component2() {
        }

        public final Item copy(String str, Data data) {
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

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public int getAuthorId() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public String getAuthorName() {
        }

        public final Data getData() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public int getDuration() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public int getId() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public String getPic() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public String getPlayUrl() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public String getTitle() {
        }

        public final String getType() {
        }

        @Override // com.magicmagnet.data.bean.IKaiYanData
        public String getUploader() {
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

    public KaiyanResponse(List<Item> list) {
    }

    public static /* synthetic */ KaiyanResponse copy$default(KaiyanResponse kaiyanResponse, List list, int i, Object obj) {
    }

    public final List<Item> component1() {
    }

    public final KaiyanResponse copy(List<Item> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<Item> getItemList() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
