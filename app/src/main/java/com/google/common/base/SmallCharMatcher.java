package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CharMatcher;
import java.util.BitSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArr, long j, boolean z, String str) {
    }

    private boolean checkFilter(int i) {
    }

    @VisibleForTesting
    static int chooseTableSize(int i) {
    }

    static CharMatcher from(BitSet bitSet, String str) {
    }

    static int smear(int i) {
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c) {
    }

    @Override // com.google.common.base.CharMatcher
    void setBits(BitSet bitSet) {
    }
}
