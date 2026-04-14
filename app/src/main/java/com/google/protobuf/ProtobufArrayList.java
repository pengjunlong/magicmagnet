package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = null;
    private E[] array;
    private int size;

    ProtobufArrayList() {
    }

    private static <E> E[] createArray(int i) {
    }

    public static <E> ProtobufArrayList<E> emptyList() {
    }

    private void ensureIndexInRange(int i) {
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ Internal.ProtobufList mutableCopyWithCapacity(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private ProtobufArrayList(E[] eArr, int i) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public ProtobufArrayList<E> mutableCopyWithCapacity(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
    }
}
