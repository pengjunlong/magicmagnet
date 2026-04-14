package com.google.android.exoplayer2.upstream.cache;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;
    public final int id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    private static final class Range {
        public final long length;
        public final long position;

        public Range(long j, long j2) {
        }

        public boolean contains(long j, long j2) {
        }

        public boolean intersects(long j, long j2) {
        }
    }

    public CachedContent(int i, String str) {
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
    }

    public boolean equals(Object obj) {
    }

    public long getCachedBytesLength(long j, long j2) {
    }

    public DefaultContentMetadata getMetadata() {
    }

    public SimpleCacheSpan getSpan(long j, long j2) {
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
    }

    public int hashCode() {
    }

    public boolean isEmpty() {
    }

    public boolean isFullyLocked(long j, long j2) {
    }

    public boolean isFullyUnlocked() {
    }

    public boolean lockRange(long j, long j2) {
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j, boolean z) {
    }

    public void unlockRange(long j) {
    }

    public CachedContent(int i, String str, DefaultContentMetadata defaultContentMetadata) {
    }
}
