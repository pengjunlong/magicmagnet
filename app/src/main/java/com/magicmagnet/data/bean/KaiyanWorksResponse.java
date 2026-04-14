package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class KaiyanWorksResponse {
    private final List<AutoPlayFollowCard> itemList;

    @Metadata
    public static final class AutoPlayFollowCard implements IData, IKaiYanData {
        public static final Parcelable.Creator<AutoPlayFollowCard> CREATOR = null;
        private final FollowCard data;
        private final String type;

        @xc0
        public static final class Creator implements Parcelable.Creator<AutoPlayFollowCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoPlayFollowCard createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ AutoPlayFollowCard createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoPlayFollowCard[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ AutoPlayFollowCard[] newArray(int i) {
            }
        }

        public AutoPlayFollowCard(String str, FollowCard followCard) {
        }

        public static /* synthetic */ AutoPlayFollowCard copy$default(AutoPlayFollowCard autoPlayFollowCard, String str, FollowCard followCard, int i, Object obj) {
        }

        public final String component1() {
        }

        public final FollowCard component2() {
        }

        public final AutoPlayFollowCard copy(String str, FollowCard followCard) {
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

        public final FollowCard getData() {
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

    public KaiyanWorksResponse(List<AutoPlayFollowCard> list) {
    }

    public static /* synthetic */ KaiyanWorksResponse copy$default(KaiyanWorksResponse kaiyanWorksResponse, List list, int i, Object obj) {
    }

    public final List<AutoPlayFollowCard> component1() {
    }

    public final KaiyanWorksResponse copy(List<AutoPlayFollowCard> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<AutoPlayFollowCard> getItemList() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
