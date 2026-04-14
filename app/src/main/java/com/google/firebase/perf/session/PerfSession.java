package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = null;
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    /* renamed from: com.google.firebase.perf.session.PerfSession$1 */
    class C11721 implements Parcelable.Creator<PerfSession> {
        C11721() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PerfSession createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PerfSession[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PerfSession createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PerfSession[] newArray(int i) {
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, C11721 c11721) {
    }

    public static com.google.firebase.perf.v1.PerfSession[] buildAndSort(List<PerfSession> list) {
    }

    public static PerfSession create() {
    }

    public static boolean shouldCollectGaugesAndEvents() {
    }

    public com.google.firebase.perf.v1.PerfSession build() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public Timer getTimer() {
    }

    public boolean isExpired() {
    }

    public boolean isGaugeAndEventCollectionEnabled() {
    }

    public boolean isVerbose() {
    }

    public String sessionId() {
    }

    public void setGaugeAndEventCollectionEnabled(boolean z) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public PerfSession(String str, Clock clock) {
    }

    static boolean isVerbose(com.google.firebase.perf.v1.PerfSession perfSession) {
    }

    private PerfSession(Parcel parcel) {
    }
}
