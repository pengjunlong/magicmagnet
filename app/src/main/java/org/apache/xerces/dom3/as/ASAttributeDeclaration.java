package org.apache.xerces.dom3.as;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ASAttributeDeclaration extends ASObject {
    public static final short VALUE_DEFAULT = 1;
    public static final short VALUE_FIXED = 2;
    public static final short VALUE_NONE = 0;

    ASDataType getDataType();

    String getDataValue();

    short getDefaultType();

    String getEnumAttr();

    ASObjectList getOwnerElements();

    void setDataType(ASDataType aSDataType);

    void setDataValue(String str);

    void setDefaultType(short s);

    void setEnumAttr(String str);

    void setOwnerElements(ASObjectList aSObjectList);
}
