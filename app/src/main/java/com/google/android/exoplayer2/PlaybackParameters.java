package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PlaybackParameters implements Bundleable {
    public static final Bundleable.Creator<PlaybackParameters> CREATOR = null;
    public static final PlaybackParameters DEFAULT = null;
    private static final String FIELD_PITCH = null;
    private static final String FIELD_SPEED = null;
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;

    public PlaybackParameters(float f) {
    }

    public static /* synthetic */ PlaybackParameters dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ PlaybackParameters lambda$static$0(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public String toString() {
    }

    public PlaybackParameters withSpeed(float f) {
    }

    public PlaybackParameters(float f, float f2) {
    }
}
