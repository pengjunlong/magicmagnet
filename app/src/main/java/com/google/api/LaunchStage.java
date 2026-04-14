package com.google.api;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LaunchStage implements Internal.EnumLite {
    private static final /* synthetic */ LaunchStage[] $VALUES = null;
    public static final LaunchStage ALPHA = null;
    public static final int ALPHA_VALUE = 2;
    public static final LaunchStage BETA = null;
    public static final int BETA_VALUE = 3;
    public static final LaunchStage DEPRECATED = null;
    public static final int DEPRECATED_VALUE = 5;
    public static final LaunchStage EARLY_ACCESS = null;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final LaunchStage GA = null;
    public static final int GA_VALUE = 4;
    public static final LaunchStage LAUNCH_STAGE_UNSPECIFIED = null;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    public static final LaunchStage UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<LaunchStage> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.LaunchStage$1 */
    class C05711 implements Internal.EnumLiteMap<LaunchStage> {
        C05711() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ LaunchStage findValueByNumber(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LaunchStage findValueByNumber(int i) {
        }
    }

    private static final class LaunchStageVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private LaunchStageVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private LaunchStage(String str, int i, int i2) {
    }

    public static LaunchStage forNumber(int i) {
    }

    public static Internal.EnumLiteMap<LaunchStage> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static LaunchStage valueOf(String str) {
    }

    public static LaunchStage[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static LaunchStage valueOf(int i) {
    }
}
