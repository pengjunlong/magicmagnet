package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CharEscaperBuilder {
    private final Map<Character, String> map;
    private int max;

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c, String str) {
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscapes(char[] cArr, String str) {
    }

    public char[][] toArray() {
    }

    public Escaper toEscaper() {
    }

    private static class CharArrayDecorator extends CharEscaper {
        private final int replaceLength;
        private final char[][] replacements;

        CharArrayDecorator(char[][] cArr) {
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
        }

        @Override // com.google.common.escape.CharEscaper
        protected char[] escape(char c) {
        }
    }
}
