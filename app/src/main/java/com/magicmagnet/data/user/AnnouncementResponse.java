package com.magicmagnet.data.user;

import com.magicmagnet.data.user.BaseResponse;
import java.util.List;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AnnouncementResponse extends BaseResponse {
    public static final Companion Companion = null;
    private static final int TYPE_DIALOG = 0;
    private static final int TYPE_DIALOG_LINK = 0;
    private static final int TYPE_DIRECT_LINK = 0;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_SHARE = 0;
    private static final int TYPE_TOAST = 0;
    private static final int TYPE_UPDATE = 0;
    private final List<Announcement> announcements;

    @xc0
    public static final class Announcement {
        private final String link;
        private final String message;
        private final int type;

        public Announcement(String str, int i, String str2) {
        }

        public static /* synthetic */ Announcement copy$default(Announcement announcement, String str, int i, String str2, int i2, Object obj) {
        }

        public final String component1() {
        }

        public final int component2() {
        }

        public final String component3() {
        }

        public final Announcement copy(String str, int i, String str2) {
        }

        public boolean equals(Object obj) {
        }

        public final String getLink() {
        }

        public final String getMessage() {
        }

        public final int getType() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final int getTYPE_DIALOG() {
        }

        public final int getTYPE_DIALOG_LINK() {
        }

        public final int getTYPE_DIRECT_LINK() {
        }

        public final int getTYPE_NONE() {
        }

        public final int getTYPE_SHARE() {
        }

        public final int getTYPE_TOAST() {
        }

        public final int getTYPE_UPDATE() {
        }
    }

    public AnnouncementResponse(BaseResponse.RESPONSE_CODE response_code, BaseResponse.Msg msg, BaseResponse.Msg msg2, List<Announcement> list) {
    }

    public static final /* synthetic */ int access$getTYPE_DIALOG$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_DIALOG_LINK$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_DIRECT_LINK$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_NONE$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_SHARE$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_TOAST$cp() {
    }

    public static final /* synthetic */ int access$getTYPE_UPDATE$cp() {
    }

    public final List<Announcement> getAnnouncements() {
    }
}
