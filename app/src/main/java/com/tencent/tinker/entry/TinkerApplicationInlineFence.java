package com.tencent.tinker.entry;

import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.anno.Keep;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TinkerApplicationInlineFence extends Handler {
    private final ApplicationLike mAppLike;

    public TinkerApplicationInlineFence(ApplicationLike applicationLike) {
    }

    private static void dummyThrowExceptionMethod() {
    }

    private void handleMessageImpl(Message message) {
    }

    private void handleMessage_$noinline$(Message message) {
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }
}
