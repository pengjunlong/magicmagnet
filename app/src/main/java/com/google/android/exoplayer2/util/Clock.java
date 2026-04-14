package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface Clock {
    public static final Clock DEFAULT = null;

    HandlerWrapper createHandler(Looper looper, Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    void onThreadBlocked();

    long uptimeMillis();
}
