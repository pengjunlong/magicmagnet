package org.apache.xerces.impl.dv;

import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ValidatedInfo implements XSValue {
    public XSSimpleType actualType;
    public Object actualValue;
    public short actualValueType;
    public ShortList itemValueTypes;
    public XSSimpleType memberType;
    public XSSimpleType[] memberTypes;
    public String normalizedValue;

    private static short convertToPrimitiveKind(short s) {
    }

    public static boolean isComparable(ValidatedInfo validatedInfo, ValidatedInfo validatedInfo2) {
    }

    public void copyFrom(XSValue xSValue) {
    }

    @Override // org.apache.xerces.xs.XSValue
    public Object getActualValue() {
    }

    @Override // org.apache.xerces.xs.XSValue
    public short getActualValueType() {
    }

    @Override // org.apache.xerces.xs.XSValue
    public ShortList getListValueTypes() {
    }

    @Override // org.apache.xerces.xs.XSValue
    public XSSimpleTypeDefinition getMemberTypeDefinition() {
    }

    @Override // org.apache.xerces.xs.XSValue
    public XSObjectList getMemberTypeDefinitions() {
    }

    @Override // org.apache.xerces.xs.XSValue
    public String getNormalizedValue() {
    }

    @Override // org.apache.xerces.xs.XSValue
    public XSSimpleTypeDefinition getTypeDefinition() {
    }

    public void reset() {
    }

    public String stringValue() {
    }
}
