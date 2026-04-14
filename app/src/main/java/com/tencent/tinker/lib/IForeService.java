package com.tencent.tinker.lib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface IForeService extends IInterface {

    public static abstract class Stub extends Binder implements IForeService {
        private static final String DESCRIPTOR = "com.tencent.tinker.lib.IForeService";
        static final int TRANSACTION_startme = 1;

        private static class Proxy implements IForeService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
            }

            public String getInterfaceDescriptor() {
            }

            @Override // com.tencent.tinker.lib.IForeService
            public void startme() throws RemoteException {
            }
        }

        public static IForeService asInterface(IBinder iBinder) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        }
    }

    void startme() throws RemoteException;
}
