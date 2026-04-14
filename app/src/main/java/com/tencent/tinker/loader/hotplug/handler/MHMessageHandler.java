package com.tencent.tinker.loader.hotplug.handler;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MHMessageHandler implements HandlerMessageInterceptor.MessageHandler {
    private static final int LAUNCH_ACTIVITY = 0;
    private static final String TAG = "Tinker.MHMsgHndlr";
    private final Context mContext;

    public MHMessageHandler(Context context) {
    }

    private <T> void copyInstanceFields(T t, T t2) {
    }

    private void fixActivityScreenOrientation(Object obj, int i) {
    }

    private void fixStubActivityInfo(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler
    public boolean handleMessage(Message message) {
    }
}
