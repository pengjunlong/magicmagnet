package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private OpusUtil() {
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
    }

    private static byte[] buildNativeOrderByteArray(long j) {
    }

    public static int getChannelCount(byte[] bArr) {
    }

    private static long getPacketDurationUs(byte b, byte b2) {
    }

    public static long getPacketDurationUs(byte[] bArr) {
    }

    private static int getPreSkipSamples(byte[] bArr) {
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
    }

    private static long sampleCountToNanoseconds(long j) {
    }
}
