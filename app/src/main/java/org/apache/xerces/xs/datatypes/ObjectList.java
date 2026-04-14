package org.apache.xerces.xs.datatypes;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ObjectList extends List {
    @Override // java.util.Collection, java.util.List, org.apache.xerces.xs.datatypes.ObjectList
    boolean contains(Object obj);

    int getLength();

    Object item(int i);
}
