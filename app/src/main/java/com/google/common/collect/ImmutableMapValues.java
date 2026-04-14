package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> map;

    /* renamed from: com.google.common.collect.ImmutableMapValues$1 */
    class C07091 extends UnmodifiableIterator<V> {
        final UnmodifiableIterator<Map.Entry<K, V>> entryItr;
        final /* synthetic */ ImmutableMapValues this$0;

        C07091(ImmutableMapValues immutableMapValues) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public V next() {
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMapValues$2 */
    class C07102 extends ImmutableList<V> {
        final /* synthetic */ ImmutableList val$entryList;

        C07102(ImmutableMapValues immutableMapValues, ImmutableList immutableList) {
        }

        @Override // java.util.List
        public V get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    @GwtIncompatible
    private static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<?, V> map;

        SerializedForm(ImmutableMap<?, V> immutableMap) {
        }

        Object readResolve() {
        }
    }

    ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
    }

    static /* synthetic */ ImmutableMap access$000(ImmutableMapValues immutableMapValues) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<V> iterator() {
    }
}
