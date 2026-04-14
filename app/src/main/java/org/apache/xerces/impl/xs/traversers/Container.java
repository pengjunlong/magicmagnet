package org.apache.xerces.impl.xs.traversers;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class Container {
    static final int THRESHOLD = 5;
    int pos;
    OneAttr[] values;

    Container() {
    }

    static Container getContainer(int i) {
    }

    abstract OneAttr get(String str);

    abstract void put(String str, OneAttr oneAttr);
}
