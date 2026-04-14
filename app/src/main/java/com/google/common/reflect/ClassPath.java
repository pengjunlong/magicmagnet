package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ClassPath {
    private static final String CLASS_FILE_NAME_EXTENSION = ".class";
    private static final Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = null;
    private static final Logger logger = null;
    private final ImmutableSet<ResourceInfo> resources;

    /* renamed from: com.google.common.reflect.ClassPath$1 */
    class C09631 implements Predicate<ClassInfo> {
        C09631(ClassPath classPath) {
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(ClassInfo classInfo) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public boolean apply2(ClassInfo classInfo) {
        }
    }

    @Beta
    public static final class ClassInfo extends ResourceInfo {
        private final String className;

        ClassInfo(File file, String str, ClassLoader classLoader) {
        }

        public String getName() {
        }

        public String getPackageName() {
        }

        public String getSimpleName() {
        }

        public boolean isTopLevel() {
        }

        public Class<?> load() {
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
        }
    }

    static final class LocationInfo {
        private final ClassLoader classloader;
        final File home;

        LocationInfo(File file, ClassLoader classLoader) {
        }

        private void scan(File file, Set<File> set, ImmutableSet.Builder<ResourceInfo> builder) throws IOException {
        }

        private void scanDirectory(File file, ImmutableSet.Builder<ResourceInfo> builder) throws IOException {
        }

        private void scanJar(File file, Set<File> set, ImmutableSet.Builder<ResourceInfo> builder) throws IOException {
        }

        private void scanJarFile(JarFile jarFile, ImmutableSet.Builder<ResourceInfo> builder) {
        }

        public boolean equals(Object obj) {
        }

        public final File file() {
        }

        public int hashCode() {
        }

        public ImmutableSet<ResourceInfo> scanResources() throws IOException {
        }

        public String toString() {
        }

        public ImmutableSet<ResourceInfo> scanResources(Set<File> set) throws IOException {
        }

        private void scanDirectory(File file, String str, Set<File> set, ImmutableSet.Builder<ResourceInfo> builder) throws IOException {
        }
    }

    @Beta
    public static class ResourceInfo {
        private final File file;
        final ClassLoader loader;
        private final String resourceName;

        ResourceInfo(File file, String str, ClassLoader classLoader) {
        }

        static ResourceInfo of(File file, String str, ClassLoader classLoader) {
        }

        public final ByteSource asByteSource() {
        }

        public final CharSource asCharSource(Charset charset) {
        }

        public boolean equals(Object obj) {
        }

        final File getFile() {
        }

        public final String getResourceName() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public final URL url() {
        }
    }

    private ClassPath(ImmutableSet<ResourceInfo> immutableSet) {
    }

    static /* synthetic */ Logger access$000() {
    }

    public static ClassPath from(ClassLoader classLoader) throws IOException {
    }

    private static ImmutableList<URL> getClassLoaderUrls(ClassLoader classLoader) {
    }

    @VisibleForTesting
    static String getClassName(String str) {
    }

    @VisibleForTesting
    static ImmutableMap<File, ClassLoader> getClassPathEntries(ClassLoader classLoader) {
    }

    @VisibleForTesting
    static URL getClassPathEntry(File file, String str) throws MalformedURLException {
    }

    @VisibleForTesting
    static ImmutableSet<File> getClassPathFromManifest(File file, Manifest manifest) {
    }

    static ImmutableSet<LocationInfo> locationsFrom(ClassLoader classLoader) {
    }

    @VisibleForTesting
    static ImmutableList<URL> parseJavaClassPath() {
    }

    @VisibleForTesting
    static File toFile(URL url) {
    }

    public ImmutableSet<ClassInfo> getAllClasses() {
    }

    public ImmutableSet<ResourceInfo> getResources() {
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses() {
    }

    public ImmutableSet<ClassInfo> getTopLevelClassesRecursive(String str) {
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses(String str) {
    }
}
