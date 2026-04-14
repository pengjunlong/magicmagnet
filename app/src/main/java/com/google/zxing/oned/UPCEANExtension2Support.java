package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class UPCEANExtension2Support {
    private final int[] decodeMiddleCounters;
    private final StringBuilder decodeRowStringBuffer;

    UPCEANExtension2Support() {
    }

    private int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
    }

    private static Map<ResultMetadataType, Object> parseExtensionString(String str) {
    }

    Result decodeRow(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
    }
}
