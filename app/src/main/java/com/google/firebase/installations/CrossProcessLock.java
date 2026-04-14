package com.google.firebase.installations;

import android.content.Context;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CrossProcessLock {
    private static final String TAG = "CrossProcessLock";
    private final FileChannel channel;
    private final FileLock lock;

    private CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
    }

    static CrossProcessLock acquire(Context context, String str) {
    }

    void releaseAndClose() {
    }
}
