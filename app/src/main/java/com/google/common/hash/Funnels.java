package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Funnels {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class ByteArrayFunnel implements Funnel<byte[]> {
        private static final /* synthetic */ ByteArrayFunnel[] $VALUES = null;
        public static final ByteArrayFunnel INSTANCE = null;

        private static /* synthetic */ ByteArrayFunnel[] $values() {
        }

        private ByteArrayFunnel(String str, int i) {
        }

        public static ByteArrayFunnel valueOf(String str) {
        }

        public static ByteArrayFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(byte[] bArr, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(byte[] bArr, PrimitiveSink primitiveSink) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class IntegerFunnel implements Funnel<Integer> {
        private static final /* synthetic */ IntegerFunnel[] $VALUES = null;
        public static final IntegerFunnel INSTANCE = null;

        private static /* synthetic */ IntegerFunnel[] $values() {
        }

        private IntegerFunnel(String str, int i) {
        }

        public static IntegerFunnel valueOf(String str) {
        }

        public static IntegerFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Integer num, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(Integer num, PrimitiveSink primitiveSink) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class LongFunnel implements Funnel<Long> {
        private static final /* synthetic */ LongFunnel[] $VALUES = null;
        public static final LongFunnel INSTANCE = null;

        private static /* synthetic */ LongFunnel[] $values() {
        }

        private LongFunnel(String str, int i) {
        }

        public static LongFunnel valueOf(String str) {
        }

        public static LongFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Long l, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(Long l, PrimitiveSink primitiveSink) {
        }
    }

    private static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        private final Funnel<E> elementFunnel;

        SequentialFunnel(Funnel<E> funnel) {
        }

        public boolean equals(Object obj) {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Object obj, PrimitiveSink primitiveSink) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public void funnel(Iterable<? extends E> iterable, PrimitiveSink primitiveSink) {
        }
    }

    private static class SinkAsStream extends OutputStream {
        final PrimitiveSink sink;

        SinkAsStream(PrimitiveSink primitiveSink) {
        }

        public String toString() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
        }
    }

    private static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
        private final Charset charset;

        private static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;
            private final String charsetCanonicalName;

            SerializedForm(Charset charset) {
            }

            private Object readResolve() {
            }
        }

        StringCharsetFunnel(Charset charset) {
        }

        public boolean equals(Object obj) {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        Object writeReplace() {
        }

        /* renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class UnencodedCharsFunnel implements Funnel<CharSequence> {
        private static final /* synthetic */ UnencodedCharsFunnel[] $VALUES = null;
        public static final UnencodedCharsFunnel INSTANCE = null;

        private static /* synthetic */ UnencodedCharsFunnel[] $values() {
        }

        private UnencodedCharsFunnel(String str, int i) {
        }

        public static UnencodedCharsFunnel valueOf(String str) {
        }

        public static UnencodedCharsFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel, reason: avoid collision after fix types in other method */
        public void funnel2(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }
    }

    private Funnels() {
    }

    public static OutputStream asOutputStream(PrimitiveSink primitiveSink) {
    }

    public static Funnel<byte[]> byteArrayFunnel() {
    }

    public static Funnel<Integer> integerFunnel() {
    }

    public static Funnel<Long> longFunnel() {
    }

    public static <E> Funnel<Iterable<? extends E>> sequentialFunnel(Funnel<E> funnel) {
    }

    public static Funnel<CharSequence> stringFunnel(Charset charset) {
    }

    public static Funnel<CharSequence> unencodedCharsFunnel() {
    }
}
