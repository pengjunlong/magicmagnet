package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class InstrumentApacheHttpResponseHandler<T> implements ResponseHandler<T> {
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final ResponseHandler<? extends T> responseHandlerDelegate;
    private final Timer timer;

    public InstrumentApacheHttpResponseHandler(ResponseHandler<? extends T> responseHandler, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
    }
}
