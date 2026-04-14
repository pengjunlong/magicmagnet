package com.shuyu.gsyvideoplayer.render.view.listener;

import android.view.Surface;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface IGSYSurfaceListener {
    void onSurfaceAvailable(Surface surface);

    boolean onSurfaceDestroyed(Surface surface);

    void onSurfaceSizeChanged(Surface surface, int i, int i2);

    void onSurfaceUpdated(Surface surface);
}
