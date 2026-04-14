package com.google.android.exoplayer2.source;

import android.content.Context;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";
    private AdViewProvider adViewProvider;
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private boolean useProgressiveMediaSourceForSubtitles;

    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class DelegateFactoryLoader {
        private DataSource.Factory dataSourceFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories;
        private final Map<Integer, Supplier<MediaSource.Factory>> mediaSourceFactorySuppliers;
        private final Set<Integer> supportedTypes;

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory) {
        }

        public static /* synthetic */ MediaSource.Factory bpdqqiQNVROMLC1ll1l1l11(DelegateFactoryLoader delegateFactoryLoader, DataSource.Factory factory) {
        }

        public static /* synthetic */ MediaSource.Factory dbpqdHhmDSIHIJiwc1ll1l1(Class cls) {
        }

        public static /* synthetic */ MediaSource.Factory dpbdbdpbLwkLpObyKsq1lll1(Class cls, DataSource.Factory factory) {
        }

        public static /* synthetic */ MediaSource.Factory dpbdpqRKAscW1lll1l(Class cls, DataSource.Factory factory) {
        }

        public static /* synthetic */ MediaSource.Factory dqqppqiKzJi1l1lll1l(Class cls, DataSource.Factory factory) {
        }

        private void ensureAllSuppliersAreLoaded() {
        }

        private static /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$0(Class cls, DataSource.Factory factory) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$1(Class cls, DataSource.Factory factory) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$2(Class cls, DataSource.Factory factory) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$3(Class cls) {
        }

        private /* synthetic */ MediaSource.Factory lambda$maybeLoadSupplier$4(DataSource.Factory factory) {
        }

        private Supplier<MediaSource.Factory> maybeLoadSupplier(int i) {
        }

        public MediaSource.Factory getMediaSourceFactory(int i) {
        }

        public int[] getSupportedTypes() {
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }
    }

    private static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        public UnknownSubtitlesExtractor(Format format) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void seek(long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
        }
    }

    public DefaultMediaSourceFactory(Context context) {
    }

    static /* synthetic */ MediaSource.Factory access$000(Class cls) {
    }

    static /* synthetic */ MediaSource.Factory access$100(Class cls, DataSource.Factory factory) {
    }

    public static /* synthetic */ Extractor[] dbpqdHhmDSIHIJiwc1ll1l1(Format format) {
    }

    private static /* synthetic */ Extractor[] lambda$createMediaSource$0(Format format) {
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
    }

    private static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public MediaSource createMediaSource(MediaItem mediaItem) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory experimentalUseProgressiveMediaSourceForSubtitles(boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public int[] getSupportedTypes() {
    }

    @CanIgnoreReturnValue
    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(AdViewProvider adViewProvider) {
    }

    @CanIgnoreReturnValue
    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(AdsLoader.Provider provider) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLiveMaxSpeed(float f) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLiveMinSpeed(float f) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(MediaSource.Factory factory) {
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
    }

    private static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
    }
}
