package com.google.android.exoplayer2.source.dash.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.BaseUrlExclusionList;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    /* renamed from: com.google.android.exoplayer2.source.dash.offline.DashDownloader$1 */
    class C01741 extends RunnableFutureTask<ChunkIndex, IOException> {
        final /* synthetic */ DataSource val$dataSource;
        final /* synthetic */ Representation val$representation;
        final /* synthetic */ int val$trackType;

        C01741(DashDownloader dashDownloader, DataSource dataSource, int i, Representation representation) {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected /* bridge */ /* synthetic */ ChunkIndex doWork() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected ChunkIndex doWork() throws IOException {
        }
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
    }

    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j, long j2, boolean z, ArrayList<SegmentDownloader.Segment> arrayList) throws IOException, InterruptedException {
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j, RangedUri rangedUri) {
    }

    private DashSegmentIndex getSegmentIndex(DataSource dataSource, int i, Representation representation, boolean z) throws IOException, InterruptedException {
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    protected /* bridge */ /* synthetic */ List getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws IOException, InterruptedException {
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
    }

    /* renamed from: getSegments, reason: avoid collision after fix types in other method */
    protected List<SegmentDownloader.Segment> getSegments2(DataSource dataSource, DashManifest dashManifest, boolean z) throws IOException, InterruptedException {
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j) {
    }
}
