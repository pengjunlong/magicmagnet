package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.zip.Inflater;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private final ParsableByteArray buffer;
    private final CueBuilder cueBuilder;
    private final ParsableByteArray inflatedBuffer;
    private Inflater inflater;

    private static final class CueBuilder {
        private final ParsableByteArray bitmapData;
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private final int[] colors;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;

        static /* synthetic */ void access$000(CueBuilder cueBuilder, ParsableByteArray parsableByteArray, int i) {
        }

        static /* synthetic */ void access$100(CueBuilder cueBuilder, ParsableByteArray parsableByteArray, int i) {
        }

        static /* synthetic */ void access$200(CueBuilder cueBuilder, ParsableByteArray parsableByteArray, int i) {
        }

        private void parseBitmapSection(ParsableByteArray parsableByteArray, int i) {
        }

        private void parseIdentifierSection(ParsableByteArray parsableByteArray, int i) {
        }

        private void parsePaletteSection(ParsableByteArray parsableByteArray, int i) {
        }

        public Cue build() {
        }

        public void reset() {
        }
    }

    private void maybeInflateData(ParsableByteArray parsableByteArray) {
    }

    private static Cue readNextSection(ParsableByteArray parsableByteArray, CueBuilder cueBuilder) {
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
    }
}
