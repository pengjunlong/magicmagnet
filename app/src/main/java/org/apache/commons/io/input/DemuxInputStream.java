package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DemuxInputStream extends InputStream {
    private final InheritableThreadLocal<InputStream> m_streams;

    public InputStream bindStream(InputStream inputStream) {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }
}
