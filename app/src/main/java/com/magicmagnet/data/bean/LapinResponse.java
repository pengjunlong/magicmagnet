package com.magicmagnet.data.bean;

import java.util.List;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LapinResponse {
    private final List<Content> content;
    private final boolean success;

    @xc0
    public static final class Content {
        private final float DiscountRate;
        private final int Id;
        private final String Picture;
        private final float ProPrice;
        private final String ProductName;
        private final float QuanPrice;
        private final String QuanUrl;
        private final float RealPrice;
        private final long SalesVolume;

        public Content(int i, String str, String str2, String str3, float f, float f2, float f3, float f4, long j) {
        }

        public static /* synthetic */ Content copy$default(Content content, int i, String str, String str2, String str3, float f, float f2, float f3, float f4, long j, int i2, Object obj) {
        }

        public final int component1() {
        }

        public final String component2() {
        }

        public final String component3() {
        }

        public final String component4() {
        }

        public final float component5() {
        }

        public final float component6() {
        }

        public final float component7() {
        }

        public final float component8() {
        }

        public final long component9() {
        }

        public final Content copy(int i, String str, String str2, String str3, float f, float f2, float f3, float f4, long j) {
        }

        public boolean equals(Object obj) {
        }

        public final float getDiscountRate() {
        }

        public final int getId() {
        }

        public final String getPicture() {
        }

        public final float getProPrice() {
        }

        public final String getProductName() {
        }

        public final float getQuanPrice() {
        }

        public final String getQuanUrl() {
        }

        public final float getRealPrice() {
        }

        public final long getSalesVolume() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public LapinResponse(boolean z, List<Content> list) {
    }

    public static /* synthetic */ LapinResponse copy$default(LapinResponse lapinResponse, boolean z, List list, int i, Object obj) {
    }

    public final boolean component1() {
    }

    public final List<Content> component2() {
    }

    public final LapinResponse copy(boolean z, List<Content> list) {
    }

    public boolean equals(Object obj) {
    }

    public final List<Content> getContent() {
    }

    public final boolean getSuccess() {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
