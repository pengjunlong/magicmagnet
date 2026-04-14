package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    protected ForwardingMapEntry() {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public K getKey() {
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V getValue() {
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
    }

    @ParametricNullness
    public V setValue(@ParametricNullness V v) {
    }

    protected boolean standardEquals(Object obj) {
    }

    protected int standardHashCode() {
    }

    @Beta
    protected String standardToString() {
    }
}
