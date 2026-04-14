package com.google.protobuf;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class UnknownFieldSchema<T, B> {
    UnknownFieldSchema() {
    }

    abstract void addFixed32(B b, int i, int i2);

    abstract void addFixed64(B b, int i, long j);

    abstract void addGroup(B b, int i, T t);

    abstract void addLengthDelimited(B b, int i, ByteString byteString);

    abstract void addVarint(B b, int i, long j);

    abstract B getBuilderFromMessage(Object obj);

    abstract T getFromMessage(Object obj);

    abstract int getSerializedSize(T t);

    abstract int getSerializedSizeAsMessageSet(T t);

    abstract void makeImmutable(Object obj);

    abstract T merge(T t, T t2);

    final void mergeFrom(B b, Reader reader) throws IOException {
    }

    final boolean mergeOneFieldFrom(B b, Reader reader) throws IOException {
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(Object obj, B b);

    abstract void setToMessage(Object obj, T t);

    abstract boolean shouldDiscardUnknownFields(Reader reader);

    abstract T toImmutable(B b);

    abstract void writeAsMessageSetTo(T t, Writer writer) throws IOException;

    abstract void writeTo(T t, Writer writer) throws IOException;
}
