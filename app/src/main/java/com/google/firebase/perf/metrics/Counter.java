package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = null;
    private final AtomicLong count;
    private final String name;

    /* renamed from: com.google.firebase.perf.metrics.Counter$1 */
    class C11691 implements Parcelable.Creator<Counter> {
        C11691() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Counter createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Counter[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Counter createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Counter[] newArray(int i) {
        }
    }

    /* synthetic */ Counter(Parcel parcel, C11691 c11691) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    long getCount() {
    }

    String getName() {
    }

    public void increment(long j) {
    }

    void setCount(long j) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public Counter(String str) {
    }

    private Counter(Parcel parcel) {
    }
}
