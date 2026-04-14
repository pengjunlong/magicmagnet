package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface WorkScheduler {
    void schedule(TransportContext transportContext, int i);

    void schedule(TransportContext transportContext, int i, boolean z);
}
