package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = null;

    String buildCacheKey(DataSpec dataSpec);
}
