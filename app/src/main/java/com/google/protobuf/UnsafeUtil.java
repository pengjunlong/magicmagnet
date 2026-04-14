package com.google.protobuf;

import java.nio.ByteBuffer;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = 0;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = 0;
    private static final long BUFFER_ADDRESS_OFFSET = 0;
    private static final int BYTE_ARRAY_ALIGNMENT = 0;
    static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_INDEX_SCALE = 0;
    private static final long FLOAT_ARRAY_BASE_OFFSET = 0;
    private static final long FLOAT_ARRAY_INDEX_SCALE = 0;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
    private static final long INT_ARRAY_BASE_OFFSET = 0;
    private static final long INT_ARRAY_INDEX_SCALE = 0;
    private static final boolean IS_ANDROID_32 = false;
    private static final boolean IS_ANDROID_64 = false;
    static final boolean IS_BIG_ENDIAN = false;
    private static final long LONG_ARRAY_BASE_OFFSET = 0;
    private static final long LONG_ARRAY_INDEX_SCALE = 0;
    private static final MemoryAccessor MEMORY_ACCESSOR = null;
    private static final Class<?> MEMORY_CLASS = null;
    private static final long OBJECT_ARRAY_BASE_OFFSET = 0;
    private static final long OBJECT_ARRAY_INDEX_SCALE = 0;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = null;

    /* renamed from: com.google.protobuf.UnsafeUtil$1 */
    static class C13421 implements PrivilegedExceptionAction<Unsafe> {
        C13421() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: run, reason: avoid collision after fix types in other method */
        public Unsafe run2() throws Exception {
        }
    }

    private static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        Android32MemoryAccessor(Unsafe unsafe) {
        }

        private static int smallAddress(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j, boolean z) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j, byte b) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j, double d) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j, float f) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j, int i) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j, long j2) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j, byte b) {
        }
    }

    private static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j, boolean z) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j, byte b) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j, double d) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j, float f) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j, int i) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j, long j2) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j, byte b) {
        }
    }

    private static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j, byte[] bArr, long j2, long j3) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j, boolean z) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j, byte b) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j, double d) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j, float f) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j, int i) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j, long j2) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j, long j2, long j3) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j) {
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j, byte b) {
        }
    }

    private static abstract class MemoryAccessor {
        Unsafe unsafe;

        MemoryAccessor(Unsafe unsafe) {
        }

        public final int arrayBaseOffset(Class<?> cls) {
        }

        public final int arrayIndexScale(Class<?> cls) {
        }

        public abstract void copyMemory(long j, byte[] bArr, long j2, long j3);

        public abstract void copyMemory(byte[] bArr, long j, long j2, long j3);

        public abstract boolean getBoolean(Object obj, long j);

        public abstract byte getByte(long j);

        public abstract byte getByte(Object obj, long j);

        public abstract double getDouble(Object obj, long j);

        public abstract float getFloat(Object obj, long j);

        public abstract int getInt(long j);

        public final int getInt(Object obj, long j) {
        }

        public abstract long getLong(long j);

        public final long getLong(Object obj, long j) {
        }

        public final Object getObject(Object obj, long j) {
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
        }

        public abstract void putBoolean(Object obj, long j, boolean z);

        public abstract void putByte(long j, byte b);

        public abstract void putByte(Object obj, long j, byte b);

        public abstract void putDouble(Object obj, long j, double d);

        public abstract void putFloat(Object obj, long j, float f);

        public abstract void putInt(long j, int i);

        public final void putInt(Object obj, long j, int i) {
        }

        public abstract void putLong(long j, long j2);

        public final void putLong(Object obj, long j, long j2) {
        }

        public final void putObject(Object obj, long j, Object obj2) {
        }
    }

    private UnsafeUtil() {
    }

    static /* synthetic */ byte access$000(Object obj, long j) {
    }

    static /* synthetic */ byte access$100(Object obj, long j) {
    }

    static /* synthetic */ void access$200(Object obj, long j, byte b) {
    }

    static /* synthetic */ void access$300(Object obj, long j, byte b) {
    }

    static /* synthetic */ boolean access$400(Object obj, long j) {
    }

    static /* synthetic */ boolean access$500(Object obj, long j) {
    }

    static /* synthetic */ void access$600(Object obj, long j, boolean z) {
    }

    static /* synthetic */ void access$700(Object obj, long j, boolean z) {
    }

    static long addressOffset(ByteBuffer byteBuffer) {
    }

    static <T> T allocateInstance(Class<T> cls) {
    }

    private static int arrayBaseOffset(Class<?> cls) {
    }

    private static int arrayIndexScale(Class<?> cls) {
    }

    private static java.lang.reflect.Field bufferAddressField() {
    }

    static void copyMemory(byte[] bArr, long j, long j2, long j3) {
    }

    private static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
    }

    private static int firstDifferingByteIndexNativeEndian(long j, long j2) {
    }

    static boolean getBoolean(Object obj, long j) {
    }

    private static boolean getBooleanBigEndian(Object obj, long j) {
    }

    private static boolean getBooleanLittleEndian(Object obj, long j) {
    }

    static byte getByte(Object obj, long j) {
    }

    private static byte getByteBigEndian(Object obj, long j) {
    }

    private static byte getByteLittleEndian(Object obj, long j) {
    }

    static double getDouble(Object obj, long j) {
    }

    static float getFloat(Object obj, long j) {
    }

    static int getInt(Object obj, long j) {
    }

    static long getLong(Object obj, long j) {
    }

    private static MemoryAccessor getMemoryAccessor() {
    }

    static Object getObject(Object obj, long j) {
    }

    static Object getStaticObject(java.lang.reflect.Field field) {
    }

    static Unsafe getUnsafe() {
    }

    static boolean hasUnsafeArrayOperations() {
    }

    static boolean hasUnsafeByteBufferOperations() {
    }

    static boolean isAndroid64() {
    }

    static int mismatch(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
    }

    static long objectFieldOffset(java.lang.reflect.Field field) {
    }

    static void putBoolean(Object obj, long j, boolean z) {
    }

    private static void putBooleanBigEndian(Object obj, long j, boolean z) {
    }

    private static void putBooleanLittleEndian(Object obj, long j, boolean z) {
    }

    static void putByte(Object obj, long j, byte b) {
    }

    private static void putByteBigEndian(Object obj, long j, byte b) {
    }

    private static void putByteLittleEndian(Object obj, long j, byte b) {
    }

    static void putDouble(Object obj, long j, double d) {
    }

    static void putFloat(Object obj, long j, float f) {
    }

    static void putInt(Object obj, long j, int i) {
    }

    static void putLong(Object obj, long j, long j2) {
    }

    static void putObject(Object obj, long j, Object obj2) {
    }

    private static boolean supportsUnsafeArrayOperations() {
    }

    private static boolean supportsUnsafeByteBufferOperations() {
    }

    static void copyMemory(long j, byte[] bArr, long j2, long j3) {
    }

    static boolean getBoolean(boolean[] zArr, long j) {
    }

    static byte getByte(byte[] bArr, long j) {
    }

    static double getDouble(double[] dArr, long j) {
    }

    static float getFloat(float[] fArr, long j) {
    }

    static int getInt(int[] iArr, long j) {
    }

    static long getLong(long[] jArr, long j) {
    }

    static Object getObject(Object[] objArr, long j) {
    }

    static void putBoolean(boolean[] zArr, long j, boolean z) {
    }

    static void putByte(byte[] bArr, long j, byte b) {
    }

    static void putDouble(double[] dArr, long j, double d) {
    }

    static void putFloat(float[] fArr, long j, float f) {
    }

    static void putInt(int[] iArr, long j, int i) {
    }

    static void putLong(long[] jArr, long j, long j2) {
    }

    static void putObject(Object[] objArr, long j, Object obj) {
    }

    static void copyMemory(byte[] bArr, long j, byte[] bArr2, long j2, long j3) {
    }

    static byte getByte(long j) {
    }

    static int getInt(long j) {
    }

    static long getLong(long j) {
    }

    static void putByte(long j, byte b) {
    }

    static void putInt(long j, int i) {
    }

    static void putLong(long j, long j2) {
    }
}
