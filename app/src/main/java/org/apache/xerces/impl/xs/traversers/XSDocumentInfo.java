package org.apache.xerces.impl.xs.traversers;

import java.util.Stack;
import java.util.Vector;
import org.apache.xerces.impl.validation.ValidationState;
import org.apache.xerces.impl.xs.SchemaNamespaceSupport;
import org.apache.xerces.impl.xs.XMLSchemaException;
import org.apache.xerces.util.SymbolTable;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class XSDocumentInfo {
    protected Stack SchemaNamespaceSupportStack;
    protected XSAnnotationInfo fAnnotations;
    protected boolean fAreLocalAttributesQualified;
    protected boolean fAreLocalElementsQualified;
    protected XSAttributeChecker fAttrChecker;
    protected short fBlockDefault;
    protected short fFinalDefault;
    Vector fImportedNS;
    protected boolean fIsChameleonSchema;
    protected SchemaNamespaceSupport fNamespaceSupport;
    protected SchemaNamespaceSupport fNamespaceSupportRoot;
    private Vector fReportedTNS;
    protected Object[] fSchemaAttrs;
    protected Element fSchemaElement;
    SymbolTable fSymbolTable;
    String fTargetNamespace;
    protected ValidationState fValidationContext;

    XSDocumentInfo(Element element, XSAttributeChecker xSAttributeChecker, SymbolTable symbolTable) throws XMLSchemaException {
    }

    public void addAllowedNS(String str) {
    }

    void addAnnotation(XSAnnotationInfo xSAnnotationInfo) {
    }

    void backupNSSupport(SchemaNamespaceSupport schemaNamespaceSupport) {
    }

    XSAnnotationInfo getAnnotations() {
    }

    Object[] getSchemaAttrs() {
    }

    public boolean isAllowedNS(String str) {
    }

    final boolean needReportTNSError(String str) {
    }

    void removeAnnotations() {
    }

    void restoreNSSupport() {
    }

    void returnSchemaAttrs() {
    }

    public String toString() {
    }
}
