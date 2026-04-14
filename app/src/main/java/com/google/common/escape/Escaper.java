package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Escaper {
    private final Function<String, String> asFunction;

    /* renamed from: com.google.common.escape.Escaper$1 */
    class C08591 implements Function<String, String> {
        final /* synthetic */ Escaper this$0;

        C08591(Escaper escaper) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(String str) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public String apply2(String str) {
        }
    }

    protected Escaper() {
    }

    public final Function<String, String> asFunction() {
    }

    public abstract String escape(String str);
}
