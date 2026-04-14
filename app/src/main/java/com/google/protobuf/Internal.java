package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final ByteBuffer EMPTY_BYTE_BUFFER = null;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM = null;
    static final Charset ISO_8859_1 = null;
    static final Charset UTF_8 = null;

    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        @Override // 
        ProtobufList<Boolean> mutableCopyWithCapacity(int i);

        boolean setBoolean(int i, boolean z);
    }

    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d);

        double getDouble(int i);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Double> mutableCopyWithCapacity(int i);

        double setDouble(int i, double d);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f);

        float getFloat(int i);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Float> mutableCopyWithCapacity(int i);

        float setFloat(int i, float f);
    }

    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i);

        int getInt(int i);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Integer> mutableCopyWithCapacity(int i);

        int setInt(int i, int i2);
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    public interface LongList extends ProtobufList<Long> {
        void addLong(long j);

        long getLong(int i);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Long> mutableCopyWithCapacity(int i);

        long setLong(int i, long j);
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: com.google.protobuf.Internal$MapAdapter$1 */
        static class C13131<T> implements Converter<Integer, T> {
            final /* synthetic */ EnumLiteMap val$enumMap;
            final /* synthetic */ EnumLite val$unrecognizedValue;

            C13131(EnumLiteMap enumLiteMap, EnumLite enumLite) {
            }

            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            public /* bridge */ /* synthetic */ Integer doBackward(Object obj) {
            }

            @Override // com.google.protobuf.Internal.MapAdapter.Converter
            public /* bridge */ /* synthetic */ Object doForward(Integer num) {
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            public Integer doBackward(EnumLite enumLite) {
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            /* renamed from: doForward, reason: avoid collision after fix types in other method */
            public EnumLite doForward2(Integer num) {
            }
        }

        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a);
        }

        private class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;
            final /* synthetic */ MapAdapter this$0;

            public EntryAdapter(MapAdapter mapAdapter, Map.Entry<K, RealValue> entry) {
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
            }

            @Override // java.util.Map.Entry
            public K getKey() {
            }

            @Override // java.util.Map.Entry
            public V getValue() {
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
            }
        }

        private class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;
            final /* synthetic */ MapAdapter this$0;

            public IteratorAdapter(MapAdapter mapAdapter, Iterator<Map.Entry<K, RealValue>> it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
            }
        }

        private class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;
            final /* synthetic */ MapAdapter this$0;

            public SetAdapter(MapAdapter mapAdapter, Set<Map.Entry<K, RealValue>> set) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
        }

        static /* synthetic */ Converter access$000(MapAdapter mapAdapter) {
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
    }

    public static ByteString bytesDefaultValue(String str) {
    }

    static <T> T checkNotNull(T t) {
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
    }

    public static int hashBoolean(boolean z) {
    }

    public static int hashCode(List<byte[]> list) {
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
    }

    public static int hashEnum(EnumLite enumLite) {
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
    }

    public static int hashLong(long j) {
    }

    public static boolean isValidUtf8(ByteString byteString) {
    }

    static Object mergeMessage(Object obj, Object obj2) {
    }

    static int partialHash(int i, byte[] bArr, int i2, int i3) {
    }

    public static String stringDefaultValue(String str) {
    }

    public static byte[] toByteArray(String str) {
    }

    public static String toStringUtf8(byte[] bArr) {
    }

    static <T> T checkNotNull(T t, String str) {
    }

    public static boolean isValidUtf8(byte[] bArr) {
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
    }

    public static int hashCode(byte[] bArr) {
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
    }

    static int hashCode(byte[] bArr, int i, int i2) {
    }
}
