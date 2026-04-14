package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.ServiceConfigurationError;
import java.util.logging.Logger;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Platform {
    private static final Logger logger = null;
    private static final PatternCompiler patternCompiler = null;

    private static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String str) {
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
        }

        /* synthetic */ JdkPatternCompiler(C06191 c06191) {
        }
    }

    private Platform() {
    }

    static void checkGwtRpcEnabled() {
    }

    static CommonPattern compilePattern(String str) {
    }

    static String emptyToNull(String str) {
    }

    static String formatCompact4Digits(double d) {
    }

    static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> cls, String str) {
    }

    private static PatternCompiler loadPatternCompiler() {
    }

    private static void logPatternCompilerError(ServiceConfigurationError serviceConfigurationError) {
    }

    static String nullToEmpty(String str) {
    }

    static boolean patternCompilerIsPcreLike() {
    }

    static CharMatcher precomputeCharMatcher(CharMatcher charMatcher) {
    }

    static boolean stringIsNullOrEmpty(String str) {
    }

    static long systemNanoTime() {
    }
}
