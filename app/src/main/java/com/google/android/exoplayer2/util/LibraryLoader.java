package com.google.android.exoplayer2.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    public LibraryLoader(String... strArr) {
    }

    public synchronized boolean isAvailable() {
    }

    protected abstract void loadLibrary(String str);

    public synchronized void setLibraries(String... strArr) {
    }
}
