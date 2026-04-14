package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    CompactLinkedHashMap() {
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i) {
    }

    private int getPredecessor(int i) {
    }

    private long link(int i) {
    }

    private long[] requireLinks() {
    }

    private void setLink(int i, long j) {
    }

    private void setPredecessor(int i, int i2) {
    }

    private void setSucceeds(int i, int i2) {
    }

    private void setSuccessor(int i, int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    void accessEntry(int i) {
    }

    @Override // com.google.common.collect.CompactHashMap
    int adjustAfterRemove(int i, int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    int allocArrays() {
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    Map<K, V> convertToHashFloodingResistantImplementation() {
    }

    @Override // com.google.common.collect.CompactHashMap
    Map<K, V> createHashFloodingResistantDelegate(int i) {
    }

    @Override // com.google.common.collect.CompactHashMap
    int firstEntryIndex() {
    }

    @Override // com.google.common.collect.CompactHashMap
    int getSuccessor(int i) {
    }

    @Override // com.google.common.collect.CompactHashMap
    void init(int i) {
    }

    @Override // com.google.common.collect.CompactHashMap
    void insertEntry(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
    }

    @Override // com.google.common.collect.CompactHashMap
    void moveLastEntry(int i, int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    void resizeEntries(int i) {
    }

    CompactLinkedHashMap(int i) {
    }

    CompactLinkedHashMap(int i, boolean z) {
    }
}
