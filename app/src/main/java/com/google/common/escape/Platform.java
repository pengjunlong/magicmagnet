package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = null;

    /* renamed from: com.google.common.escape.Platform$1 */
    class C08631 extends ThreadLocal<char[]> {
        C08631() {
        }

        @Override // java.lang.ThreadLocal
        protected /* bridge */ /* synthetic */ char[] initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue, reason: avoid collision after fix types in other method */
        protected char[] initialValue2() {
        }
    }

    private Platform() {
    }

    static char[] charBufferFromThreadLocal() {
    }
}
