package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.mv1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qh;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = null;
    private static final Settings DEFAULT_SETTINGS = null;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    @Metadata
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll sink;
        public Socket socket;
        public qbbbpbbbiFxIAmEwllll11 source;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner) {
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, int i, Object obj) throws IOException {
        }

        public final Http2Connection build() {
        }

        public final boolean getClient$okhttp() {
        }

        public final String getConnectionName$okhttp() {
        }

        public final Listener getListener$okhttp() {
        }

        public final int getPingIntervalMillis$okhttp() {
        }

        public final PushObserver getPushObserver$okhttp() {
        }

        public final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll getSink$okhttp() {
        }

        public final Socket getSocket$okhttp() {
        }

        public final qbbbpbbbiFxIAmEwllll11 getSource$okhttp() {
        }

        public final TaskRunner getTaskRunner$okhttp() {
        }

        public final Builder listener(Listener listener) {
        }

        public final Builder pingIntervalMillis(int i) {
        }

        public final Builder pushObserver(PushObserver pushObserver) {
        }

        public final void setClient$okhttp(boolean z) {
        }

        public final void setConnectionName$okhttp(String str) {
        }

        public final void setListener$okhttp(Listener listener) {
        }

        public final void setPingIntervalMillis$okhttp(int i) {
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
        }

        public final void setSink$okhttp(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) {
        }

        public final void setSocket$okhttp(Socket socket) {
        }

        public final void setSource$okhttp(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) {
        }

        public final Builder socket(Socket socket) throws IOException {
        }

        public final Builder socket(Socket socket, String str) throws IOException {
        }

        public final Builder socket(Socket socket, String str, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) throws IOException {
        }

        public final Builder socket(Socket socket, String str, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) throws IOException {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final Settings getDEFAULT_SETTINGS() {
        }
    }

    @Metadata
    public static abstract class Listener {
        public static final Companion Companion = null;
        public static final Listener REFUSE_INCOMING_STREAMS = null;

        @xc0
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    @Metadata
    public final class ReaderRunnable implements Http2Reader.Handler, qh<mv1> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, String str2, int i2, long j) {
        }

        public final void applyAndAckSettings(boolean z, Settings settings) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, int i2) throws IOException {
        }

        public final Http2Reader getReader$okhttp() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, List<Header> list) {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i, int i2) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z, Settings settings) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() {
        }
    }

    public Http2Connection(Builder builder) {
    }

    public static final /* synthetic */ void access$failConnection(Http2Connection http2Connection, IOException iOException) {
    }

    public static final /* synthetic */ long access$getAwaitPongsReceived$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ Set access$getCurrentPushRequests$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ Settings access$getDEFAULT_SETTINGS$cp() {
    }

    public static final /* synthetic */ long access$getDegradedPongsReceived$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ long access$getIntervalPingsSent$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ long access$getIntervalPongsReceived$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ PushObserver access$getPushObserver$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ TaskQueue access$getSettingsListenerQueue$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ TaskRunner access$getTaskRunner$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ TaskQueue access$getWriterQueue$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ boolean access$isShutdown$p(Http2Connection http2Connection) {
    }

    public static final /* synthetic */ void access$setAwaitPongsReceived$p(Http2Connection http2Connection, long j) {
    }

    public static final /* synthetic */ void access$setDegradedPongsReceived$p(Http2Connection http2Connection, long j) {
    }

    public static final /* synthetic */ void access$setIntervalPingsSent$p(Http2Connection http2Connection, long j) {
    }

    public static final /* synthetic */ void access$setIntervalPongsReceived$p(Http2Connection http2Connection, long j) {
    }

    public static final /* synthetic */ void access$setShutdown$p(Http2Connection http2Connection, boolean z) {
    }

    public static final /* synthetic */ void access$setWriteBytesMaximum$p(Http2Connection http2Connection, long j) {
    }

    private final void failConnection(IOException iOException) {
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
    }

    public final synchronized void awaitPong() throws InterruptedException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
    }

    public final void flush() throws IOException {
    }

    public final boolean getClient$okhttp() {
    }

    public final String getConnectionName$okhttp() {
    }

    public final int getLastGoodStreamId$okhttp() {
    }

    public final Listener getListener$okhttp() {
    }

    public final int getNextStreamId$okhttp() {
    }

    public final Settings getOkHttpSettings() {
    }

    public final Settings getPeerSettings() {
    }

    public final long getReadBytesAcknowledged() {
    }

    public final long getReadBytesTotal() {
    }

    public final ReaderRunnable getReaderRunnable() {
    }

    public final Socket getSocket$okhttp() {
    }

    public final synchronized Http2Stream getStream(int i) {
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
    }

    public final long getWriteBytesMaximum() {
    }

    public final long getWriteBytesTotal() {
    }

    public final Http2Writer getWriter() {
    }

    public final synchronized boolean isHealthy(long j) {
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
    }

    public final synchronized int openStreamCount() {
    }

    public final void pushDataLater$okhttp(int i, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, int i2, boolean z) throws IOException {
    }

    public final void pushHeadersLater$okhttp(int i, List<Header> list, boolean z) {
    }

    public final void pushRequestLater$okhttp(int i, List<Header> list) {
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
    }

    public final boolean pushedStream$okhttp(int i) {
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
    }

    public final void sendDegradedPingLater$okhttp() {
    }

    public final void setLastGoodStreamId$okhttp(int i) {
    }

    public final void setNextStreamId$okhttp(int i) {
    }

    public final void setPeerSettings(Settings settings) {
    }

    public final void setSettings(Settings settings) throws IOException {
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
    }

    public final void start() throws IOException {
    }

    public final void start(boolean z) throws IOException {
    }

    public final void start(boolean z, TaskRunner taskRunner) throws IOException {
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
    }

    public final void writeData(int i, boolean z, dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) throws IOException {
    }

    public final void writePing(boolean z, int i, int i2) {
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) throws IOException {
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
    }

    private final Http2Stream newStream(int i, List<Header> list, boolean z) throws IOException {
    }

    public final void writePing() throws InterruptedException {
    }
}
