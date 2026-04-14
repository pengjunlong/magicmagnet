package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AudioCapabilitiesReceiver {
    AudioCapabilities audioCapabilities;
    private final Context context;
    private final ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final Handler handler;
    private final Listener listener;
    private final BroadcastReceiver receiver;
    private boolean registered;

    private final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        private final ContentResolver resolver;
        private final Uri settingUri;
        final /* synthetic */ AudioCapabilitiesReceiver this$0;

        public ExternalSurroundSoundSettingObserver(AudioCapabilitiesReceiver audioCapabilitiesReceiver, Handler handler, ContentResolver contentResolver, Uri uri) {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
        }

        public void register() {
        }

        public void unregister() {
        }
    }

    private final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ AudioCapabilitiesReceiver this$0;

        private HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver audioCapabilitiesReceiver, C00861 c00861) {
        }
    }

    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    public AudioCapabilitiesReceiver(Context context, Listener listener) {
    }

    static /* synthetic */ void access$100(AudioCapabilitiesReceiver audioCapabilitiesReceiver, AudioCapabilities audioCapabilities) {
    }

    static /* synthetic */ Context access$200(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
    }

    private void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
    }

    public AudioCapabilities register() {
    }

    public void unregister() {
    }
}
