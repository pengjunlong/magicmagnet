package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AvcConfig {
    public final String codecs;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i, int i2, int i3, float f, String str) {
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
    }
}
