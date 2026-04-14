package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ApplicationProcessState implements Internal.EnumLite {
    private static final /* synthetic */ ApplicationProcessState[] $VALUES = null;
    public static final ApplicationProcessState APPLICATION_PROCESS_STATE_UNKNOWN = null;
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final ApplicationProcessState BACKGROUND = null;
    public static final int BACKGROUND_VALUE = 2;
    public static final ApplicationProcessState FOREGROUND = null;
    public static final ApplicationProcessState FOREGROUND_BACKGROUND = null;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal.EnumLiteMap<ApplicationProcessState> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$1 */
    class C11841 implements Internal.EnumLiteMap<ApplicationProcessState> {
        C11841() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ ApplicationProcessState findValueByNumber(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ApplicationProcessState findValueByNumber(int i) {
        }
    }

    private static final class ApplicationProcessStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private ApplicationProcessStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private ApplicationProcessState(String str, int i, int i2) {
    }

    public static ApplicationProcessState forNumber(int i) {
    }

    public static Internal.EnumLiteMap<ApplicationProcessState> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static ApplicationProcessState valueOf(String str) {
    }

    public static ApplicationProcessState[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i) {
    }
}
