package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AllocatedBuffer {

    /* renamed from: com.google.protobuf.AllocatedBuffer$1 */
    static class C12731 extends AllocatedBuffer {
        final /* synthetic */ ByteBuffer val$buffer;

        C12731(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public byte[] array() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int arrayOffset() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasArray() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasNioBuffer() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int limit() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public ByteBuffer nioBuffer() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int position() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int remaining() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public AllocatedBuffer position(int i) {
        }
    }

    /* renamed from: com.google.protobuf.AllocatedBuffer$2 */
    static class C12742 extends AllocatedBuffer {
        private int position;
        final /* synthetic */ byte[] val$bytes;
        final /* synthetic */ int val$length;
        final /* synthetic */ int val$offset;

        C12742(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public byte[] array() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int arrayOffset() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasArray() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public boolean hasNioBuffer() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int limit() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public ByteBuffer nioBuffer() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int position() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public int remaining() {
        }

        @Override // com.google.protobuf.AllocatedBuffer
        public AllocatedBuffer position(int i) {
        }
    }

    AllocatedBuffer() {
    }

    public static AllocatedBuffer wrap(byte[] bArr) {
    }

    private static AllocatedBuffer wrapNoCheck(byte[] bArr, int i, int i2) {
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    public abstract AllocatedBuffer position(int i);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr, int i, int i2) {
    }

    public static AllocatedBuffer wrap(ByteBuffer byteBuffer) {
    }
}
