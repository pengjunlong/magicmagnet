package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.HandlerWrapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class MediaSourceList {
    private static final String TAG = "MediaSourceList";
    private final HashMap<MediaSourceHolder, MediaSourceAndListener> childSources;
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final HandlerWrapper eventHandler;
    private final AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final MediaSourceListInfoRefreshListener mediaSourceListInfoListener;
    private TransferListener mediaTransferListener;
    private final PlayerId playerId;
    private ShuffleOrder shuffleOrder;

    /* JADX INFO: Access modifiers changed from: private */
    final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        private final MediaSourceHolder id;
        final /* synthetic */ MediaSourceList this$0;

        public ForwardingEventListener(MediaSourceList mediaSourceList, MediaSourceHolder mediaSourceHolder) {
        }

        public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(ForwardingEventListener forwardingEventListener, Pair pair) {
        }

        public static /* synthetic */ void dbppbdqpeLmcbs11l11(ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData) {
        }

        public static /* synthetic */ void ddbbbeXHXx111ll(ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        public static /* synthetic */ void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(ForwardingEventListener forwardingEventListener, Pair pair, Exception exc) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public static /* synthetic */ void dpbdpqRKAscW1lll1l(ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(ForwardingEventListener forwardingEventListener, Pair pair) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData) {
        }

        public static /* synthetic */ void dqqppqiKzJi1l1lll1l(ForwardingEventListener forwardingEventListener, Pair pair) {
        }

        private Pair<Integer, MediaSource.MediaPeriodId> getEventParameters(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        private /* synthetic */ void lambda$onDownstreamFormatChanged$5(Pair pair, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void lambda$onDrmKeysLoaded$7(Pair pair) {
        }

        private /* synthetic */ void lambda$onDrmKeysRemoved$10(Pair pair) {
        }

        private /* synthetic */ void lambda$onDrmKeysRestored$9(Pair pair) {
        }

        private /* synthetic */ void lambda$onDrmSessionAcquired$6(Pair pair, int i) {
        }

        private /* synthetic */ void lambda$onDrmSessionManagerError$8(Pair pair, Exception exc) {
        }

        private /* synthetic */ void lambda$onDrmSessionReleased$11(Pair pair) {
        }

        private /* synthetic */ void lambda$onLoadCanceled$2(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void lambda$onLoadCompleted$1(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void lambda$onLoadError$3(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        private /* synthetic */ void lambda$onLoadStarted$0(Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        private /* synthetic */ void lambda$onUpstreamDiscarded$4(Pair pair, MediaLoadData mediaLoadData) {
        }

        public static /* synthetic */ void pbppbpqbamJRy11l1l1(ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(ForwardingEventListener forwardingEventListener, Pair pair) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }
    }

    private static final class MediaSourceAndListener {
        public final MediaSource.MediaSourceCaller caller;
        public final ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, ForwardingEventListener forwardingEventListener) {
        }
    }

    static final class MediaSourceHolder implements MediaSourceInfoHolder {
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final Object uid;

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Timeline getTimeline() {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Object getUid() {
        }

        public void reset(int i) {
        }
    }

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
    }

    static /* synthetic */ HandlerWrapper access$000(MediaSourceList mediaSourceList) {
    }

    static /* synthetic */ MediaSource.MediaPeriodId access$100(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    static /* synthetic */ int access$200(MediaSourceHolder mediaSourceHolder, int i) {
    }

    static /* synthetic */ AnalyticsCollector access$300(MediaSourceList mediaSourceList) {
    }

    private void correctOffsets(int i, int i2) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MediaSourceList mediaSourceList, MediaSource mediaSource, Timeline timeline) {
    }

    private void disableChildSource(MediaSourceHolder mediaSourceHolder) {
    }

    private void disableUnusedMediaSources() {
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
    }

    private static Object getChildPeriodUid(Object obj) {
    }

    private static MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private static Object getMediaSourceHolderUid(Object obj) {
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
    }

    private static int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
    }

    private /* synthetic */ void lambda$prepareChildSource$0(MediaSource mediaSource, Timeline timeline) {
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
    }

    private void prepareChildSource(MediaSourceHolder mediaSourceHolder) {
    }

    private void removeMediaSourcesInternal(int i, int i2) {
    }

    public Timeline addMediaSources(int i, List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
    }

    public Timeline clear(ShuffleOrder shuffleOrder) {
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    public Timeline createTimeline() {
    }

    public int getSize() {
    }

    public boolean isPrepared() {
    }

    public Timeline moveMediaSource(int i, int i2, ShuffleOrder shuffleOrder) {
    }

    public Timeline moveMediaSourceRange(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
    }

    public void prepare(TransferListener transferListener) {
    }

    public void release() {
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    public Timeline removeMediaSourceRange(int i, int i2, ShuffleOrder shuffleOrder) {
    }

    public Timeline setMediaSources(List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
    }

    public Timeline setShuffleOrder(ShuffleOrder shuffleOrder) {
    }
}
