package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.xs.datatypes.XSDouble;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DoubleDV extends TypeValidator {

    private static final class XDouble implements XSDouble {
        private String canonical;
        private final double value;

        public XDouble(String str) throws NumberFormatException {
        }

        static /* synthetic */ int access$000(XDouble xDouble, XDouble xDouble2) {
        }

        private int compareTo(XDouble xDouble) {
        }

        public boolean equals(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDouble
        public double getValue() {
        }

        public int hashCode() {
        }

        public boolean isIdentical(XDouble xDouble) {
        }

        public synchronized String toString() {
        }
    }

    static boolean isPossibleFP(String str) {
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
