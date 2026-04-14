package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Version {
    private static final Version[] VERSIONS = null;
    private static final int[] VERSION_DECODE_INFO = null;
    private final int[] alignmentPatternCenters;
    private final ECBlocks[] ecBlocks;
    private final int totalCodewords;
    private final int versionNumber;

    public static final class ECB {
        private final int count;
        private final int dataCodewords;

        ECB(int i, int i2) {
        }

        public int getCount() {
        }

        public int getDataCodewords() {
        }
    }

    public static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewordsPerBlock;

        ECBlocks(int i, ECB... ecbArr) {
        }

        public ECB[] getECBlocks() {
        }

        public int getECCodewordsPerBlock() {
        }

        public int getNumBlocks() {
        }

        public int getTotalECCodewords() {
        }
    }

    private Version(int i, int[] iArr, ECBlocks... eCBlocksArr) {
    }

    private static Version[] buildVersions() {
    }

    static Version decodeVersionInformation(int i) {
    }

    public static Version getProvisionalVersionForDimension(int i) throws FormatException {
    }

    public static Version getVersionForNumber(int i) {
    }

    BitMatrix buildFunctionPattern() {
    }

    public int[] getAlignmentPatternCenters() {
    }

    public int getDimensionForVersion() {
    }

    public ECBlocks getECBlocksForLevel(ErrorCorrectionLevel errorCorrectionLevel) {
    }

    public int getTotalCodewords() {
    }

    public int getVersionNumber() {
    }

    public String toString() {
    }
}
