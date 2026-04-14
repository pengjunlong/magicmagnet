package com.google.protobuf;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = null;
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
    }

    private void ensureCapacity() {
    }

    public static UnknownFieldSetLite getDefaultInstance() {
    }

    private static int hashCode(int[] iArr, int i) {
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) throws IOException {
    }

    static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
    }

    static UnknownFieldSetLite newInstance() {
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i) {
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i) {
    }

    private static void writeField(int i, Object obj, Writer writer) throws IOException {
    }

    void checkMutable() {
    }

    public boolean equals(Object obj) {
    }

    public int getSerializedSize() {
    }

    public int getSerializedSizeAsMessageSet() {
    }

    public void makeImmutable() {
    }

    boolean mergeFieldFrom(int i, CodedInputStream codedInputStream) throws IOException {
    }

    UnknownFieldSetLite mergeLengthDelimitedField(int i, ByteString byteString) {
    }

    UnknownFieldSetLite mergeVarintField(int i, int i2) {
    }

    final void printWithIndent(StringBuilder sb, int i) {
    }

    void storeField(int i, Object obj) {
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
    }

    private UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
    }

    private static int hashCode(Object[] objArr, int i) {
    }

    public int hashCode() {
    }

    void writeAsMessageSetTo(Writer writer) throws IOException {
    }

    public void writeTo(Writer writer) throws IOException {
    }
}
