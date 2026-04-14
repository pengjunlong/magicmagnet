package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.ConditionVariable;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class AsynchronousMediaCodecBufferEnqueuer {
    private static final ArrayDeque<MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = null;
    private static final int MSG_OPEN_CV = 2;
    private static final int MSG_QUEUE_INPUT_BUFFER = 0;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 1;
    private static final Object QUEUE_SECURE_LOCK = null;
    private final MediaCodec codec;
    private final ConditionVariable conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;

    /* renamed from: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$1 */
    class HandlerC01161 extends Handler {
        final /* synthetic */ AsynchronousMediaCodecBufferEnqueuer this$0;

        HandlerC01161(AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo;
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        MessageParams() {
        }

        public void setQueueParams(int i, int i2, int i3, long j, int i4) {
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
    }

    static /* synthetic */ void access$000(AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer, Message message) {
    }

    private void blockUntilHandlerThreadIsIdle() throws InterruptedException {
    }

    private static void copy(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
    }

    private void doHandleMessage(Message message) {
    }

    private void doQueueInputBuffer(int i, int i2, int i3, long j, int i4) {
    }

    private void doQueueSecureInputBuffer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
    }

    private void flushHandlerThread() throws InterruptedException {
    }

    private static MessageParams getMessageParams() {
    }

    private static void recycleMessageParams(MessageParams messageParams) {
    }

    public void flush() {
    }

    public void maybeThrowException() {
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
    }

    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
    }

    void setPendingRuntimeException(RuntimeException runtimeException) {
    }

    public void shutdown() {
    }

    public void start() {
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
    }

    AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable) {
    }

    private static int[] copy(int[] iArr, int[] iArr2) {
    }

    private static byte[] copy(byte[] bArr, byte[] bArr2) {
    }
}
