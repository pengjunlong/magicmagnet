package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.Set;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class SessionManager extends AppStateUpdateHandler {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = null;
    private final AppStateMonitor appStateMonitor;
    private final Set<WeakReference<SessionAwareObject>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;

    private SessionManager() {
    }

    public static SessionManager getInstance() {
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
    }

    @Override // com.google.firebase.perf.application.AppStateUpdateHandler, com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
    }

    public final PerfSession perfSession() {
    }

    public void registerForSessionUpdates(WeakReference<SessionAwareObject> weakReference) {
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession) {
    }

    public void unregisterForSessionUpdates(WeakReference<SessionAwareObject> weakReference) {
    }

    public void updatePerfSession(ApplicationProcessState applicationProcessState) {
    }

    public boolean updatePerfSessionIfExpired() {
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, AppStateMonitor appStateMonitor) {
    }
}
