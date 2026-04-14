package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class PrecisionDecimalDV extends TypeValidator {

    static class XPrecisionDecimal {
        private String canonical;
        int fracDigits;
        String fvalue;
        int intDigits;
        String ivalue;
        int pvalue;
        int sign;
        int totalDigits;

        XPrecisionDecimal(String str) throws NumberFormatException {
        }

        private int compare(XPrecisionDecimal xPrecisionDecimal) {
        }

        private int compareDecimal(String str, String str2, String str3, String str4) {
        }

        private int compareFractionalPart(XPrecisionDecimal xPrecisionDecimal) {
        }

        private int intComp(XPrecisionDecimal xPrecisionDecimal) {
        }

        private void makeCanonical() {
        }

        private void truncateTrailingZeros(StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        }

        public int compareTo(XPrecisionDecimal xPrecisionDecimal) {
        }

        public boolean equals(Object obj) {
        }

        void initD(String str) throws NumberFormatException {
        }

        public boolean isIdentical(XPrecisionDecimal xPrecisionDecimal) {
        }

        public synchronized String toString() {
        }
    }

    PrecisionDecimalDV() {
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
    public int getFractionDigits(Object obj) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public int getTotalDigits(Object obj) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public boolean isIdentical(Object obj, Object obj2) {
    }
}
