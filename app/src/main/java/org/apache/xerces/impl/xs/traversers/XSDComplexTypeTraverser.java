package org.apache.xerces.impl.xs.traversers;

import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.impl.xs.XSAnnotationImpl;
import org.apache.xerces.impl.xs.XSAttributeGroupDecl;
import org.apache.xerces.impl.xs.XSComplexTypeDecl;
import org.apache.xerces.impl.xs.XSParticleDecl;
import org.apache.xerces.impl.xs.XSWildcardDecl;
import org.apache.xerces.xs.XSTypeDefinition;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class XSDComplexTypeTraverser extends XSDAbstractParticleTraverser {
    private static final boolean DEBUG = false;
    private static final int GLOBAL_NUM = 11;
    private static XSParticleDecl fErrorContent;
    private static XSWildcardDecl fErrorWildcard;
    private XSAnnotationImpl[] fAnnotations;
    private XSAttributeGroupDecl fAttrGrp;
    private XSTypeDefinition fBaseType;
    private short fBlock;
    private XSComplexTypeDecl fComplexTypeDecl;
    private short fContentType;
    private short fDerivedBy;
    private short fFinal;
    private Object[] fGlobalStore;
    private int fGlobalStorePos;
    private boolean fIsAbstract;
    private String fName;
    private XSParticleDecl fParticle;
    private String fTargetNamespace;
    private XSSimpleType fXSSimpleType;

    XSDComplexTypeTraverser(XSDHandler xSDHandler, XSAttributeChecker xSAttributeChecker) {
    }

    private void addAnnotation(XSAnnotationImpl xSAnnotationImpl) {
    }

    private void contentBackup() {
    }

    private void contentRestore() {
    }

    private String genAnonTypeName(Element element) {
    }

    private static XSParticleDecl getErrorContent() {
    }

    private static XSWildcardDecl getErrorWildcard() {
    }

    private void handleComplexTypeError(String str, Object[] objArr, Element element) {
    }

    private boolean isAttrOrAttrGroup(Element element) {
    }

    private void mergeAttributes(XSAttributeGroupDecl xSAttributeGroupDecl, XSAttributeGroupDecl xSAttributeGroupDecl2, String str, boolean z, Element element) throws ComplexTypeRecoverableError {
    }

    private void processComplexContent(Element element, boolean z, boolean z2, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) throws ComplexTypeRecoverableError {
    }

    private void traverseComplexContent(Element element, boolean z, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) throws ComplexTypeRecoverableError {
    }

    private void traverseComplexContentDecl(Element element, boolean z) {
    }

    private XSComplexTypeDecl traverseComplexTypeDecl(Element element, String str, Object[] objArr, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) {
    }

    private void traverseSimpleContent(Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) throws ComplexTypeRecoverableError {
    }

    private void traverseSimpleContentDecl(Element element) {
    }

    XSComplexTypeDecl traverseGlobal(Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) {
    }

    XSComplexTypeDecl traverseLocal(Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) {
    }

    private static final class ComplexTypeRecoverableError extends Exception {
        private static final long serialVersionUID = 6802729912091130335L;
        Element errorElem;
        Object[] errorSubstText;

        ComplexTypeRecoverableError() {
        }

        ComplexTypeRecoverableError(String str, Object[] objArr, Element element) {
        }
    }
}
