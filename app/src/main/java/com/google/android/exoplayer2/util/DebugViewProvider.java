package com.google.android.exoplayer2.util;

import android.view.SurfaceView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = null;

    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
