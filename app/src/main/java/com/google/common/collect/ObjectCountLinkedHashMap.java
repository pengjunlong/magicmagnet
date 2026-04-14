package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    ObjectCountLinkedHashMap() {
    }

    static <K> ObjectCountLinkedHashMap<K> create() {
    }

    static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i) {
    }

    private int getPredecessor(int i) {
    }

    private int getSuccessor(int i) {
    }

    private void setPredecessor(int i, int i2) {
    }

    private void setSucceeds(int i, int i2) {
    }

    private void setSuccessor(int i, int i2) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int firstIndex() {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void init(int i, float f) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void insertEntry(int i, @ParametricNullness K k, int i2, int i3) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void moveLastEntry(int i) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int nextIndex(int i) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int nextIndexAfterRemove(int i, int i2) {
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void resizeEntries(int i) {
    }

    ObjectCountLinkedHashMap(int i) {
    }

    ObjectCountLinkedHashMap(int i, float f) {
    }

    ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
    }
}
