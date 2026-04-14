package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Mac;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class MacHashFunction extends AbstractHashFunction {
    private final int bits;
    private final Key key;
    private final Mac prototype;
    private final boolean supportsClone;
    private final String toString;

    private static final class MacHasher extends AbstractByteHasher {
        private boolean done;
        private final Mac mac;

        /* synthetic */ MacHasher(Mac mac, C09271 c09271) {
        }

        private void checkNotDone() {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte b) {
        }

        private MacHasher(Mac mac) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] bArr) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(ByteBuffer byteBuffer) {
        }
    }

    MacHashFunction(String str, Key key, String str2) {
    }

    private static Mac getMac(String str, Key key) {
    }

    private static boolean supportsClone(Mac mac) {
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
