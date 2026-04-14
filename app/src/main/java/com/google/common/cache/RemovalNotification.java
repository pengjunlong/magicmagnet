package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractMap;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(K k, V v, RemovalCause removalCause) {
    }

    public static <K, V> RemovalNotification<K, V> create(K k, V v, RemovalCause removalCause) {
    }

    public RemovalCause getCause() {
    }

    public boolean wasEvicted() {
    }
}
