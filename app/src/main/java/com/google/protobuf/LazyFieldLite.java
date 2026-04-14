package com.google.protobuf;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class LazyFieldLite {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = null;
    private ByteString delayedBytes;
    private ExtensionRegistryLite extensionRegistry;
    private volatile ByteString memoizedBytes;
    protected volatile MessageLite value;

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
    }

    private static void checkArguments(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
    }

    private static MessageLite mergeValueAndBytes(MessageLite messageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
    }

    public void clear() {
    }

    public boolean containsDefaultInstance() {
    }

    protected void ensureInitialized(MessageLite messageLite) {
    }

    public boolean equals(Object obj) {
    }

    public int getSerializedSize() {
    }

    public MessageLite getValue(MessageLite messageLite) {
    }

    public int hashCode() {
    }

    public void merge(LazyFieldLite lazyFieldLite) {
    }

    public void mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public void set(LazyFieldLite lazyFieldLite) {
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
    }

    public MessageLite setValue(MessageLite messageLite) {
    }

    public ByteString toByteString() {
    }

    void writeTo(Writer writer, int i) throws IOException {
    }

    public LazyFieldLite() {
    }
}
