package com.google.rpc;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Code implements Internal.EnumLite {
    private static final /* synthetic */ Code[] $VALUES = null;
    public static final Code ABORTED = null;
    public static final int ABORTED_VALUE = 10;
    public static final Code ALREADY_EXISTS = null;
    public static final int ALREADY_EXISTS_VALUE = 6;
    public static final Code CANCELLED = null;
    public static final int CANCELLED_VALUE = 1;
    public static final Code DATA_LOSS = null;
    public static final int DATA_LOSS_VALUE = 15;
    public static final Code DEADLINE_EXCEEDED = null;
    public static final int DEADLINE_EXCEEDED_VALUE = 4;
    public static final Code FAILED_PRECONDITION = null;
    public static final int FAILED_PRECONDITION_VALUE = 9;
    public static final Code INTERNAL = null;
    public static final int INTERNAL_VALUE = 13;
    public static final Code INVALID_ARGUMENT = null;
    public static final int INVALID_ARGUMENT_VALUE = 3;
    public static final Code NOT_FOUND = null;
    public static final int NOT_FOUND_VALUE = 5;
    public static final Code OK = null;
    public static final int OK_VALUE = 0;
    public static final Code OUT_OF_RANGE = null;
    public static final int OUT_OF_RANGE_VALUE = 11;
    public static final Code PERMISSION_DENIED = null;
    public static final int PERMISSION_DENIED_VALUE = 7;
    public static final Code RESOURCE_EXHAUSTED = null;
    public static final int RESOURCE_EXHAUSTED_VALUE = 8;
    public static final Code UNAUTHENTICATED = null;
    public static final int UNAUTHENTICATED_VALUE = 16;
    public static final Code UNAVAILABLE = null;
    public static final int UNAVAILABLE_VALUE = 14;
    public static final Code UNIMPLEMENTED = null;
    public static final int UNIMPLEMENTED_VALUE = 12;
    public static final Code UNKNOWN = null;
    public static final int UNKNOWN_VALUE = 2;
    public static final Code UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<Code> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.rpc.Code$1 */
    class C13531 implements Internal.EnumLiteMap<Code> {
        C13531() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ Code findValueByNumber(int i) {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: findValueByNumber, reason: avoid collision after fix types in other method */
        public Code findValueByNumber2(int i) {
        }
    }

    private static final class CodeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private CodeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private Code(String str, int i, int i2) {
    }

    public static Code forNumber(int i) {
    }

    public static Internal.EnumLiteMap<Code> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static Code valueOf(String str) {
    }

    public static Code[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static Code valueOf(int i) {
    }
}
