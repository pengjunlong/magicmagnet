package com.tencent.tinker.loader.hotplug;

import android.content.Context;
import android.os.Handler;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ComponentHotplug {
    private static final String TAG = "Tinker.ComponentHotplug";
    private static ServiceBinderInterceptor sAMSInterceptor = null;
    private static volatile boolean sInstalled = false;
    private static HandlerMessageInterceptor sMHMessageInterceptor;
    private static ServiceBinderInterceptor sPMSInterceptor;
    private static TinkerHackInstrumentation sTinkerHackInstrumentation;

    private ComponentHotplug() {
    }

    public static synchronized void ensureComponentHotplugInstalled(TinkerApplication tinkerApplication) throws UnsupportedEnvironmentException {
    }

    private static Handler fetchMHInstance(Context context) {
    }

    public static synchronized void install(TinkerApplication tinkerApplication, ShareSecurityCheck shareSecurityCheck) throws UnsupportedEnvironmentException {
    }

    public static synchronized void uninstall() {
    }
}
