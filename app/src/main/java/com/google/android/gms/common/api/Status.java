package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = null;

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_CANCELED = null;

    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = null;

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = null;

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = null;

    @ShowFirstParty
    @VisibleForTesting
    @KeepForSdk
    public static final Status RESULT_SUCCESS = null;

    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = null;

    @ShowFirstParty
    private static final Status zza = null;

    @SafeParcelable.VersionField(id = 1000)
    private final int zzb;

    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzc;

    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final String zzd;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zze;

    @SafeParcelable.Constructor
    @KeepForSdk
    Status(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
    }

    public final boolean equals(Object obj) {
    }

    public final PendingIntent getResolution() {
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public final Status getStatus() {
    }

    public final int getStatusCode() {
    }

    public final String getStatusMessage() {
    }

    @VisibleForTesting
    public final boolean hasResolution() {
    }

    public final int hashCode() {
    }

    public final boolean isCanceled() {
    }

    public final boolean isInterrupted() {
    }

    public final boolean isSuccess() {
    }

    public final void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
    }

    public final String toString() {
    }

    @Override // android.os.Parcelable
    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final String zza() {
    }

    @KeepForSdk
    public Status(int i) {
    }

    @KeepForSdk
    public Status(int i, String str) {
    }

    @KeepForSdk
    public Status(int i, String str, PendingIntent pendingIntent) {
    }
}
