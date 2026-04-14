package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    private final String name;

    /* renamed from: com.google.android.exoplayer2.text.SimpleSubtitleDecoder$1 */
    class C02001 extends SubtitleOutputBuffer {
        final /* synthetic */ SimpleSubtitleDecoder this$0;

        C02001(SimpleSubtitleDecoder simpleSubtitleDecoder) {
        }

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        public void release() {
        }
    }

    protected SimpleSubtitleDecoder(String str) {
    }

    static /* synthetic */ void access$000(SimpleSubtitleDecoder simpleSubtitleDecoder, DecoderOutputBuffer decoderOutputBuffer) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    protected /* bridge */ /* synthetic */ SubtitleInputBuffer createInputBuffer() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    protected /* bridge */ /* synthetic */ SubtitleOutputBuffer createOutputBuffer() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    protected /* bridge */ /* synthetic */ SubtitleDecoderException createUnexpectedDecodeException(Throwable th) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    protected /* bridge */ /* synthetic */ SubtitleDecoderException decode(SubtitleInputBuffer subtitleInputBuffer, SubtitleOutputBuffer subtitleOutputBuffer, boolean z) {
    }

    protected abstract Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: createInputBuffer, reason: avoid collision after fix types in other method */
    protected final SubtitleInputBuffer createInputBuffer2() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: createOutputBuffer, reason: avoid collision after fix types in other method */
    protected final SubtitleOutputBuffer createOutputBuffer2() {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: createUnexpectedDecodeException, reason: avoid collision after fix types in other method */
    protected final SubtitleDecoderException createUnexpectedDecodeException2(Throwable th) {
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected final SubtitleDecoderException decode2(SubtitleInputBuffer subtitleInputBuffer, SubtitleOutputBuffer subtitleOutputBuffer, boolean z) {
    }
}
