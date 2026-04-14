package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    @Beta
    protected abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        final /* synthetic */ ForwardingMap this$0;

        public StandardEntrySet(ForwardingMap forwardingMap) {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        Map<K, V> map() {
        }
    }

    @Beta
    protected class StandardKeySet extends Maps.KeySet<K, V> {
        public StandardKeySet(ForwardingMap forwardingMap) {
        }
    }

    @Beta
    protected class StandardValues extends Maps.Values<K, V> {
        public StandardValues(ForwardingMap forwardingMap) {
        }
    }

    protected ForwardingMap() {
    }

    public void clear() {
    }

    public boolean containsKey(Object obj) {
    }

    public boolean containsValue(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
    }

    public boolean equals(Object obj) {
    }

    public V get(Object obj) {
    }

    public int hashCode() {
    }

    public boolean isEmpty() {
    }

    public Set<K> keySet() {
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
    }

    public int size() {
    }

    protected void standardClear() {
    }

    @Beta
    protected boolean standardContainsKey(Object obj) {
    }

    protected boolean standardContainsValue(Object obj) {
    }

    protected boolean standardEquals(Object obj) {
    }

    protected int standardHashCode() {
    }

    protected boolean standardIsEmpty() {
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
    }

    @Beta
    protected V standardRemove(Object obj) {
    }

    protected String standardToString() {
    }

    public Collection<V> values() {
    }
}
