package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class HashCode {
    private static final char[] hexDigits = null;

    private static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        BytesHashCode(byte[] bArr) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode hashCode) {
        }

        @Override // com.google.common.hash.HashCode
        byte[] getBytesInternal() {
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] bArr, int i, int i2) {
        }
    }

    private static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        IntHashCode(int i) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode hashCode) {
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] bArr, int i, int i2) {
        }
    }

    private static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        LongHashCode(long j) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode hashCode) {
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] bArr, int i, int i2) {
        }
    }

    HashCode() {
    }

    private static int decode(char c) {
    }

    public static HashCode fromBytes(byte[] bArr) {
    }

    static HashCode fromBytesNoCopy(byte[] bArr) {
    }

    public static HashCode fromInt(int i) {
    }

    public static HashCode fromLong(long j) {
    }

    public static HashCode fromString(String str) {
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(Object obj) {
    }

    abstract boolean equalsSameBits(HashCode hashCode);

    byte[] getBytesInternal() {
    }

    public final int hashCode() {
    }

    public abstract long padToLong();

    public final String toString() {
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i, int i2) {
    }

    abstract void writeBytesToImpl(byte[] bArr, int i, int i2);
}
