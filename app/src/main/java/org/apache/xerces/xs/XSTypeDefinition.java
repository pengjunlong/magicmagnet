package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSTypeDefinition extends XSObject {
    public static final short COMPLEX_TYPE = 15;
    public static final short SIMPLE_TYPE = 16;

    boolean derivedFrom(String str, String str2, short s);

    boolean derivedFromType(XSTypeDefinition xSTypeDefinition, short s);

    boolean getAnonymous();

    XSTypeDefinition getBaseType();

    short getFinal();

    short getTypeCategory();

    boolean isFinal(short s);
}
