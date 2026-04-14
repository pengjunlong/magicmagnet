package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ByteSink {

    private final class AsCharSink extends CharSink {
        private final Charset charset;
        final /* synthetic */ ByteSink this$0;

        /* synthetic */ AsCharSink(ByteSink byteSink, Charset charset, C09371 c09371) {
        }

        @Override // com.google.common.io.CharSink
        public Writer openStream() throws IOException {
        }

        public String toString() {
        }

        private AsCharSink(ByteSink byteSink, Charset charset) {
        }
    }

    protected ByteSink() {
    }

    public CharSink asCharSink(Charset charset) {
    }

    public OutputStream openBufferedStream() throws IOException {
    }

    public abstract OutputStream openStream() throws IOException;

    public void write(byte[] bArr) throws IOException {
    }

    @CanIgnoreReturnValue
    public long writeFrom(InputStream inputStream) throws IOException {
    }
}
