package com.tencent.tinker.loader.hotplug.handler;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import java.lang.reflect.Method;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AMSInterceptHandler implements ServiceBinderInterceptor.BinderInvocationHandler {
    private static final int INTENT_SENDER_ACTIVITY = 0;
    private static final String TAG = "Tinker.AMSIntrcptHndlr";
    private static final int[] TRANSLUCENT_ATTR_ID = null;
    private final Context mContext;

    public AMSInterceptHandler(Context context) {
    }

    private Object handleGetIntentSender(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    private Object handleStartActivities(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    private Object handleStartActivity(Object obj, Method method, Object[] objArr) throws Throwable {
    }

    private boolean hasTransparentTheme(ActivityInfo activityInfo) {
    }

    private void processActivityIntent(Intent intent) {
    }

    private void storeAndReplaceOriginalComponentName(Intent intent, String str, String str2, String str3) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
    }
}
