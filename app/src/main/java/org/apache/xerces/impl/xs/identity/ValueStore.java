package org.apache.xerces.impl.xs.identity;

import org.apache.xerces.xs.ShortList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ValueStore {
    void addValue(Field field, boolean z, Object obj, short s, ShortList shortList);

    void reportError(String str, Object[] objArr);
}
