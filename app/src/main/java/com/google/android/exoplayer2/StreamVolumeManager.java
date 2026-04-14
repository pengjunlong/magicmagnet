package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private static final int VOLUME_FLAGS = 1;
    private final Context applicationContext;
    private final AudioManager audioManager;
    private final Handler eventHandler;
    private final Listener listener;
    private boolean muted;
    private VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    private final class VolumeChangeReceiver extends BroadcastReceiver {
        final /* synthetic */ StreamVolumeManager this$0;

        private VolumeChangeReceiver(StreamVolumeManager streamVolumeManager) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(StreamVolumeManager streamVolumeManager) {
        }

        private static /* synthetic */ void lambda$onReceive$0(StreamVolumeManager streamVolumeManager) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ VolumeChangeReceiver(StreamVolumeManager streamVolumeManager, C00801 c00801) {
        }
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
    }

    static /* synthetic */ Handler access$100(StreamVolumeManager streamVolumeManager) {
    }

    static /* synthetic */ void access$200(StreamVolumeManager streamVolumeManager) {
    }

    private static boolean getMutedFromManager(AudioManager audioManager, int i) {
    }

    private static int getVolumeFromManager(AudioManager audioManager, int i) {
    }

    private void updateVolumeAndNotifyIfChanged() {
    }

    public void decreaseVolume() {
    }

    public int getMaxVolume() {
    }

    public int getMinVolume() {
    }

    public int getVolume() {
    }

    public void increaseVolume() {
    }

    public boolean isMuted() {
    }

    public void release() {
    }

    public void setMuted(boolean z) {
    }

    public void setStreamType(int i) {
    }

    public void setVolume(int i) {
    }
}
