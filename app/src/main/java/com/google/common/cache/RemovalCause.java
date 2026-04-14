package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class RemovalCause {
    private static final /* synthetic */ RemovalCause[] $VALUES = null;
    public static final RemovalCause COLLECTED = null;
    public static final RemovalCause EXPIRED = null;
    public static final RemovalCause EXPLICIT = null;
    public static final RemovalCause REPLACED = null;
    public static final RemovalCause SIZE = null;

    /* renamed from: com.google.common.cache.RemovalCause$1 */
    enum C06601 extends RemovalCause {
        C06601(String str, int i) {
        }

        @Override // com.google.common.cache.RemovalCause
        boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$2 */
    enum C06612 extends RemovalCause {
        C06612(String str, int i) {
        }

        @Override // com.google.common.cache.RemovalCause
        boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$3 */
    enum C06623 extends RemovalCause {
        C06623(String str, int i) {
        }

        @Override // com.google.common.cache.RemovalCause
        boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$4 */
    enum C06634 extends RemovalCause {
        C06634(String str, int i) {
        }

        @Override // com.google.common.cache.RemovalCause
        boolean wasEvicted() {
        }
    }

    /* renamed from: com.google.common.cache.RemovalCause$5 */
    enum C06645 extends RemovalCause {
        C06645(String str, int i) {
        }

        @Override // com.google.common.cache.RemovalCause
        boolean wasEvicted() {
        }
    }

    private static /* synthetic */ RemovalCause[] $values() {
    }

    private RemovalCause(String str, int i) {
    }

    public static RemovalCause valueOf(String str) {
    }

    public static RemovalCause[] values() {
    }

    abstract boolean wasEvicted();

    /* synthetic */ RemovalCause(String str, int i, C06601 c06601) {
    }
}
