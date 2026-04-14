package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    /* renamed from: com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput$1 */
    class C01071 implements SeekMap {
        final /* synthetic */ StartOffsetExtractorOutput this$0;
        final /* synthetic */ SeekMap val$seekMap;

        C01071(StartOffsetExtractorOutput startOffsetExtractorOutput, SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
        }
    }

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
    }

    static /* synthetic */ long access$000(StartOffsetExtractorOutput startOffsetExtractorOutput) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
    }
}
