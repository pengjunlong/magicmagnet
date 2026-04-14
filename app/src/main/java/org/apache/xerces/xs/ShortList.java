package org.apache.xerces.xs;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ShortList extends List {
    boolean contains(short s);

    int getLength();

    short item(int i) throws XSException;
}
