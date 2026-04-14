package com.google.android.exoplayer2.util;

import android.util.Pair;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CodecSpecificDataUtil {
    private static final int EXTENDED_PAR = 15;
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = null;
    private static final byte[] NAL_START_CODE = null;
    private static final int RECTANGULAR = 0;
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;

    private CodecSpecificDataUtil() {
    }

    public static String buildAvcCodecString(int i, int i2, int i3) {
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
    }

    public static String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
    }

    private static int findNalStartCode(byte[] bArr, int i) {
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
    }

    private static boolean isNalStartCode(byte[] bArr, int i) {
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
    }
}
