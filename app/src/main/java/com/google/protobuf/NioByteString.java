package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    NioByteString(ByteBuffer byteBuffer) {
    }

    static /* synthetic */ ByteBuffer access$000(NioByteString nioByteString) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    private ByteBuffer slice(int i, int i2) {
    }

    private Object writeReplace() {
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    boolean equalsRange(ByteString byteString, int i, int i2) {
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int i, int i2, int i3) {
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int i, int i2, int i3) {
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
    }

    /* renamed from: com.google.protobuf.NioByteString$1 */
    class C13231 extends InputStream {
        private final ByteBuffer buf;
        final /* synthetic */ NioByteString this$0;

        C13231(NioByteString nioByteString) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream
        public void mark(int i) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(ByteOutput byteOutput) throws IOException {
    }
}
