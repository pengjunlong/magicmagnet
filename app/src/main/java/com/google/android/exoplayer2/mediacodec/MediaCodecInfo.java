package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaCodecInfo {
    private static final int COVERAGE_RESULT_NO = 1;
    private static final int COVERAGE_RESULT_NO_EMPTY_LIST = 0;
    private static final int COVERAGE_RESULT_YES = 2;
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    private static final class Api29 {
        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        }
    }

    MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
    }

    static /* synthetic */ boolean access$000() {
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
    }

    private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private boolean isCodecProfileAndLevelSupported(Format format, boolean z) {
    }

    private boolean isSampleMimeTypeSupported(Format format) {
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private void logAssumedSupport(String str) {
    }

    private void logNoSupport(String str) {
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
    }

    private static boolean needsIgnorePerformancePointsWorkaround() {
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i) {
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
    }

    public Point alignVideoSizeV21(int i, int i2) {
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
    }

    public int getMaxSupportedInstances() {
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
    }

    public boolean isAudioChannelCountSupportedV21(int i) {
    }

    public boolean isAudioSampleRateSupportedV21(int i) {
    }

    public boolean isFormatFunctionallySupported(Format format) {
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
    }

    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
    }

    public String toString() {
    }

    private static Point alignVideoSizeV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(Format format, Format format2, boolean z) {
    }
}
