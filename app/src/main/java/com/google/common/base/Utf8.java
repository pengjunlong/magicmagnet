package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
    }

    public static boolean isWellFormed(byte[] bArr) {
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i, int i2) {
    }

    private static String unpairedSurrogateMsg(int i) {
    }

    public static boolean isWellFormed(byte[] bArr, int i, int i2) {
    }
}
