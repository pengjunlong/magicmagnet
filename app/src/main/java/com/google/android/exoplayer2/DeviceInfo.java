package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DeviceInfo implements Bundleable {
    public static final Bundleable.Creator<DeviceInfo> CREATOR = null;
    private static final String FIELD_MAX_VOLUME = null;
    private static final String FIELD_MIN_VOLUME = null;
    private static final String FIELD_PLAYBACK_TYPE = null;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public static final DeviceInfo UNKNOWN = null;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    public DeviceInfo(int i, int i2, int i3) {
    }

    public static /* synthetic */ DeviceInfo dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ DeviceInfo lambda$static$0(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }
}
