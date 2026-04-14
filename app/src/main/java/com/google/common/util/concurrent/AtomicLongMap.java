package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AtomicLongMap<K> implements Serializable {
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    /* renamed from: com.google.common.util.concurrent.AtomicLongMap$1 */
    class C10161 implements Function<AtomicLong, Long> {
        C10161(AtomicLongMap atomicLongMap) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Long apply(AtomicLong atomicLong) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public Long apply2(AtomicLong atomicLong) {
        }
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
    }

    public static <K> AtomicLongMap<K> create() {
    }

    private Map<K, Long> createAsMap() {
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k, long j) {
    }

    public Map<K, Long> asMap() {
    }

    public void clear() {
    }

    public boolean containsKey(Object obj) {
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k) {
    }

    public long get(K k) {
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k, long j) {
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k) {
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k) {
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k) {
    }

    public boolean isEmpty() {
    }

    @CanIgnoreReturnValue
    public long put(K k, long j) {
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
    }

    long putIfAbsent(K k, long j) {
    }

    @CanIgnoreReturnValue
    public long remove(K k) {
    }

    public void removeAllZeros() {
    }

    @CanIgnoreReturnValue
    @Beta
    public boolean removeIfZero(K k) {
    }

    boolean replace(K k, long j, long j2) {
    }

    public int size() {
    }

    public long sum() {
    }

    public String toString() {
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
    }

    boolean remove(K k, long j) {
    }
}
