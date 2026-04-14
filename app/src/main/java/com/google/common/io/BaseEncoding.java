package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class BaseEncoding {
    private static final BaseEncoding BASE16 = null;
    private static final BaseEncoding BASE32 = null;
    private static final BaseEncoding BASE32_HEX = null;
    private static final BaseEncoding BASE64 = null;
    private static final BaseEncoding BASE64_URL = null;

    /* renamed from: com.google.common.io.BaseEncoding$1 */
    class C09301 extends ByteSink {
        final /* synthetic */ BaseEncoding this$0;
        final /* synthetic */ CharSink val$encodedSink;

        C09301(BaseEncoding baseEncoding, CharSink charSink) {
        }

        @Override // com.google.common.io.ByteSink
        public OutputStream openStream() throws IOException {
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$2 */
    class C09312 extends ByteSource {
        final /* synthetic */ BaseEncoding this$0;
        final /* synthetic */ CharSource val$encodedSource;

        C09312(BaseEncoding baseEncoding, CharSource charSource) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$5 */
    class C09345 extends Writer {
        final /* synthetic */ Writer val$delegate;
        final /* synthetic */ Appendable val$separatingAppendable;

        C09345(Appendable appendable, Writer writer) {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
        }
    }

    private static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        Alphabet(String str, char[] cArr) {
        }

        static /* synthetic */ char[] access$000(Alphabet alphabet) {
        }

        private boolean hasLowerCase() {
        }

        private boolean hasUpperCase() {
        }

        boolean canDecode(char c) {
        }

        int decode(char c) throws DecodingException {
        }

        char encode(int i) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        boolean isValidPaddingStartPosition(int i) {
        }

        Alphabet lowerCase() {
        }

        public boolean matches(char c) {
        }

        public String toString() {
        }

        Alphabet upperCase() {
        }
    }

    static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        Base16Encoding(String str, String str2) {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding newInstance(Alphabet alphabet, Character ch) {
        }

        private Base16Encoding(Alphabet alphabet) {
        }
    }

    static final class Base64Encoding extends StandardBaseEncoding {
        Base64Encoding(String str, String str2, Character ch) {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding newInstance(Alphabet alphabet, Character ch) {
        }

        private Base64Encoding(Alphabet alphabet, Character ch) {
        }
    }

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
        }

        DecodingException(Throwable th) {
        }
    }

    static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i) {
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i) {
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
        }

        public String toString() {
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
        }
    }

    static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;

        @LazyInit
        private transient BaseEncoding lowerCase;
        final Character paddingChar;

        @LazyInit
        private transient BaseEncoding upperCase;

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1 */
        class C09351 extends OutputStream {
            int bitBuffer;
            int bitBufferLength;
            final /* synthetic */ StandardBaseEncoding this$0;
            final /* synthetic */ Writer val$out;
            int writtenChars;

            C09351(StandardBaseEncoding standardBaseEncoding, Writer writer) {
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
            }
        }

        StandardBaseEncoding(String str, String str2, Character ch) {
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
        }

        void encodeChunkTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i) {
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i) {
        }

        BaseEncoding newInstance(Alphabet alphabet, Character ch) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
        }

        public String toString() {
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
        }

        StandardBaseEncoding(Alphabet alphabet, Character ch) {
        }

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2 */
        class C09362 extends InputStream {
            int bitBuffer;
            int bitBufferLength;
            boolean hitPadding;
            int readChars;
            final /* synthetic */ StandardBaseEncoding this$0;
            final /* synthetic */ Reader val$reader;

            C09362(StandardBaseEncoding standardBaseEncoding, Reader reader) {
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
            }
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding base16() {
    }

    public static BaseEncoding base32() {
    }

    public static BaseEncoding base32Hex() {
    }

    public static BaseEncoding base64() {
    }

    public static BaseEncoding base64Url() {
    }

    private static byte[] extract(byte[] bArr, int i) {
    }

    @GwtIncompatible
    static Reader ignoringReader(Reader reader, String str) {
    }

    static Appendable separatingAppendable(Appendable appendable, String str, int i) {
    }

    @GwtIncompatible
    static Writer separatingWriter(Writer writer, String str, int i) {
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
    }

    final byte[] decodeChecked(CharSequence charSequence) throws DecodingException {
    }

    abstract int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @GwtIncompatible
    public final ByteSource decodingSource(CharSource charSource) {
    }

    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
    }

    abstract void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    @GwtIncompatible
    public final ByteSink encodingSink(CharSink charSink) {
    }

    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding lowerCase();

    abstract int maxDecodedSize(int i);

    abstract int maxEncodedSize(int i);

    public abstract BaseEncoding omitPadding();

    CharSequence trimTrailingPadding(CharSequence charSequence) {
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c);

    public abstract BaseEncoding withSeparator(String str, int i);

    /* renamed from: com.google.common.io.BaseEncoding$3 */
    class C09323 extends Reader {
        final /* synthetic */ Reader val$delegate;
        final /* synthetic */ String val$toIgnore;

        C09323(Reader reader, String str) {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Reader
        public int read() throws IOException {
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
        }
    }

    public final String encode(byte[] bArr, int i, int i2) {
    }

    /* renamed from: com.google.common.io.BaseEncoding$4 */
    class C09334 implements Appendable {
        int charsUntilSeparator;
        final /* synthetic */ int val$afterEveryChars;
        final /* synthetic */ Appendable val$delegate;
        final /* synthetic */ String val$separator;

        C09334(int i, Appendable appendable, String str) {
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) {
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
        }
    }
}
