package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AudioAttributes implements Bundleable {
    public static final Bundleable.Creator<AudioAttributes> CREATOR = null;
    public static final AudioAttributes DEFAULT = null;
    private static final String FIELD_ALLOWED_CAPTURE_POLICY = null;
    private static final String FIELD_CONTENT_TYPE = null;
    private static final String FIELD_FLAGS = null;
    private static final String FIELD_SPATIALIZATION_BEHAVIOR = null;
    private static final String FIELD_USAGE = null;
    public final int allowedCapturePolicy;
    private AudioAttributesV21 audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;

    private static final class Api29 {
        private Api29() {
        }

        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
        }
    }

    private static final class Api32 {
        private Api32() {
        }

        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i) {
        }
    }

    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        /* synthetic */ AudioAttributesV21(AudioAttributes audioAttributes, C00851 c00851) {
        }

        private AudioAttributesV21(AudioAttributes audioAttributes) {
        }
    }

    public static final class Builder {
        private int allowedCapturePolicy;
        private int contentType;
        private int flags;
        private int spatializationBehavior;
        private int usage;

        public AudioAttributes build() {
        }

        @CanIgnoreReturnValue
        public Builder setAllowedCapturePolicy(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setContentType(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setSpatializationBehavior(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setUsage(int i) {
        }
    }

    /* synthetic */ AudioAttributes(int i, int i2, int i3, int i4, int i5, C00851 c00851) {
    }

    public static /* synthetic */ AudioAttributes dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ AudioAttributes lambda$static$0(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public AudioAttributesV21 getAudioAttributesV21() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    private AudioAttributes(int i, int i2, int i3, int i4, int i5) {
    }
}
