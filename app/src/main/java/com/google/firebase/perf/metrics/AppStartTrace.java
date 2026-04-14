package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    private static final long MAX_LATENCY_BEFORE_UI_INIT = 0;
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private final Clock clock;
    private boolean isRegisteredForLifecycleCallbacks;
    private boolean isStartedFromBackground;
    private boolean isTooLateToInitUI;
    private WeakReference<Activity> launchActivity;
    private Timer onCreateTime;
    private Timer onResumeTime;
    private Timer onStartTime;
    private final TransportManager transportManager;

    public static class StartFromBackgroundRunnable implements Runnable {
        private final AppStartTrace trace;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    AppStartTrace(TransportManager transportManager, Clock clock) {
    }

    static /* synthetic */ Timer access$000(AppStartTrace appStartTrace) {
    }

    static /* synthetic */ boolean access$102(AppStartTrace appStartTrace, boolean z) {
    }

    public static AppStartTrace getInstance() {
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @VisibleForTesting
    Activity getAppStartActivity() {
    }

    @VisibleForTesting
    Activity getLaunchActivity() {
    }

    @VisibleForTesting
    Timer getOnCreateTime() {
    }

    @VisibleForTesting
    Timer getOnResumeTime() {
    }

    @VisibleForTesting
    Timer getOnStartTime() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
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

    @VisibleForTesting
    void setIsStartFromBackground() {
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
    }

    static AppStartTrace getInstance(TransportManager transportManager, Clock clock) {
    }
}
