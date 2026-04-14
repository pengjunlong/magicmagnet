package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class DataMask {
    private static final /* synthetic */ DataMask[] $VALUES = null;
    public static final DataMask DATA_MASK_000 = null;
    public static final DataMask DATA_MASK_001 = null;
    public static final DataMask DATA_MASK_010 = null;
    public static final DataMask DATA_MASK_011 = null;
    public static final DataMask DATA_MASK_100 = null;
    public static final DataMask DATA_MASK_101 = null;
    public static final DataMask DATA_MASK_110 = null;
    public static final DataMask DATA_MASK_111 = null;

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$1 */
    enum C13891 extends DataMask {
        C13891(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$2 */
    enum C13902 extends DataMask {
        C13902(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$3 */
    enum C13913 extends DataMask {
        C13913(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$4 */
    enum C13924 extends DataMask {
        C13924(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$5 */
    enum C13935 extends DataMask {
        C13935(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$6 */
    enum C13946 extends DataMask {
        C13946(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$7 */
    enum C13957 extends DataMask {
        C13957(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DataMask$8 */
    enum C13968 extends DataMask {
        C13968(String str, int i) {
        }

        @Override // com.google.zxing.qrcode.decoder.DataMask
        boolean isMasked(int i, int i2) {
        }
    }

    private DataMask(String str, int i) {
    }

    public static DataMask valueOf(String str) {
    }

    public static DataMask[] values() {
    }

    abstract boolean isMasked(int i, int i2);

    final void unmaskBitMatrix(BitMatrix bitMatrix, int i) {
    }

    /* synthetic */ DataMask(String str, int i, C13891 c13891) {
    }
}
