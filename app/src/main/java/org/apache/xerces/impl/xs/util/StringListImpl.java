package org.apache.xerces.impl.xs.util;

import java.util.AbstractList;
import java.util.Vector;
import org.apache.xerces.xs.StringList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class StringListImpl extends AbstractList implements StringList {
    public static final StringListImpl EMPTY_LIST = null;
    private final String[] fArray;
    private final int fLength;
    private final Vector fVector;

    public StringListImpl(Vector vector) {
    }

    private void toArray0(Object[] objArr) {
    }

    @Override // org.apache.xerces.xs.StringList
    public boolean contains(String str) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
    }

    @Override // org.apache.xerces.xs.StringList
    public int getLength() {
    }

    @Override // org.apache.xerces.xs.StringList
    public String item(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
    }

    public StringListImpl(String[] strArr, int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
    }
}
