package com.tencent.tinker.loader;

import android.app.Application;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SystemClassLoaderAdder {
    public static final String CHECK_DEX_CLASS = "com.tencent.tinker.loader.TinkerTestDexLoad";
    public static final String CHECK_DEX_FIELD = "isPatch";
    private static final String TAG = "Tinker.ClassLoaderAdder";
    private static int sPatchDexCount;

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$1 */
    static class C16471 implements Comparator<File> {
        final /* synthetic */ Map val$matchesClassNPatternMemo;

        C16471(Map map) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(File file, File file2) {
        }
    }

    private static final class ArkHot {
        private ArkHot() {
        }

        static /* synthetic */ void access$400(ClassLoader classLoader, List list) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, SecurityException {
        }

        private static void install(ClassLoader classLoader, List<File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, SecurityException {
        }
    }

    private static final class V14 {
        private V14() {
        }

        static /* synthetic */ void access$200(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        }

        private static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }
    }

    private static final class V19 {
        private V19() {
        }

        static /* synthetic */ void access$100(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        static /* synthetic */ Object[] access$500(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }

        private static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }
    }

    private static final class V23 {
        private V23() {
        }

        static /* synthetic */ void access$000(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        private static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        }

        private static Object[] makePathElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        }
    }

    private static final class V4 {
        private V4() {
        }

        static /* synthetic */ void access$300(ClassLoader classLoader, List list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
        }

        private static void install(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
        }
    }

    private static boolean checkDexInstall(ClassLoader classLoader) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    }

    private static List<File> createSortedAdditionalPathEntries(List<File> list) {
    }

    static void injectDexesInternal(ClassLoader classLoader, List<File> list, File file) throws Throwable {
    }

    public static void installApk(PathClassLoader pathClassLoader, List<File> list) throws Throwable {
    }

    public static void installDexes(Application application, ClassLoader classLoader, File file, List<File> list, boolean z, boolean z2) throws Throwable {
    }

    public static void uninstallPatchDex(ClassLoader classLoader) throws Throwable {
    }
}
