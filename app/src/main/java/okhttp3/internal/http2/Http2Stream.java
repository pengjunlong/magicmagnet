package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okio.dbpqdHhmDSIHIJiwc1ll1l1;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.aj1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Http2Stream {
    public static final Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    public final class FramingSource implements cl1 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final dppbpdpFXDhtOnccosy1lll1l readBuffer;
        private final dppbpdpFXDhtOnccosy1lll1l receiveBuffer;
        final /* synthetic */ Http2Stream this$0;
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long j, boolean z) {
        }

        private final void updateConnectionFlowControl(long j) {
        }

        @Override // p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        public final boolean getClosed$okhttp() {
        }

        public final boolean getFinished$okhttp() {
        }

        public final dppbpdpFXDhtOnccosy1lll1l getReadBuffer() {
        }

        public final dppbpdpFXDhtOnccosy1lll1l getReceiveBuffer() {
        }

        public final Headers getTrailers() {
        }

        @Override // p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
        }

        public final void receive$okhttp(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, long j) throws IOException {
        }

        public final void setClosed$okhttp(boolean z) {
        }

        public final void setFinished$okhttp(boolean z) {
        }

        public final void setTrailers(Headers headers) {
        }

        @Override // p000.cl1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }
    }

    @Metadata
    public final class StreamTimeout extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
        }

        @Override // okio.dbpqdHhmDSIHIJiwc1ll1l1
        protected IOException newTimeoutException(IOException iOException) {
        }

        @Override // okio.dbpqdHhmDSIHIJiwc1ll1l1
        protected void timedOut() {
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
    }

    public final void addBytesToWriteWindow(long j) {
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
    }

    public final void close(ErrorCode errorCode, IOException iOException) throws IOException {
    }

    public final void closeLater(ErrorCode errorCode) {
    }

    public final void enqueueTrailers(Headers headers) {
    }

    public final Http2Connection getConnection() {
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
    }

    public final IOException getErrorException$okhttp() {
    }

    public final int getId() {
    }

    public final long getReadBytesAcknowledged() {
    }

    public final long getReadBytesTotal() {
    }

    public final StreamTimeout getReadTimeout$okhttp() {
    }

    public final aj1 getSink() {
    }

    public final FramingSink getSink$okhttp() {
    }

    public final cl1 getSource() {
    }

    public final FramingSource getSource$okhttp() {
    }

    public final long getWriteBytesMaximum() {
    }

    public final long getWriteBytesTotal() {
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
    }

    public final boolean isLocallyInitiated() {
    }

    public final synchronized boolean isOpen() {
    }

    public final dpbdbdpbLwkLpObyKsq1lll1 readTimeout() {
    }

    public final void receiveData(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, int i) throws IOException {
    }

    public final void receiveHeaders(Headers headers, boolean z) {
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
    }

    public final void setErrorException$okhttp(IOException iOException) {
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
    }

    public final void setReadBytesTotal$okhttp(long j) {
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
    }

    public final void setWriteBytesTotal$okhttp(long j) {
    }

    public final synchronized Headers takeHeaders() throws IOException {
    }

    public final synchronized Headers trailers() throws IOException {
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
    }

    public final dpbdbdpbLwkLpObyKsq1lll1 writeTimeout() {
    }

    @Metadata
    public final class FramingSink implements aj1 {
        private boolean closed;
        private boolean finished;
        private final dppbpdpFXDhtOnccosy1lll1l sendBuffer;
        final /* synthetic */ Http2Stream this$0;
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean z) {
        }

        private final void emitFrame(boolean z) throws IOException {
        }

        @Override // p000.aj1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p000.aj1, java.io.Flushable
        public void flush() throws IOException {
        }

        public final boolean getClosed() {
        }

        public final boolean getFinished() {
        }

        public final Headers getTrailers() {
        }

        public final void setClosed(boolean z) {
        }

        public final void setFinished(boolean z) {
        }

        public final void setTrailers(Headers headers) {
        }

        @Override // p000.aj1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }

        @Override // p000.aj1
        public void write(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }
}
