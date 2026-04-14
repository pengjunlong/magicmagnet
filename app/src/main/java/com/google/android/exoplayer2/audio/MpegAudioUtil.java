package com.google.android.exoplayer2.audio;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MpegAudioUtil {
    private static final int[] BITRATE_V1_L1 = null;
    private static final int[] BITRATE_V1_L2 = null;
    private static final int[] BITRATE_V1_L3 = null;
    private static final int[] BITRATE_V2 = null;
    private static final int[] BITRATE_V2_L1 = null;
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final String[] MIME_TYPE_BY_LAYER = null;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final int[] SAMPLING_RATE_V1 = null;

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int i) {
        }
    }

    private MpegAudioUtil() {
    }

    static /* synthetic */ boolean access$000(int i) {
    }

    static /* synthetic */ String[] access$100() {
    }

    static /* synthetic */ int[] access$200() {
    }

    static /* synthetic */ int access$300(int i, int i2) {
    }

    static /* synthetic */ int[] access$400() {
    }

    static /* synthetic */ int[] access$500() {
    }

    static /* synthetic */ int[] access$600() {
    }

    static /* synthetic */ int[] access$700() {
    }

    static /* synthetic */ int[] access$800() {
    }

    public static int getFrameSize(int i) {
    }

    private static int getFrameSizeInSamples(int i, int i2) {
    }

    private static boolean isMagicPresent(int i) {
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
    }
}
