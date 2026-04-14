package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfMetricOrBuilder;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class TransportManager implements AppStateMonitor.AppStateCallback {
    private static final int CORE_POOL_SIZE = 0;
    private static final String KEY_AVAILABLE_GAUGES_FOR_CACHING = "KEY_AVAILABLE_GAUGES_FOR_CACHING";
    private static final String KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";
    private static final String KEY_AVAILABLE_TRACES_FOR_CACHING = "KEY_AVAILABLE_TRACES_FOR_CACHING";
    private static final int MAX_GAUGE_METRICS_CACHE_SIZE = 50;
    private static final int MAX_NETWORK_REQUEST_METRICS_CACHE_SIZE = 50;
    private static final int MAX_POOL_SIZE = 1;
    private static final int MAX_TRACE_METRICS_CACHE_SIZE = 50;
    private static final TransportManager instance = null;
    private static final AndroidLogger logger = null;
    private Context appContext;
    private AppStateMonitor appStateMonitor;
    private ApplicationInfo.Builder applicationInfoBuilder;
    private final Map<String, Integer> cacheMap;
    private ConfigResolver configResolver;
    private ExecutorService executorService;
    private FirebaseApp firebaseApp;
    private FirebaseInstallationsApi firebaseInstallationsApi;
    private FirebasePerformance firebasePerformance;
    private FlgTransport flgTransport;
    private Provider<TransportFactory> flgTransportFactoryProvider;
    private boolean isForegroundState;
    private final AtomicBoolean isTransportInitialized;
    private String packageName;
    private final ConcurrentLinkedQueue<PendingPerfEvent> pendingEventsQueue;
    private String projectId;
    private RateLimiter rateLimiter;

    private TransportManager() {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(TransportManager transportManager, NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(TransportManager transportManager, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
    }

    private void dispatchLog(PerfMetric perfMetric) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(TransportManager transportManager) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(TransportManager transportManager) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(TransportManager transportManager, PendingPerfEvent pendingPerfEvent) {
    }

    private void finishInitialization() {
    }

    private String getConsoleUrl(TraceMetric traceMetric) {
    }

    private Map<String, String> getGlobalCustomAttributes() {
    }

    public static TransportManager getInstance() {
    }

    private static String getLogcatMsg(PerfMetricOrBuilder perfMetricOrBuilder) {
    }

    private static String getVersionName(Context context) {
    }

    private void incrementDropCount(PerfMetric perfMetric) {
    }

    private boolean isAllowedToCache(PerfMetricOrBuilder perfMetricOrBuilder) {
    }

    private boolean isAllowedToDispatch(PerfMetric perfMetric) {
    }

    private /* synthetic */ void lambda$finishInitialization$0(PendingPerfEvent pendingPerfEvent) {
    }

    private /* synthetic */ void lambda$log$2(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
    }

    private /* synthetic */ void lambda$log$3(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
    }

    private /* synthetic */ void lambda$log$4(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
    }

    private /* synthetic */ void lambda$onUpdateAppState$1() {
    }

    public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(TransportManager transportManager, TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
    }

    private PerfMetric setApplicationInfoAndBuild(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
    }

    private void syncInit() {
    }

    private void syncLog(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
    }

    private void updateFirebaseInstallationIdIfPossibleAndNeeded() {
    }

    private void updateFirebasePerformanceIfPossibleAndNeeded() {
    }

    protected void clearAppInstanceId() {
    }

    protected ConcurrentLinkedQueue<PendingPerfEvent> getPendingEventsQueue() {
    }

    public void initialize(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider) {
    }

    void initializeForTest(FirebaseApp firebaseApp, FirebasePerformance firebasePerformance, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider, ConfigResolver configResolver, RateLimiter rateLimiter, AppStateMonitor appStateMonitor, FlgTransport flgTransport, ExecutorService executorService) {
    }

    public boolean isInitialized() {
    }

    public void log(TraceMetric traceMetric) {
    }

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
    }

    protected void setInitialized(boolean z) {
    }

    public void log(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
    }

    public void log(NetworkRequestMetric networkRequestMetric) {
    }

    public void log(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
    }

    public void log(GaugeMetric gaugeMetric) {
    }

    public void log(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
    }

    private static String getLogcatMsg(TraceMetric traceMetric) {
    }

    private static String getLogcatMsg(NetworkRequestMetric networkRequestMetric) {
    }

    private static String getLogcatMsg(GaugeMetric gaugeMetric) {
    }
}
