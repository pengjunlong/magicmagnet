package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long j, long j2, long j3, long j4, long j5, long j6) {
    }

    public double averageLoadPenalty() {
    }

    public boolean equals(Object obj) {
    }

    public long evictionCount() {
    }

    public int hashCode() {
    }

    public long hitCount() {
    }

    public double hitRate() {
    }

    public long loadCount() {
    }

    public long loadExceptionCount() {
    }

    public double loadExceptionRate() {
    }

    public long loadSuccessCount() {
    }

    public CacheStats minus(CacheStats cacheStats) {
    }

    public long missCount() {
    }

    public double missRate() {
    }

    public CacheStats plus(CacheStats cacheStats) {
    }

    public long requestCount() {
    }

    public String toString() {
    }

    public long totalLoadTime() {
    }
}
