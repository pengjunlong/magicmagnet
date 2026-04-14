package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(byte[] bArr);

        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract Priority getPriority();

    public final String toString() {
    }

    public TransportContext withPriority(Priority priority) {
    }
}
