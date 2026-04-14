package com.tencent.bugly;

import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CrashModule extends AbstractC1500a {
    public static final int MODULE_ID = 1004;

    /* renamed from: a */
    private static int f231a;

    /* renamed from: b */
    private static CrashModule f232b;

    /* renamed from: c */
    private long f233c;

    /* renamed from: d */
    private BuglyStrategy.C1499a f234d;

    /* renamed from: e */
    private boolean f235e;

    /* renamed from: a */
    private synchronized void m61a(Context context, BuglyStrategy buglyStrategy) {
    }

    public static CrashModule getInstance() {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public String[] getTables() {
    }

    public synchronized boolean hasInitialized() {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
    }

    @Override // com.tencent.bugly.AbstractC1500a
    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
