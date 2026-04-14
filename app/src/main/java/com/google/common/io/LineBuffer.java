package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class LineBuffer {
    private StringBuilder line;
    private boolean sawReturn;

    LineBuffer() {
    }

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z) throws IOException {
    }

    protected void add(char[] cArr, int i, int i2) throws IOException {
    }

    protected void finish() throws IOException {
    }

    protected abstract void handleLine(String str, String str2) throws IOException;
}
