package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Decoder {
    private static final String[] DIGIT_TABLE = null;
    private static final String[] LOWER_TABLE = null;
    private static final String[] MIXED_TABLE = null;
    private static final String[] PUNCT_TABLE = null;
    private static final String[] UPPER_TABLE = null;
    private AztecDetectorResult ddata;

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1 */
    static /* synthetic */ class C13791 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class Table {
        private static final /* synthetic */ Table[] $VALUES = null;
        public static final Table BINARY = null;
        public static final Table DIGIT = null;
        public static final Table LOWER = null;
        public static final Table MIXED = null;
        public static final Table PUNCT = null;
        public static final Table UPPER = null;

        private Table(String str, int i) {
        }

        public static Table valueOf(String str) {
        }

        public static Table[] values() {
        }
    }

    static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
    }

    private boolean[] correctBits(boolean[] zArr) throws FormatException {
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
    }

    private static String getCharacter(Table table, int i) {
    }

    private static String getEncodedData(boolean[] zArr) {
    }

    private static Table getTable(char c) {
    }

    public static String highLevelDecode(boolean[] zArr) {
    }

    private static byte readByte(boolean[] zArr, int i) {
    }

    private static int readCode(boolean[] zArr, int i, int i2) {
    }

    private static int totalBitsInLayer(int i, boolean z) {
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
    }
}
