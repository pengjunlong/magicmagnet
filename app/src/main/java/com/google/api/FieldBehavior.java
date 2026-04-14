package com.google.api;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FieldBehavior implements Internal.EnumLite {
    private static final /* synthetic */ FieldBehavior[] $VALUES = null;
    public static final FieldBehavior FIELD_BEHAVIOR_UNSPECIFIED = null;
    public static final int FIELD_BEHAVIOR_UNSPECIFIED_VALUE = 0;
    public static final FieldBehavior IMMUTABLE = null;
    public static final int IMMUTABLE_VALUE = 5;
    public static final FieldBehavior INPUT_ONLY = null;
    public static final int INPUT_ONLY_VALUE = 4;
    public static final FieldBehavior OPTIONAL = null;
    public static final int OPTIONAL_VALUE = 1;
    public static final FieldBehavior OUTPUT_ONLY = null;
    public static final int OUTPUT_ONLY_VALUE = 3;
    public static final FieldBehavior REQUIRED = null;
    public static final int REQUIRED_VALUE = 2;
    public static final FieldBehavior UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<FieldBehavior> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.FieldBehavior$1 */
    class C05641 implements Internal.EnumLiteMap<FieldBehavior> {
        C05641() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ FieldBehavior findValueByNumber(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public FieldBehavior findValueByNumber(int i) {
        }
    }

    private static final class FieldBehaviorVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private FieldBehaviorVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private FieldBehavior(String str, int i, int i2) {
    }

    public static FieldBehavior forNumber(int i) {
    }

    public static Internal.EnumLiteMap<FieldBehavior> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static FieldBehavior valueOf(String str) {
    }

    public static FieldBehavior[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static FieldBehavior valueOf(int i) {
    }
}
