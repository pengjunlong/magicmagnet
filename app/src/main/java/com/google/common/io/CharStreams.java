package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.List;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    private static final class NullWriter extends Writer {
        private static final NullWriter INSTANCE = null;

        private NullWriter() {
        }

        static /* synthetic */ NullWriter access$000() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
        }

        @Override // java.io.Writer
        public void write(int i) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        }

        @Override // java.io.Writer
        public void write(String str) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i, int i2) {
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
        }
    }

    private CharStreams() {
    }

    @Beta
    public static Writer asWriter(Appendable appendable) {
    }

    @CanIgnoreReturnValue
    public static long copy(Readable readable, Appendable appendable) throws IOException {
    }

    @CanIgnoreReturnValue
    static long copyReaderToBuilder(Reader reader, StringBuilder sb) throws IOException {
    }

    @CanIgnoreReturnValue
    static long copyReaderToWriter(Reader reader, Writer writer) throws IOException {
    }

    static CharBuffer createBuffer() {
    }

    @CanIgnoreReturnValue
    @Beta
    public static long exhaust(Readable readable) throws IOException {
    }

    @Beta
    public static Writer nullWriter() {
    }

    @Beta
    public static List<String> readLines(Readable readable) throws IOException {
    }

    @Beta
    public static void skipFully(Reader reader, long j) throws IOException {
    }

    public static String toString(Readable readable) throws IOException {
    }

    private static StringBuilder toStringBuilder(Readable readable) throws IOException {
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readLines(Readable readable, LineProcessor<T> lineProcessor) throws IOException {
    }
}
