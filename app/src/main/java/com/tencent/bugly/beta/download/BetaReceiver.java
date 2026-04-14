package com.tencent.bugly.beta.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BetaReceiver extends BroadcastReceiver {
    public static String CONNECTIVITY_CHANGE;
    public static ConcurrentHashMap<String, C1506d> netListeners;
    public static int netStatus;

    public static synchronized void addTask(DownloadTask downloadTask) {
    }

    @Override // android.content.BroadcastReceiver
    public synchronized void onReceive(Context context, Intent intent) {
    }
}
