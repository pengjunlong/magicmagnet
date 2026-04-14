package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeByte(int i) throws IOException {
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeChar(int i) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeInt(int i) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeLong(long j) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeShort(int i) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
    }
}
