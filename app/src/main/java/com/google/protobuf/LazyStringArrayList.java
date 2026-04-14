package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY = null;
    private static final LazyStringArrayList EMPTY_LIST = null;
    private final List<Object> list;

    private static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        ByteArrayListView(LazyStringArrayList lazyStringArrayList) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        public void add(int i, byte[] bArr) {
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i) {
        }

        public byte[] set(int i, byte[] bArr) {
        }
    }

    private static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        ByteStringListView(LazyStringArrayList lazyStringArrayList) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        public void add(int i, ByteString byteString) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString get(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString remove(int i) {
        }

        public ByteString set(int i, ByteString byteString) {
        }
    }

    public LazyStringArrayList() {
    }

    static /* synthetic */ Object access$000(LazyStringArrayList lazyStringArrayList, int i, byte[] bArr) {
    }

    static /* synthetic */ byte[] access$100(Object obj) {
    }

    static /* synthetic */ void access$200(LazyStringArrayList lazyStringArrayList, int i, byte[] bArr) {
    }

    static /* synthetic */ Object access$300(LazyStringArrayList lazyStringArrayList, int i, ByteString byteString) {
    }

    static /* synthetic */ ByteString access$400(Object obj) {
    }

    static /* synthetic */ void access$500(LazyStringArrayList lazyStringArrayList, int i, ByteString byteString) {
    }

    private static byte[] asByteArray(Object obj) {
    }

    private static ByteString asByteString(Object obj) {
    }

    private static String asString(Object obj) {
    }

    static LazyStringArrayList emptyList() {
    }

    private Object setAndReturn(int i, ByteString byteString) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
    }

    @Override // com.google.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
    }

    @Override // com.google.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
    }

    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
    }

    @Override // com.google.protobuf.LazyStringList
    public ByteString getByteString(int i) {
    }

    @Override // com.google.protobuf.LazyStringList
    public Object getRaw(int i) {
    }

    @Override // com.google.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
    }

    @Override // com.google.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ Internal.ProtobufList mutableCopyWithCapacity(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    public LazyStringArrayList(int i) {
    }

    public void add(int i, String str) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public LazyStringArrayList mutableCopyWithCapacity(int i) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
    }

    public String set(int i, String str) {
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
    }

    private Object setAndReturn(int i, byte[] bArr) {
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String remove(int i) {
    }

    private void add(int i, ByteString byteString) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
    }

    public LazyStringArrayList(List<String> list) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
    }

    private LazyStringArrayList(ArrayList<Object> arrayList) {
    }

    private void add(int i, byte[] bArr) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(ByteString byteString) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] bArr) {
    }
}
