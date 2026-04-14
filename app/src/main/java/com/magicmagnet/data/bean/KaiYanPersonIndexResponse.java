package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class KaiYanPersonIndexResponse {
    private final List<VideoCollectionOfHorizontalScrollCard> itemList;

    @Metadata
    public static final class VideoCollectionOfHorizontalScrollCard implements IData {
        public static final Parcelable.Creator<VideoCollectionOfHorizontalScrollCard> CREATOR = null;
        private final ItemCollection data;
        private final String type;

        @xc0
        public static final class Creator implements Parcelable.Creator<VideoCollectionOfHorizontalScrollCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VideoCollectionOfHorizontalScrollCard createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ VideoCollectionOfHorizontalScrollCard createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VideoCollectionOfHorizontalScrollCard[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ VideoCollectionOfHorizontalScrollCard[] newArray(int i) {
            }
        }

        @Metadata
        public static final class ItemCollection implements Parcelable {
            public static final Parcelable.Creator<ItemCollection> CREATOR = null;
            private final String dataType;
            private final List<Item> itemList;

            @xc0
            public static final class Creator implements Parcelable.Creator<ItemCollection> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ItemCollection createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ ItemCollection createFromParcel(Parcel parcel) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ItemCollection[] newArray(int i) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ ItemCollection[] newArray(int i) {
                }
            }

            @Metadata
            public static final class Item implements Parcelable {
                public static final Parcelable.Creator<Item> CREATOR = null;
                private final FollowCard data;
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

                public Item(String str, FollowCard followCard) {
                }

                public static /* synthetic */ Item copy$default(Item item, String str, FollowCard followCard, int i, Object obj) {
                }

                public final String component1() {
                }

                public final FollowCard component2() {
                }

                public final Item copy(String str, FollowCard followCard) {
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                }

                public boolean equals(Object obj) {
                }

                public final FollowCard getData() {
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

            public ItemCollection(String str, List<Item> list) {
            }

            public static /* synthetic */ ItemCollection copy$default(ItemCollection itemCollection, String str, List list, int i, Object obj) {
            }

            public final String component1() {
            }

            public final List<Item> component2() {
            }

            public final ItemCollection copy(String str, List<Item> list) {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public boolean equals(Object obj) {
            }

            public final String getDataType() {
            }

            public final List<Item> getItemList() {
            }

            public int hashCode() {
            }

            public String toString() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
            }
        }

        public VideoCollectionOfHorizontalScrollCard(String str, ItemCollection itemCollection) {
        }

        public static /* synthetic */ VideoCollectionOfHorizontalScrollCard copy$default(VideoCollectionOfHorizontalScrollCard videoCollectionOfHorizontalScrollCard, String str, ItemCollection itemCollection, int i, Object obj) {
        }

        public final String component1() {
        }

        public final ItemCollection component2() {
        }

        public final VideoCollectionOfHorizontalScrollCard copy(String str, ItemCollection itemCollection) {
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

        public final ItemCollection getData() {
        }

        public final String getType() {
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

    public KaiYanPersonIndexResponse(List<VideoCollectionOfHorizontalScrollCard> list) {
    }

    public static /* synthetic */ KaiYanPersonIndexResponse copy$default(KaiYanPersonIndexResponse kaiYanPersonIndexResponse, List list, int i, Object obj) {
    }

    public final List<VideoCollectionOfHorizontalScrollCard> component1() {
    }

    public final KaiYanPersonIndexResponse copy(List<VideoCollectionOfHorizontalScrollCard> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<VideoCollectionOfHorizontalScrollCard> getItemList() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
