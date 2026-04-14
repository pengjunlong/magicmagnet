package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class zzaq extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzaq> CREATOR = null;

    @SafeParcelable.Field(getter = "z", id = 2)
    private final Bundle zza;

    @SafeParcelable.Constructor
    zzaq(@SafeParcelable.Param(id = 2) Bundle bundle) {
    }

    static /* synthetic */ Bundle zzg(zzaq zzaqVar) {
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
    }

    public final String toString() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    final Object zza(String str) {
    }

    final Long zzb(String str) {
    }

    final Double zzc(String str) {
    }

    final String zzd(String str) {
    }

    public final int zze() {
    }

    public final Bundle zzf() {
    }
}
