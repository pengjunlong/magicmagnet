package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo;
    public ByteBuffer data;
    public Format format;
    private final int paddingSize;
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
        }
    }

    public DecoderInputBuffer(int i) {
    }

    private ByteBuffer createReplacementByteBuffer(int i) {
    }

    public static DecoderInputBuffer newNoDataInstance() {
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i) {
    }

    public final void flip() {
    }

    public final boolean isEncrypted() {
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i) {
    }

    public DecoderInputBuffer(int i, int i2) {
    }
}
