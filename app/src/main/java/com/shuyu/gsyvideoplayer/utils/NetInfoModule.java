package com.shuyu.gsyvideoplayer.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NetInfoModule {
    private static final String CONNECTION_TYPE_NONE = "NONE";
    private static final String CONNECTION_TYPE_UNKNOWN = "UNKNOWN";
    private static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    private static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    private String mConnectivity;
    private final ConnectivityBroadcastReceiver mConnectivityBroadcastReceiver;
    private final ConnectivityManager mConnectivityManager;
    private Context mContext;
    private NetChangeListener mNetChangeListener;
    private boolean mNoNetworkPermission;

    public interface NetChangeListener {
        void changed(String str);
    }

    public NetInfoModule(Context context, NetChangeListener netChangeListener) {
    }

    static /* synthetic */ void access$100(NetInfoModule netInfoModule) {
    }

    private void registerReceiver() {
    }

    private void sendConnectivityChangedEvent() {
    }

    private void unregisterReceiver() {
    }

    private void updateAndSendConnectionType() {
    }

    public String getCurrentConnectionType() {
    }

    public String getCurrentConnectivity() {
    }

    public boolean isConnectionMetered() {
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    private class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;
        final /* synthetic */ NetInfoModule this$0;

        private ConnectivityBroadcastReceiver(NetInfoModule netInfoModule) {
        }

        public boolean isRegistered() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public void setRegistered(boolean z) {
        }

        /* synthetic */ ConnectivityBroadcastReceiver(NetInfoModule netInfoModule, C14751 c14751) {
        }
    }
}
