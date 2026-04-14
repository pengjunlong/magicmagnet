package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class ClientInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ClientInfo build();

        public abstract Builder setAndroidClientInfo(AndroidClientInfo androidClientInfo);

        public abstract Builder setClientType(ClientType clientType);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ClientType {
        private static final /* synthetic */ ClientType[] $VALUES = null;
        public static final ClientType ANDROID_FIREBASE = null;
        public static final ClientType UNKNOWN = null;
        private final int value;

        private ClientType(String str, int i, int i2) {
        }

        public static ClientType valueOf(String str) {
        }

        public static ClientType[] values() {
        }
    }

    public static Builder builder() {
    }

    public abstract AndroidClientInfo getAndroidClientInfo();

    public abstract ClientType getClientType();
}
