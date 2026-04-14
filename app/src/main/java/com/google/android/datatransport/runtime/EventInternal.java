package com.google.android.datatransport.runtime;

import com.google.auto.value.AutoValue;
import java.util.Map;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class EventInternal {

    @AutoValue.Builder
    public static abstract class Builder {
        public final Builder addMetadata(String str, String str2) {
        }

        public abstract EventInternal build();

        protected abstract Map<String, String> getAutoMetadata();

        protected abstract Builder setAutoMetadata(Map<String, String> map);

        public abstract Builder setCode(Integer num);

        public abstract Builder setEncodedPayload(EncodedPayload encodedPayload);

        public abstract Builder setEventMillis(long j);

        public abstract Builder setTransportName(String str);

        public abstract Builder setUptimeMillis(long j);

        public final Builder addMetadata(String str, long j) {
        }

        public final Builder addMetadata(String str, int i) {
        }
    }

    public static Builder builder() {
    }

    public final String get(String str) {
    }

    protected abstract Map<String, String> getAutoMetadata();

    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String str) {
    }

    public final long getLong(String str) {
    }

    public final Map<String, String> getMetadata() {
    }

    public final String getOrDefault(String str, String str2) {
    }

    @Deprecated
    public byte[] getPayload() {
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public Builder toBuilder() {
    }
}
