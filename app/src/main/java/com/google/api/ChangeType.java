package com.google.api;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ChangeType implements Internal.EnumLite {
    private static final /* synthetic */ ChangeType[] $VALUES = null;
    public static final ChangeType ADDED = null;
    public static final int ADDED_VALUE = 1;
    public static final ChangeType CHANGE_TYPE_UNSPECIFIED = null;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final ChangeType MODIFIED = null;
    public static final int MODIFIED_VALUE = 3;
    public static final ChangeType REMOVED = null;
    public static final int REMOVED_VALUE = 2;
    public static final ChangeType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.ChangeType$1 */
    class C05541 implements Internal.EnumLiteMap<ChangeType> {
        C05541() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ ChangeType findValueByNumber(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ChangeType findValueByNumber(int i) {
        }
    }

    private static final class ChangeTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private ChangeTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private ChangeType(String str, int i, int i2) {
    }

    public static ChangeType forNumber(int i) {
    }

    public static Internal.EnumLiteMap<ChangeType> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static ChangeType valueOf(String str) {
    }

    public static ChangeType[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static ChangeType valueOf(int i) {
    }
}
