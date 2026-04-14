package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AutoValue_EventInternal extends EventInternal {
    private final Map<String, String> autoMetadata;
    private final Integer code;
    private final EncodedPayload encodedPayload;
    private final long eventMillis;
    private final String transportName;
    private final long uptimeMillis;

    static final class Builder extends EventInternal.Builder {
        private Map<String, String> autoMetadata;
        private Integer code;
        private EncodedPayload encodedPayload;
        private Long eventMillis;
        private String transportName;
        private Long uptimeMillis;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected Map<String, String> getAutoMetadata() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected EventInternal.Builder setAutoMetadata(Map<String, String> map) {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j) {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j) {
        }
    }

    /* synthetic */ AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, Map map, C00571 c00571) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected Map<String, String> getAutoMetadata() {
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Integer getCode() {
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    private AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, Map<String, String> map) {
    }
}
