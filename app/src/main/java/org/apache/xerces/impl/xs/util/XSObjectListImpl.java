package org.apache.xerces.impl.xs.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.ListIterator;
import org.apache.xerces.xs.XSObject;
import org.apache.xerces.xs.XSObjectList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSObjectListImpl extends AbstractList implements XSObjectList {
    private static final int DEFAULT_SIZE = 4;
    private static final ListIterator EMPTY_ITERATOR = null;
    public static final XSObjectListImpl EMPTY_LIST = null;
    private XSObject[] fArray;
    private int fLength;

    /* renamed from: org.apache.xerces.impl.xs.util.XSObjectListImpl$1 */
    static class C18001 implements ListIterator {
        C18001() {
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public Object previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
        }
    }

    private final class XSObjectListIterator implements ListIterator {
        private int index;
        final /* synthetic */ XSObjectListImpl this$0;

        public XSObjectListIterator(XSObjectListImpl xSObjectListImpl, int i) {
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public Object previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
        }
    }

    public XSObjectListImpl() {
    }

    static /* synthetic */ int access$000(XSObjectListImpl xSObjectListImpl) {
    }

    static /* synthetic */ XSObject[] access$100(XSObjectListImpl xSObjectListImpl) {
    }

    private boolean containsNull() {
    }

    private boolean containsObject(Object obj) {
    }

    private ListIterator listIterator0(int i) {
    }

    private void toArray0(Object[] objArr) {
    }

    public void addXSObject(XSObject xSObject) {
    }

    public void clearXSObjectList() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
    }

    @Override // org.apache.xerces.xs.XSObjectList
    public int getLength() {
    }

    @Override // org.apache.xerces.xs.XSObjectList
    public XSObject item(int i) {
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
    }

    public XSObjectListImpl(XSObject[] xSObjectArr, int i) {
    }

    public void addXSObject(int i, XSObject xSObject) {
    }
}
