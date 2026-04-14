package com.tencent.bugly.crashreport.crash.anr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TraceFileHelper {

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$a */
    public static class C1550a {

        /* renamed from: a */
        public long f619a;

        /* renamed from: b */
        public String f620b;

        /* renamed from: c */
        public long f621c;

        /* renamed from: d */
        public Map<String, String[]> f622d;
    }

    /* renamed from: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b */
    public interface InterfaceC1551b {
        /* renamed from: a */
        boolean mo354a(long j);

        /* renamed from: a */
        boolean mo355a(long j, long j2, String str);

        /* renamed from: a */
        boolean mo356a(String str, int i, String str2, String str3, boolean z);

        /* renamed from: a */
        boolean mo357a(String str, long j, long j2);
    }

    /* renamed from: a */
    protected static Object[] m352a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
    }

    /* renamed from: b */
    protected static String m353b(BufferedReader bufferedReader) throws IOException {
    }

    public static C1550a readFirstDumpInfo(String str, boolean z) {
    }

    public static C1550a readTargetDumpInfo(String str, String str2, boolean z) {
    }

    public static void readTraceFile(String str, InterfaceC1551b interfaceC1551b) {
    }

    /* renamed from: a */
    protected static String m351a(BufferedReader bufferedReader) throws IOException {
    }
}
