package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
interface PatternCompiler {
    CommonPattern compile(String str);

    boolean isPcreLike();
}
