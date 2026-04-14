package com.google.firebase.perf.metrics;

import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class HttpMetric implements FirebasePerformanceAttributable {
    private static final AndroidLogger logger = null;
    private final Map<String, String> customAttributesMap;
    private boolean isDisabled;
    private boolean isStopped;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final Timer timer;

    public HttpMetric(String str, String str2, TransportManager transportManager, Timer timer) {
    }

    private void checkAttribute(String str, String str2) {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public String getAttribute(String str) {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public Map<String, String> getAttributes() {
    }

    public void markRequestComplete() {
    }

    public void markResponseStart() {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void putAttribute(String str, String str2) {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void removeAttribute(String str) {
    }

    public void setHttpResponseCode(int i) {
    }

    public void setRequestPayloadSize(long j) {
    }

    public void setResponseContentType(String str) {
    }

    public void setResponsePayloadSize(long j) {
    }

    public void start() {
    }

    public void stop() {
    }

    public HttpMetric(URL url, String str, TransportManager transportManager, Timer timer) {
    }
}
