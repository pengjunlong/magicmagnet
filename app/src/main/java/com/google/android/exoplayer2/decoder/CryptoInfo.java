package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final MediaCodec.CryptoInfo frameworkCryptoInfo;
    public byte[] iv;
    public byte[] key;
    public int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    private final PatternHolderV24 patternHolder;

    private static final class PatternHolderV24 {
        private final MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final MediaCodec.CryptoInfo.Pattern pattern;

        /* synthetic */ PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo, C00941 c00941) {
        }

        static /* synthetic */ void access$100(PatternHolderV24 patternHolderV24, int i, int i2) {
        }

        private void set(int i, int i2) {
        }

        private PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
        }
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
    }

    public void increaseClearDataFirstSubSampleBy(int i) {
    }

    public void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
    }
}
