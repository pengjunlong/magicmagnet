package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.hh;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static volatile AppStateMonitor instance;
    private static final AndroidLogger logger = null;
    private final WeakHashMap<Activity, Boolean> activityToResumedMap;
    private final WeakHashMap<Activity, Trace> activityToScreenTraceMap;
    private Set<AppColdStartCallback> appColdStartSubscribers;
    private final Set<WeakReference<AppStateCallback>> appStateSubscribers;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private ApplicationProcessState currentAppState;
    private hh frameMetricsAggregator;
    private boolean hasFrameMetricsAggregator;
    private boolean isColdStart;
    private boolean isRegisteredForLifecycleCallbacks;
    private final Map<String, Long> metricToCountMap;
    private Timer resumeTime;
    private Timer stopTime;
    private final TransportManager transportManager;
    private final AtomicInteger tsnsCount;

    public interface AppColdStartCallback {
        void onAppColdStart();
    }

    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    AppStateMonitor(TransportManager transportManager, Clock clock) {
    }

    public static AppStateMonitor getInstance() {
    }

    public static String getScreenTraceName(Activity activity) {
    }

    private boolean hasFrameMetricsAggregatorClass() {
    }

    private boolean isScreenTraceSupported(Activity activity) {
    }

    private void sendAppColdStartUpdate() {
    }

    private void sendScreenTrace(Activity activity) {
    }

    private void sendSessionLog(String str, Timer timer, Timer timer2) {
    }

    private void updateAppState(ApplicationProcessState applicationProcessState) {
    }

    @VisibleForTesting
    WeakHashMap<Activity, Trace> getActivity2ScreenTrace() {
    }

    public ApplicationProcessState getAppState() {
    }

    @VisibleForTesting
    Timer getPauseTime() {
    }

    @VisibleForTesting
    Timer getResumeTime() {
    }

    @VisibleForTesting
    WeakHashMap<Activity, Boolean> getResumed() {
    }

    public void incrementCount(String str, long j) {
    }

    public void incrementTsnsCount(int i) {
    }

    public boolean isColdStart() {
    }

    public boolean isForeground() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
    }

    public void registerForAppColdStart(AppColdStartCallback appColdStartCallback) {
    }

    public void registerForAppState(WeakReference<AppStateCallback> weakReference) {
    }

    @VisibleForTesting
    public void setIsColdStart(boolean z) {
    }

    public synchronized void unregisterActivityLifecycleCallbacks(Context context) {
    }

    public void unregisterForAppState(WeakReference<AppStateCallback> weakReference) {
    }
}
