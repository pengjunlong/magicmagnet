package com.tencent.tinker.ziputils.ziputil;

import java.nio.ByteOrder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class HeapBufferIterator extends BufferIterator {
    private final byte[] buffer;
    private final int byteCount;
    private final int offset;
    private final ByteOrder order;
    private int position;

    HeapBufferIterator(byte[] bArr, int i, int i2, ByteOrder byteOrder) {
    }

    public static BufferIterator iterator(byte[] bArr, int i, int i2, ByteOrder byteOrder) {
    }

    public byte readByte() {
    }

    public void readByteArray(byte[] bArr, int i, int i2) {
    }

    @Override // com.tencent.tinker.ziputils.ziputil.BufferIterator
    public int readInt() {
    }

    @Override // com.tencent.tinker.ziputils.ziputil.BufferIterator
    public short readShort() {
    }

    @Override // com.tencent.tinker.ziputils.ziputil.BufferIterator
    public void seek(int i) {
    }

    @Override // com.tencent.tinker.ziputils.ziputil.BufferIterator
    public void skip(int i) {
    }
}
