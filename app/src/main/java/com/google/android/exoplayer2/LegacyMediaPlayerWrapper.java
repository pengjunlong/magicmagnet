package com.google.android.exoplayer2;

import android.media.MediaPlayer;
import android.os.Looper;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class LegacyMediaPlayerWrapper extends SimpleBasePlayer {
    private boolean playWhenReady;
    private final MediaPlayer player;

    public LegacyMediaPlayerWrapper(Looper looper) {
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    protected SimpleBasePlayer.State getState() {
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    protected ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
    }
}
