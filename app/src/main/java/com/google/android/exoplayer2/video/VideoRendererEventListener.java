package com.google.android.exoplayer2.video;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        }

        public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(EventDispatcher eventDispatcher, Object obj, long j) {
        }

        public static /* synthetic */ void dbppbdqpeLmcbs11l11(EventDispatcher eventDispatcher, long j, int i) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        }

        public static /* synthetic */ void ddbbbeXHXx111ll(EventDispatcher eventDispatcher, VideoSize videoSize) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(EventDispatcher eventDispatcher, String str) {
        }

        public static /* synthetic */ void dpbdpqRKAscW1lll1l(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        }

        public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(EventDispatcher eventDispatcher, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(EventDispatcher eventDispatcher, String str, long j, long j2) {
        }

        public static /* synthetic */ void dqqppqiKzJi1l1lll1l(EventDispatcher eventDispatcher, Exception exc) {
        }

        private /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
        }

        private /* synthetic */ void lambda$decoderReleased$7(String str) {
        }

        private /* synthetic */ void lambda$disabled$8(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void lambda$droppedFrames$3(int i, long j) {
        }

        private /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void lambda$inputFormatChanged$2(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        private /* synthetic */ void lambda$renderedFirstFrame$6(Object obj, long j) {
        }

        private /* synthetic */ void lambda$reportVideoFrameProcessingOffset$4(long j, int i) {
        }

        private /* synthetic */ void lambda$videoCodecError$9(Exception exc) {
        }

        private /* synthetic */ void lambda$videoSizeChanged$5(VideoSize videoSize) {
        }

        public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(EventDispatcher eventDispatcher, int i, long j) {
        }

        public void decoderInitialized(String str, long j, long j2) {
        }

        public void decoderReleased(String str) {
        }

        public void disabled(DecoderCounters decoderCounters) {
        }

        public void droppedFrames(int i, long j) {
        }

        public void enabled(DecoderCounters decoderCounters) {
        }

        public void inputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public void renderedFirstFrame(Object obj) {
        }

        public void reportVideoFrameProcessingOffset(long j, int i) {
        }

        public void videoCodecError(Exception exc) {
        }

        public void videoSizeChanged(VideoSize videoSize) {
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Object obj, long j);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j, int i);

    @Deprecated
    void onVideoInputFormatChanged(Format format);

    void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(VideoSize videoSize);
}
