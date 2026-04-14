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
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = null;
    private final double[] array;
    private final int end;
    private final transient int start;

    static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        /* synthetic */ AsList(ImmutableDoubleArray immutableDoubleArray, C09591 c09591) {
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
        public List<Double> subList(int i, int i2) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i) {
        }
    }

    /* synthetic */ ImmutableDoubleArray(double[] dArr, int i, int i2, C09591 c09591) {
    }

    static /* synthetic */ double[] access$000(ImmutableDoubleArray immutableDoubleArray) {
    }

    static /* synthetic */ int access$100(ImmutableDoubleArray immutableDoubleArray) {
    }

    static /* synthetic */ ImmutableDoubleArray access$200() {
    }

    static /* synthetic */ boolean access$500(double d, double d2) {
    }

    private static boolean areEqual(double d, double d2) {
    }

    public static Builder builder(int i) {
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
    }

    private boolean isPartialView() {
    }

    public static ImmutableDoubleArray of() {
    }

    public List<Double> asList() {
    }

    public boolean contains(double d) {
    }

    public boolean equals(Object obj) {
    }

    public double get(int i) {
    }

    public int hashCode() {
    }

    public int indexOf(double d) {
    }

    public boolean isEmpty() {
    }

    public int lastIndexOf(double d) {
    }

    public int length() {
    }

    Object readResolve() {
    }

    public ImmutableDoubleArray subArray(int i, int i2) {
    }

    public double[] toArray() {
    }

    public String toString() {
    }

    public ImmutableDoubleArray trimmed() {
    }

    Object writeReplace() {
    }

    private ImmutableDoubleArray(double[] dArr) {
    }

    public static ImmutableDoubleArray of(double d) {
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private double[] array;
        private int count;

        Builder(int i) {
        }

        private void ensureRoomFor(int i) {
        }

        private static int expandedCapacity(int i, int i2) {
        }

        public Builder add(double d) {
        }

        public Builder addAll(double[] dArr) {
        }

        @CheckReturnValue
        public ImmutableDoubleArray build() {
        }

        public Builder addAll(Iterable<Double> iterable) {
        }

        public Builder addAll(Collection<Double> collection) {
        }

        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i, int i2) {
    }

    public static Builder builder() {
    }

    public static ImmutableDoubleArray of(double d, double d2) {
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
    }

    public static ImmutableDoubleArray of(double d, double d2, double d3) {
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
    }

    public static ImmutableDoubleArray of(double d, double d2, double d3, double d4) {
    }

    public static ImmutableDoubleArray of(double d, double d2, double d3, double d4, double d5) {
    }

    public static ImmutableDoubleArray of(double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public static ImmutableDoubleArray of(double d, double... dArr) {
    }
}
