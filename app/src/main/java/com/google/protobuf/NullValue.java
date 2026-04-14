package com.google.protobuf;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class NullValue implements Internal.EnumLite {
    private static final /* synthetic */ NullValue[] $VALUES = null;
    public static final NullValue NULL_VALUE = null;
    public static final int NULL_VALUE_VALUE = 0;
    public static final NullValue UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.NullValue$1 */
    static class C13241 implements Internal.EnumLiteMap<NullValue> {
        C13241() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ NullValue findValueByNumber(int i) {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: findValueByNumber, reason: avoid collision after fix types in other method */
        public NullValue findValueByNumber2(int i) {
        }
    }

    private static final class NullValueVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private NullValueVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private NullValue(String str, int i, int i2) {
    }

    public static NullValue forNumber(int i) {
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static NullValue valueOf(String str) {
    }

    public static NullValue[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static NullValue valueOf(int i) {
    }
}
