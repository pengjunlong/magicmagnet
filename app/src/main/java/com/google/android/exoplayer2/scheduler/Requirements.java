package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = null;
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;

    /* renamed from: com.google.android.exoplayer2.scheduler.Requirements$1 */
    class C01581 implements Parcelable.Creator<Requirements> {
        C01581() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Requirements createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Requirements[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements[] newArray(int i) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i) {
    }

    private int getNotMetNetworkRequirements(Context context) {
    }

    private boolean isDeviceCharging(Context context) {
    }

    private boolean isDeviceIdle(Context context) {
    }

    private static boolean isInternetConnectivityValidated(ConnectivityManager connectivityManager) {
    }

    private boolean isStorageNotLow(Context context) {
    }

    public boolean checkRequirements(Context context) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public Requirements filterRequirements(int i) {
    }

    public int getNotMetRequirements(Context context) {
    }

    public int getRequirements() {
    }

    public int hashCode() {
    }

    public boolean isChargingRequired() {
    }

    public boolean isIdleRequired() {
    }

    public boolean isNetworkRequired() {
    }

    public boolean isStorageNotLowRequired() {
    }

    public boolean isUnmeteredNetworkRequired() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
