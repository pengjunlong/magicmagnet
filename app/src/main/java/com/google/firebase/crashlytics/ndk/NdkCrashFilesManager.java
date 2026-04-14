package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.util.Comparator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class NdkCrashFilesManager implements CrashFilesManager {
    private static final Comparator<? super File> LATEST_SESSION_FIRST = null;
    private static final int MAX_SESSIONS = 8;
    private final File rootPath;

    NdkCrashFilesManager(File file) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(File file, File file2) {
    }

    private static /* synthetic */ int lambda$static$0(File file, File file2) {
    }

    private static File prepareDirectory(File file) {
    }

    private static void recursiveDelete(File file) {
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public void cleanOldSessionFileDirectories() {
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public void deleteSessionFileDirectory(String str) {
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public File getSessionFileDirectory(String str) {
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public boolean hasSessionFileDirectory(String str) {
    }
}
