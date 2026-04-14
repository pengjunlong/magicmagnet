package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class SessionDescription {
    public static final String ATTR_CONTROL = "control";
    public static final String ATTR_FMTP = "fmtp";
    public static final String ATTR_LENGTH = "length";
    public static final String ATTR_RANGE = "range";
    public static final String ATTR_RTPMAP = "rtpmap";
    public static final String ATTR_TOOL = "tool";
    public static final String ATTR_TYPE = "type";
    public static final String SUPPORTED_SDP_VERSION = "0";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String emailAddress;
    public final String key;
    public final ImmutableList<MediaDescription> mediaDescriptionList;
    public final String origin;
    public final String phoneNumber;
    public final String sessionInfo;
    public final String sessionName;
    public final String timing;
    public final Uri uri;

    public static final class Builder {
        private final HashMap<String, String> attributes;
        private int bitrate;
        private String connection;
        private String emailAddress;
        private String key;
        private final ImmutableList.Builder<MediaDescription> mediaDescriptionListBuilder;
        private String origin;
        private String phoneNumber;
        private String sessionInfo;
        private String sessionName;
        private String timing;
        private Uri uri;

        static /* synthetic */ HashMap access$100(Builder builder) {
        }

        static /* synthetic */ String access$1000(Builder builder) {
        }

        static /* synthetic */ String access$1100(Builder builder) {
        }

        static /* synthetic */ String access$1200(Builder builder) {
        }

        static /* synthetic */ ImmutableList.Builder access$200(Builder builder) {
        }

        static /* synthetic */ String access$300(Builder builder) {
        }

        static /* synthetic */ String access$400(Builder builder) {
        }

        static /* synthetic */ String access$500(Builder builder) {
        }

        static /* synthetic */ Uri access$600(Builder builder) {
        }

        static /* synthetic */ String access$700(Builder builder) {
        }

        static /* synthetic */ int access$800(Builder builder) {
        }

        static /* synthetic */ String access$900(Builder builder) {
        }

        @CanIgnoreReturnValue
        public Builder addAttribute(String str, String str2) {
        }

        @CanIgnoreReturnValue
        public Builder addMediaDescription(MediaDescription mediaDescription) {
        }

        public SessionDescription build() {
        }

        @CanIgnoreReturnValue
        public Builder setBitrate(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setConnection(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setEmailAddress(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setKey(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setOrigin(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setPhoneNumber(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setSessionInfo(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setSessionName(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setTiming(String str) {
        }

        @CanIgnoreReturnValue
        public Builder setUri(Uri uri) {
        }
    }

    /* synthetic */ SessionDescription(Builder builder, C01951 c01951) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    private SessionDescription(Builder builder) {
    }
}
