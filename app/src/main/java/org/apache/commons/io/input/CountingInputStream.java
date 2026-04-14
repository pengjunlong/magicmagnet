package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CountingInputStream extends ProxyInputStream {
    private long count;

    public CountingInputStream(InputStream inputStream) {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected synchronized void afterRead(int i) {
    }

    public synchronized long getByteCount() {
    }

    public int getCount() {
    }

    public synchronized long resetByteCount() {
    }

    public int resetCount() {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
    }
}
