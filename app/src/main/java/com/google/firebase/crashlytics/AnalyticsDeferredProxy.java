package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AnalyticsDeferredProxy {
    private final Deferred<AnalyticsConnector> analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;
    private final List<BreadcrumbHandler> breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(AnalyticsDeferredProxy analyticsDeferredProxy, String str, Bundle bundle) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
    }

    private void init() {
    }

    private /* synthetic */ void lambda$getAnalyticsEventLogger$1(String str, Bundle bundle) {
    }

    private /* synthetic */ void lambda$getDeferredBreadcrumbSource$0(BreadcrumbHandler breadcrumbHandler) {
    }

    private /* synthetic */ void lambda$init$2(Provider provider) {
    }

    @DeferredApi
    private static AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(AnalyticsConnector analyticsConnector, CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
    }
}
