package org.apache.xerces.dom;

import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class NodeListCache implements Serializable {
    private static final long serialVersionUID = -7927529254918631002L;
    ChildNode fChild;
    int fChildIndex;
    int fLength;
    ParentNode fOwner;
    NodeListCache next;

    NodeListCache(ParentNode parentNode) {
    }
}
