package org.apache.xerces.impl.xs.models;

import java.util.Vector;
import org.apache.xerces.impl.dtd.models.CMNode;
import org.apache.xerces.impl.dtd.models.CMStateSet;
import org.apache.xerces.impl.xs.SubstitutionGroupHandler;
import org.apache.xerces.impl.xs.XMLSchemaException;
import org.apache.xerces.xni.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSDFACM implements XSCMValidator {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_VALIDATE_CONTENT = false;
    private static long time;
    private Occurence[] fCountingStates;
    private Object[] fElemMap;
    private int[] fElemMapId;
    private int fElemMapSize;
    private int[] fElemMapType;
    private boolean[] fFinalStateFlags;
    private CMStateSet[] fFollowList;
    private CMNode fHeadNode;
    private boolean fIsCompactedForUPA;
    private int fLeafCount;
    private XSCMLeaf[] fLeafList;
    private int[] fLeafListType;
    private int[][] fTransTable;
    private int fTransTableSize;

    static final class Occurence {
        final int elemIndex;
        final int maxOccurs;
        final int minOccurs;

        public Occurence(XSCMRepeatingLeaf xSCMRepeatingLeaf, int i) {
        }

        public String toString() {
        }
    }

    public XSDFACM(CMNode cMNode, int i) {
    }

    private void buildDFA(CMNode cMNode) {
    }

    private void calcFollowList(CMNode cMNode) {
    }

    private void dumpTree(CMNode cMNode, int i) {
    }

    private int[] makeDefStateList() {
    }

    private void postTreeBuildInit(CMNode cMNode) throws RuntimeException {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler substitutionGroupHandler) throws XMLSchemaException {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public boolean endContentModel(int[] iArr) {
    }

    Object findMatchingDecl(QName qName, SubstitutionGroupHandler substitutionGroupHandler) {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public String getTermName(int i) {
    }

    @Override // org.apache.xerces.impl.xs.models.XSCMValidator
    public boolean isCompactedForUPA() {
    }

    public boolean isFinalState(int i) {
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

    Object findMatchingDecl(QName qName, int[] iArr, SubstitutionGroupHandler substitutionGroupHandler, int i) {
    }
}
