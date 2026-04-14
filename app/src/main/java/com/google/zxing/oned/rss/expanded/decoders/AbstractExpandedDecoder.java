package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractExpandedDecoder {
    private final GeneralAppIdDecoder generalDecoder;
    private final BitArray information;

    AbstractExpandedDecoder(BitArray bitArray) {
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
    }

    protected final GeneralAppIdDecoder getGeneralDecoder() {
    }

    protected final BitArray getInformation() {
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
