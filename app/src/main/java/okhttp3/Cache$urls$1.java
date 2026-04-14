package okhttp3;

import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;
import p000.j00;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Cache$urls$1 implements Iterator<String>, j00 {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;
    final /* synthetic */ Cache this$0;

    Cache$urls$1(Cache cache) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ String next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public String next2() {
    }
}
