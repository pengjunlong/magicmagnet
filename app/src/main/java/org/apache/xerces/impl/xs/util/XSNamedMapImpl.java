package org.apache.xerces.impl.xs.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.xerces.util.SymbolHash;
import org.apache.xerces.xs.XSNamedMap;
import org.apache.xerces.xs.XSObject;
import org.javax.xml.namespace.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSNamedMapImpl extends AbstractMap implements XSNamedMap {
    public static final XSNamedMapImpl EMPTY_MAP = null;
    XSObject[] fArray;
    private Set fEntrySet;
    int fLength;
    final SymbolHash[] fMaps;
    final int fNSNum;
    final String[] fNamespaces;

    /* renamed from: org.apache.xerces.impl.xs.util.XSNamedMapImpl$1 */
    class C17991 extends AbstractSet {
        final /* synthetic */ XSNamedMapImpl this$0;
        final /* synthetic */ XSNamedMapEntry[] val$entries;
        final /* synthetic */ int val$length;

        /* renamed from: org.apache.xerces.impl.xs.util.XSNamedMapImpl$1$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator {
            private int index;
            final /* synthetic */ C17991 this$1;

            AnonymousClass1(C17991 c17991) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        C17991(XSNamedMapImpl xSNamedMapImpl, int i, XSNamedMapEntry[] xSNamedMapEntryArr) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    private static final class XSNamedMapEntry implements Map.Entry {
        private final QName key;
        private final XSObject value;

        public XSNamedMapEntry(QName qName, XSObject xSObject) {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
        }

        public String toString() {
        }
    }

    public XSNamedMapImpl(String str, SymbolHash symbolHash) {
    }

    static boolean isEqual(String str, String str2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public synchronized Set entrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
    }

    public synchronized int getLength() {
    }

    public synchronized XSObject item(int i) {
    }

    public XSObject itemByName(String str, String str2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public XSNamedMapImpl(String[] strArr, SymbolHash[] symbolHashArr, int i) {
    }

    public XSNamedMapImpl(XSObject[] xSObjectArr, int i) {
    }
}
