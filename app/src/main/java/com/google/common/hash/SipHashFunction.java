package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = null;
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f108c;

    /* renamed from: d */
    private final int f109d;
    private final long k0;
    private final long k1;

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* renamed from: b */
        private long f110b;

        /* renamed from: c */
        private final int f111c;

        /* renamed from: d */
        private final int f112d;
        private long finalM;
        private long v0;
        private long v1;
        private long v2;
        private long v3;

        SipHasher(int i, int i2, long j, long j2) {
        }

        private void processM(long j) {
        }

        private void sipRound(int i) {
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

    SipHashFunction(int i, int i2, long j, long j2) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }
}
