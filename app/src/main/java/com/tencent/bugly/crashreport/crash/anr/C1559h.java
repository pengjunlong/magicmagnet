package com.tencent.bugly.crashreport.crash.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.C1543a;
import com.tencent.bugly.crashreport.common.strategy.C1548c;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.C1565e;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C1589J;
import com.tencent.bugly.proguard.C1601W;
import com.tencent.bugly.proguard.da;
import com.tencent.bugly.proguard.ea;
import com.tencent.bugly.proguard.fa;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.bugly.crashreport.crash.anr.h */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class C1559h implements fa {

    /* renamed from: a */
    private static C1559h f637a;

    /* renamed from: b */
    private AtomicInteger f638b;

    /* renamed from: c */
    private long f639c;

    /* renamed from: d */
    private final Context f640d;

    /* renamed from: e */
    private final C1543a f641e;

    /* renamed from: f */
    private final C1601W f642f;

    /* renamed from: g */
    private final C1548c f643g;

    /* renamed from: h */
    private String f644h;

    /* renamed from: i */
    private final C1565e f645i;

    /* renamed from: j */
    private FileObserver f646j;

    /* renamed from: k */
    private boolean f647k;

    /* renamed from: l */
    private ea f648l;

    /* renamed from: m */
    private int f649m;

    /* renamed from: n */
    private ActivityManager.ProcessErrorStateInfo f650n;

    private C1559h(Context context, C1548c c1548c, C1543a c1543a, C1601W c1601w, C1589J c1589j, C1565e c1565e, BuglyStrategy.C1499a c1499a) {
    }

    /* renamed from: a */
    static /* synthetic */ C1601W m359a(C1559h c1559h) {
    }

    /* renamed from: b */
    static /* synthetic */ ea m361b(C1559h c1559h) {
    }

    /* renamed from: h */
    private boolean m364h() {
    }

    /* renamed from: i */
    private synchronized void m365i() {
    }

    /* renamed from: j */
    private boolean m366j() {
    }

    /* renamed from: k */
    private synchronized void m367k() {
    }

    /* renamed from: l */
    private File m368l() {
    }

    /* renamed from: c */
    public synchronized boolean m381c() {
    }

    /* renamed from: d */
    protected void m382d() {
    }

    /* renamed from: e */
    protected synchronized void m383e() {
    }

    /* renamed from: f */
    protected synchronized void m384f() {
    }

    /* renamed from: g */
    public void m385g() {
    }

    /* renamed from: a */
    static /* synthetic */ boolean m360a(C1559h c1559h, String str) {
    }

    /* renamed from: c */
    private synchronized void m363c(boolean z) {
    }

    /* renamed from: b */
    public boolean m380b() {
    }

    /* renamed from: a */
    public static C1559h m358a(Context context, C1548c c1548c, C1543a c1543a, C1601W c1601w, C1589J c1589j, C1565e c1565e, BuglyStrategy.C1499a c1499a) {
    }

    /* renamed from: b */
    public void m379b(boolean z) {
    }

    /* renamed from: a */
    protected ActivityManager.ProcessErrorStateInfo m369a(Context context, long j) {
    }

    /* renamed from: b */
    private boolean m362b(String str) {
    }

    /* renamed from: a */
    protected C1552a m371a(Context context, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j, Map<String, String> map) {
    }

    /* renamed from: a */
    protected CrashDetailBean m370a(C1552a c1552a) {
    }

    /* renamed from: a */
    protected boolean m378a(String str, String str2, String str3) {
    }

    /* renamed from: a */
    public boolean m376a(Context context, String str, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j, Map<String, String> map) {
    }

    /* renamed from: a */
    public final void m373a(String str) {
    }

    /* renamed from: a */
    protected synchronized boolean m375a() {
    }

    /* renamed from: a */
    protected synchronized void m374a(boolean z) {
    }

    /* renamed from: a */
    public synchronized void m372a(StrategyBean strategyBean) {
    }

    @Override // com.tencent.bugly.proguard.fa
    /* renamed from: a */
    public boolean mo377a(da daVar) {
    }
}
