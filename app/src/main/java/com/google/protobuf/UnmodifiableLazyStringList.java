package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    /* renamed from: com.google.protobuf.UnmodifiableLazyStringList$1 */
    class C13401 implements ListIterator<String> {
        ListIterator<String> iter;
        final /* synthetic */ UnmodifiableLazyStringList this$0;
        final /* synthetic */ int val$index;

        C13401(UnmodifiableLazyStringList unmodifiableLazyStringList, int i) {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ String previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(String str) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
        }

        @Override // java.util.ListIterator
        /* renamed from: previous, reason: avoid collision after fix types in other method */
        public String previous2() {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(String str) {
        }
    }

    /* renamed from: com.google.protobuf.UnmodifiableLazyStringList$2 */
    class C13412 implements Iterator<String> {
        Iterator<String> iter;
        final /* synthetic */ UnmodifiableLazyStringList this$0;

        C13412(UnmodifiableLazyStringList unmodifiableLazyStringList) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ String next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public String next2() {
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
    }

    static /* synthetic */ LazyStringList access$000(UnmodifiableLazyStringList unmodifiableLazyStringList) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(ByteString byteString) {
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] bArr) {
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
    }
}
