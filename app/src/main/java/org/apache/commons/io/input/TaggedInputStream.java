package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TaggedInputStream extends ProxyInputStream {
    private final Serializable tag;

    public TaggedInputStream(InputStream inputStream) {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected void handleIOException(IOException iOException) throws IOException {
    }

    public boolean isCauseOf(Throwable th) {
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
    }
}
