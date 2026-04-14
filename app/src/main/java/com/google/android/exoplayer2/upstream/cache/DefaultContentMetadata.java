package com.google.android.exoplayer2.upstream.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = null;
    private int hashCode;
    private final Map<String, byte[]> metadata;

    public DefaultContentMetadata() {
    }

    private static void addValues(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> map, ContentMetadataMutations contentMetadataMutations) {
    }

    private static byte[] getBytes(Object obj) {
    }

    private static boolean isMetadataEqual(Map<String, byte[]> map, Map<String, byte[]> map2) {
    }

    private static void removeValues(HashMap<String, byte[]> hashMap, List<String> list) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(String str) {
    }

    public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentMetadataMutations) {
    }

    public Set<Map.Entry<String, byte[]>> entrySet() {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final byte[] get(String str, byte[] bArr) {
    }

    public int hashCode() {
    }

    public DefaultContentMetadata(Map<String, byte[]> map) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final String get(String str, String str2) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final long get(String str, long j) {
    }
}
