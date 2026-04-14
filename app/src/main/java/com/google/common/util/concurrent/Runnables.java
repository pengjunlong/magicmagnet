package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Runnables {
    private static final Runnable EMPTY_RUNNABLE = null;

    /* renamed from: com.google.common.util.concurrent.Runnables$1 */
    class RunnableC10621 implements Runnable {
        RunnableC10621() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Runnables() {
    }

    public static Runnable doNothing() {
    }
}
