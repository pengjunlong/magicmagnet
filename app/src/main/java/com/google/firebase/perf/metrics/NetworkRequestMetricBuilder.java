package com.google.firebase.perf.metrics;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class NetworkRequestMetricBuilder extends AppStateUpdateHandler implements SessionAwareObject {
    private static final char HIGHEST_ASCII_CHAR = 127;
    private static final char HIGHEST_CONTROL_CHAR = 31;
    private static final AndroidLogger logger = null;
    private final NetworkRequestMetric.Builder builder;
    private final GaugeManager gaugeManager;
    private boolean isManualNetworkRequestMetric;
    private boolean isReportSent;
    private final List<PerfSession> sessions;
    private final TransportManager transportManager;
    private String userAgent;
    private final WeakReference<SessionAwareObject> weakReference;

    private NetworkRequestMetricBuilder(TransportManager transportManager) {
    }

    public static NetworkRequestMetricBuilder builder(TransportManager transportManager) {
    }

    private boolean hasStarted() {
    }

    private boolean isStopped() {
    }

    private static boolean isValidContentType(String str) {
    }

    public NetworkRequestMetric build() {
    }

    void clearBuilderFields() {
    }

    List<PerfSession> getSessions() {
    }

    public long getTimeToResponseInitiatedMicros() {
    }

    public String getUrl() {
    }

    public boolean hasHttpResponseCode() {
    }

    boolean isReportSent() {
    }

    public NetworkRequestMetricBuilder setCustomAttributes(Map<String, String> map) {
    }

    public NetworkRequestMetricBuilder setHttpMethod(String str) {
    }

    public NetworkRequestMetricBuilder setHttpResponseCode(int i) {
    }

    public void setManualNetworkRequestMetric() {
    }

    public NetworkRequestMetricBuilder setNetworkClientErrorReason() {
    }

    void setReportSent() {
    }

    public NetworkRequestMetricBuilder setRequestPayloadBytes(long j) {
    }

    public NetworkRequestMetricBuilder setRequestStartTimeMicros(long j) {
    }

    public NetworkRequestMetricBuilder setResponseContentType(String str) {
    }

    public NetworkRequestMetricBuilder setResponsePayloadBytes(long j) {
    }

    public NetworkRequestMetricBuilder setTimeToRequestCompletedMicros(long j) {
    }

    public NetworkRequestMetricBuilder setTimeToResponseCompletedMicros(long j) {
    }

    public NetworkRequestMetricBuilder setTimeToResponseInitiatedMicros(long j) {
    }

    public NetworkRequestMetricBuilder setUrl(String str) {
    }

    public NetworkRequestMetricBuilder setUserAgent(String str) {
    }

    @Override // com.google.firebase.perf.session.SessionAwareObject
    public void updateSession(PerfSession perfSession) {
    }

    public NetworkRequestMetricBuilder(TransportManager transportManager, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
    }
}
