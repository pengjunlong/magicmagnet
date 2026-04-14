package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private final EventMessageDecoder decoder;
    private long expiredManifestPublishTimeUs;
    private final Handler handler;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;

    private static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j, long j2) {
        }
    }

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final MetadataInputBuffer buffer;
        private final FormatHolder formatHolder;
        private long maxLoadedChunkEndTimeUs;
        private final SampleQueue sampleQueue;
        final /* synthetic */ PlayerEmsgHandler this$0;

        PlayerTrackEmsgHandler(PlayerEmsgHandler playerEmsgHandler, Allocator allocator) {
        }

        private MetadataInputBuffer dequeueSample() {
        }

        private void onManifestExpiredMessageEncountered(long j, long j2) {
        }

        private void parseAndDiscardSamples() {
        }

        private void parsePlayerEmsgEvent(long j, EventMessage eventMessage) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        }

        public void onChunkLoadCompleted(Chunk chunk) {
        }

        public boolean onChunkLoadError(Chunk chunk) {
        }

        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        }
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
    }

    static /* synthetic */ EventMessageDecoder access$000(PlayerEmsgHandler playerEmsgHandler) {
    }

    static /* synthetic */ boolean access$100(String str, String str2) {
    }

    static /* synthetic */ long access$200(EventMessage eventMessage) {
    }

    static /* synthetic */ Handler access$300(PlayerEmsgHandler playerEmsgHandler) {
    }

    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j) {
    }

    private static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
    }

    private void handleManifestExpiredMessage(long j, long j2) {
    }

    private static boolean isPlayerEmsgEvent(String str, String str2) {
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
    }

    private void notifyManifestPublishTimeExpired() {
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
    }

    void onChunkLoadCompleted(Chunk chunk) {
    }

    boolean onChunkLoadError(boolean z) {
    }

    public void release() {
    }

    public void updateManifest(DashManifest dashManifest) {
    }
}
