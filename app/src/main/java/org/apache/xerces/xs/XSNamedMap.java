package org.apache.xerces.xs;

import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSNamedMap extends Map {
    int getLength();

    XSObject item(int i);

    XSObject itemByName(String str, String str2);
}
