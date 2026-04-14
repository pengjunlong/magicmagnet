package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.security.Key;
import java.util.zip.Checksum;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Immutable
    static abstract class ChecksumType implements ImmutableSupplier<Checksum> {
        private static final /* synthetic */ ChecksumType[] $VALUES = null;
        public static final ChecksumType ADLER_32 = null;
        public static final ChecksumType CRC_32 = null;
        public final HashFunction hashFunction;

        /* renamed from: com.google.common.hash.Hashing$ChecksumType$1 */
        enum C09181 extends ChecksumType {
            C09181(String str, int i, String str2) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ Object get() {
            }

            @Override // com.google.common.base.Supplier
            public Checksum get() {
            }
        }

        /* renamed from: com.google.common.hash.Hashing$ChecksumType$2 */
        enum C09192 extends ChecksumType {
            C09192(String str, int i, String str2) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ Object get() {
            }

            @Override // com.google.common.base.Supplier
            public Checksum get() {
            }
        }

        private static /* synthetic */ ChecksumType[] $values() {
        }

        /* synthetic */ ChecksumType(String str, int i, String str2, C09171 c09171) {
        }

        public static ChecksumType valueOf(String str) {
        }

        public static ChecksumType[] values() {
        }

        private ChecksumType(String str, int i, String str2) {
        }
    }

    private static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        /* synthetic */ ConcatenatedHashFunction(HashFunction[] hashFunctionArr, C09171 c09171) {
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.common.hash.AbstractCompositeHashFunction
        HashCode makeHash(Hasher[] hasherArr) {
        }

        private ConcatenatedHashFunction(HashFunction... hashFunctionArr) {
        }
    }

    private static final class LinearCongruentialGenerator {
        private long state;

        public LinearCongruentialGenerator(long j) {
        }

        public double nextDouble() {
        }
    }

    private static class Md5Holder {
        static final HashFunction MD5 = null;

        private Md5Holder() {
        }
    }

    private static class Sha1Holder {
        static final HashFunction SHA_1 = null;

        private Sha1Holder() {
        }
    }

    private static class Sha256Holder {
        static final HashFunction SHA_256 = null;

        private Sha256Holder() {
        }
    }

    private static class Sha384Holder {
        static final HashFunction SHA_384 = null;

        private Sha384Holder() {
        }
    }

    private static class Sha512Holder {
        static final HashFunction SHA_512 = null;

        private Sha512Holder() {
        }
    }

    private Hashing() {
    }

    public static HashFunction adler32() {
    }

    static int checkPositiveAndMakeMultipleOf32(int i) {
    }

    public static HashCode combineOrdered(Iterable<HashCode> iterable) {
    }

    public static HashCode combineUnordered(Iterable<HashCode> iterable) {
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunction2, HashFunction... hashFunctionArr) {
    }

    public static int consistentHash(HashCode hashCode, int i) {
    }

    public static HashFunction crc32() {
    }

    public static HashFunction crc32c() {
    }

    public static HashFunction farmHashFingerprint64() {
    }

    public static HashFunction goodFastHash(int i) {
    }

    public static HashFunction hmacMd5(Key key) {
    }

    public static HashFunction hmacSha1(Key key) {
    }

    public static HashFunction hmacSha256(Key key) {
    }

    public static HashFunction hmacSha512(Key key) {
    }

    private static String hmacToString(String str, Key key) {
    }

    @Deprecated
    public static HashFunction md5() {
    }

    public static HashFunction murmur3_128(int i) {
    }

    @Deprecated
    public static HashFunction murmur3_32(int i) {
    }

    public static HashFunction murmur3_32_fixed(int i) {
    }

    @Deprecated
    public static HashFunction sha1() {
    }

    public static HashFunction sha256() {
    }

    public static HashFunction sha384() {
    }

    public static HashFunction sha512() {
    }

    public static HashFunction sipHash24() {
    }

    public static int consistentHash(long j, int i) {
    }

    public static HashFunction hmacMd5(byte[] bArr) {
    }

    public static HashFunction hmacSha1(byte[] bArr) {
    }

    public static HashFunction hmacSha256(byte[] bArr) {
    }

    public static HashFunction hmacSha512(byte[] bArr) {
    }

    public static HashFunction murmur3_128() {
    }

    @Deprecated
    public static HashFunction murmur3_32() {
    }

    public static HashFunction murmur3_32_fixed() {
    }

    public static HashFunction sipHash24(long j, long j2) {
    }

    public static HashFunction concatenating(Iterable<HashFunction> iterable) {
    }
}
