package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<E> extends pbppbpqbamJRy11l1l1<E> implements List<E> {
    public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final boolean bpdqqiQNVROMLC1ll1l1l11(Collection<?> collection, Collection<?> collection2) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2, int i3) {
        }

        public final void dpbdbdpbLwkLpObyKsq1lll1(int i, int i2) {
        }

        public final void dpbdpqRKAscW1lll1l(int i, int i2, int i3) {
        }

        public final void dqqppqiKzJi1l1lll1l(int i, int i2) {
        }

        public final int ppbdpwWWljzmXXdHNabfWhgjl111l11(Collection<?> collection) {
        }
    }

    @Metadata
    private class dpbdbdpbLwkLpObyKsq1lll1 implements Iterator<E>, j00 {
        final /* synthetic */ qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<E> bpdqqiQNVROMLC1ll1l1l11;
        private int dpbdpqRKAscW1lll1l;

        public dpbdbdpbLwkLpObyKsq1lll1(qbdqqpbqpCWRpIKEKtzoceYOll1ll1l qbdqqpbqpcwrpikektzoceyoll1ll1l) {
        }

        protected final int dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        protected final void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    @Metadata
    private static final class dpbdpqRKAscW1lll1l<E> extends qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<E> implements RandomAccess {
        private final qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<E> bpdqqiQNVROMLC1ll1l1l11;
        private int dqpqqqbqQyjyB11111l1;
        private final int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dpbdpqRKAscW1lll1l(qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<? extends E> qbdqqpbqpcwrpikektzoceyoll1ll1l, int i, int i2) {
        }

        @Override // p000.pbppbpqbamJRy11l1l1
        public int dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l, java.util.List
        public E get(int i) {
        }
    }

    @Metadata
    private class dqqppqiKzJi1l1lll1l extends qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<E>.dpbdbdpbLwkLpObyKsq1lll1 implements ListIterator<E> {
        final /* synthetic */ qbdqqpbqpCWRpIKEKtzoceYOll1ll1l<E> ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dqqppqiKzJi1l1lll1l(qbdqqpbqpCWRpIKEKtzoceYOll1ll1l qbdqqpbqpcwrpikektzoceyoll1ll1l, int i) {
        }

        @Override // java.util.ListIterator
        public void add(E e) {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public E previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator
        public void set(E e) {
        }
    }

    protected qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    @Override // java.util.List
    public void add(int i, E e) {
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
    }

    public int indexOf(E e) {
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
    }

    public int lastIndexOf(E e) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
    }

    @Override // java.util.List
    public E remove(int i) {
    }

    @Override // java.util.List
    public E set(int i, E e) {
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
    }
}
