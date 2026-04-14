package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Ticker {
    private static final Ticker SYSTEM_TICKER = null;

    /* renamed from: com.google.common.base.Ticker$1 */
    class C06321 extends Ticker {
        C06321() {
        }

        @Override // com.google.common.base.Ticker
        public long read() {
        }
    }

    protected Ticker() {
    }

    public static Ticker systemTicker() {
    }

    public abstract long read();
}
