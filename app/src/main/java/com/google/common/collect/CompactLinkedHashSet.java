package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;
    private transient int[] predecessor;
    private transient int[] successor;

    CompactLinkedHashSet() {
    }

    public static <E> CompactLinkedHashSet<E> create() {
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i) {
    }

    private int getPredecessor(int i) {
    }

    private int[] requirePredecessors() {
    }

    private int[] requireSuccessors() {
    }

    private void setPredecessor(int i, int i2) {
    }

    private void setSucceeds(int i, int i2) {
    }

    private void setSuccessor(int i, int i2) {
    }

    @Override // com.google.common.collect.CompactHashSet
    int adjustAfterRemove(int i, int i2) {
    }

    @Override // com.google.common.collect.CompactHashSet
    int allocArrays() {
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
    }

    @Override // com.google.common.collect.CompactHashSet
    @CanIgnoreReturnValue
    Set<E> convertToHashFloodingResistantImplementation() {
    }

    @Override // com.google.common.collect.CompactHashSet
    int firstEntryIndex() {
    }

    @Override // com.google.common.collect.CompactHashSet
    int getSuccessor(int i) {
    }

    @Override // com.google.common.collect.CompactHashSet
    void init(int i) {
    }

    @Override // com.google.common.collect.CompactHashSet
    void insertEntry(int i, @ParametricNullness E e, int i2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashSet
    void moveLastEntry(int i, int i2) {
    }

    @Override // com.google.common.collect.CompactHashSet
    void resizeEntries(int i) {
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
    }

    CompactLinkedHashSet(int i) {
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
    }
}
