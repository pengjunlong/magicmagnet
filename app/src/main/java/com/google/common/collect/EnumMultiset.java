package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    /* renamed from: com.google.common.collect.EnumMultiset$1 */
    class C06951 extends EnumMultiset<E>.Itr<E> {
        final /* synthetic */ EnumMultiset this$0;

        C06951(EnumMultiset enumMultiset) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        /* bridge */ /* synthetic */ Object output(int i) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        E output(int i) {
        }
    }

    /* renamed from: com.google.common.collect.EnumMultiset$2 */
    class C06962 extends EnumMultiset<E>.Itr<Multiset.Entry<E>> {
        final /* synthetic */ EnumMultiset this$0;

        /* renamed from: com.google.common.collect.EnumMultiset$2$1, reason: invalid class name */
        class AnonymousClass1 extends Multisets.AbstractEntry<E> {
            final /* synthetic */ C06962 this$1;
            final /* synthetic */ int val$index;

            AnonymousClass1(C06962 c06962, int i) {
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
            }

            @Override // com.google.common.collect.Multiset.Entry
            public /* bridge */ /* synthetic */ Object getElement() {
            }

            @Override // com.google.common.collect.Multiset.Entry
            public E getElement() {
            }
        }

        C06962(EnumMultiset enumMultiset) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        /* bridge */ /* synthetic */ Object output(int i) {
        }

        @Override // com.google.common.collect.EnumMultiset.Itr
        Multiset.Entry<E> output(int i) {
        }
    }

    abstract class Itr<T> implements Iterator<T> {
        int index;
        final /* synthetic */ EnumMultiset this$0;
        int toRemove;

        Itr(EnumMultiset enumMultiset) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        abstract T output(int i);

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    private EnumMultiset(Class<E> cls) {
    }

    static /* synthetic */ Enum[] access$000(EnumMultiset enumMultiset) {
    }

    static /* synthetic */ int[] access$100(EnumMultiset enumMultiset) {
    }

    static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
    }

    static /* synthetic */ long access$322(EnumMultiset enumMultiset, long j) {
    }

    private void checkIsE(Object obj) {
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
    }

    private boolean isActuallyE(Object obj) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ int add(Object obj, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ int setCount(Object obj, int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
    }

    @CanIgnoreReturnValue
    public int add(E e, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean setCount(@ParametricNullness Object obj, int i, int i2) {
    }

    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
    }
}
