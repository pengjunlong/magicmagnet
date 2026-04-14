package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AutoValue_TransportContext extends TransportContext {
    private final String backendName;
    private final byte[] extras;
    private final Priority priority;

    static final class Builder extends TransportContext.Builder {
        private String backendName;
        private byte[] extras;
        private Priority priority;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(byte[] bArr) {
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
        }
    }

    /* synthetic */ AutoValue_TransportContext(String str, byte[] bArr, Priority priority, C00591 c00591) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public Priority getPriority() {
    }

    public int hashCode() {
    }

    private AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
    }
}
