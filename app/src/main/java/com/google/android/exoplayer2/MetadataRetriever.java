package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MetadataRetriever {

    private static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final MediaSource.Factory mediaSourceFactory;
        private final HandlerWrapper mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private final SettableFuture<TrackGroupArray> trackGroupsFuture;

        private final class MediaSourceHandlerCallback implements Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private MediaPeriod mediaPeriod;
            private MediaSource mediaSource;
            private final MediaSourceCaller mediaSourceCaller;
            final /* synthetic */ MetadataRetrieverInternal this$0;

            private final class MediaSourceCaller implements MediaSource.MediaSourceCaller {
                private final Allocator allocator;
                private final MediaPeriodCallback mediaPeriodCallback;
                private boolean mediaPeriodCreated;
                final /* synthetic */ MediaSourceHandlerCallback this$1;

                private final class MediaPeriodCallback implements MediaPeriod.Callback {
                    final /* synthetic */ MediaSourceCaller this$2;

                    private MediaPeriodCallback(MediaSourceCaller mediaSourceCaller) {
                    }

                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                    }

                    /* synthetic */ MediaPeriodCallback(MediaSourceCaller mediaSourceCaller, C00761 c00761) {
                    }

                    /* renamed from: onContinueLoadingRequested, reason: avoid collision after fix types in other method */
                    public void onContinueLoadingRequested2(MediaPeriod mediaPeriod) {
                    }
                }

                public MediaSourceCaller(MediaSourceHandlerCallback mediaSourceHandlerCallback) {
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                }
            }

            public MediaSourceHandlerCallback(MetadataRetrieverInternal metadataRetrieverInternal) {
            }

            static /* synthetic */ MediaPeriod access$500(MediaSourceHandlerCallback mediaSourceHandlerCallback) {
            }

            static /* synthetic */ MediaPeriod access$502(MediaSourceHandlerCallback mediaSourceHandlerCallback, MediaPeriod mediaPeriod) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        public MetadataRetrieverInternal(MediaSource.Factory factory, Clock clock) {
        }

        static /* synthetic */ MediaSource.Factory access$000(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        static /* synthetic */ HandlerWrapper access$100(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        static /* synthetic */ SettableFuture access$200(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        static /* synthetic */ HandlerThread access$300(MetadataRetrieverInternal metadataRetrieverInternal) {
        }

        public ListenableFuture<TrackGroupArray> retrieveMetadata(MediaItem mediaItem) {
        }
    }

    private MetadataRetriever() {
    }

    public static ListenableFuture<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem) {
    }

    public static ListenableFuture<TrackGroupArray> retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem) {
    }

    static ListenableFuture<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem, Clock clock) {
    }

    private static ListenableFuture<TrackGroupArray> retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem, Clock clock) {
    }
}
