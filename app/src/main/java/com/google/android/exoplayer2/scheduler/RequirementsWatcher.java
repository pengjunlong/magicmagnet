package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RequirementsWatcher {
    private final Context context;
    private final Handler handler;
    private final Listener listener;
    private NetworkCallback networkCallback;
    private int notMetRequirements;
    private DeviceStatusChangeReceiver receiver;
    private final Requirements requirements;

    private class DeviceStatusChangeReceiver extends BroadcastReceiver {
        final /* synthetic */ RequirementsWatcher this$0;

        private DeviceStatusChangeReceiver(RequirementsWatcher requirementsWatcher) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ DeviceStatusChangeReceiver(RequirementsWatcher requirementsWatcher, C01591 c01591) {
        }
    }

    public interface Listener {
        void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class NetworkCallback extends ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;
        final /* synthetic */ RequirementsWatcher this$0;

        private NetworkCallback(RequirementsWatcher requirementsWatcher) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(NetworkCallback networkCallback) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(NetworkCallback networkCallback) {
        }

        private /* synthetic */ void lambda$postCheckRequirements$0() {
        }

        private /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
        }

        private void postCheckRequirements() {
        }

        private void postRecheckNotMetNetworkRequirements() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
        }

        /* synthetic */ NetworkCallback(RequirementsWatcher requirementsWatcher, C01591 c01591) {
        }
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
    }

    static /* synthetic */ void access$200(RequirementsWatcher requirementsWatcher) {
    }

    static /* synthetic */ Handler access$300(RequirementsWatcher requirementsWatcher) {
    }

    static /* synthetic */ NetworkCallback access$400(RequirementsWatcher requirementsWatcher) {
    }

    static /* synthetic */ void access$500(RequirementsWatcher requirementsWatcher) {
    }

    private void checkRequirements() {
    }

    private void recheckNotMetNetworkRequirements() {
    }

    private void registerNetworkCallbackV24() {
    }

    private void unregisterNetworkCallbackV24() {
    }

    public Requirements getRequirements() {
    }

    public int start() {
    }

    public void stop() {
    }
}
