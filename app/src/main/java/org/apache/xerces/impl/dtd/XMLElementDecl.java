package org.apache.xerces.impl.dtd;

import org.apache.xerces.impl.dtd.models.ContentModelValidator;
import org.apache.xerces.xni.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLElementDecl {
    public static final short TYPE_ANY = 0;
    public static final short TYPE_CHILDREN = 3;
    public static final short TYPE_EMPTY = 1;
    public static final short TYPE_MIXED = 2;
    public static final short TYPE_SIMPLE = 4;
    public ContentModelValidator contentModelValidator;
    public final QName name;
    public int scope;
    public final XMLSimpleType simpleType;
    public short type;

    public void clear() {
    }

    public void setValues(QName qName, int i, short s, ContentModelValidator contentModelValidator, XMLSimpleType xMLSimpleType) {
    }
}
