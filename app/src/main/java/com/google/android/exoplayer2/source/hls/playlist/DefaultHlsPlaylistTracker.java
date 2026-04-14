package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final HlsPlaylistTracker.Factory FACTORY = null;
    private final HlsDataSourceFactory dataSourceFactory;
    private MediaSourceEventListener.EventDispatcher eventDispatcher;
    private Loader initialPlaylistLoader;
    private long initialStartTimeUs;
    private boolean isLive;
    private final CopyOnWriteArrayList<HlsPlaylistTracker.PlaylistEventListener> listeners;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private HlsMultivariantPlaylist multivariantPlaylist;
    private final HashMap<Uri, MediaPlaylistBundle> playlistBundles;
    private final HlsPlaylistParserFactory playlistParserFactory;
    private Handler playlistRefreshHandler;
    private final double playlistStuckTargetDurationCoefficient;
    private HlsMediaPlaylist primaryMediaPlaylistSnapshot;
    private Uri primaryMediaPlaylistUrl;
    private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;

    private class FirstPrimaryMediaPlaylistListener implements HlsPlaylistTracker.PlaylistEventListener {
        final /* synthetic */ DefaultHlsPlaylistTracker this$0;

        private FirstPrimaryMediaPlaylistListener(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public void onPlaylistChanged() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        }

        /* synthetic */ FirstPrimaryMediaPlaylistListener(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, C01831 c01831) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class MediaPlaylistBundle implements Loader.Callback<ParsingLoadable<HlsPlaylist>> {
        private static final String BLOCK_MSN_PARAM = "_HLS_msn";
        private static final String BLOCK_PART_PARAM = "_HLS_part";
        private static final String SKIP_PARAM = "_HLS_skip";
        private long earliestNextLoadTimeMs;
        private long excludeUntilMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final DataSource mediaPlaylistDataSource;
        private final Loader mediaPlaylistLoader;
        private IOException playlistError;
        private HlsMediaPlaylist playlistSnapshot;
        private final Uri playlistUrl;
        final /* synthetic */ DefaultHlsPlaylistTracker this$0;

        public MediaPlaylistBundle(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri) {
        }

        static /* synthetic */ boolean access$000(MediaPlaylistBundle mediaPlaylistBundle, long j) {
        }

        static /* synthetic */ void access$200(MediaPlaylistBundle mediaPlaylistBundle, HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
        }

        static /* synthetic */ long access$300(MediaPlaylistBundle mediaPlaylistBundle) {
        }

        static /* synthetic */ Uri access$400(MediaPlaylistBundle mediaPlaylistBundle) {
        }

        static /* synthetic */ void access$500(MediaPlaylistBundle mediaPlaylistBundle, Uri uri) {
        }

        static /* synthetic */ HlsMediaPlaylist access$600(MediaPlaylistBundle mediaPlaylistBundle) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MediaPlaylistBundle mediaPlaylistBundle, Uri uri) {
        }

        private boolean excludePlaylist(long j) {
        }

        private Uri getMediaPlaylistUriForReload() {
        }

        private /* synthetic */ void lambda$loadPlaylistInternal$0(Uri uri) {
        }

        private void loadPlaylistImmediately(Uri uri) {
        }

        private void loadPlaylistInternal(Uri uri) {
        }

        private void processLoadedPlaylist(HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
        }

        public HlsMediaPlaylist getPlaylistSnapshot() {
        }

        public boolean isSnapshotValid() {
        }

        public void loadPlaylist() {
        }

        public void maybeThrowPlaylistRefreshError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
        }

        public void release() {
        }

        /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
        }

        /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
        }

        /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
    }

    static /* synthetic */ boolean access$1000(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
    }

    static /* synthetic */ Handler access$1100(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ HlsMultivariantPlaylist access$1200(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ HlsPlaylistParserFactory access$1300(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ HlsMediaPlaylist access$1400(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
    }

    static /* synthetic */ void access$1500(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri, HlsMediaPlaylist hlsMediaPlaylist) {
    }

    static /* synthetic */ double access$1600(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ Uri access$1700(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ boolean access$1800(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ CopyOnWriteArrayList access$1900(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ HlsMediaPlaylist access$2000(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ HashMap access$2100(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ HlsDataSourceFactory access$700(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ MediaSourceEventListener.EventDispatcher access$800(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    static /* synthetic */ LoadErrorHandlingPolicy access$900(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    private void createBundles(List<Uri> list) {
    }

    private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
    }

    private HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
    }

    private int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
    }

    private long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
    }

    private Uri getRequestUriForPrimaryChange(Uri uri) {
    }

    private boolean isVariantUrl(Uri uri) {
    }

    private boolean maybeSelectNewPrimaryUrl() {
    }

    private void maybeSetPrimaryUrl(Uri uri) {
    }

    private boolean notifyPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
    }

    private void onPlaylistUpdated(Uri uri, HlsMediaPlaylist hlsMediaPlaylist) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void addListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean excludeMediaPlaylist(Uri uri, long j) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public HlsMultivariantPlaylist getMultivariantPlaylist() {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public HlsMediaPlaylist getPlaylistSnapshot(Uri uri, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(Uri uri) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(Uri uri) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(Uri uri) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void removeListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void start(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, double d) {
    }

    /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
    public void onLoadCanceled2(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
    }

    /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
    public void onLoadCompleted2(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
    }

    /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
    public Loader.LoadErrorAction onLoadError2(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException, int i) {
    }
}
