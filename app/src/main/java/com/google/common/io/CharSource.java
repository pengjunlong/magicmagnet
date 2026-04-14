package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class CharSource {

    private final class AsByteSource extends ByteSource {
        final Charset charset;
        final /* synthetic */ CharSource this$0;

        AsByteSource(CharSource charSource, Charset charset) {
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }

        public String toString() {
        }
    }

    private static class CharSequenceCharSource extends CharSource {
        private static final Splitter LINE_SPLITTER = null;
        protected final CharSequence seq;

        /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1 */
        class C09391 extends AbstractIterator<String> {
            Iterator<String> lines;
            final /* synthetic */ CharSequenceCharSource this$0;

            C09391(CharSequenceCharSource charSequenceCharSource) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ String computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: computeNext, reason: avoid collision after fix types in other method */
            protected String computeNext2() {
            }
        }

        protected CharSequenceCharSource(CharSequence charSequence) {
        }

        static /* synthetic */ Splitter access$100() {
        }

        private Iterator<String> linesIterator() {
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
        }

        @Override // com.google.common.io.CharSource
        public long length() {
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() {
        }

        @Override // com.google.common.io.CharSource
        public String read() {
        }

        @Override // com.google.common.io.CharSource
        public String readFirstLine() {
        }

        @Override // com.google.common.io.CharSource
        public ImmutableList<String> readLines() {
        }

        public String toString() {
        }

        @Override // com.google.common.io.CharSource
        @ParametricNullness
        public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
        }
    }

    private static final class ConcatenatedCharSource extends CharSource {
        private final Iterable<? extends CharSource> sources;

        ConcatenatedCharSource(Iterable<? extends CharSource> iterable) {
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws IOException {
        }

        @Override // com.google.common.io.CharSource
        public long length() throws IOException {
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
        }

        public String toString() {
        }
    }

    private static final class EmptyCharSource extends StringCharSource {
        private static final EmptyCharSource INSTANCE = null;

        private EmptyCharSource() {
        }

        static /* synthetic */ EmptyCharSource access$000() {
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public String toString() {
        }
    }

    protected CharSource() {
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
    }

    private long countBySkipping(Reader reader) throws IOException {
    }

    public static CharSource empty() {
    }

    public static CharSource wrap(CharSequence charSequence) {
    }

    @Beta
    public ByteSource asByteSource(Charset charset) {
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws IOException {
    }

    public boolean isEmpty() throws IOException {
    }

    @Beta
    public long length() throws IOException {
    }

    @Beta
    public Optional<Long> lengthIfKnown() {
    }

    public BufferedReader openBufferedStream() throws IOException {
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws IOException {
    }

    public String readFirstLine() throws IOException {
    }

    public ImmutableList<String> readLines() throws IOException {
    }

    private static class StringCharSource extends CharSequenceCharSource {
        protected StringCharSource(String str) {
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.io.CharSource
        public Reader openStream() {
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(CharSink charSink) throws IOException {
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
    }

    public static CharSource concat(CharSource... charSourceArr) {
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws IOException {
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
    }
}
