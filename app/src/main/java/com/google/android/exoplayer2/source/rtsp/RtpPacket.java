package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RtpPacket {
    public static final int CSRC_SIZE = 4;
    private static final byte[] EMPTY = null;
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static final int MAX_SIZE = 65507;
    public static final int MIN_HEADER_SIZE = 12;
    public static final int MIN_SEQUENCE_NUMBER = 0;
    public static final int RTP_VERSION = 2;
    public final byte[] csrc;
    public final byte csrcCount;
    public final boolean extension;
    public final boolean marker;
    public final boolean padding;
    public final byte[] payloadData;
    public final byte payloadType;
    public final int sequenceNumber;
    public final int ssrc;
    public final long timestamp;
    public final byte version;

    public static final class Builder {
        private byte[] csrc;
        private boolean marker;
        private boolean padding;
        private byte[] payloadData;
        private byte payloadType;
        private int sequenceNumber;
        private int ssrc;
        private long timestamp;

        static /* synthetic */ boolean access$200(Builder builder) {
        }

        static /* synthetic */ boolean access$300(Builder builder) {
        }

        static /* synthetic */ byte access$400(Builder builder) {
        }

        static /* synthetic */ int access$500(Builder builder) {
        }

        static /* synthetic */ long access$600(Builder builder) {
        }

        static /* synthetic */ int access$700(Builder builder) {
        }

        static /* synthetic */ byte[] access$800(Builder builder) {
        }

        static /* synthetic */ byte[] access$900(Builder builder) {
        }

        public RtpPacket build() {
        }

        @CanIgnoreReturnValue
        public Builder setCsrc(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setMarker(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setPadding(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setPayloadData(byte[] bArr) {
        }

        @CanIgnoreReturnValue
        public Builder setPayloadType(byte b) {
        }

        @CanIgnoreReturnValue
        public Builder setSequenceNumber(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setSsrc(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setTimestamp(long j) {
        }
    }

    /* synthetic */ RtpPacket(Builder builder, C01881 c01881) {
    }

    static /* synthetic */ byte[] access$000() {
    }

    public static int getNextSequenceNumber(int i) {
    }

    public static int getPreviousSequenceNumber(int i) {
    }

    public static RtpPacket parse(ParsableByteArray parsableByteArray) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public int writeToBuffer(byte[] bArr, int i, int i2) {
    }

    private RtpPacket(Builder builder) {
    }

    public static RtpPacket parse(byte[] bArr, int i) {
    }
}
