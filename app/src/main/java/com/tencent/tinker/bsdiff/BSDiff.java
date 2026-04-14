package com.tencent.tinker.bsdiff;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BSDiff {
    private static final byte[] MAGIC_BYTES = null;

    /* renamed from: com.tencent.tinker.bsdiff.BSDiff$1EmuStackFrame, reason: invalid class name */
    class C1EmuStackFrame {

        /* renamed from: h */
        int f1144h;

        /* renamed from: i */
        int f1145i;

        /* renamed from: j */
        int f1146j;
        int jj;

        /* renamed from: k */
        int f1147k;
        int kk;
        int len;
        int start;
        int stmRetLabel;

        /* renamed from: x */
        int f1148x;

        C1EmuStackFrame(int i, int i2, int i3, int i4) {
        }
    }

    private static class IntByRef {
        private int value;

        private IntByRef() {
        }

        static /* synthetic */ int access$000(IntByRef intByRef) {
        }

        static /* synthetic */ int access$002(IntByRef intByRef, int i) {
        }

        /* synthetic */ IntByRef(C16361 c16361) {
        }
    }

    public static void bsdiff(File file, File file2, File file3) throws IOException {
    }

    public static void main(String[] strArr) throws IOException {
    }

    private static int matchlen(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
    }

    private static int memcmp(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
    }

    private static void qsufsort(int[] iArr, int[] iArr2, byte[] bArr, int i) {
    }

    private static int search(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, IntByRef intByRef) {
    }

    private static void split(int[] iArr, int[] iArr2, int i, int i2, int i3) {
    }

    public static byte[] bsdiff(InputStream inputStream, int i, InputStream inputStream2, int i2) throws IOException {
    }

    public static byte[] bsdiff(byte[] bArr, int i, byte[] bArr2, int i2) throws IOException {
    }
}
