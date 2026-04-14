package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
        }

        public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(EventDispatcher eventDispatcher, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public static /* synthetic */ void dbppbdqpeLmcbs11l11(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(EventDispatcher eventDispatcher, boolean z) {
        }

        public static /* synthetic */ void ddbbbeXHXx111ll(EventDispatcher eventDispatcher, long j) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        }

        public static /* synthetic */ void dpbdpqRKAscW1lll1l(EventDispatcher eventDispatcher, Exception exc) {
        }

        public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(EventDispatcher eventDispatcher, int i, long j, long j2) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(EventDispatcher eventDispatcher, String str) {
        }

        public static /* synthetic */ void dqqppqiKzJi1l1lll1l(EventDispatcher eventDispatcher, Exception exc) {
        }

        private /* synthetic */ void lambda$audioCodecError$9(Exception exc) {
        }

        private /* synthetic */ void lambda$audioSinkError$8(Exception exc) {
        }

        private /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
        }

        private /* synthetic */ void lambda$decoderReleased$5(String str) {
        }

        private /* synthetic */ void lambda$disabled$6(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void lambda$inputFormatChanged$2(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        private /* synthetic */ void lambda$positionAdvancing$3(long j) {
        }

        private /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean z) {
        }

        private /* synthetic */ void lambda$underrun$4(int i, long j, long j2) {
        }

        public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(EventDispatcher eventDispatcher, String str, long j, long j2) {
        }

        public void audioCodecError(Exception exc) {
        }

        public void audioSinkError(Exception exc) {
        }

        public void decoderInitialized(String str, long j, long j2) {
        }

        public void decoderReleased(String str) {
        }

        public void disabled(DecoderCounters decoderCounters) {
        }

        public void enabled(DecoderCounters decoderCounters) {
        }

        public void inputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public void positionAdvancing(long j) {
        }

        public void skipSilenceEnabledChanged(boolean z) {
        }

        public void underrun(int i, long j, long j2) {
        }
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    @Deprecated
    void onAudioInputFormatChanged(Format format);

    void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);
}
