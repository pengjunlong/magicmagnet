package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AutoValue_SendRequest extends SendRequest {
    private final Encoding encoding;
    private final Event<?> event;
    private final Transformer<?, byte[]> transformer;
    private final TransportContext transportContext;
    private final String transportName;

    static final class Builder extends SendRequest.Builder {
        private Encoding encoding;
        private Event<?> event;
        private Transformer<?, byte[]> transformer;
        private TransportContext transportContext;
        private String transportName;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        SendRequest.Builder setEncoding(Encoding encoding) {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        SendRequest.Builder setEvent(Event<?> event) {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        SendRequest.Builder setTransformer(Transformer<?, byte[]> transformer) {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
        }
    }

    /* synthetic */ AutoValue_SendRequest(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding, C00581 c00581) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Encoding getEncoding() {
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    Event<?> getEvent() {
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    Transformer<?, byte[]> getTransformer() {
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public TransportContext getTransportContext() {
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public String getTransportName() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event<?> event, Transformer<?, byte[]> transformer, Encoding encoding) {
    }
}
