package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class LongAddables {
    private static final Supplier<LongAddable> SUPPLIER = null;

    /* renamed from: com.google.common.hash.LongAddables$1 */
    class C09251 implements Supplier<LongAddable> {
        C09251() {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ LongAddable get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Supplier
        public LongAddable get() {
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$2 */
    class C09262 implements Supplier<LongAddable> {
        C09262() {
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

        @Override // com.google.common.hash.LongAddable
        public void add(long j) {
        }

        @Override // com.google.common.hash.LongAddable
        public void increment() {
        }

        @Override // com.google.common.hash.LongAddable
        public long sum() {
        }

        /* synthetic */ PureJavaLongAddable(C09251 c09251) {
        }
    }

    LongAddables() {
    }

    public static LongAddable create() {
    }
}
