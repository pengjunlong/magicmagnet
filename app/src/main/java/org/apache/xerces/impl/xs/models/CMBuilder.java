package org.apache.xerces.impl.xs.models;

import org.apache.xerces.impl.dtd.models.CMNode;
import org.apache.xerces.impl.xs.XSComplexTypeDecl;
import org.apache.xerces.impl.xs.XSDeclarationPool;
import org.apache.xerces.impl.xs.XSParticleDecl;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CMBuilder {
    private static final XSEmptyCM fEmptyCM = null;
    private XSDeclarationPool fDeclPool;
    private int fLeafCount;
    private final CMNodeFactory fNodeFactory;
    private int fParticleCount;

    public CMBuilder(CMNodeFactory cMNodeFactory) {
    }

    private CMNode buildCompactSyntaxTree(XSParticleDecl xSParticleDecl) {
    }

    private CMNode buildCompactSyntaxTree2(XSParticleDecl xSParticleDecl, int i, int i2) {
    }

    private CMNode buildSyntaxTree(XSParticleDecl xSParticleDecl, boolean z) {
    }

    private CMNode copyNode(CMNode cMNode) {
    }

    private CMNode expandContentModel(CMNode cMNode, int i, int i2) {
    }

    private CMNode multiNodes(CMNode cMNode, int i, boolean z) {
    }

    private boolean useRepeatingLeafNodes(XSParticleDecl xSParticleDecl) {
    }

    XSCMValidator createAllCM(XSParticleDecl xSParticleDecl) {
    }

    XSCMValidator createDFACM(XSParticleDecl xSParticleDecl, boolean z) {
    }

    public XSCMValidator getContentModel(XSComplexTypeDecl xSComplexTypeDecl, boolean z) {
    }

    public void setDeclPool(XSDeclarationPool xSDeclarationPool) {
    }
}
