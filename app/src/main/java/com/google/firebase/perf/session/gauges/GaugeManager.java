package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetadata;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = null;
    private static final AndroidLogger logger = null;
    private ApplicationProcessState applicationProcessState;
    private final ConfigResolver configResolver;
    private final CpuGaugeCollector cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final ScheduledExecutorService gaugeManagerExecutor;
    private GaugeMetadataManager gaugeMetadataManager;
    private final MemoryGaugeCollector memoryGaugeCollector;
    private String sessionId;
    private final TransportManager transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$1 */
    static /* synthetic */ class C11731 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState = null;
    }

    private GaugeManager() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
    }

    private GaugeMetadata getGaugeMetadata() {
    }

    public static synchronized GaugeManager getInstance() {
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
    }

    private /* synthetic */ void lambda$startCollectingGauges$0(String str, ApplicationProcessState applicationProcessState) {
    }

    private /* synthetic */ void lambda$stopCollectingGauges$1(String str, ApplicationProcessState applicationProcessState) {
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
    }

    private void syncFlush(String str, ApplicationProcessState applicationProcessState) {
    }

    public void collectGaugeMetricOnce(Timer timer) {
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
    }

    public void setApplicationContext(Context context) {
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState) {
    }

    public void stopCollectingGauges() {
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
    }

    GaugeManager(ScheduledExecutorService scheduledExecutorService, TransportManager transportManager, ConfigResolver configResolver, GaugeMetadataManager gaugeMetadataManager, CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector) {
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
    }
}
