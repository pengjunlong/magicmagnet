package com.google.android.exoplayer2.upstream.crypto;

import javax.crypto.Cipher;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i, byte[] bArr, String str, long j) {
    }

    private static long getFNV64Hash(String str) {
    }

    private byte[] getInitializationVector(long j, long j2) {
    }

    private int nonFlushingUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
    }

    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
    }

    public void updateInPlace(byte[] bArr, int i, int i2) {
    }

    public AesFlushingCipher(int i, byte[] bArr, long j, long j2) {
    }
}
