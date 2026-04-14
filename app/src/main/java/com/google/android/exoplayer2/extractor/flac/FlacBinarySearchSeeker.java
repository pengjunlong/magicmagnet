package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    private static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        /* synthetic */ FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i, C01061 c01061) {
        }

        private long findNextFrame(ExtractorInput extractorInput) throws IOException {
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public /* synthetic */ void onSeekFinished() {
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException {
        }

        private FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i) {
        }
    }

    public FlacBinarySearchSeeker(FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
    }
}
