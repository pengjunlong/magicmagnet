package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.C1543a;
import com.tencent.bugly.crashreport.common.strategy.C1548c;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.lang.Thread;

/* renamed from: com.tencent.bugly.crashreport.crash.l */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class C1577l implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static String f759a;

    /* renamed from: b */
    private static final Object f760b = null;

    /* renamed from: c */
    protected final Context f761c;

    /* renamed from: d */
    protected final C1565e f762d;

    /* renamed from: e */
    protected final C1548c f763e;

    /* renamed from: f */
    protected final C1543a f764f;

    /* renamed from: g */
    protected Thread.UncaughtExceptionHandler f765g;

    /* renamed from: h */
    protected Thread.UncaughtExceptionHandler f766h;

    /* renamed from: i */
    protected boolean f767i;

    /* renamed from: j */
    private int f768j;

    public C1577l(Context context, C1565e c1565e, C1548c c1548c, C1543a c1543a) {
    }

    /* renamed from: a */
    public synchronized void m489a() {
    }

    /* renamed from: b */
    public synchronized void m492b() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }

    /* renamed from: b */
    public void m493b(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
    }

    /* renamed from: a */
    protected void m491a(Thread thread, Throwable th) {
    }

    /* renamed from: a */
    public CrashDetailBean m488a(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
    }

    /* renamed from: a */
    private boolean m486a(Thread thread) {
    }

    /* renamed from: a */
    private boolean m485a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    /* renamed from: b */
    public static String m487b(Throwable th, int i) {
    }

    /* renamed from: a */
    public synchronized void m490a(StrategyBean strategyBean) {
    }

    /* renamed from: a */
    public static String m484a(Throwable th, int i) {
    }
}
