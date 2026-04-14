package com.tencent.tinker.loader;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class NewClassLoaderInjector {
    private NewClassLoaderInjector() {
    }

    private static ClassLoader createNewClassLoader(ClassLoader classLoader, File file, boolean z, String... strArr) throws Throwable {
    }

    private static void doInject(Application application, ClassLoader classLoader) throws Throwable {
    }

    private static Field findField(Class<?> cls, String str) throws Throwable {
    }

    public static ClassLoader inject(Application application, ClassLoader classLoader, File file, boolean z, List<File> list) throws Throwable {
    }

    public static void triggerDex2Oat(Context context, File file, boolean z, String... strArr) throws Throwable {
    }
}
