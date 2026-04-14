package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xs.datatypes.XSQName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class QNameDV extends TypeValidator {
    private static final String EMPTY_STRING = null;

    private static final class XQName extends QName implements XSQName {
        public XQName(String str, String str2, String str3, String str4) {
        }

        @Override // org.apache.xerces.xni.QName
        public boolean equals(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.XSQName
        public javax.xml.namespace.QName getJAXPQName() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSQName
        public QName getXNIQName() {
        }

        @Override // org.apache.xerces.xni.QName
        public String toString() {
        }
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public Object getActualValue(String str, ValidationContext validationContext) throws InvalidDatatypeValueException {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public short getAllowedFacets() {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public int getDataLength(Object obj) {
    }
}
