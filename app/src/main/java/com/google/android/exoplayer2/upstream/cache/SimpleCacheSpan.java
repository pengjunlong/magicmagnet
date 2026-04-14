package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = null;
    private static final Pattern CACHE_FILE_PATTERN_V2 = null;
    private static final Pattern CACHE_FILE_PATTERN_V3 = null;
    static final String COMMON_SUFFIX = ".exo";
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String str, long j, long j2, long j3, File file) {
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j, CachedContentIndex cachedContentIndex) {
    }

    public static SimpleCacheSpan createHole(String str, long j, long j2) {
    }

    public static SimpleCacheSpan createLookup(String str, long j) {
    }

    public static File getCacheFile(File file, int i, long j, long j2) {
    }

    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
    }

    public SimpleCacheSpan copyWithFileAndLastTouchTimestamp(File file, long j) {
    }

    public static SimpleCacheSpan createCacheEntry(File file, long j, long j2, CachedContentIndex cachedContentIndex) {
    }
}
