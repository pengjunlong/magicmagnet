package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PDF417 {
    private static final int[][] CODEWORD_TABLE = null;
    private static final float DEFAULT_MODULE_WIDTH = 0.357f;
    private static final float HEIGHT = 2.0f;
    private static final float PREFERRED_RATIO = 3.0f;
    private static final int START_PATTERN = 130728;
    private static final int STOP_PATTERN = 260649;
    private BarcodeMatrix barcodeMatrix;
    private boolean compact;
    private Compaction compaction;
    private Charset encoding;
    private int maxCols;
    private int maxRows;
    private int minCols;
    private int minRows;

    public PDF417() {
    }

    private static int calculateNumberOfRows(int i, int i2, int i3) {
    }

    private int[] determineDimensions(int i, int i2) throws WriterException {
    }

    private static void encodeChar(int i, int i2, BarcodeRow barcodeRow) {
    }

    private void encodeLowLevel(CharSequence charSequence, int i, int i2, int i3, BarcodeMatrix barcodeMatrix) {
    }

    private static int getNumberOfPadCodewords(int i, int i2, int i3, int i4) {
    }

    public void generateBarcodeLogic(String str, int i) throws WriterException {
    }

    public BarcodeMatrix getBarcodeMatrix() {
    }

    public void setCompact(boolean z) {
    }

    public void setCompaction(Compaction compaction) {
    }

    public void setDimensions(int i, int i2, int i3, int i4) {
    }

    public void setEncoding(Charset charset) {
    }

    public PDF417(boolean z) {
    }
}
