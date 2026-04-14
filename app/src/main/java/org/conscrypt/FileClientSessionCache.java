package org.conscrypt;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    static final Map<File, Impl> caches = null;
    private static final Logger logger = null;

    static class CacheFile extends File {
        long lastModified;
        final String name;

        CacheFile(File file, String str) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(File file) {
        }

        @Override // java.io.File
        public long lastModified() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.io.File
        public int compareTo(File file) {
        }
    }

    static class Impl implements SSLClientSessionCache {
        Map<String, File> accessOrder;
        final File directory;
        String[] initialFiles;
        int size;

        Impl(File file) throws IOException {
        }

        private void delete(File file) {
        }

        private static String fileName(String str, int i) {
        }

        private void indexFiles() {
        }

        static void logReadError(String str, File file, Throwable th) {
        }

        static void logWriteError(String str, File file, Throwable th) {
        }

        private void makeRoom() {
        }

        private static Map<String, File> newAccessOrder() {
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized byte[] getSessionData(String str, int i) {
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
        }
    }

    private FileClientSessionCache() {
    }

    static /* synthetic */ Logger access$000() {
    }

    static synchronized void reset() {
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) throws IOException {
    }
}
