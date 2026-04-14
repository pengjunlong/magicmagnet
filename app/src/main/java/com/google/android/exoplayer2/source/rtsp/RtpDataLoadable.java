package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtpDataLoadable implements Loader.Loadable {
    private final EventListener eventListener;
    private RtpExtractor extractor;
    private volatile boolean loadCancelled;
    private volatile long nextRtpTimestamp;
    private final ExtractorOutput output;
    private volatile long pendingSeekPositionUs;
    private final Handler playbackThreadHandler;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    public final RtspMediaTrack rtspMediaTrack;
    public final int trackId;

    public interface EventListener {
        void onTransportReady(String str, RtpDataChannel rtpDataChannel);
    }

    public RtpDataLoadable(int i, RtspMediaTrack rtspMediaTrack, EventListener eventListener, ExtractorOutput extractorOutput, RtpDataChannel.Factory factory) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(RtpDataLoadable rtpDataLoadable, String str, RtpDataChannel rtpDataChannel) {
    }

    private /* synthetic */ void lambda$load$0(String str, RtpDataChannel rtpDataChannel) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
    }

    public void resetForSeek() {
    }

    public void seekToUs(long j, long j2) {
    }

    public void setSequenceNumber(int i) {
    }

    public void setTimestamp(long j) {
    }
}
