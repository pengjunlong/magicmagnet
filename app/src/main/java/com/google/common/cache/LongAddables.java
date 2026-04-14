package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER = null;

    /* renamed from: com.google.common.cache.LongAddables$1 */
    class C06581 implements Supplier<LongAddable> {
        C06581() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
        }
    }

    /* renamed from: com.google.common.cache.LongAddables$2 */
    class C06592 implements Supplier<LongAddable> {
        C06592() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
        }
    }

    private static final class PureJavaLongAddable extends AtomicLong implements LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.cache.LongAddable
        public void add(long j) {
        }

        @Override // com.google.common.cache.LongAddable
        public void increment() {
        }

        @Override // com.google.common.cache.LongAddable
        public long sum() {
        }

        /* synthetic */ PureJavaLongAddable(C06581 c06581) {
        }
    }

    LongAddables() {
    }

    public static LongAddable create() {
    }
}
