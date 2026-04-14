package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.common.collect.ImmutableList;
import java.util.Deque;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ExoplayerCuesDecoder implements SubtitleDecoder {
    private static final int INPUT_BUFFER_AVAILABLE = 0;
    private static final int INPUT_BUFFER_DEQUEUED = 1;
    private static final int INPUT_BUFFER_QUEUED = 2;
    private static final int OUTPUT_BUFFERS_COUNT = 2;
    private final Deque<SubtitleOutputBuffer> availableOutputBuffers;
    private final CueDecoder cueDecoder;
    private final SubtitleInputBuffer inputBuffer;
    private int inputBufferState;
    private boolean released;

    /* renamed from: com.google.android.exoplayer2.text.ExoplayerCuesDecoder$1 */
    class C01991 extends SubtitleOutputBuffer {
        final /* synthetic */ ExoplayerCuesDecoder this$0;

        C01991(ExoplayerCuesDecoder exoplayerCuesDecoder) {
        }

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        public void release() {
        }
    }

    private static final class SingleEventSubtitle implements Subtitle {
        private final ImmutableList<Cue> cues;
        private final long timeUs;

        public SingleEventSubtitle(long j, ImmutableList<Cue> immutableList) {
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public List<Cue> getCues(long j) {
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public long getEventTime(int i) {
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getEventTimeCount() {
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getNextEventTimeIndex(long j) {
        }
    }

    static /* synthetic */ void access$000(ExoplayerCuesDecoder exoplayerCuesDecoder, SubtitleOutputBuffer subtitleOutputBuffer) {
    }

    private void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
    }

    /* renamed from: queueInputBuffer, reason: avoid collision after fix types in other method */
    public void queueInputBuffer2(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
    }
}
