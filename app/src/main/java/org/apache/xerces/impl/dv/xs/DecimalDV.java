package org.apache.xerces.impl.dv.xs;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.xs.datatypes.XSDecimal;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DecimalDV extends TypeValidator {
    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public final int compare(Object obj, Object obj2) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public Object getActualValue(String str, ValidationContext validationContext) throws InvalidDatatypeValueException {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public final short getAllowedFacets() {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public final int getFractionDigits(Object obj) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public final int getTotalDigits(Object obj) {
    }

    static class XDecimal implements XSDecimal {
        private String canonical;
        int fracDigits;
        String fvalue;
        int intDigits;
        boolean integer;
        String ivalue;
        int sign;
        int totalDigits;

        XDecimal(String str) throws NumberFormatException {
        }

        private int intComp(XDecimal xDecimal) {
        }

        private void makeCanonical() {
        }

        public int compareTo(XDecimal xDecimal) {
        }

        public boolean equals(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDecimal
        public BigDecimal getBigDecimal() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDecimal
        public BigInteger getBigInteger() throws NumberFormatException {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDecimal
        public byte getByte() throws NumberFormatException {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDecimal
        public int getInt() throws NumberFormatException {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDecimal
        public long getLong() throws NumberFormatException {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDecimal
        public short getShort() throws NumberFormatException {
        }

        void initD(String str) throws NumberFormatException {
        }

        void initI(String str) throws NumberFormatException {
        }

        public synchronized String toString() {
        }

        XDecimal(String str, boolean z) throws NumberFormatException {
        }
    }
}
