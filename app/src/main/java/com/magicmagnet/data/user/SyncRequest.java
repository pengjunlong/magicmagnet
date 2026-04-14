package com.magicmagnet.data.user;

import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class SyncRequest extends BaseRequest {
    private String body;
    private final String token;
    private final Type type;
    private final String uid;
    private final String userName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @xc0
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type SYNC_TO_CLOUD = null;
        public static final Type SYNC_TO_DEVICE = null;

        private static final /* synthetic */ Type[] $values() {
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    public SyncRequest(Type type, String str, String str2, String str3, String str4) {
    }

    public final String getBody() {
    }

    public final String getToken() {
    }

    public final Type getType() {
    }

    public final String getUid() {
    }

    public final String getUserName() {
    }

    public final void setBody(String str) {
    }
}
