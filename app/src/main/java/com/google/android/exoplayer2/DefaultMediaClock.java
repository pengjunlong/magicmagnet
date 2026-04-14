package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class DefaultMediaClock implements MediaClock {
    private boolean isUsingStandaloneClock;
    private final PlaybackParametersListener listener;
    private MediaClock rendererClock;
    private Renderer rendererClockSource;
    private final StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, Clock clock) {
    }

    private boolean shouldUseStandaloneClock(boolean z) {
    }

    private void syncClocks(boolean z) {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
    }

    public void onRendererDisabled(Renderer renderer) {
    }

    public void onRendererEnabled(Renderer renderer) throws ExoPlaybackException {
    }

    public void resetPosition(long j) {
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public void start() {
    }

    public void stop() {
    }

    public long syncAndGetPositionUs(boolean z) {
    }
}
