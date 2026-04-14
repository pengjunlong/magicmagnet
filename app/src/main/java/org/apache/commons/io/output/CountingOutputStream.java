package org.apache.commons.io.output;

import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CountingOutputStream extends ProxyOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream
    protected synchronized void beforeWrite(int i) {
    }

    public synchronized long getByteCount() {
    }

    public int getCount() {
    }

    public synchronized long resetByteCount() {
    }

    public int resetCount() {
    }
}
