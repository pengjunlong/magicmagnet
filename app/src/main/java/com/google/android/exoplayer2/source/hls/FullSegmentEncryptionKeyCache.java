package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap<Uri, byte[]> backingMap;

    /* renamed from: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache$1 */
    class C01751 extends LinkedHashMap<Uri, byte[]> {
        final /* synthetic */ int val$maxSize;

        C01751(FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache, int i, float f, boolean z, int i2) {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        }
    }

    public FullSegmentEncryptionKeyCache(int i) {
    }

    public boolean containsUri(Uri uri) {
    }

    public byte[] get(Uri uri) {
    }

    public byte[] put(Uri uri, byte[] bArr) {
    }

    public byte[] remove(Uri uri) {
    }
}
