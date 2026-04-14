package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Map;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY = null;
    private final char[][] replacementArray;

    private ArrayBasedEscaperMap(char[][] cArr) {
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> map) {
    }

    @VisibleForTesting
    static char[][] createReplacementArray(Map<Character, String> map) {
    }

    char[][] getReplacementArray() {
    }
}
