package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepForSdk
@KeepName
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = null;
    private IBinder zza;

    public BinderWrapper() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    @KeepForSdk
    public BinderWrapper(IBinder iBinder) {
    }

    private BinderWrapper(Parcel parcel) {
    }

    /* synthetic */ BinderWrapper(Parcel parcel, zza zzaVar) {
    }
}
