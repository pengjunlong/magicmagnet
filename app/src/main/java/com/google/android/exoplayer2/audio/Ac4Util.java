package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = null;
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        /* synthetic */ SyncFrameInfo(int i, int i2, int i3, int i4, int i5, C00841 c00841) {
        }

        private SyncFrameInfo(int i, int i2, int i3, int i4, int i5) {
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int i, ParsableByteArray parsableByteArray) {
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
    }

    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i) {
    }
}
