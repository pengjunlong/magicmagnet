package com.google.firebase.crashlytics.ndk;

import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
interface CrashFilesManager {
    void cleanOldSessionFileDirectories();

    void deleteSessionFileDirectory(String str);

    File getSessionFileDirectory(String str);

    boolean hasSessionFileDirectory(String str);
}
