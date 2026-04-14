package okhttp3.internal.cache;

import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;
import p000.j00;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, j00 {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ DiskLruCache.Snapshot next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public DiskLruCache.Snapshot next2() {
    }
}
