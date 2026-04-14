package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int ac3BufferMultiplicationFactor;
        private int maxPcmBufferDurationUs;
        private int minPcmBufferDurationUs;
        private int offloadBufferDurationUs;
        private int passthroughBufferDurationUs;
        private int pcmBufferMultiplicationFactor;

        static /* synthetic */ int access$000(Builder builder) {
        }

        static /* synthetic */ int access$100(Builder builder) {
        }

        static /* synthetic */ int access$200(Builder builder) {
        }

        static /* synthetic */ int access$300(Builder builder) {
        }

        static /* synthetic */ int access$400(Builder builder) {
        }

        static /* synthetic */ int access$500(Builder builder) {
        }

        public DefaultAudioTrackBufferSizeProvider build() {
        }

        @CanIgnoreReturnValue
        public Builder setAc3BufferMultiplicationFactor(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMaxPcmBufferDurationUs(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMinPcmBufferDurationUs(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setOffloadBufferDurationUs(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setPassthroughBufferDurationUs(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setPcmBufferMultiplicationFactor(int i) {
        }
    }

    protected DefaultAudioTrackBufferSizeProvider(Builder builder) {
    }

    protected static int durationUsToBytes(int i, int i2, int i3) {
    }

    protected static int getMaximumEncodedRateBytesPerSecond(int i) {
    }

    protected int get1xBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d) {
    }

    protected int getOffloadBufferSizeInBytes(int i) {
    }

    protected int getPassthroughBufferSizeInBytes(int i, int i2) {
    }

    protected int getPcmBufferSizeInBytes(int i, int i2, int i3) {
    }
}
