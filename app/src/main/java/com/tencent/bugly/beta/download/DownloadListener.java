package com.tencent.bugly.beta.download;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface DownloadListener {
    void onCompleted(DownloadTask downloadTask);

    void onFailed(DownloadTask downloadTask, int i, String str);

    void onReceive(DownloadTask downloadTask);
}
