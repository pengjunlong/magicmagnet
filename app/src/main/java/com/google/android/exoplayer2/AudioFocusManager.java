package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioAttributes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AudioFocusManager {
    private static final int AUDIOFOCUS_GAIN = 1;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final int AUDIOFOCUS_NONE = 0;
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    private AudioAttributes audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    private int audioFocusState;
    private final AudioManager audioManager;
    private int focusGainToRequest;
    private final AudioFocusListener focusListener;
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier;

    /* JADX INFO: Access modifiers changed from: private */
    class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private final Handler eventHandler;
        final /* synthetic */ AudioFocusManager this$0;

        public AudioFocusListener(AudioFocusManager audioFocusManager, Handler handler) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AudioFocusListener audioFocusListener, int i) {
        }

        private /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
    }

    private void abandonAudioFocusDefault() {
    }

    private void abandonAudioFocusIfHeld() {
    }

    private void abandonAudioFocusV26() {
    }

    static /* synthetic */ void access$000(AudioFocusManager audioFocusManager, int i) {
    }

    private static int convertAudioAttributesToFocusGain(AudioAttributes audioAttributes) {
    }

    private void executePlayerCommand(int i) {
    }

    private void handlePlatformAudioFocusChange(int i) {
    }

    private int requestAudioFocus() {
    }

    private int requestAudioFocusDefault() {
    }

    private int requestAudioFocusV26() {
    }

    private void setAudioFocusState(int i) {
    }

    private boolean shouldAbandonAudioFocusIfHeld(int i) {
    }

    private boolean willPauseWhenDucked() {
    }

    AudioManager.OnAudioFocusChangeListener getFocusListener() {
    }

    public float getVolumeMultiplier() {
    }

    public void release() {
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
    }

    public int updateAudioFocus(boolean z, int i) {
    }
}
