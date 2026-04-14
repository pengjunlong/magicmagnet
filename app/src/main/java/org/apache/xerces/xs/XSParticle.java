package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSParticle extends XSObject {
    XSObjectList getAnnotations();

    int getMaxOccurs();

    boolean getMaxOccursUnbounded();

    int getMinOccurs();

    XSTerm getTerm();
}
