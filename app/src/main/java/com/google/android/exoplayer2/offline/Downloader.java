package com.google.android.exoplayer2.offline;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(ProgressListener progressListener) throws IOException, InterruptedException;

    void remove();
}
