package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class SessionVerbosity implements Internal.EnumLite {
    private static final /* synthetic */ SessionVerbosity[] $VALUES = null;
    public static final SessionVerbosity GAUGES_AND_SYSTEM_EVENTS = null;
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final SessionVerbosity SESSION_VERBOSITY_NONE = null;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<SessionVerbosity> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$1 */
    class C11971 implements Internal.EnumLiteMap<SessionVerbosity> {
        C11971() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ SessionVerbosity findValueByNumber(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SessionVerbosity findValueByNumber(int i) {
        }
    }

    private static final class SessionVerbosityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private SessionVerbosityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private SessionVerbosity(String str, int i, int i2) {
    }

    public static SessionVerbosity forNumber(int i) {
    }

    public static Internal.EnumLiteMap<SessionVerbosity> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static SessionVerbosity valueOf(String str) {
    }

    public static SessionVerbosity[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
    }
}
