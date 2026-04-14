package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = null;
    private int[] array;
    private int size;

    IntArrayList() {
    }

    public static IntArrayList emptyList() {
    }

    private void ensureIndexInRange(int i) {
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private IntArrayList(int[] iArr, int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i) {
    }

    public Integer set(int i, Integer num) {
    }

    public boolean add(Integer num) {
    }

    public void add(int i, Integer num) {
    }

    private void addInt(int i, int i2) {
    }
}
