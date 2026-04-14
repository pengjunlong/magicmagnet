package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import javax.net.SocketFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RtspMediaSource extends BaseMediaSource {
    public static final long DEFAULT_TIMEOUT_MS = 8000;
    private final boolean debugLoggingEnabled;
    private final MediaItem mediaItem;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private final SocketFactory socketFactory;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;
    private final Uri uri;
    private final String userAgent;

    /* renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$1 */
    class C01921 implements RtspMediaPeriod.Listener {
        final /* synthetic */ RtspMediaSource this$0;

        C01921(RtspMediaSource rtspMediaSource) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod.Listener
        public void onSeekingUnsupported() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod.Listener
        public void onSourceInfoRefreshed(RtspSessionTiming rtspSessionTiming) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$2 */
    class C01932 extends ForwardingTimeline {
        C01932(RtspMediaSource rtspMediaSource, Timeline timeline) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private boolean debugLoggingEnabled;
        private boolean forceUseRtpTcp;
        private SocketFactory socketFactory;
        private long timeoutMs;
        private String userAgent;

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource createMediaSource(MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
        }

        @CanIgnoreReturnValue
        public Factory setDebugLoggingEnabled(boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @CanIgnoreReturnValue
        public Factory setForceUseRtpTcp(boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        @CanIgnoreReturnValue
        public Factory setSocketFactory(SocketFactory socketFactory) {
        }

        @CanIgnoreReturnValue
        public Factory setTimeoutMs(long j) {
        }

        @CanIgnoreReturnValue
        public Factory setUserAgent(String str) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public RtspMediaSource createMediaSource(MediaItem mediaItem) {
        }
    }

    public static final class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
        }

        public RtspPlaybackException(Throwable th) {
        }

        public RtspPlaybackException(String str, Throwable th) {
        }
    }

    RtspMediaSource(MediaItem mediaItem, RtpDataChannel.Factory factory, String str, SocketFactory socketFactory, boolean z) {
    }

    static /* synthetic */ long access$002(RtspMediaSource rtspMediaSource, long j) {
    }

    static /* synthetic */ boolean access$102(RtspMediaSource rtspMediaSource, boolean z) {
    }

    static /* synthetic */ boolean access$202(RtspMediaSource rtspMediaSource, boolean z) {
    }

    static /* synthetic */ boolean access$302(RtspMediaSource rtspMediaSource, boolean z) {
    }

    static /* synthetic */ void access$400(RtspMediaSource rtspMediaSource) {
    }

    private void notifySourceInfoRefreshed() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }
}
