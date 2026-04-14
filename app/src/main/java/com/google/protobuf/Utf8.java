package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor = null;

    private static class DecodeUtil {
        private DecodeUtil() {
        }

        static /* synthetic */ void access$1000(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        }

        static /* synthetic */ boolean access$400(byte b) {
        }

        static /* synthetic */ void access$500(byte b, char[] cArr, int i) {
        }

        static /* synthetic */ boolean access$600(byte b) {
        }

        static /* synthetic */ void access$700(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        }

        static /* synthetic */ boolean access$800(byte b) {
        }

        static /* synthetic */ void access$900(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        }

        private static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        }

        private static void handleOneByte(byte b, char[] cArr, int i) {
        }

        private static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        }

        private static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        }

        private static char highSurrogate(int i) {
        }

        private static boolean isNotTrailingByte(byte b) {
        }

        private static boolean isOneByte(byte b) {
        }

        private static boolean isThreeBytes(byte b) {
        }

        private static boolean isTwoBytes(byte b) {
        }

        private static char lowSurrogate(int i) {
        }

        private static int trailingByteValue(byte b) {
        }
    }

    static abstract class Processor {
        Processor() {
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        }

        abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean isValidUtf8(byte[] bArr, int i, int i2) {
        }

        final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        }

        abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        final int partialIsValidUtf8Default(int i, ByteBuffer byteBuffer, int i2, int i3) {
        }

        abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
        }

        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
        }

        private static int partialIsValidUtf8(long j, int i) {
        }
    }

    private Utf8() {
    }

    static /* synthetic */ int access$000(int i, int i2) {
    }

    static /* synthetic */ int access$100(int i, int i2, int i3) {
    }

    static /* synthetic */ int access$1100(byte[] bArr, int i, int i2) {
    }

    static /* synthetic */ int access$1200(int i) {
    }

    static /* synthetic */ int access$200(ByteBuffer byteBuffer, int i, int i2) {
    }

    static /* synthetic */ int access$300(ByteBuffer byteBuffer, int i, int i2, int i3) {
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
    }

    static int encodedLength(CharSequence charSequence) {
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
    }

    private static int incompleteStateFor(int i) {
    }

    private static int incompleteStateFor(int i, int i2) {
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
    }

    public static boolean isValidUtf8(byte[] bArr) {
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
    }

    static String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
    }

    static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
    }

    private static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        }

        @Override // com.google.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        }
    }
}
