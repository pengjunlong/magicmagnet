package com.google.android.exoplayer2.extractor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = null;

    /* renamed from: com.google.android.exoplayer2.extractor.ExtractorOutput$1 */
    class C01031 implements ExtractorOutput {
        C01031() {
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

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i, int i2);
}
