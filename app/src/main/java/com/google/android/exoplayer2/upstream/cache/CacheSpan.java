package com.google.android.exoplayer2.upstream.cache;

import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j2) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CacheSpan cacheSpan) {
    }

    public boolean isHoleSpan() {
    }

    public boolean isOpenEnded() {
    }

    public String toString() {
    }

    public CacheSpan(String str, long j, long j2, long j3, File file) {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(CacheSpan cacheSpan) {
    }
}
