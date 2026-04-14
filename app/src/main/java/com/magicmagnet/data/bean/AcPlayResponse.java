package com.magicmagnet.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import p000.cq;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AcPlayResponse {
    private final boolean HasMore;
    private final List<Resource> Resources;

    @Metadata
    public static final class Resource implements IData, cq {
        public static final Parcelable.Creator<Resource> CREATOR = null;
        private final String FileSize;
        private final String Magnet;
        private final String PageUrl;
        private final String PublishDate;
        private final int SubgroupId;
        private final String SubgroupName;
        private final String Title;
        private final int TypeId;
        private final String TypeName;

        @xc0
        public static final class Creator implements Parcelable.Creator<Resource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resource createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Resource createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resource[] newArray(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Resource[] newArray(int i) {
            }
        }

        public Resource(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7) {
        }

        public static /* synthetic */ Resource copy$default(Resource resource, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7, int i3, Object obj) {
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

        public final int component8() {
        }

        public final String component9() {
        }

        public final Resource copy(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7) {
        }

        @Override // p000.cq
        public String copyName() {
        }

        @Override // p000.cq
        public String copyable() {
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

        public final String getFileSize() {
        }

        public final String getMagnet() {
        }

        public final String getPageUrl() {
        }

        public final String getPublishDate() {
        }

        public final int getSubgroupId() {
        }

        public final String getSubgroupName() {
        }

        public final String getTitle() {
        }

        public final int getTypeId() {
        }

        public final String getTypeName() {
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

    public AcPlayResponse(boolean z, List<Resource> list) {
    }

    public static /* synthetic */ AcPlayResponse copy$default(AcPlayResponse acPlayResponse, boolean z, List list, int i, Object obj) {
    }

    public final boolean component1() {
    }

    public final List<Resource> component2() {
    }

    public final AcPlayResponse copy(boolean z, List<Resource> list) {
    }

    public boolean equals(Object obj) {
    }

    public final boolean getHasMore() {
    }

    public final List<Resource> getResources() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
