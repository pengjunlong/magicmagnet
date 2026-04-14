package com.google.android.exoplayer2.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import java.io.IOException;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = null;
    private static final String TAG = "MediaPrsrChunkExtractor";
    private final DummyTrackOutput dummyTrackOutput;
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;
    private Format[] sampleFormats;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final TrackOutputProviderAdapter trackOutputProviderAdapter;

    private class TrackOutputProviderAdapter implements ExtractorOutput {
        final /* synthetic */ MediaParserChunkExtractor this$0;

        private TrackOutputProviderAdapter(MediaParserChunkExtractor mediaParserChunkExtractor) {
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

        /* synthetic */ TrackOutputProviderAdapter(MediaParserChunkExtractor mediaParserChunkExtractor, C01701 c01701) {
        }
    }

    @SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int i, Format format, List<Format> list, PlayerId playerId) {
    }

    static /* synthetic */ ChunkExtractor.TrackOutputProvider access$100(MediaParserChunkExtractor mediaParserChunkExtractor) {
    }

    static /* synthetic */ DummyTrackOutput access$200(MediaParserChunkExtractor mediaParserChunkExtractor) {
    }

    static /* synthetic */ Format[] access$302(MediaParserChunkExtractor mediaParserChunkExtractor, Format[] formatArr) {
    }

    static /* synthetic */ OutputConsumerAdapterV30 access$400(MediaParserChunkExtractor mediaParserChunkExtractor) {
    }

    public static /* synthetic */ ChunkExtractor dbpqdHhmDSIHIJiwc1ll1l1(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
    }

    private static /* synthetic */ ChunkExtractor lambda$static$0(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
    }

    private void maybeExecutePendingSeek() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public ChunkIndex getChunkIndex() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public Format[] getSampleFormats() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
    }
}
