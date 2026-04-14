package com.google.protobuf;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(MessageLite messageLite) {
    }

    private static String buildDescription(List<String> list) {
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
    }

    public List<String> getMissingFields() {
    }

    public UninitializedMessageException(List<String> list) {
    }
}
