package com.xunlei.downloadlib;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ReLinker {
    private static final int COPY_BUFFER_SIZE = 4096;
    private static final String LIB_DIR = "lib";
    private static final int MAX_TRIES = 5;
    private static final String TAG = "Relinker";

    private static class MissingLibraryException extends RuntimeException {
        public MissingLibraryException(String str) {
        }
    }

    private ReLinker() {
    }

    private static void closeSilently(Closeable closeable) {
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) {
    }

    private static String[] getSupportedABIs() {
    }

    private static File getWorkaroundLibDir(Context context) {
    }

    private static File getWorkaroundLibFile(Context context, String str) {
    }

    public static void loadLibrary(Context context, String str) {
    }

    @SuppressLint({"NewApi"})
    private static void unpackLibrary(Context context, String str) {
    }
}
