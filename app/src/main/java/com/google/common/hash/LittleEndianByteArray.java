package com.google.common.hash;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final LittleEndianBytes byteArray = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class JavaLittleEndianBytes implements LittleEndianBytes {
        private static final /* synthetic */ JavaLittleEndianBytes[] $VALUES = null;
        public static final JavaLittleEndianBytes INSTANCE = null;

        /* renamed from: com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1 */
        enum C09211 extends JavaLittleEndianBytes {
            C09211(String str, int i) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
            }
        }

        private static /* synthetic */ JavaLittleEndianBytes[] $values() {
        }

        private JavaLittleEndianBytes(String str, int i) {
        }

        public static JavaLittleEndianBytes valueOf(String str) {
        }

        public static JavaLittleEndianBytes[] values() {
        }

        /* synthetic */ JavaLittleEndianBytes(String str, int i, C09201 c09201) {
        }
    }

    private interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i);

        void putLongLittleEndian(byte[] bArr, int i, long j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class UnsafeByteArray implements LittleEndianBytes {
        private static final /* synthetic */ UnsafeByteArray[] $VALUES = null;
        private static final int BYTE_ARRAY_BASE_OFFSET = 0;
        public static final UnsafeByteArray UNSAFE_BIG_ENDIAN = null;
        public static final UnsafeByteArray UNSAFE_LITTLE_ENDIAN = null;
        private static final Unsafe theUnsafe = null;

        /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1 */
        enum C09221 extends UnsafeByteArray {
            C09221(String str, int i) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
            }
        }

        /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2 */
        enum C09232 extends UnsafeByteArray {
            C09232(String str, int i) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i, long j) {
            }
        }

        /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3 */
        class C09243 implements PrivilegedExceptionAction<Unsafe> {
            C09243() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: run, reason: avoid collision after fix types in other method */
            public Unsafe run2() throws Exception {
            }
        }

        private static /* synthetic */ UnsafeByteArray[] $values() {
        }

        private UnsafeByteArray(String str, int i) {
        }

        static /* synthetic */ int access$100() {
        }

        static /* synthetic */ Unsafe access$200() {
        }

        private static Unsafe getUnsafe() {
        }

        public static UnsafeByteArray valueOf(String str) {
        }

        public static UnsafeByteArray[] values() {
        }

        /* synthetic */ UnsafeByteArray(String str, int i, C09201 c09201) {
        }
    }

    private LittleEndianByteArray() {
    }

    static int load32(byte[] bArr, int i) {
    }

    static long load64(byte[] bArr, int i) {
    }

    static long load64Safely(byte[] bArr, int i, int i2) {
    }

    static void store64(byte[] bArr, int i, long j) {
    }

    static boolean usingUnsafe() {
    }
}
