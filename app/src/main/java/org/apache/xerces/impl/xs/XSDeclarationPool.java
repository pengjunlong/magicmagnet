package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.dv.xs.SchemaDVFactoryImpl;
import org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class XSDeclarationPool {
    private static final int CHUNK_MASK = 255;
    private static final int CHUNK_SHIFT = 8;
    private static final int CHUNK_SIZE = 256;
    private static final int INITIAL_CHUNK_COUNT = 4;
    private SchemaDVFactoryImpl dvFactory;
    private XSAttributeDecl[][] fAttrDecl;
    private int fAttrDeclIndex;
    private XSAttributeUseImpl[][] fAttributeUse;
    private int fAttributeUseIndex;
    private XSComplexTypeDecl[][] fCTDecl;
    private int fCTDeclIndex;
    private XSElementDecl[][] fElementDecl;
    private int fElementDeclIndex;
    private XSModelGroupImpl[][] fModelGroup;
    private int fModelGroupIndex;
    private XSParticleDecl[][] fParticleDecl;
    private int fParticleDeclIndex;
    private XSSimpleTypeDecl[][] fSTDecl;
    private int fSTDeclIndex;

    private boolean ensureAttrDeclCapacity(int i) {
    }

    private boolean ensureAttributeUseCapacity(int i) {
    }

    private boolean ensureCTDeclCapacity(int i) {
    }

    private boolean ensureElementDeclCapacity(int i) {
    }

    private boolean ensureModelGroupCapacity(int i) {
    }

    private boolean ensureParticleDeclCapacity(int i) {
    }

    private boolean ensureSTDeclCapacity(int i) {
    }

    private static XSElementDecl[][] resize(XSElementDecl[][] xSElementDeclArr, int i) {
    }

    public final XSAttributeDecl getAttributeDecl() {
    }

    public final XSAttributeUseImpl getAttributeUse() {
    }

    public final XSComplexTypeDecl getComplexTypeDecl() {
    }

    public final XSElementDecl getElementDecl() {
    }

    public final XSModelGroupImpl getModelGroup() {
    }

    public final XSParticleDecl getParticleDecl() {
    }

    public final XSSimpleTypeDecl getSimpleTypeDecl() {
    }

    public void reset() {
    }

    public void setDVFactory(SchemaDVFactoryImpl schemaDVFactoryImpl) {
    }

    private static XSParticleDecl[][] resize(XSParticleDecl[][] xSParticleDeclArr, int i) {
    }

    private static XSModelGroupImpl[][] resize(XSModelGroupImpl[][] xSModelGroupImplArr, int i) {
    }

    private static XSAttributeDecl[][] resize(XSAttributeDecl[][] xSAttributeDeclArr, int i) {
    }

    private static XSAttributeUseImpl[][] resize(XSAttributeUseImpl[][] xSAttributeUseImplArr, int i) {
    }

    private static XSSimpleTypeDecl[][] resize(XSSimpleTypeDecl[][] xSSimpleTypeDeclArr, int i) {
    }

    private static XSComplexTypeDecl[][] resize(XSComplexTypeDecl[][] xSComplexTypeDeclArr, int i) {
    }
}
