package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Format implements Bundleable {
    public static final Bundleable.Creator<Format> CREATOR = null;
    private static final Format DEFAULT = null;
    private static final String FIELD_ACCESSIBILITY_CHANNEL = null;
    private static final String FIELD_AVERAGE_BITRATE = null;
    private static final String FIELD_CHANNEL_COUNT = null;
    private static final String FIELD_CODECS = null;
    private static final String FIELD_COLOR_INFO = null;
    private static final String FIELD_CONTAINER_MIME_TYPE = null;
    private static final String FIELD_CRYPTO_TYPE = null;
    private static final String FIELD_DRM_INIT_DATA = null;
    private static final String FIELD_ENCODER_DELAY = null;
    private static final String FIELD_ENCODER_PADDING = null;
    private static final String FIELD_FRAME_RATE = null;
    private static final String FIELD_HEIGHT = null;
    private static final String FIELD_ID = null;
    private static final String FIELD_INITIALIZATION_DATA = null;
    private static final String FIELD_LABEL = null;
    private static final String FIELD_LANGUAGE = null;
    private static final String FIELD_MAX_INPUT_SIZE = null;
    private static final String FIELD_METADATA = null;
    private static final String FIELD_PCM_ENCODING = null;
    private static final String FIELD_PEAK_BITRATE = null;
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = null;
    private static final String FIELD_PROJECTION_DATA = null;
    private static final String FIELD_ROLE_FLAGS = null;
    private static final String FIELD_ROTATION_DEGREES = null;
    private static final String FIELD_SAMPLE_MIME_TYPE = null;
    private static final String FIELD_SAMPLE_RATE = null;
    private static final String FIELD_SELECTION_FLAGS = null;
    private static final String FIELD_STEREO_MODE = null;
    private static final String FIELD_SUBSAMPLE_OFFSET_US = null;
    private static final String FIELD_TILE_COUNT_HORIZONTAL = null;
    private static final String FIELD_TILE_COUNT_VERTICAL = null;
    private static final String FIELD_WIDTH = null;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final int cryptoType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;
    public final String id;
    public final List<byte[]> initializationData;
    public final String label;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;

    public static final class Builder {
        private int accessibilityChannel;
        private int averageBitrate;
        private int channelCount;
        private String codecs;
        private ColorInfo colorInfo;
        private String containerMimeType;
        private int cryptoType;
        private DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private int height;
        private String id;
        private List<byte[]> initializationData;
        private String label;
        private String language;
        private int maxInputSize;
        private Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        private String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int tileCountHorizontal;
        private int tileCountVertical;
        private int width;

        /* synthetic */ Builder(Format format, C00731 c00731) {
        }

        static /* synthetic */ String access$100(Builder builder) {
        }

        static /* synthetic */ String access$1000(Builder builder) {
        }

        static /* synthetic */ String access$1100(Builder builder) {
        }

        static /* synthetic */ int access$1200(Builder builder) {
        }

        static /* synthetic */ List access$1300(Builder builder) {
        }

        static /* synthetic */ DrmInitData access$1400(Builder builder) {
        }

        static /* synthetic */ long access$1500(Builder builder) {
        }

        static /* synthetic */ int access$1600(Builder builder) {
        }

        static /* synthetic */ int access$1700(Builder builder) {
        }

        static /* synthetic */ float access$1800(Builder builder) {
        }

        static /* synthetic */ int access$1900(Builder builder) {
        }

        static /* synthetic */ String access$200(Builder builder) {
        }

        static /* synthetic */ float access$2000(Builder builder) {
        }

        static /* synthetic */ byte[] access$2100(Builder builder) {
        }

        static /* synthetic */ int access$2200(Builder builder) {
        }

        static /* synthetic */ ColorInfo access$2300(Builder builder) {
        }

        static /* synthetic */ int access$2400(Builder builder) {
        }

        static /* synthetic */ int access$2500(Builder builder) {
        }

        static /* synthetic */ int access$2600(Builder builder) {
        }

        static /* synthetic */ int access$2700(Builder builder) {
        }

        static /* synthetic */ int access$2800(Builder builder) {
        }

        static /* synthetic */ int access$2900(Builder builder) {
        }

        static /* synthetic */ String access$300(Builder builder) {
        }

        static /* synthetic */ int access$3000(Builder builder) {
        }

        static /* synthetic */ int access$3100(Builder builder) {
        }

        static /* synthetic */ int access$3200(Builder builder) {
        }

        static /* synthetic */ int access$400(Builder builder) {
        }

        static /* synthetic */ int access$500(Builder builder) {
        }

        static /* synthetic */ int access$600(Builder builder) {
        }

        static /* synthetic */ int access$700(Builder builder) {
        }

        static /* synthetic */ String access$800(Builder builder) {
        }

        static /* synthetic */ Metadata access$900(Builder builder) {
        }

        public Format build() {
        }

        @CanIgnoreReturnValue
        public Builder setAccessibilityChannel(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setAverageBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setChannelCount(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setCodecs(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setColorInfo(ColorInfo colorInfo) {
        }

        @CanIgnoreReturnValue
        public Builder setContainerMimeType(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setCryptoType(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setDrmInitData(DrmInitData drmInitData) {
        }

        @CanIgnoreReturnValue
        public Builder setEncoderDelay(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setEncoderPadding(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setFrameRate(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setHeight(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setId(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setInitializationData(List<byte[]> list) {
        }

        @CanIgnoreReturnValue
        public Builder setLabel(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setLanguage(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxInputSize(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMetadata(Metadata metadata) {
        }

        @CanIgnoreReturnValue
        public Builder setPcmEncoding(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setPeakBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setPixelWidthHeightRatio(float f) {
        }

        @CanIgnoreReturnValue
        public Builder setProjectionData(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setRoleFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setRotationDegrees(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setSampleMimeType(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setSampleRate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setSelectionFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setStereoMode(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setSubsampleOffsetUs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setTileCountHorizontal(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setTileCountVertical(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setWidth(int i) {
        }

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setId(int i) {
        }

        private Builder(Format format) {
        }
    }

    /* synthetic */ Format(Builder builder, C00731 c00731) {
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
    }

    @Deprecated
    public static Format createContainerFormat(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
    }

    @Deprecated
    public static Format createSampleFormat(String str, String str2) {
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, DrmInitData drmInitData) {
    }

    public static /* synthetic */ Format dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static <T> T defaultIfNull(T t, T t2) {
    }

    private static Format fromBundle(Bundle bundle) {
    }

    private static String keyForInitializationData(int i) {
    }

    public static String toLogString(Format format) {
    }

    public Builder buildUpon() {
    }

    @Deprecated
    public Format copyWithBitrate(int i) {
    }

    public Format copyWithCryptoType(int i) {
    }

    @Deprecated
    public Format copyWithDrmInitData(DrmInitData drmInitData) {
    }

    @Deprecated
    public Format copyWithFrameRate(float f) {
    }

    @Deprecated
    public Format copyWithGaplessInfo(int i, int i2) {
    }

    @Deprecated
    public Format copyWithLabel(String str) {
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format format) {
    }

    @Deprecated
    public Format copyWithMaxInputSize(int i) {
    }

    @Deprecated
    public Format copyWithMetadata(Metadata metadata) {
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long j) {
    }

    @Deprecated
    public Format copyWithVideoSize(int i, int i2) {
    }

    public boolean equals(Object obj) {
    }

    public int getPixelCount() {
    }

    public int hashCode() {
    }

    public boolean initializationDataEquals(Format format) {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public String toString() {
    }

    public Format withManifestFormatInfo(Format format) {
    }

    private Format(Builder builder) {
    }

    public Bundle toBundle(boolean z) {
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
    }
}
