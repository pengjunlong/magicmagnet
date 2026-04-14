package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class FirebasePerfTraceValidator extends PerfMetricValidator {
    private static final AndroidLogger logger = null;
    private final TraceMetric traceMetric;

    FirebasePerfTraceValidator(TraceMetric traceMetric) {
    }

    private boolean areCountersValid(TraceMetric traceMetric) {
    }

    private boolean hasCounters(TraceMetric traceMetric) {
    }

    private boolean hasValidAttributes(Map<String, String> map) {
    }

    private boolean isValidCounterId(String str) {
    }

    private boolean isValidCounterValue(Long l) {
    }

    private boolean isValidTrace(TraceMetric traceMetric, int i) {
    }

    private boolean isValidTraceDuration(TraceMetric traceMetric) {
    }

    private boolean isValidTraceId(String str) {
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
    }

    private boolean areCountersValid(TraceMetric traceMetric, int i) {
    }
}
