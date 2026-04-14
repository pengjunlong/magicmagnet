package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    protected UnicodeEscaper() {
    }

    protected static int codePointAt(CharSequence charSequence, int i, int i2) {
    }

    private static char[] growBuffer(char[] cArr, int i, int i2) {
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
    }

    protected abstract char[] escape(int i);

    protected final String escapeSlow(String str, int i) {
    }

    protected int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
    }
}
