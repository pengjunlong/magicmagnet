package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import java.util.Deque;

@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class TrieParser {
    private static final Joiner PREFIX_JOINER = null;

    TrieParser() {
    }

    private static int doParseTrieToBuilder(Deque<CharSequence> deque, CharSequence charSequence, int i, ImmutableMap.Builder<String, PublicSuffixType> builder) {
    }

    static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence charSequence) {
    }

    private static CharSequence reverse(CharSequence charSequence) {
    }
}
