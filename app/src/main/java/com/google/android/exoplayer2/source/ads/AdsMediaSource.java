package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = null;
    private final MediaSource.Factory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    private final MediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i, Exception exc) {
        }

        public static AdLoadException createForAd(Exception exc) {
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
        }

        public static AdLoadException createForAllAds(Exception exc) {
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
        }
    }

    private final class AdMediaSourceHolder {
        private final List<MaskingMediaPeriod> activeMediaPeriods;
        private MediaSource adMediaSource;
        private Uri adUri;
        private final MediaSource.MediaPeriodId id;
        final /* synthetic */ AdsMediaSource this$0;
        private Timeline timeline;

        public AdMediaSourceHolder(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        }

        public long getDurationUs() {
        }

        public void handleSourceInfoRefresh(Timeline timeline) {
        }

        public boolean hasMediaSource() {
        }

        public void initializeWithMediaSource(MediaSource mediaSource, Uri uri) {
        }

        public boolean isInactive() {
        }

        public void release() {
        }

        public void releaseMediaPeriod(MaskingMediaPeriod maskingMediaPeriod) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final Uri adUri;
        final /* synthetic */ AdsMediaSource this$0;

        public AdPrepareListener(AdsMediaSource adsMediaSource, Uri uri) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AdPrepareListener adPrepareListener, MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(AdPrepareListener adPrepareListener, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        private /* synthetic */ void lambda$onPrepareComplete$0(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        private /* synthetic */ void lambda$onPrepareError$1(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler;
        private volatile boolean stopped;
        final /* synthetic */ AdsMediaSource this$0;

        public ComponentListener(AdsMediaSource adsMediaSource) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ComponentListener componentListener, AdPlaybackState adPlaybackState) {
        }

        private /* synthetic */ void lambda$onAdPlaybackState$0(AdPlaybackState adPlaybackState) {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdClicked() {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdTapped() {
        }

        public void stop() {
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
    }

    static /* synthetic */ MediaSourceEventListener.EventDispatcher access$000(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    static /* synthetic */ void access$100(AdsMediaSource adsMediaSource, AdPlaybackState adPlaybackState) {
    }

    static /* synthetic */ Handler access$200(AdsMediaSource adsMediaSource) {
    }

    static /* synthetic */ MediaSourceEventListener.EventDispatcher access$300(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    static /* synthetic */ AdsLoader access$400(AdsMediaSource adsMediaSource) {
    }

    static /* synthetic */ void access$500(AdsMediaSource adsMediaSource, Object obj, MediaSource mediaSource) {
    }

    static /* synthetic */ Timeline.Period access$600(AdsMediaSource adsMediaSource) {
    }

    static /* synthetic */ void access$700(AdsMediaSource adsMediaSource, Object obj) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(AdsMediaSource adsMediaSource, ComponentListener componentListener) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(AdsMediaSource adsMediaSource, ComponentListener componentListener) {
    }

    private long[][] getAdDurationsUs() {
    }

    private /* synthetic */ void lambda$prepareSourceInternal$0(ComponentListener componentListener) {
    }

    private /* synthetic */ void lambda$releaseSourceInternal$1(ComponentListener componentListener) {
    }

    private void maybeUpdateAdMediaSources() {
    }

    private void maybeUpdateSourceInfo() {
    }

    private void onAdPlaybackState(AdPlaybackState adPlaybackState) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    protected /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    /* renamed from: getMediaPeriodIdForChildMediaPeriodId, reason: avoid collision after fix types in other method */
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
    }

    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method */
    protected void onChildSourceInfoRefreshed2(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
    }
}
