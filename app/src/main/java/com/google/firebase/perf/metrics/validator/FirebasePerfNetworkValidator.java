package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class FirebasePerfNetworkValidator extends PerfMetricValidator {
    private static final int EMPTY_PORT = -1;
    private static final String HTTPS = "https";
    private static final String HTTP_SCHEMA = "http";
    private static final AndroidLogger logger = null;
    private final Context appContext;
    private final NetworkRequestMetric networkMetric;

    FirebasePerfNetworkValidator(NetworkRequestMetric networkRequestMetric, Context context) {
    }

    private URI getResultUrl(String str) {
    }

    private boolean isAllowlisted(URI uri, Context context) {
    }

    private boolean isBlank(String str) {
    }

    private boolean isEmptyUrl(String str) {
    }

    private boolean isValidHost(String str) {
    }

    private boolean isValidHttpResponseCode(int i) {
    }

    private boolean isValidPayload(long j) {
    }

    private boolean isValidPort(int i) {
    }

    private boolean isValidScheme(String str) {
    }

    private boolean isValidTime(long j) {
    }

    private boolean isValidUserInfo(String str) {
    }

    boolean isValidHttpMethod(NetworkRequestMetric.HttpMethod httpMethod) {
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
    }
}
