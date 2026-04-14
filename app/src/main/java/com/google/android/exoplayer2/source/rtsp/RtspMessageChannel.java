package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class RtspMessageChannel implements Closeable {
    public static final Charset CHARSET = null;
    public static final int DEFAULT_RTSP_PORT = 554;
    private static final String TAG = "RtspMessageChannel";
    private volatile boolean closed;
    private final Map<Integer, InterleavedBinaryDataListener> interleavedBinaryDataListeners;
    private final MessageListener messageListener;
    private final Loader receiverLoader;
    private Sender sender;
    private Socket socket;

    public interface InterleavedBinaryDataListener {
        void onInterleavedBinaryDataReceived(byte[] bArr);
    }

    private final class LoaderCallbackImpl implements Loader.Callback<Receiver> {
        final /* synthetic */ RtspMessageChannel this$0;

        private LoaderCallbackImpl(RtspMessageChannel rtspMessageChannel) {
        }

        /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(Receiver receiver, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(Receiver receiver, long j, long j2, boolean z) {
        }

        /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(Receiver receiver, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(Receiver receiver, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(Receiver receiver, long j, long j2, IOException iOException, int i) {
        }

        /* synthetic */ LoaderCallbackImpl(RtspMessageChannel rtspMessageChannel, C01941 c01941) {
        }

        /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(Receiver receiver, long j, long j2, IOException iOException, int i) {
        }
    }

    public interface MessageListener {
        void onReceivingFailed(Exception exc);

        void onRtspMessageReceived(List<String> list);

        void onSendingFailed(List<String> list, Exception exc);
    }

    private static final class MessageParser {
        private static final int STATE_READING_BODY = 3;
        private static final int STATE_READING_FIRST_LINE = 1;
        private static final int STATE_READING_HEADER = 2;
        private long messageBodyLength;
        private final List<String> messageLines;
        private int state;

        private ImmutableList<String> addMessageBody(byte[] bArr) {
        }

        private ImmutableList<String> addMessageLine(byte[] bArr) throws ParserException {
        }

        private static byte[] parseNextLine(byte b, DataInputStream dataInputStream) throws IOException {
        }

        private void reset() {
        }

        public ImmutableList<String> parseNext(byte b, DataInputStream dataInputStream) throws IOException {
        }
    }

    private final class Receiver implements Loader.Loadable {
        private static final byte INTERLEAVED_MESSAGE_MARKER = 36;
        private final DataInputStream dataInputStream;
        private volatile boolean loadCanceled;
        private final MessageParser messageParser;
        final /* synthetic */ RtspMessageChannel this$0;

        public Receiver(RtspMessageChannel rtspMessageChannel, InputStream inputStream) {
        }

        private void handleInterleavedBinaryData() throws IOException {
        }

        private void handleRtspMessage(byte b) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class Sender implements Closeable {
        private final OutputStream outputStream;
        private final HandlerThread senderThread;
        private final Handler senderThreadHandler;
        final /* synthetic */ RtspMessageChannel this$0;

        public Sender(RtspMessageChannel rtspMessageChannel, OutputStream outputStream) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(Sender sender, byte[] bArr, List list) {
        }

        private /* synthetic */ void lambda$send$0(byte[] bArr, List list) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public void send(List<String> list) {
        }
    }

    public RtspMessageChannel(MessageListener messageListener) {
    }

    static /* synthetic */ boolean access$100(RtspMessageChannel rtspMessageChannel) {
    }

    static /* synthetic */ MessageListener access$200(RtspMessageChannel rtspMessageChannel) {
    }

    static /* synthetic */ Map access$300(RtspMessageChannel rtspMessageChannel) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void open(Socket socket) throws IOException {
    }

    public void registerInterleavedBinaryDataListener(int i, InterleavedBinaryDataListener interleavedBinaryDataListener) {
    }

    public void send(List<String> list) {
    }
}
