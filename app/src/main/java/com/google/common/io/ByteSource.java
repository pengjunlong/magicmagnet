package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Optional;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ByteSource {

    class AsCharSource extends CharSource {
        final Charset charset;
        final /* synthetic */ ByteSource this$0;

        AsCharSource(ByteSource byteSource, Charset charset) {
        }

        @Override // com.google.common.io.CharSource
        public ByteSource asByteSource(Charset charset) {
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
        }

        @Override // com.google.common.io.CharSource
        public String read() throws IOException {
        }

        public String toString() {
        }
    }

    private static class ByteArrayByteSource extends ByteSource {
        final byte[] bytes;
        final int length;
        final int offset;

        ByteArrayByteSource(byte[] bArr) {
        }

        @Override // com.google.common.io.ByteSource
        public long copyTo(OutputStream outputStream) throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public HashCode hash(HashFunction hashFunction) throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openBufferedStream() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() {
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() {
        }

        @Override // com.google.common.io.ByteSource
        public long size() {
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
        }

        @Override // com.google.common.io.ByteSource
        public ByteSource slice(long j, long j2) {
        }

        public String toString() {
        }

        ByteArrayByteSource(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.common.io.ByteSource
        @ParametricNullness
        public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
        }
    }

    private static final class ConcatenatedByteSource extends ByteSource {
        final Iterable<? extends ByteSource> sources;

        ConcatenatedByteSource(Iterable<? extends ByteSource> iterable) {
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
        }

        public String toString() {
        }
    }

    private static final class EmptyByteSource extends ByteArrayByteSource {
        static final EmptyByteSource INSTANCE = null;

        EmptyByteSource() {
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.io.ByteSource
        public byte[] read() {
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public String toString() {
        }
    }

    private final class SlicedByteSource extends ByteSource {
        final long length;
        final long offset;
        final /* synthetic */ ByteSource this$0;

        SlicedByteSource(ByteSource byteSource, long j, long j2) {
        }

        private InputStream sliceStream(InputStream inputStream) throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openBufferedStream() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
        }

        @Override // com.google.common.io.ByteSource
        public ByteSource slice(long j, long j2) {
        }

        public String toString() {
        }
    }

    protected ByteSource() {
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
    }

    private long countBySkipping(InputStream inputStream) throws IOException {
    }

    public static ByteSource empty() {
    }

    public static ByteSource wrap(byte[] bArr) {
    }

    public CharSource asCharSource(Charset charset) {
    }

    public boolean contentEquals(ByteSource byteSource) throws IOException {
    }

    @CanIgnoreReturnValue
    public long copyTo(OutputStream outputStream) throws IOException {
    }

    public HashCode hash(HashFunction hashFunction) throws IOException {
    }

    public boolean isEmpty() throws IOException {
    }

    public InputStream openBufferedStream() throws IOException {
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws IOException {
    }

    public long size() throws IOException {
    }

    @Beta
    public Optional<Long> sizeIfKnown() {
    }

    public ByteSource slice(long j, long j2) {
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
    }

    @CanIgnoreReturnValue
    public long copyTo(ByteSink byteSink) throws IOException {
    }

    @CanIgnoreReturnValue
    @Beta
    public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
    }
}
