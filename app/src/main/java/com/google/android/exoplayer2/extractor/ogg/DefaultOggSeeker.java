package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final OggPageHeader pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    private final class OggSeekMap implements SeekMap {
        final /* synthetic */ DefaultOggSeeker this$0;

        private OggSeekMap(DefaultOggSeeker defaultOggSeeker) {
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

        /* synthetic */ OggSeekMap(DefaultOggSeeker defaultOggSeeker, C01111 c01111) {
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z) {
    }

    static /* synthetic */ StreamReader access$100(DefaultOggSeeker defaultOggSeeker) {
    }

    static /* synthetic */ long access$200(DefaultOggSeeker defaultOggSeeker) {
    }

    static /* synthetic */ long access$300(DefaultOggSeeker defaultOggSeeker) {
    }

    static /* synthetic */ long access$400(DefaultOggSeeker defaultOggSeeker) {
    }

    private long getNextSeekPosition(ExtractorInput extractorInput) throws IOException {
    }

    private void skipToPageOfTargetGranule(ExtractorInput extractorInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public /* bridge */ /* synthetic */ SeekMap createSeekMap() {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) throws IOException {
    }

    long readGranuleOfLastPage(ExtractorInput extractorInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public void startSeek(long j) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public OggSeekMap createSeekMap() {
    }
}
