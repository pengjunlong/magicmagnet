package com.magicmagnet.data.user;

import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ProRequest extends BaseRequest {
    private final FROM _from;
    private final String code;
    private final ProType type;
    private final String uid;
    private final String userName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @xc0
    public static final class FROM {
        private static final /* synthetic */ FROM[] $VALUES = null;
        public static final FROM AUTO = null;
        public static final FROM FOUND_BY_DEVICE_ID = null;
        public static final FROM MANUAL = null;

        private static final /* synthetic */ FROM[] $values() {
        }

        private FROM(String str, int i) {
        }

        public static FROM valueOf(String str) {
        }

        public static FROM[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @xc0
    public static final class ProType {
        private static final /* synthetic */ ProType[] $VALUES = null;
        public static final ProType DEVICE_ID = null;
        public static final ProType MCODE = null;
        public static final ProType PAY_NO = null;

        private static final /* synthetic */ ProType[] $values() {
        }

        private ProType(String str, int i) {
        }

        public static ProType valueOf(String str) {
        }

        public static ProType[] values() {
        }
    }

    public ProRequest(String str, String str2, String str3, ProType proType, FROM from) {
    }

    public final String getCode() {
    }

    public final ProType getType() {
    }

    public final String getUid() {
    }

    public final String getUserName() {
    }

    public final FROM get_from() {
    }
}
