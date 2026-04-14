package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AudioBecomingNoisyManager {
    private final Context context;
    private final AudioBecomingNoisyReceiver receiver;
    private boolean receiverRegistered;

    private final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        private final Handler eventHandler;
        private final EventListener listener;
        final /* synthetic */ AudioBecomingNoisyManager this$0;

        public AudioBecomingNoisyReceiver(AudioBecomingNoisyManager audioBecomingNoisyManager, Handler handler, EventListener eventListener) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
    }

    static /* synthetic */ boolean access$000(AudioBecomingNoisyManager audioBecomingNoisyManager) {
    }

    public void setEnabled(boolean z) {
    }
}
