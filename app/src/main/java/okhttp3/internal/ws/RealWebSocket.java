package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.WebSocketReader;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<qqbddbbsOSPMeeOGlgesDt1l1l1> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;

    @Metadata
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final qqbddbbsOSPMeeOGlgesDt1l1l1 reason;

        public Close(int i, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, long j) {
        }

        public final long getCancelAfterCloseMillis() {
        }

        public final int getCode() {
        }

        public final qqbddbbsOSPMeeOGlgesDt1l1l1 getReason() {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    public static final class Message {
        private final qqbddbbsOSPMeeOGlgesDt1l1l1 data;
        private final int formatOpcode;

        public Message(int i, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
        }

        public final qqbddbbsOSPMeeOGlgesDt1l1l1 getData() {
        }

        public final int getFormatOpcode() {
        }
    }

    @Metadata
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll sink;
        private final qbbbpbbbiFxIAmEwllll11 source;

        public Streams(boolean z, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) {
        }

        public final boolean getClient() {
        }

        public final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll getSink() {
        }

        public final qbbbpbbbiFxIAmEwllll11 getSource() {
        }
    }

    @xc0
    private final class WriterTask extends Task {
        final /* synthetic */ RealWebSocket this$0;

        public WriterTask(RealWebSocket realWebSocket) {
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2) {
    }

    public static final /* synthetic */ ArrayDeque access$getMessageAndCloseQueue$p(RealWebSocket realWebSocket) {
    }

    public static final /* synthetic */ String access$getName$p(RealWebSocket realWebSocket) {
    }

    public static final /* synthetic */ boolean access$isValid(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
    }

    public static final /* synthetic */ void access$setExtensions$p(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
    }

    private final boolean isValid(WebSocketExtensions webSocketExtensions) {
    }

    private final void runWriter() {
    }

    public final void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
    }

    public final void connect(OkHttpClient okHttpClient) {
    }

    public final void failWebSocket(Exception exc, Response response) {
    }

    public final WebSocketListener getListener$okhttp() {
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
    }

    public final void loopReader() throws IOException {
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    public final synchronized boolean pong(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    public final boolean processNextFrame() throws IOException {
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
    }

    public final synchronized int receivedPingCount() {
    }

    public final synchronized int receivedPongCount() {
    }

    @Override // okhttp3.WebSocket
    public Request request() {
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
    }

    public final synchronized int sentPingCount() {
    }

    public final void tearDown() throws InterruptedException {
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
    }

    public final void writePingFrame$okhttp() {
    }

    public final synchronized boolean close(int i, String str, long j) {
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }

    @Override // okhttp3.WebSocket
    public boolean send(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    private final synchronized boolean send(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, int i) {
    }
}
