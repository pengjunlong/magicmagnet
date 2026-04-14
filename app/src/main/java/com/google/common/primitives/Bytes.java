package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Bytes {

    @GwtCompatible
    private static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        ByteArrayAsList(byte[] bArr) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i, int i2) {
        }

        byte[] toByteArray() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        ByteArrayAsList(byte[] bArr, int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i) {
        }

        public Byte set(int i, Byte b) {
        }
    }

    private Bytes() {
    }

    static /* synthetic */ int access$000(byte[] bArr, byte b, int i, int i2) {
    }

    static /* synthetic */ int access$100(byte[] bArr, byte b, int i, int i2) {
    }

    public static List<Byte> asList(byte... bArr) {
    }

    public static byte[] concat(byte[]... bArr) {
    }

    public static boolean contains(byte[] bArr, byte b) {
    }

    public static byte[] ensureCapacity(byte[] bArr, int i, int i2) {
    }

    public static int hashCode(byte b) {
    }

    public static int indexOf(byte[] bArr, byte b) {
    }

    public static int lastIndexOf(byte[] bArr, byte b) {
    }

    public static void reverse(byte[] bArr) {
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
    }

    private static int indexOf(byte[] bArr, byte b, int i, int i2) {
    }

    private static int lastIndexOf(byte[] bArr, byte b, int i, int i2) {
    }

    public static int indexOf(byte[] bArr, byte[] bArr2) {
    }

    public static void reverse(byte[] bArr, int i, int i2) {
    }
}
