package com.tencent.tinker.lib.listener;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DefaultPatchListener implements PatchListener {
    private ServiceConnection connection;
    protected final Context context;

    /* renamed from: com.tencent.tinker.lib.listener.DefaultPatchListener$1 */
    class ServiceConnectionC16421 implements ServiceConnection {
        final /* synthetic */ DefaultPatchListener this$0;

        ServiceConnectionC16421(DefaultPatchListener defaultPatchListener) {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public DefaultPatchListener(Context context) {
    }

    static /* synthetic */ ServiceConnection access$000(DefaultPatchListener defaultPatchListener) {
    }

    private void runForgService() {
    }

    @Override // com.tencent.tinker.lib.listener.PatchListener
    public int onPatchReceived(String str) {
    }

    protected int patchCheck(String str, String str2) {
    }
}
