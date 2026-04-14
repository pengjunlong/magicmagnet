package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    private static final class MessageDigestHasher extends AbstractByteHasher {
        private final int bytes;
        private final MessageDigest digest;
        private boolean done;

        /* synthetic */ MessageDigestHasher(MessageDigest messageDigest, int i, C09281 c09281) {
        }

        private void checkNotDone() {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte b) {
        }

        private MessageDigestHasher(MessageDigest messageDigest, int i) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(ByteBuffer byteBuffer) {
        }
    }

    private static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        /* synthetic */ SerializedForm(String str, int i, String str2, C09281 c09281) {
        }

        private Object readResolve() {
        }

        private SerializedForm(String str, int i, String str2) {
        }
    }

    MessageDigestHashFunction(String str, String str2) {
    }

    private static MessageDigest getMessageDigest(String str) {
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }

    Object writeReplace() {
    }

    MessageDigestHashFunction(String str, int i, String str2) {
    }
}
