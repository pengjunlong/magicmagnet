package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = null;
    private final long[] array;
    private final int end;
    private final transient int start;

    static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

        /* synthetic */ AsList(ImmutableLongArray immutableLongArray, C09611 c09611) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        private AsList(ImmutableLongArray immutableLongArray) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
        }
    }

    /* synthetic */ ImmutableLongArray(long[] jArr, int i, int i2, C09611 c09611) {
    }

    static /* synthetic */ long[] access$000(ImmutableLongArray immutableLongArray) {
    }

    static /* synthetic */ int access$100(ImmutableLongArray immutableLongArray) {
    }

    static /* synthetic */ ImmutableLongArray access$200() {
    }

    public static Builder builder(int i) {
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
    }

    private boolean isPartialView() {
    }

    public static ImmutableLongArray of() {
    }

    public List<Long> asList() {
    }

    public boolean contains(long j) {
    }

    public boolean equals(Object obj) {
    }

    public long get(int i) {
    }

    public int hashCode() {
    }

    public int indexOf(long j) {
    }

    public boolean isEmpty() {
    }

    public int lastIndexOf(long j) {
    }

    public int length() {
    }

    Object readResolve() {
    }

    public ImmutableLongArray subArray(int i, int i2) {
    }

    public long[] toArray() {
    }

    public String toString() {
    }

    public ImmutableLongArray trimmed() {
    }

    Object writeReplace() {
    }

    private ImmutableLongArray(long[] jArr) {
    }

    public static ImmutableLongArray of(long j) {
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private long[] array;
        private int count;

        Builder(int i) {
        }

        private void ensureRoomFor(int i) {
        }

        private static int expandedCapacity(int i, int i2) {
        }

        public Builder add(long j) {
        }

        public Builder addAll(long[] jArr) {
        }

        @CheckReturnValue
        public ImmutableLongArray build() {
        }

        public Builder addAll(Iterable<Long> iterable) {
        }

        public Builder addAll(Collection<Long> collection) {
        }

        public Builder addAll(ImmutableLongArray immutableLongArray) {
        }
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
    }

    public static Builder builder() {
    }

    public static ImmutableLongArray of(long j, long j2) {
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
    }

    public static ImmutableLongArray of(long j, long j2, long j3) {
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
    }

    public static ImmutableLongArray of(long j, long j2, long j3, long j4) {
    }

    public static ImmutableLongArray of(long j, long j2, long j3, long j4, long j5) {
    }

    public static ImmutableLongArray of(long j, long j2, long j3, long j4, long j5, long j6) {
    }

    public static ImmutableLongArray of(long j, long... jArr) {
    }
}
