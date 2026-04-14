package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class CreationContextFactory {
    private final Context applicationContext;
    private final Clock monotonicClock;
    private final Clock wallClock;

    CreationContextFactory(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
    }

    CreationContext create(String str) {
    }
}
