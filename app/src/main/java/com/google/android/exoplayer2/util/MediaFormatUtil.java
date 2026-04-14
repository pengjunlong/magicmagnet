package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaFormatUtil {
    public static final String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private MediaFormatUtil() {
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(Format format) {
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
    }

    public static ColorInfo getColorInfo(MediaFormat mediaFormat) {
    }

    private static boolean isValidColorRange(int i) {
    }

    private static boolean isValidColorSpace(int i) {
    }

    private static boolean isValidColorTransfer(int i) {
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, ColorInfo colorInfo) {
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f) {
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int i) {
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float f) {
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, String str2) {
    }

    private static void setBooleanAsInt(MediaFormat mediaFormat, String str, int i) {
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
    }
}
