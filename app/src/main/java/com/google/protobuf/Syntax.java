package com.google.protobuf;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Syntax implements Internal.EnumLite {
    private static final /* synthetic */ Syntax[] $VALUES = null;
    public static final Syntax SYNTAX_PROTO2 = null;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final Syntax SYNTAX_PROTO3 = null;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final Syntax UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.protobuf.Syntax$1 */
    static class C13331 implements Internal.EnumLiteMap<Syntax> {
        C13331() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ Syntax findValueByNumber(int i) {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: findValueByNumber, reason: avoid collision after fix types in other method */
        public Syntax findValueByNumber2(int i) {
        }
    }

    private static final class SyntaxVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private SyntaxVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private Syntax(String str, int i, int i2) {
    }

    public static Syntax forNumber(int i) {
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static Syntax valueOf(String str) {
    }

    public static Syntax[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static Syntax valueOf(int i) {
    }
}
