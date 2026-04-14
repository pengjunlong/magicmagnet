package com.tencent.bugly.proguard;

import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.download.InterfaceC1505c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.tencent.bugly.proguard.v */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class C1627v implements InterfaceC1505c {

    /* renamed from: a */
    public static C1627v f1104a;

    /* renamed from: b */
    public ConcurrentHashMap<String, DownloadTask> f1105b;

    /* renamed from: c */
    private ScheduledExecutorService f1106c;

    @Override // com.tencent.bugly.beta.download.InterfaceC1505c
    /* renamed from: a */
    public DownloadTask mo69a(String str, String str2, String str3, String str4) {
    }

    /* renamed from: a */
    public synchronized boolean m826a(Runnable runnable) {
    }
}
