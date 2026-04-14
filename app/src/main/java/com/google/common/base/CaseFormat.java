package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES = null;
    public static final CaseFormat LOWER_CAMEL = null;
    public static final CaseFormat LOWER_HYPHEN = null;
    public static final CaseFormat LOWER_UNDERSCORE = null;
    public static final CaseFormat UPPER_CAMEL = null;
    public static final CaseFormat UPPER_UNDERSCORE = null;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    /* renamed from: com.google.common.base.CaseFormat$1 */
    enum C06051 extends CaseFormat {
        C06051(String str, int i, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$2 */
    enum C06062 extends CaseFormat {
        C06062(String str, int i, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$3 */
    enum C06073 extends CaseFormat {
        C06073(String str, int i, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeFirstWord(String str) {
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$4 */
    enum C06084 extends CaseFormat {
        C06084(String str, int i, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
        }
    }

    /* renamed from: com.google.common.base.CaseFormat$5 */
    enum C06095 extends CaseFormat {
        C06095(String str, int i, CharMatcher charMatcher, String str2) {
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
        }
    }

    private static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(String str) {
        }

        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doForward(String str) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        protected String doBackward2(String str) {
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        protected String doForward2(String str) {
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
    }

    /* synthetic */ CaseFormat(String str, int i, CharMatcher charMatcher, String str2, C06051 c06051) {
    }

    static /* synthetic */ String access$100(String str) {
    }

    private static String firstCharOnlyToUpper(String str) {
    }

    public static CaseFormat valueOf(String str) {
    }

    public static CaseFormat[] values() {
    }

    String convert(CaseFormat caseFormat, String str) {
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
    }

    String normalizeFirstWord(String str) {
    }

    abstract String normalizeWord(String str);

    public final String to(CaseFormat caseFormat, String str) {
    }

    private CaseFormat(String str, int i, CharMatcher charMatcher, String str2) {
    }
}
