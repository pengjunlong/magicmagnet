package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class NetworkTypeObserver {
    private static NetworkTypeObserver staticInstance;
    private final CopyOnWriteArrayList<WeakReference<Listener>> listeners;
    private final Handler mainHandler;
    private int networkType;
    private final Object networkTypeLock;

    private static final class Api31 {

        private static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final NetworkTypeObserver instance;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            }
        }

        private Api31() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, NetworkTypeObserver networkTypeObserver) {
        }
    }

    public interface Listener {
        void onNetworkTypeChanged(int i);
    }

    private final class Receiver extends BroadcastReceiver {
        final /* synthetic */ NetworkTypeObserver this$0;

        private Receiver(NetworkTypeObserver networkTypeObserver) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ Receiver(NetworkTypeObserver networkTypeObserver, C02351 c02351) {
        }
    }

    private NetworkTypeObserver(Context context) {
    }

    static /* synthetic */ int access$100(Context context) {
    }

    static /* synthetic */ void access$200(NetworkTypeObserver networkTypeObserver, int i) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(NetworkTypeObserver networkTypeObserver, Listener listener) {
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
    }

    private static int getNetworkTypeFromConnectivityManager(Context context) {
    }

    private /* synthetic */ void lambda$register$0(Listener listener) {
    }

    private void removeClearedReferences() {
    }

    public static synchronized void resetForTests() {
    }

    private void updateNetworkType(int i) {
    }

    public int getNetworkType() {
    }

    public void register(Listener listener) {
    }
}
