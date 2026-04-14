package org.apache.xerces.impl.dtd.models;

import org.apache.xerces.xni.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DFAContentModel implements ContentModelValidator {
    private static final boolean DEBUG_VALIDATE_CONTENT = false;
    private static String fEOCString = "<<CMNODE_EOC>>";
    private static String fEpsilonString = "<<CMNODE_EPSILON>>";
    private int fEOCPos;
    private QName[] fElemMap;
    private int fElemMapSize;
    private int[] fElemMapType;
    private boolean fEmptyContentIsValid;
    private boolean[] fFinalStateFlags;
    private CMStateSet[] fFollowList;
    private CMNode fHeadNode;
    private int fLeafCount;
    private CMLeaf[] fLeafList;
    private int[] fLeafListType;
    private boolean fMixed;
    private final QName fQName;
    private int[][] fTransTable;
    private int fTransTableSize;

    public DFAContentModel(CMNode cMNode, int i, boolean z) {
    }

    private void buildDFA(CMNode cMNode) {
    }

    private void calcFollowList(CMNode cMNode) {
    }

    private void dumpTree(CMNode cMNode, int i) {
    }

    private int[] makeDefStateList() {
    }

    private int postTreeBuildInit(CMNode cMNode, int i) {
    }

    @Override // org.apache.xerces.impl.dtd.models.ContentModelValidator
    public int validate(QName[] qNameArr, int i, int i2) {
    }
}
