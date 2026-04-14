package org.apache.xerces.xs.datatypes;

import java.util.List;
import org.apache.xerces.xs.XSException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ByteList extends List {
    boolean contains(byte b);

    int getLength();

    byte item(int i) throws XSException;

    byte[] toByteArray();
}
