package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BuglyBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static BuglyBroadcastReceiver f562a;

    /* renamed from: b */
    private IntentFilter f563b;

    /* renamed from: c */
    private Context f564c;

    /* renamed from: d */
    private String f565d;

    /* renamed from: e */
    private boolean f566e;

    /* renamed from: a */
    static /* synthetic */ BuglyBroadcastReceiver m347a() {
    }

    /* renamed from: b */
    static /* synthetic */ Context m348b(BuglyBroadcastReceiver buglyBroadcastReceiver) {
    }

    public static synchronized BuglyBroadcastReceiver getInstance() {
    }

    public synchronized void addFilter(String str) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
    }

    public synchronized void register(Context context) {
    }

    public synchronized void unregister(Context context) {
    }

    /* renamed from: a */
    static /* synthetic */ IntentFilter m346a(BuglyBroadcastReceiver buglyBroadcastReceiver) {
    }

    /* renamed from: a */
    protected final synchronized boolean m349a(Context context, Intent intent) {
    }
}
