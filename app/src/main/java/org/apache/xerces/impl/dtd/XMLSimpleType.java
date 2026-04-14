package org.apache.xerces.impl.dtd;

import org.apache.xerces.impl.dv.DatatypeValidator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLSimpleType {
    public static final short DEFAULT_TYPE_DEFAULT = 3;
    public static final short DEFAULT_TYPE_FIXED = 1;
    public static final short DEFAULT_TYPE_IMPLIED = 0;
    public static final short DEFAULT_TYPE_REQUIRED = 2;
    public static final short TYPE_CDATA = 0;
    public static final short TYPE_ENTITY = 1;
    public static final short TYPE_ENUMERATION = 2;
    public static final short TYPE_ID = 3;
    public static final short TYPE_IDREF = 4;
    public static final short TYPE_NAMED = 7;
    public static final short TYPE_NMTOKEN = 5;
    public static final short TYPE_NOTATION = 6;
    public DatatypeValidator datatypeValidator;
    public short defaultType;
    public String defaultValue;
    public String[] enumeration;
    public boolean list;
    public String name;
    public String nonNormalizedDefaultValue;
    public short type;

    public void clear() {
    }

    public void setValues(short s, String str, String[] strArr, boolean z, short s2, String str2, String str3, DatatypeValidator datatypeValidator) {
    }

    public void setValues(XMLSimpleType xMLSimpleType) {
    }
}
