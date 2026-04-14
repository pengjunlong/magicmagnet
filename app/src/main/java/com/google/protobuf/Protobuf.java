package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Protobuf {
    private static final Protobuf INSTANCE = null;
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache;
    private final SchemaFactory schemaFactory;

    private Protobuf() {
    }

    public static Protobuf getInstance() {
    }

    int getTotalSchemaSize() {
    }

    <T> boolean isInitialized(T t) {
    }

    public <T> void makeImmutable(T t) {
    }

    public <T> void mergeFrom(T t, Reader reader) throws IOException {
    }

    public Schema<?> registerSchema(Class<?> cls, Schema<?> schema) {
    }

    public Schema<?> registerSchemaOverride(Class<?> cls, Schema<?> schema) {
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
    }

    public <T> void writeTo(T t, Writer writer) throws IOException {
    }

    public <T> void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public <T> Schema<T> schemaFor(T t) {
    }
}
