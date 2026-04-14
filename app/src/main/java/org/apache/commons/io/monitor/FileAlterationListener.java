package org.apache.commons.io.monitor;

import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface FileAlterationListener {
    void onDirectoryChange(File file);

    void onDirectoryCreate(File file);

    void onDirectoryDelete(File file);

    void onFileChange(File file);

    void onFileCreate(File file);

    void onFileDelete(File file);

    void onStart(FileAlterationObserver fileAlterationObserver);

    void onStop(FileAlterationObserver fileAlterationObserver);
}
