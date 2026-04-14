package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;

    @RetainedWith
    @LazyInit
    private transient ImmutableList<E> asList;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @VisibleForTesting
        Object[] hashTable;

        public Builder() {
        }

        private void addDeduping(E e) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.ArrayBasedBuilder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterable iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection build() {
        }

        @CanIgnoreReturnValue
        Builder<E> combine(Builder<E> builder) {
        }

        Builder(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder addAll(Iterator it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object[] objArr) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
        }
    }

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
        }

        Object readResolve() {
        }
    }

    ImmutableSet() {
    }

    static /* synthetic */ boolean access$000(int i, int i2) {
    }

    static /* synthetic */ ImmutableSet access$100(int i, Object[] objArr) {
    }

    public static <E> Builder<E> builder() {
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i) {
    }

    @VisibleForTesting
    static int chooseTableSize(int i) {
    }

    private static <E> ImmutableSet<E> construct(int i, Object... objArr) {
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
    }

    public static <E> ImmutableSet<E> of() {
    }

    private static boolean shouldTrim(int i, int i2) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
    }

    ImmutableList<E> createAsList() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
    }

    boolean isHashCodeFast() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
    }

    public static <E> ImmutableSet<E> of(E e) {
    }

    public static <E> ImmutableSet<E> of(E e, E e2) {
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3) {
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4) {
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
    }
}
