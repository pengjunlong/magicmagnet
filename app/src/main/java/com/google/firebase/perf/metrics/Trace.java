package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class Trace extends AppStateUpdateHandler implements Parcelable, FirebasePerformanceAttributable, SessionAwareObject {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = null;

    @VisibleForTesting
    static final Parcelable.Creator<Trace> CREATOR_DATAONLY = null;
    private static final AndroidLogger logger = null;
    private static final Map<String, Trace> traceNameToTraceMap = null;
    private final Clock clock;
    private final Map<String, Counter> counterNameToCounterMap;
    private final Map<String, String> customAttributesMap;
    private Timer endTime;
    private final GaugeManager gaugeManager;
    private final String name;
    private final Trace parent;
    private final WeakReference<SessionAwareObject> sessionAwareObject;
    private final List<PerfSession> sessions;
    private Timer startTime;
    private final List<Trace> subtraces;
    private final TransportManager transportManager;

    /* renamed from: com.google.firebase.perf.metrics.Trace$1 */
    class C11701 implements Parcelable.Creator<Trace> {
        C11701() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Trace createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Trace[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Trace createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Trace[] newArray(int i) {
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$2 */
    class C11712 implements Parcelable.Creator<Trace> {
        C11712() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Trace createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Trace[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Trace createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Trace[] newArray(int i) {
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, C11701 c11701) {
    }

    private void checkAttribute(String str, String str2) {
    }

    public static Trace create(String str) {
    }

    static synchronized Trace getTrace(String str) {
    }

    private Counter obtainOrCreateCounterByName(String str) {
    }

    private void setEndTimeOfLastStage(Timer timer) {
    }

    static Trace startTrace(String str) {
    }

    static Trace stopTrace(String str) {
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
    }

    protected void finalize() throws Throwable {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Keep
    public String getAttribute(String str) {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Keep
    public Map<String, String> getAttributes() {
    }

    @VisibleForTesting
    Map<String, Counter> getCounters() {
    }

    @VisibleForTesting
    Timer getEndTime() {
    }

    @Keep
    public long getLongMetric(String str) {
    }

    @VisibleForTesting
    String getName() {
    }

    @VisibleForTesting
    List<PerfSession> getSessions() {
    }

    @VisibleForTesting
    Timer getStartTime() {
    }

    @VisibleForTesting
    List<Trace> getSubtraces() {
    }

    @VisibleForTesting
    boolean hasStarted() {
    }

    @Keep
    public void incrementMetric(String str, long j) {
    }

    @VisibleForTesting
    boolean isActive() {
    }

    @VisibleForTesting
    boolean isStopped() {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Keep
    public void putAttribute(String str, String str2) {
    }

    @Keep
    public void putMetric(String str, long j) {
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Keep
    public void removeAttribute(String str) {
    }

    @Keep
    public void start() {
    }

    void startStage(String str) {
    }

    @Keep
    public void stop() {
    }

    void stopStage() {
    }

    @Override // com.google.firebase.perf.session.SessionAwareObject
    public void updateSession(PerfSession perfSession) {
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i) {
    }

    private Trace(String str) {
    }

    @VisibleForTesting
    static synchronized Trace getTrace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor) {
    }

    private Trace(Trace trace, String str, Timer timer, Timer timer2, List<Trace> list, Map<String, Counter> map, Map<String, String> map2) {
    }

    public Trace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor) {
    }

    public Trace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
    }

    private Trace(Parcel parcel, boolean z) {
    }
}
