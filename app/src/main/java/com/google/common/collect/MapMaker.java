package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MapMaker {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int UNSET_INT = -1;
    int concurrencyLevel;
    int initialCapacity;
    Equivalence<Object> keyEquivalence;
    MapMakerInternalMap.Strength keyStrength;
    boolean useCustomMap;
    MapMakerInternalMap.Strength valueStrength;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class Dummy {
        private static final /* synthetic */ Dummy[] $VALUES = null;
        public static final Dummy VALUE = null;

        private static /* synthetic */ Dummy[] $values() {
        }

        private Dummy(String str, int i) {
        }

        public static Dummy valueOf(String str) {
        }

        public static Dummy[] values() {
        }
    }

    @CanIgnoreReturnValue
    public MapMaker concurrencyLevel(int i) {
    }

    int getConcurrencyLevel() {
    }

    int getInitialCapacity() {
    }

    Equivalence<Object> getKeyEquivalence() {
    }

    MapMakerInternalMap.Strength getKeyStrength() {
    }

    MapMakerInternalMap.Strength getValueStrength() {
    }

    @CanIgnoreReturnValue
    public MapMaker initialCapacity(int i) {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    MapMaker keyEquivalence(Equivalence<Object> equivalence) {
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
    }

    MapMaker setKeyStrength(MapMakerInternalMap.Strength strength) {
    }

    MapMaker setValueStrength(MapMakerInternalMap.Strength strength) {
    }

    public String toString() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakKeys() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakValues() {
    }
}
