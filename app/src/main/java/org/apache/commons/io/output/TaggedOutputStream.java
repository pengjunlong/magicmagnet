package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TaggedOutputStream extends ProxyOutputStream {
    private final Serializable tag;

    public TaggedOutputStream(OutputStream outputStream) {
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    protected void handleIOException(IOException iOException) throws IOException {
    }

    public boolean isCauseOf(Exception exc) {
    }

    public void throwIfCauseOf(Exception exc) throws IOException {
    }
}
