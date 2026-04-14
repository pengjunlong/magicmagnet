package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.xs.datatypes.XSFloat;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FloatDV extends TypeValidator {

    private static final class XFloat implements XSFloat {
        private String canonical;
        private final float value;

        public XFloat(String str) throws NumberFormatException {
        }

        static /* synthetic */ int access$000(XFloat xFloat, XFloat xFloat2) {
        }

        private int compareTo(XFloat xFloat) {
        }

        public boolean equals(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.XSFloat
        public float getValue() {
        }

        public int hashCode() {
        }

        public boolean isIdentical(XFloat xFloat) {
        }

        public synchronized String toString() {
        }
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public int compare(Object obj, Object obj2) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public Object getActualValue(String str, ValidationContext validationContext) throws InvalidDatatypeValueException {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public short getAllowedFacets() {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public boolean isIdentical(Object obj, Object obj2) {
    }
}
