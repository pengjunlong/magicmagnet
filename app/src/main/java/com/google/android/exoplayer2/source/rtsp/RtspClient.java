package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtspClient implements Closeable {
    private static final long DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_MS = 30000;
    public static final int RTSP_STATE_INIT = 0;
    public static final int RTSP_STATE_PLAYING = 2;
    public static final int RTSP_STATE_READY = 1;
    public static final int RTSP_STATE_UNINITIALIZED = -1;
    private static final String TAG = "RtspClient";
    private final boolean debugLoggingEnabled;
    private boolean hasPendingPauseRequest;
    private boolean hasUpdatedTimelineAndTracks;
    private KeepAliveMonitor keepAliveMonitor;
    private RtspMessageChannel messageChannel;
    private final MessageSender messageSender;
    private final SparseArray<RtspRequest> pendingRequests;
    private long pendingSeekPositionUs;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;
    private RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;
    private RtspAuthenticationInfo rtspAuthenticationInfo;
    private int rtspState;
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final SocketFactory socketFactory;
    private Uri uri;
    private final String userAgent;

    private final class KeepAliveMonitor implements Runnable, Closeable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler;
        final /* synthetic */ RtspClient this$0;

        public KeepAliveMonitor(RtspClient rtspClient, long j) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void start() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler;
        final /* synthetic */ RtspClient this$0;

        public MessageListener(RtspClient rtspClient) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MessageListener messageListener, List list) {
        }

        private void handleRtspMessage(List<String> list) {
        }

        private void handleRtspRequest(List<String> list) {
        }

        private void handleRtspResponse(List<String> list) {
        }

        private /* synthetic */ void lambda$onRtspMessageReceived$0(List list) {
        }

        private void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
        }

        private void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) {
        }

        private void onPauseResponseReceived() {
        }

        private void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
        }

        private void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onReceivingFailed(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(List<String> list) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onSendingFailed(List list, Exception exc) {
        }
    }

    private final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;
        final /* synthetic */ RtspClient this$0;

        private MessageSender(RtspClient rtspClient) {
        }

        private RtspRequest getRequestWithCommonHeaders(int i, String str, Map<String, String> map, Uri uri) {
        }

        private void sendRequest(RtspRequest rtspRequest) {
        }

        private void sendResponse(RtspResponse rtspResponse) {
        }

        public void retryLastRequest() {
        }

        public void sendDescribeRequest(Uri uri, String str) {
        }

        public void sendMethodNotAllowedResponse(int i) {
        }

        public void sendOptionsRequest(Uri uri, String str) {
        }

        public void sendPauseRequest(Uri uri, String str) {
        }

        public void sendPlayRequest(Uri uri, long j, String str) {
        }

        public void sendSetupRequest(Uri uri, String str, String str2) {
        }

        public void sendTeardownRequest(Uri uri, String str) {
        }

        /* synthetic */ MessageSender(RtspClient rtspClient, C01891 c01891) {
        }
    }

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j, ImmutableList<RtspTrackTiming> immutableList);

        void onRtspSetupCompleted();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RtspState {
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, Throwable th);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList);
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String str, Uri uri, SocketFactory socketFactory, boolean z) {
    }

    static /* synthetic */ int access$100(RtspClient rtspClient) {
    }

    static /* synthetic */ RtspMessageChannel access$1000(RtspClient rtspClient) {
    }

    static /* synthetic */ int access$102(RtspClient rtspClient, int i) {
    }

    static /* synthetic */ MessageSender access$1100(RtspClient rtspClient) {
    }

    static /* synthetic */ SessionInfoListener access$1200(RtspClient rtspClient) {
    }

    static /* synthetic */ Uri access$1300(RtspClient rtspClient) {
    }

    static /* synthetic */ Uri access$1302(RtspClient rtspClient, Uri uri) {
    }

    static /* synthetic */ boolean access$1400(RtspClient rtspClient) {
    }

    static /* synthetic */ boolean access$1402(RtspClient rtspClient, boolean z) {
    }

    static /* synthetic */ KeepAliveMonitor access$1500(RtspClient rtspClient) {
    }

    static /* synthetic */ KeepAliveMonitor access$1502(RtspClient rtspClient, KeepAliveMonitor keepAliveMonitor) {
    }

    static /* synthetic */ boolean access$1600(List list) {
    }

    static /* synthetic */ ImmutableList access$1700(SessionDescription sessionDescription, Uri uri) {
    }

    static /* synthetic */ boolean access$1802(RtspClient rtspClient, boolean z) {
    }

    static /* synthetic */ void access$1900(RtspClient rtspClient) {
    }

    static /* synthetic */ long access$2000(RtspClient rtspClient) {
    }

    static /* synthetic */ long access$2002(RtspClient rtspClient, long j) {
    }

    static /* synthetic */ boolean access$202(RtspClient rtspClient, boolean z) {
    }

    static /* synthetic */ PlaybackEventListener access$2100(RtspClient rtspClient) {
    }

    static /* synthetic */ String access$300(RtspClient rtspClient) {
    }

    static /* synthetic */ String access$302(RtspClient rtspClient, String str) {
    }

    static /* synthetic */ String access$400(RtspClient rtspClient) {
    }

    static /* synthetic */ RtspAuthenticationInfo access$500(RtspClient rtspClient) {
    }

    static /* synthetic */ RtspAuthenticationInfo access$502(RtspClient rtspClient, RtspAuthenticationInfo rtspAuthenticationInfo) {
    }

    static /* synthetic */ RtspMessageUtil.RtspAuthUserInfo access$600(RtspClient rtspClient) {
    }

    static /* synthetic */ RtspMessageUtil.RtspAuthUserInfo access$602(RtspClient rtspClient, RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo) {
    }

    static /* synthetic */ void access$700(RtspClient rtspClient, Throwable th) {
    }

    static /* synthetic */ SparseArray access$800(RtspClient rtspClient) {
    }

    static /* synthetic */ void access$900(RtspClient rtspClient, List list) {
    }

    private static ImmutableList<RtspMediaTrack> buildTrackList(SessionDescription sessionDescription, Uri uri) {
    }

    private void continueSetupRtspTrack() {
    }

    private void dispatchRtspError(Throwable th) {
    }

    private Socket getSocket(Uri uri) throws IOException {
    }

    private void maybeLogMessage(List<String> list) {
    }

    private static boolean serverSupportsDescribe(List<Integer> list) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public int getState() {
    }

    public void registerInterleavedDataChannel(int i, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
    }

    public void retryWithRtpTcp() {
    }

    public void seekToUs(long j) {
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> list) {
    }

    public void start() throws IOException {
    }

    public void startPlayback(long j) {
    }
}
