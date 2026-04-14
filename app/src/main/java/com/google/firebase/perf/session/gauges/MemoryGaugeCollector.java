package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = -1;
    private static final int UNSET_MEMORY_METRIC_COLLECTION_RATE = -1;

    @SuppressLint({"StaticFieldLeak"})
    private static final MemoryGaugeCollector instance = null;
    private static final AndroidLogger logger = null;
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    private MemoryGaugeCollector() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
    }

    public static MemoryGaugeCollector getInstance() {
    }

    public static boolean isInvalidCollectionFrequency(long j) {
    }

    private /* synthetic */ void lambda$scheduleMemoryMetricCollectionOnce$1(Timer timer) {
    }

    private /* synthetic */ void lambda$scheduleMemoryMetricCollectionWithRate$0(Timer timer) {
    }

    private synchronized void scheduleMemoryMetricCollectionOnce(Timer timer) {
    }

    private synchronized void scheduleMemoryMetricCollectionWithRate(long j, Timer timer) {
    }

    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
    }

    public void collectOnce(Timer timer) {
    }

    public void startCollecting(long j, Timer timer) {
    }

    public void stopCollecting() {
    }

    MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
    }
}
