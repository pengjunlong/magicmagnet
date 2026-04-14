package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    private final IntArrayQueue availableInputBuffers;
    private final IntArrayQueue availableOutputBuffers;
    private final ArrayDeque<MediaCodec.BufferInfo> bufferInfos;
    private final HandlerThread callbackThread;
    private MediaFormat currentFormat;
    private final ArrayDeque<MediaFormat> formats;
    private Handler handler;
    private IllegalStateException internalException;
    private final Object lock;
    private MediaCodec.CodecException mediaCodecException;
    private long pendingFlushCount;
    private MediaFormat pendingOutputFormat;
    private boolean shutDown;

    AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
    }

    private void addOutputFormat(MediaFormat mediaFormat) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AsynchronousMediaCodecCallback asynchronousMediaCodecCallback) {
    }

    private void flushInternal() {
    }

    private boolean isFlushingOrShutdown() {
    }

    private void maybeThrowException() {
    }

    private void maybeThrowInternalException() {
    }

    private void maybeThrowMediaCodecException() {
    }

    private void onFlushCompleted() {
    }

    private void setInternalException(IllegalStateException illegalStateException) {
    }

    public int dequeueInputBufferIndex() {
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
    }

    public void flush() {
    }

    public MediaFormat getOutputFormat() {
    }

    public void initialize(MediaCodec mediaCodec) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    public void shutdown() {
    }
}
