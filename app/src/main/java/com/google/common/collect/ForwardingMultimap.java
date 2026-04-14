package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    protected ForwardingMultimap() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract Multimap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
    }

    public Collection<V> get(@ParametricNullness K k) {
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
    }

    @CanIgnoreReturnValue
    public Collection<V> removeAll(Object obj) {
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
    }
}
