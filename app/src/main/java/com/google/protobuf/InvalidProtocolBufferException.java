package com.google.protobuf;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private MessageLite unfinishedMessage;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
        }
    }

    public InvalidProtocolBufferException(String str) {
    }

    static InvalidProtocolBufferException invalidEndTag() {
    }

    static InvalidProtocolBufferException invalidTag() {
    }

    static InvalidProtocolBufferException invalidUtf8() {
    }

    static InvalidWireTypeException invalidWireType() {
    }

    static InvalidProtocolBufferException malformedVarint() {
    }

    static InvalidProtocolBufferException negativeSize() {
    }

    static InvalidProtocolBufferException parseFailure() {
    }

    static InvalidProtocolBufferException recursionLimitExceeded() {
    }

    static InvalidProtocolBufferException sizeLimitExceeded() {
    }

    static InvalidProtocolBufferException truncatedMessage() {
    }

    public MessageLite getUnfinishedMessage() {
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite) {
    }

    public IOException unwrapIOException() {
    }

    public InvalidProtocolBufferException(IOException iOException) {
    }

    public InvalidProtocolBufferException(String str, IOException iOException) {
    }
}
