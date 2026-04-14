package com.tencent.tinker.loader;

import android.annotation.SuppressLint;
import com.tencent.tinker.anno.Keep;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

@SuppressLint({"NewApi"})
@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TinkerClassLoader extends PathClassLoader {
    private final ClassLoader mOriginAppClassLoader;

    @Keep
    class CompoundEnumeration<E> implements Enumeration<E> {
        private Enumeration<E>[] enums;
        private int index;
        final /* synthetic */ TinkerClassLoader this$0;

        public CompoundEnumeration(TinkerClassLoader tinkerClassLoader, Enumeration<E>[] enumerationArr) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public E nextElement() {
        }
    }

    TinkerClassLoader(String str, File file, String str2, ClassLoader classLoader) {
    }

    private static void injectDexPath(ClassLoader classLoader, String str, File file) {
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Class<?> findClass(String str) throws ClassNotFoundException {
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
    }
}
