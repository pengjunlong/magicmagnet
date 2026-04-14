package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = null;

    @SafeParcelable.Field(id = 4)
    String zza;

    @SafeParcelable.Field(id = 5)
    IBinder zzb;

    @SafeParcelable.Field(id = 6)
    Scope[] zzc;

    @SafeParcelable.Field(id = 7)
    Bundle zzd;

    @SafeParcelable.Field(id = 8)
    Account zze;

    @SafeParcelable.Field(id = 10)
    Feature[] zzf;

    @SafeParcelable.Field(id = 11)
    Feature[] zzg;

    @SafeParcelable.VersionField(id = 1)
    private final int zzh;

    @SafeParcelable.Field(id = 2)
    private final int zzi;

    @SafeParcelable.Field(id = 3)
    private int zzj;

    @SafeParcelable.Field(id = 12)
    private boolean zzk;

    @SafeParcelable.Field(defaultValue = "0", id = 13)
    private int zzl;

    public GetServiceRequest(int i) {
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4) {
    }
}
