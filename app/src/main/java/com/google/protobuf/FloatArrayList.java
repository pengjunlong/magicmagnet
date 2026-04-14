package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST = null;
    private float[] array;
    private int size;

    FloatArrayList() {
    }

    public static FloatArrayList emptyList() {
    }

    private void ensureIndexInRange(int i) {
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f) {
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

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i) {
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

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i, float f) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    private FloatArrayList(float[] fArr, int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public Internal.ProtobufList<Float> mutableCopyWithCapacity(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i) {
    }

    public Float set(int i, Float f) {
    }

    public boolean add(Float f) {
    }

    public void add(int i, Float f) {
    }

    private void addFloat(int i, float f) {
    }
}
