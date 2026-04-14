package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.C1543a;
import com.tencent.bugly.crashreport.common.strategy.C1548c;
import com.tencent.bugly.crashreport.crash.C1565e;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* renamed from: com.tencent.bugly.crashreport.crash.jni.b */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class C1574b implements NativeExceptionHandler {

    /* renamed from: a */
    private final Context f749a;

    /* renamed from: b */
    private final C1565e f750b;

    /* renamed from: c */
    private final C1543a f751c;

    /* renamed from: d */
    private final C1548c f752d;

    public C1574b(Context context, C1543a c1543a, C1565e c1565e, C1548c c1548c) {
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, int i3, String str5, int i4, int i5, int i6, String str6, String str7) {
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException2(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, int i3, String str5, int i4, int i5, int i6, String str6, String str7, String[] strArr) {
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public CrashDetailBean packageCrashDatas(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z, boolean z2) {
    }
}
