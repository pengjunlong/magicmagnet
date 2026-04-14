package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Version {
    private static final Version[] VERSIONS = null;
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    static final class ECB {
        private final int count;
        private final int dataCodewords;

        /* synthetic */ ECB(int i, int i2, C13841 c13841) {
        }

        int getCount() {
        }

        int getDataCodewords() {
        }

        private ECB(int i, int i2) {
        }
    }

    static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewords;

        /* synthetic */ ECBlocks(int i, ECB ecb, C13841 c13841) {
        }

        ECB[] getECBlocks() {
        }

        int getECCodewords() {
        }

        /* synthetic */ ECBlocks(int i, ECB ecb, ECB ecb2, C13841 c13841) {
        }

        private ECBlocks(int i, ECB ecb) {
        }

        private ECBlocks(int i, ECB ecb, ECB ecb2) {
        }
    }

    private Version(int i, int i2, int i3, int i4, int i5, ECBlocks eCBlocks) {
    }

    private static Version[] buildVersions() {
    }

    public static Version getVersionForDimensions(int i, int i2) throws FormatException {
    }

    public int getDataRegionSizeColumns() {
    }

    public int getDataRegionSizeRows() {
    }

    ECBlocks getECBlocks() {
    }

    public int getSymbolSizeColumns() {
    }

    public int getSymbolSizeRows() {
    }

    public int getTotalCodewords() {
    }

    public int getVersionNumber() {
    }

    public String toString() {
    }
}
