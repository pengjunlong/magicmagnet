package com.iflytek.voiceads.dex;

import android.annotation.TargetApi;
import android.content.Context;
import dalvik.system.DexClassLoader;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AdDexLoader {
    private static DexClassLoader classLoader;

    private static void changePackageClassLoader(Context context, DexClassLoader dexClassLoader) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
    }

    @TargetApi(14)
    public static Class<?> loadAdClass(Context context, String str) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
    }

    private static DexClassLoader loadDex(Context context) {
    }

    private static DexClassLoader loadRawDex(Context context) {
    }

    private static DexClassLoader loadDex(Context context, String str) {
    }
}
