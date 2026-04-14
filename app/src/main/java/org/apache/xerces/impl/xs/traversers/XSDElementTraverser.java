package org.apache.xerces.impl.xs.traversers;

import java.util.Locale;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.impl.xs.XSElementDecl;
import org.apache.xerces.impl.xs.XSParticleDecl;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xs.XSObject;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class XSDElementTraverser extends XSDAbstractTraverser {
    boolean fDeferTraversingLocalElements;
    protected final XSElementDecl fTempElementDecl;

    XSDElementTraverser(XSDHandler xSDHandler, XSAttributeChecker xSAttributeChecker) {
    }

    @Override // org.apache.xerces.impl.xs.traversers.XSDAbstractTraverser
    void reset(SymbolTable symbolTable, boolean z, Locale locale) {
    }

    XSElementDecl traverseGlobal(Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) {
    }

    XSParticleDecl traverseLocal(Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar, int i, XSObject xSObject) {
    }

    XSElementDecl traverseNamedElement(Element element, Object[] objArr, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar, boolean z, XSObject xSObject) {
    }

    protected void traverseLocal(XSParticleDecl xSParticleDecl, Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar, int i, XSObject xSObject, String[] strArr) {
    }
}
