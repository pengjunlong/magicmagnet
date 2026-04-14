package com.magicmagnet.data.user;

import com.magicmagnet.data.user.BaseResponse;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UpdateResponse extends BaseResponse {
    public static final Companion Companion = null;
    private static final int TYPE_APK_DOWNLOAD = 0;
    private static final int TYPE_WEBSITE = 0;
    private final Update info;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final int getTYPE_APK_DOWNLOAD() {
        }

        public final int getTYPE_WEBSITE() {
        }
    }

    @xc0
    public static final class Update {
        private final String date;
        private final boolean force;
        private final int id;
        private final String link;
        private final int link_type;
        private final String message;
        private final int thread;
        private final String title;
        private final int versionCode;
        private final String versionName;

        public Update(int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, int i4) {
        }

        public static /* synthetic */ Update copy$default(Update update, int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, int i4, int i5, Object obj) {
        }

        public final int component1() {
        }

        public final int component10() {
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

        public final boolean component8() {
        }

        public final int component9() {
        }

        public final Update copy(int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, int i4) {
        }

        public boolean equals(Object obj) {
        }

        public final String getDate() {
        }

        public final boolean getForce() {
        }

        public final int getId() {
        }

        public final String getLink() {
        }

        public final int getLink_type() {
        }

        public final String getMessage() {
        }

        public final int getThread() {
        }

        public final String getTitle() {
        }

        public final int getVersionCode() {
        }

        public final String getVersionName() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    public UpdateResponse(BaseResponse.RESPONSE_CODE response_code, BaseResponse.Msg msg, BaseResponse.Msg msg2, Update update) {
    }

    public static final /* synthetic */ int access$getTYPE_APK_DOWNLOAD$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_WEBSITE$cp() {
    }

    public final Update getInfo() {
    }
}
