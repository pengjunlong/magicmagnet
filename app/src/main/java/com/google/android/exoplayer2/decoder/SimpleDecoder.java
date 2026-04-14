package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import java.util.ArrayDeque;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock;
    private final ArrayDeque<I> queuedInputBuffers;
    private final ArrayDeque<O> queuedOutputBuffers;
    private boolean released;
    private int skippedOutputBufferCount;

    /* renamed from: com.google.android.exoplayer2.decoder.SimpleDecoder$1 */
    class C00961 extends Thread {
        final /* synthetic */ SimpleDecoder this$0;

        C00961(SimpleDecoder simpleDecoder, String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    protected SimpleDecoder(I[] iArr, O[] oArr) {
    }

    static /* synthetic */ void access$000(SimpleDecoder simpleDecoder) {
    }

    private boolean canDecodeBuffer() {
    }

    private boolean decode() throws InterruptedException {
    }

    private void maybeNotifyDecodeLoop() {
    }

    private void maybeThrowException() throws DecoderException {
    }

    private void releaseInputBufferInternal(I i) {
    }

    private void releaseOutputBufferInternal(O o) {
    }

    private void run() {
    }

    protected abstract I createInputBuffer();

    protected abstract O createOutputBuffer();

    protected abstract E createUnexpectedDecodeException(Throwable th);

    protected abstract E decode(I i, O o, boolean z);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ Object dequeueInputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ Object dequeueOutputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(Object obj) throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    protected void releaseOutputBuffer(O o) {
    }

    protected final void setInitialInputBufferSize(int i) {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final I dequeueInputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final O dequeueOutputBuffer() throws DecoderException {
    }

    public final void queueInputBuffer(I i) throws DecoderException {
    }
}
