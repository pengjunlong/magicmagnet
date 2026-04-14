package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Crc32cHashFunction extends AbstractHashFunction {
    static final HashFunction CRC_32_C = null;

    static final class Crc32cHasher extends AbstractStreamingHasher {
        static final int[] BYTE_TABLE = null;
        private static final ByteBuffer EMPTY = null;
        static final int INVERSE_COMPUTE_FOR_WORD_OF_ALL_1S = -287056435;
        static final int[][] STRIDE_TABLE = null;
        private int crc0;
        private int crc1;
        private int crc2;
        private int crc3;
        private boolean finished;

        Crc32cHasher() {
        }

        static int combine(int i, int i2) {
        }

        static int computeForWord(int i) {
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer byteBuffer) {
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer byteBuffer) {
        }
    }

    Crc32cHashFunction() {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }
}
