package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class BundleUtil {
    private static final String TAG = "BundleUtil";
    private static Method getIBinderMethod;
    private static Method putIBinderMethod;

    private BundleUtil() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
    }

    private static IBinder getBinderByReflection(Bundle bundle, String str) {
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
    }

    private static void putBinderByReflection(Bundle bundle, String str, IBinder iBinder) {
    }
}
