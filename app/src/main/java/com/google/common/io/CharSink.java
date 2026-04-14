package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class CharSink {
    protected CharSink() {
    }

    public Writer openBufferedStream() throws IOException {
    }

    public abstract Writer openStream() throws IOException;

    public void write(CharSequence charSequence) throws IOException {
    }

    @CanIgnoreReturnValue
    public long writeFrom(Readable readable) throws IOException {
    }

    public void writeLines(Iterable<? extends CharSequence> iterable) throws IOException {
    }

    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws IOException {
    }
}
