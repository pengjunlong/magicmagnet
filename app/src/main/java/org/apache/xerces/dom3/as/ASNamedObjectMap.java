package org.apache.xerces.dom3.as;

import org.w3c.dom.DOMException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ASNamedObjectMap {
    int getLength();

    ASObject getNamedItem(String str);

    ASObject getNamedItemNS(String str, String str2);

    ASObject item(int i);

    ASObject removeNamedItem(String str) throws DOMException;

    ASObject removeNamedItemNS(String str, String str2) throws DOMException;

    ASObject setNamedItem(ASObject aSObject) throws DOMException;

    ASObject setNamedItemNS(ASObject aSObject) throws DOMException;
}
