package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class TimeModule {
    @Provides
    @WallTime
    static Clock eventClock() {
    }

    @Provides
    @Monotonic
    static Clock uptimeClock() {
    }
}
