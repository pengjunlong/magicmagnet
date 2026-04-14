package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String key;
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    public static final class Builder {
        private static final String RTP_MAP_ATTR_AUDIO_FMT = "%d %s/%d/%d";
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_MONO = 11;
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_STEREO = 10;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMA = 8;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMU = 0;
        private final HashMap<String, String> attributes;
        private int bitrate;
        private String connection;
        private String key;
        private String mediaTitle;
        private final String mediaType;
        private final int payloadType;
        private final int port;
        private final String transportProtocol;

        public Builder(String str, int i, String str2, int i2) {
        }

        static /* synthetic */ String access$100(Builder builder) {
        }

        static /* synthetic */ int access$200(Builder builder) {
        }

        static /* synthetic */ String access$300(Builder builder) {
        }

        static /* synthetic */ int access$400(Builder builder) {
        }

        static /* synthetic */ String access$500(Builder builder) {
        }

        static /* synthetic */ String access$600(Builder builder) {
        }

        static /* synthetic */ int access$700(Builder builder) {
        }

        static /* synthetic */ String access$800(Builder builder) {
        }

        private static String constructAudioRtpMap(int i, String str, int i2, int i3) {
        }

        private static String getRtpMapStringByPayloadType(int i) {
        }

        @CanIgnoreReturnValue
        public Builder addAttribute(String str, String str2) {
        }

        public MediaDescription build() {
        }

        @CanIgnoreReturnValue
        public Builder setBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setConnection(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setKey(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setMediaTitle(String str) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        private RtpMapAttribute(int i, String str, int i2, int i3) {
        }

        public static RtpMapAttribute parse(String str) throws ParserException {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* synthetic */ MediaDescription(Builder builder, ImmutableMap immutableMap, RtpMapAttribute rtpMapAttribute, C01861 c01861) {
    }

    public boolean equals(Object obj) {
    }

    public ImmutableMap<String, String> getFmtpParametersAsMap() {
    }

    public int hashCode() {
    }

    private MediaDescription(Builder builder, ImmutableMap<String, String> immutableMap, RtpMapAttribute rtpMapAttribute) {
    }
}
