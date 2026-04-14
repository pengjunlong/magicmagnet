package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSIDCDefinition extends XSObject {
    public static final short IC_KEY = 1;
    public static final short IC_KEYREF = 2;
    public static final short IC_UNIQUE = 3;

    XSObjectList getAnnotations();

    short getCategory();

    StringList getFieldStrs();

    XSIDCDefinition getRefKey();

    String getSelectorStr();
}
