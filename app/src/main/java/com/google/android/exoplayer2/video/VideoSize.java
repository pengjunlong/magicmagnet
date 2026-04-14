package com.google.android.exoplayer2.video;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class VideoSize implements Bundleable {
    public static final Bundleable.Creator<VideoSize> CREATOR = null;
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_UNAPPLIED_ROTATION_DEGREES = 0;
    private static final int DEFAULT_WIDTH = 0;
    private static final String FIELD_HEIGHT = null;
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = null;
    private static final String FIELD_UNAPPLIED_ROTATION_DEGREES = null;
    private static final String FIELD_WIDTH = null;
    public static final VideoSize UNKNOWN = null;
    public final int height;
    public final float pixelWidthHeightRatio;
    public final int unappliedRotationDegrees;
    public final int width;

    public VideoSize(int i, int i2) {
    }

    public static /* synthetic */ VideoSize dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static /* synthetic */ VideoSize lambda$static$0(Bundle bundle) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public VideoSize(int i, int i2, int i3, float f) {
    }
}
