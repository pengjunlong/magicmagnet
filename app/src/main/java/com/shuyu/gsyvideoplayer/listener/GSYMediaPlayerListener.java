package com.shuyu.gsyvideoplayer.listener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface GSYMediaPlayerListener {
    void onAutoCompletion();

    void onBackFullscreen();

    void onBufferingUpdate(int i);

    void onCompletion();

    void onError(int i, int i2);

    void onInfo(int i, int i2);

    void onPrepared();

    void onSeekComplete();

    void onVideoPause();

    void onVideoResume();

    void onVideoResume(boolean z);

    void onVideoSizeChanged();
}
