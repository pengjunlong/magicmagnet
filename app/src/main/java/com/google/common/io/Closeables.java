package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Closeables {

    @VisibleForTesting
    static final Logger logger = null;

    private Closeables() {
    }

    public static void close(Closeable closeable, boolean z) throws IOException {
    }

    public static void closeQuietly(InputStream inputStream) {
    }

    public static void closeQuietly(Reader reader) {
    }
}
