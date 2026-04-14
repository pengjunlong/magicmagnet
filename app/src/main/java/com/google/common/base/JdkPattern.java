package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class JdkPattern extends CommonPattern implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    private static final class JdkMatcher extends CommonMatcher {
        final Matcher matcher;

        JdkMatcher(Matcher matcher) {
        }

        @Override // com.google.common.base.CommonMatcher
        public int end() {
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find() {
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean matches() {
        }

        @Override // com.google.common.base.CommonMatcher
        public String replaceAll(String str) {
        }

        @Override // com.google.common.base.CommonMatcher
        public int start() {
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find(int i) {
        }
    }

    JdkPattern(Pattern pattern) {
    }

    @Override // com.google.common.base.CommonPattern
    public int flags() {
    }

    @Override // com.google.common.base.CommonPattern
    public CommonMatcher matcher(CharSequence charSequence) {
    }

    @Override // com.google.common.base.CommonPattern
    public String pattern() {
    }

    @Override // com.google.common.base.CommonPattern
    public String toString() {
    }
}
