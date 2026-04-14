package com.google.zxing.client.android;

import android.content.Intent;
import com.google.zxing.BarcodeFormat;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DecodeFormatManager {
    static final Set<BarcodeFormat> AZTEC_FORMATS = null;
    private static final Pattern COMMA_PATTERN = null;
    static final Set<BarcodeFormat> DATA_MATRIX_FORMATS = null;
    private static final Map<String, Set<BarcodeFormat>> FORMATS_FOR_MODE = null;
    static final Set<BarcodeFormat> INDUSTRIAL_FORMATS = null;
    private static final Set<BarcodeFormat> ONE_D_FORMATS = null;
    static final Set<BarcodeFormat> PDF417_FORMATS = null;
    static final Set<BarcodeFormat> PRODUCT_FORMATS = null;
    static final Set<BarcodeFormat> QR_CODE_FORMATS = null;

    private DecodeFormatManager() {
    }

    public static Set<BarcodeFormat> parseDecodeFormats(Intent intent) {
    }

    private static Set<BarcodeFormat> parseDecodeFormats(Iterable<String> iterable, String str) {
    }
}
