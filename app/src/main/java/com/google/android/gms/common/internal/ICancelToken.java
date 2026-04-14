package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface ICancelToken extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zza implements ICancelToken {

        public static class zza extends com.google.android.gms.internal.common.zzb implements ICancelToken {
            zza(IBinder iBinder) {
            }

            @Override // com.google.android.gms.common.internal.ICancelToken
            public final void cancel() throws RemoteException {
            }
        }

        public static ICancelToken asInterface(IBinder iBinder) {
        }
    }

    void cancel() throws RemoteException;
}
