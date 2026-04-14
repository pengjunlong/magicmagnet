package com.tencent.tinker.lib.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.tinker.lib.IForeService;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerPatchForeService extends Service {

    /* renamed from: com.tencent.tinker.lib.service.TinkerPatchForeService$1 */
    class BinderC16441 extends IForeService.Stub {
        final /* synthetic */ TinkerPatchForeService this$0;

        BinderC16441(TinkerPatchForeService tinkerPatchForeService) {
        }

        @Override // com.tencent.tinker.lib.IForeService
        public void startme() throws RemoteException {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }
}
