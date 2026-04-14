package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.base.Supplier;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CacheBuilder<K, V> {
    static final Supplier<AbstractCache.StatsCounter> CACHE_STATS_COUNTER = null;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int DEFAULT_REFRESH_NANOS = 0;
    static final CacheStats EMPTY_STATS = null;
    static final Supplier<? extends AbstractCache.StatsCounter> NULL_STATS_COUNTER = null;
    static final Ticker NULL_TICKER = null;
    static final int UNSET_INT = -1;
    private static final Logger logger = null;
    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence<Object> keyEquivalence;
    LocalCache.Strength keyStrength;
    long maximumSize;
    long maximumWeight;
    long refreshNanos;
    RemovalListener<? super K, ? super V> removalListener;
    Supplier<? extends AbstractCache.StatsCounter> statsCounterSupplier;
    boolean strictParsing;
    Ticker ticker;
    Equivalence<Object> valueEquivalence;
    LocalCache.Strength valueStrength;
    Weigher<? super K, ? super V> weigher;

    /* renamed from: com.google.common.cache.CacheBuilder$1 */
    class C06331 implements AbstractCache.StatsCounter {
        C06331() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$2 */
    class C06342 implements Supplier<AbstractCache.StatsCounter> {
        C06342() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ AbstractCache.StatsCounter get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public AbstractCache.StatsCounter get() {
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$3 */
    class C06353 extends Ticker {
        C06353() {
        }

        @Override // com.google.common.base.Ticker
        public long read() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class NullListener implements RemovalListener<Object, Object> {
        private static final /* synthetic */ NullListener[] $VALUES = null;
        public static final NullListener INSTANCE = null;

        private static /* synthetic */ NullListener[] $values() {
        }

        private NullListener(String str, int i) {
        }

        public static NullListener valueOf(String str) {
        }

        public static NullListener[] values() {
        }

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class OneWeigher implements Weigher<Object, Object> {
        private static final /* synthetic */ OneWeigher[] $VALUES = null;
        public static final OneWeigher INSTANCE = null;

        private static /* synthetic */ OneWeigher[] $values() {
        }

        private OneWeigher(String str, int i) {
        }

        public static OneWeigher valueOf(String str) {
        }

        public static OneWeigher[] values() {
        }

        @Override // com.google.common.cache.Weigher
        public int weigh(Object obj, Object obj2) {
        }
    }

    private CacheBuilder() {
    }

    private void checkNonLoadingCache() {
    }

    private void checkWeightWithWeigher() {
    }

    @CheckReturnValue
    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(CacheBuilderSpec cacheBuilderSpec) {
    }

    @CheckReturnValue
    public static CacheBuilder<Object, Object> newBuilder() {
    }

    @CheckReturnValue
    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> cacheLoader) {
    }

    public CacheBuilder<K, V> concurrencyLevel(int i) {
    }

    public CacheBuilder<K, V> expireAfterAccess(long j, TimeUnit timeUnit) {
    }

    public CacheBuilder<K, V> expireAfterWrite(long j, TimeUnit timeUnit) {
    }

    int getConcurrencyLevel() {
    }

    long getExpireAfterAccessNanos() {
    }

    long getExpireAfterWriteNanos() {
    }

    int getInitialCapacity() {
    }

    Equivalence<Object> getKeyEquivalence() {
    }

    LocalCache.Strength getKeyStrength() {
    }

    long getMaximumWeight() {
    }

    long getRefreshNanos() {
    }

    <K1 extends K, V1 extends V> RemovalListener<K1, V1> getRemovalListener() {
    }

    Supplier<? extends AbstractCache.StatsCounter> getStatsCounterSupplier() {
    }

    Ticker getTicker(boolean z) {
    }

    Equivalence<Object> getValueEquivalence() {
    }

    LocalCache.Strength getValueStrength() {
    }

    <K1 extends K, V1 extends V> Weigher<K1, V1> getWeigher() {
    }

    public CacheBuilder<K, V> initialCapacity(int i) {
    }

    boolean isRecordingStats() {
    }

    @GwtIncompatible
    CacheBuilder<K, V> keyEquivalence(Equivalence<Object> equivalence) {
    }

    @GwtIncompatible
    CacheBuilder<K, V> lenientParsing() {
    }

    public CacheBuilder<K, V> maximumSize(long j) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> maximumWeight(long j) {
    }

    public CacheBuilder<K, V> recordStats() {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(long j, TimeUnit timeUnit) {
    }

    @CheckReturnValue
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> removalListener) {
    }

    CacheBuilder<K, V> setKeyStrength(LocalCache.Strength strength) {
    }

    CacheBuilder<K, V> setValueStrength(LocalCache.Strength strength) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> softValues() {
    }

    public CacheBuilder<K, V> ticker(Ticker ticker) {
    }

    public String toString() {
    }

    @GwtIncompatible
    CacheBuilder<K, V> valueEquivalence(Equivalence<Object> equivalence) {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> weakKeys() {
    }

    @GwtIncompatible
    public CacheBuilder<K, V> weakValues() {
    }

    @GwtIncompatible
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> weigher(Weigher<? super K1, ? super V1> weigher) {
    }

    @CheckReturnValue
    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(String str) {
    }

    @CheckReturnValue
    public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
    }
}
