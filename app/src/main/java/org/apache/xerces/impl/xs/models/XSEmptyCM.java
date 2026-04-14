package org.apache.xerces.impl.xs.models;

import java.util.Vector;
import org.apache.xerces.impl.xs.SubstitutionGroupHandler;
import org.apache.xerces.impl.xs.XMLSchemaException;
import org.apache.xerces.xni.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSEmptyCM implements XSCMValidator {
    private static final Vector EMPTY = null;
    private static final short STATE_START = 0;

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler substitutionGroupHandler) throws XMLSchemaException {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public boolean endContentModel(int[] iArr) {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public String getTermName(int i) {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public boolean isCompactedForUPA() {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public int[] occurenceInfo(int[] iArr) {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public Object oneTransition(QName qName, int[] iArr, SubstitutionGroupHandler substitutionGroupHandler) {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public int[] startContentModel() {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public Vector whatCanGoHere(int[] iArr) {
    }
}
