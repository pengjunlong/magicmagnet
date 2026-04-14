package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = null;
    private long highResTime;
    private long timeInMicros;

    /* renamed from: com.google.firebase.perf.util.Timer$1 */
    class C11801 implements Parcelable.Creator<Timer> {
        C11801() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Timer createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Timer[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer[] newArray(int i) {
        }
    }

    /* synthetic */ Timer(Parcel parcel, C11801 c11801) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public long getCurrentTimestampMicros() {
    }

    public long getDurationMicros() {
    }

    @VisibleForTesting
    public long getHighResTime() {
    }

    public long getMicros() {
    }

    public void reset() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public Timer() {
    }

    public long getDurationMicros(Timer timer) {
    }

    @VisibleForTesting
    public Timer(long j) {
    }

    @VisibleForTesting
    public Timer(long j, long j2) {
    }

    private Timer(Parcel parcel) {
    }
}
