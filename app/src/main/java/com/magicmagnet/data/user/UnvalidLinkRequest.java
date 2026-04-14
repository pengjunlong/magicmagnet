package com.magicmagnet.data.user;

import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UnvalidLinkRequest extends BaseRequest {
    private final String from;
    private final String link;
    private final String title;
    private final TYPE type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @xc0
    public static final class TYPE {
        private static final /* synthetic */ TYPE[] $VALUES = null;
        public static final TYPE ED2K = null;
        public static final TYPE FTP = null;
        public static final TYPE MAGNET = null;
        public static final TYPE OTHER = null;

        private static final /* synthetic */ TYPE[] $values() {
        }

        private TYPE(String str, int i) {
        }

        public static TYPE valueOf(String str) {
        }

        public static TYPE[] values() {
        }
    }

    public UnvalidLinkRequest(String str, String str2, TYPE type, String str3) {
    }

    public final String getFrom() {
    }

    public final String getLink() {
    }

    public final String getTitle() {
    }

    public final TYPE getType() {
    }
}
