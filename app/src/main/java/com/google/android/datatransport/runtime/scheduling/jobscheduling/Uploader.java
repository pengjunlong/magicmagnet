package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class Uploader {
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock) {
    }

    public static /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1(Uploader uploader, BackendResponse backendResponse, Iterable iterable, TransportContext transportContext, int i) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
    }

    public static /* synthetic */ Object dpbdpqRKAscW1lll1l(Uploader uploader, TransportContext transportContext, int i) {
    }

    public static /* synthetic */ Iterable dqqppqiKzJi1l1lll1l(Uploader uploader, TransportContext transportContext) {
    }

    private /* synthetic */ Iterable lambda$logAndUpdateState$2(TransportContext transportContext) {
    }

    private /* synthetic */ Object lambda$logAndUpdateState$3(BackendResponse backendResponse, Iterable iterable, TransportContext transportContext, int i) {
    }

    private /* synthetic */ Object lambda$upload$0(TransportContext transportContext, int i) {
    }

    private /* synthetic */ void lambda$upload$1(TransportContext transportContext, int i, Runnable runnable) {
    }

    boolean isNetworkAvailable() {
    }

    void logAndUpdateState(TransportContext transportContext, int i) {
    }

    public void upload(TransportContext transportContext, int i, Runnable runnable) {
    }
}
