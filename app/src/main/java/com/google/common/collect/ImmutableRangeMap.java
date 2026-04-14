package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.List;
import java.util.Map;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = null;
    private static final long serialVersionUID = 0;
    private final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$1 */
    class C07141 extends ImmutableList<Range<K>> {
        final /* synthetic */ ImmutableRangeMap this$0;
        final /* synthetic */ int val$len;
        final /* synthetic */ int val$off;
        final /* synthetic */ Range val$range;

        C07141(ImmutableRangeMap immutableRangeMap, int i, int i2, Range range) {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.List
        public Range<K> get(int i) {
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$2 */
    class C07152 extends ImmutableRangeMap<K, V> {
        final /* synthetic */ ImmutableRangeMap val$outer;
        final /* synthetic */ Range val$range;

        C07152(ImmutableRangeMap immutableRangeMap, ImmutableList immutableList, ImmutableList immutableList2, Range range, ImmutableRangeMap immutableRangeMap2) {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public /* bridge */ /* synthetic */ RangeMap subRangeMap(Range range) {
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
        public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
        }
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {
        private final List<Map.Entry<Range<K>, V>> entries;

        public ImmutableRangeMap<K, V> build() {
        }

        @CanIgnoreReturnValue
        Builder<K, V> combine(Builder<K, V> builder) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Range<K> range, V v) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(RangeMap<K, ? extends V> rangeMap) {
        }
    }

    private static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
        }

        Object createRangeMap() {
        }

        Object readResolve() {
        }
    }

    ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
    }

    static /* synthetic */ ImmutableList access$000(ImmutableRangeMap immutableRangeMap) {
    }

    public static <K extends Comparable<?>, V> Builder<K, V> builder() {
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(RangeMap<K, ? extends V> rangeMap) {
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of() {
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ Map asMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.RangeMap
    public V get(K k) {
    }

    @Override // com.google.common.collect.RangeMap
    public Map.Entry<Range<K>, V> getEntry(K k) {
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void put(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(RangeMap<K, V> rangeMap) {
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putCoalescing(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove(Range<K> range) {
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
    }

    @Override // com.google.common.collect.RangeMap
    public /* bridge */ /* synthetic */ RangeMap subRangeMap(Range range) {
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
    }

    Object writeReplace() {
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
    }
}
