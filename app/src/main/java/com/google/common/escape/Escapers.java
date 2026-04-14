package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Escapers {
    private static final Escaper NULL_ESCAPER = null;

    /* renamed from: com.google.common.escape.Escapers$1 */
    class C08601 extends CharEscaper {
        C08601() {
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
        }

        @Override // com.google.common.escape.CharEscaper
        protected char[] escape(char c) {
        }
    }

    /* renamed from: com.google.common.escape.Escapers$2 */
    class C08612 extends UnicodeEscaper {
        final /* synthetic */ CharEscaper val$escaper;

        C08612(CharEscaper charEscaper) {
        }

        @Override // com.google.common.escape.UnicodeEscaper
        protected char[] escape(int i) {
        }
    }

    @Beta
    public static final class Builder {
        private final Map<Character, String> replacementMap;
        private char safeMax;
        private char safeMin;
        private String unsafeReplacement;

        /* renamed from: com.google.common.escape.Escapers$Builder$1 */
        class C08621 extends ArrayBasedCharEscaper {
            private final char[] replacementChars;
            final /* synthetic */ Builder this$0;

            C08621(Builder builder, Map map, char c, char c2) {
            }

            @Override // com.google.common.escape.ArrayBasedCharEscaper
            protected char[] escapeUnsafe(char c) {
            }
        }

        /* synthetic */ Builder(C08601 c08601) {
        }

        static /* synthetic */ String access$100(Builder builder) {
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String str) {
        }

        public Escaper build() {
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c, char c2) {
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
        }

        private Builder() {
        }
    }

    private Escapers() {
    }

    static UnicodeEscaper asUnicodeEscaper(Escaper escaper) {
    }

    public static Builder builder() {
    }

    public static String computeReplacement(CharEscaper charEscaper, char c) {
    }

    public static Escaper nullEscaper() {
    }

    private static String stringOrNull(char[] cArr) {
    }

    private static UnicodeEscaper wrap(CharEscaper charEscaper) {
    }

    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i) {
    }
}
