package org.apache.xerces.xni;

import java.util.Enumeration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface Augmentations {
    Object getItem(String str);

    Enumeration keys();

    Object putItem(String str, Object obj);

    void removeAllItems();

    Object removeItem(String str);
}
