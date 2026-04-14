package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CpuGaugeCollector {
    private static final int CSTIME_POSITION_IN_PROC_PID_STAT = 16;
    private static final int CUTIME_POSITION_IN_PROC_PID_STAT = 15;
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = -1;
    private static final int INVALID_SC_PER_CPU_CLOCK_TICK = -1;
    private static final long MICROSECONDS_PER_SECOND = 0;
    private static final int STIME_POSITION_IN_PROC_PID_STAT = 14;
    private static final int UNSET_CPU_METRIC_COLLECTION_RATE = -1;
    private static final int UTIME_POSITION_IN_PROC_PID_STAT = 13;
    private static CpuGaugeCollector instance;
    private static final AndroidLogger logger = null;
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs;
    private final ScheduledExecutorService cpuMetricCollectorExecutor;
    private ScheduledFuture cpuMetricCollectorJob;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings;
    private final String procFileName;

    private CpuGaugeCollector() {
    }

    private long convertClockTicksToMicroseconds(long j) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
    }

    private long getClockTicksPerSecond() {
    }

    public static CpuGaugeCollector getInstance() {
    }

    public static boolean isInvalidCollectionFrequency(long j) {
    }

    private /* synthetic */ void lambda$scheduleCpuMetricCollectionOnce$1(Timer timer) {
    }

    private /* synthetic */ void lambda$scheduleCpuMetricCollectionWithRate$0(Timer timer) {
    }

    private synchronized void scheduleCpuMetricCollectionOnce(Timer timer) {
    }

    private synchronized void scheduleCpuMetricCollectionWithRate(long j, Timer timer) {
    }

    private CpuMetricReading syncCollectCpuMetric(Timer timer) {
    }

    public void collectOnce(Timer timer) {
    }

    public void startCollecting(long j, Timer timer) {
    }

    public void stopCollecting() {
    }

    CpuGaugeCollector(ScheduledExecutorService scheduledExecutorService, String str, long j) {
    }
}
