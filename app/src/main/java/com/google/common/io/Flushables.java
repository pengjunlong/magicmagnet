package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Flushables {
    private static final Logger logger = null;

    private Flushables() {
    }

    public static void flush(Flushable flushable, boolean z) throws IOException {
    }

    public static void flushQuietly(Flushable flushable) {
    }
}
