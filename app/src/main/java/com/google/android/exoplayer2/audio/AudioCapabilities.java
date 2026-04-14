package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AudioCapabilities {
    private static final ImmutableMap<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = null;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = null;
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final AudioCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = null;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;

    private static final class Api29 {
        private static final android.media.AudioAttributes DEFAULT_AUDIO_ATTRIBUTES = null;

        private Api29() {
        }

        public static int[] getDirectPlaybackSupportedEncodings() {
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
        }
    }

    public AudioCapabilities(int[] iArr, int i) {
    }

    static /* synthetic */ ImmutableMap access$000() {
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
    }

    public static AudioCapabilities getCapabilities(Context context) {
    }

    private static int getChannelConfigForPassthrough(int i) {
    }

    static Uri getExternalSurroundSoundGlobalSettingUri() {
    }

    private static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
    }

    public boolean equals(Object obj) {
    }

    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
    }

    public int getMaxChannelCount() {
    }

    public int hashCode() {
    }

    public boolean isPassthroughPlaybackSupported(Format format) {
    }

    public boolean supportsEncoding(int i) {
    }

    public String toString() {
    }

    @SuppressLint({"InlinedApi"})
    static AudioCapabilities getCapabilities(Context context, Intent intent) {
    }
}
