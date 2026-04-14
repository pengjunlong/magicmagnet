package org.apache.xerces.impl.xs.traversers;

import java.util.Locale;
import org.apache.xerces.impl.dv.XSFacets;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.validation.ValidationState;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.impl.xs.XSAnnotationImpl;
import org.apache.xerces.impl.xs.XSAttributeGroupDecl;
import org.apache.xerces.impl.xs.XSComplexTypeDecl;
import org.apache.xerces.impl.xs.XSParticleDecl;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xs.XSTypeDefinition;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class XSDAbstractTraverser {
    protected static final int CHILD_OF_GROUP = 4;
    protected static final int GROUP_REF_WITH_ALL = 2;
    protected static final int NOT_ALL_CONTEXT = 0;
    protected static final String NO_NAME = "(no name)";
    protected static final int PROCESSING_ALL_EL = 1;
    protected static final int PROCESSING_ALL_GP = 8;
    private static final XSSimpleType fQNameDV = null;
    protected XSAttributeChecker fAttrChecker;
    private StringBuffer fPattern;
    protected XSDHandler fSchemaHandler;
    protected SymbolTable fSymbolTable;
    protected boolean fValidateAnnotations;
    ValidationState fValidationState;
    private final XSFacets xsFacets;

    static final class FacetInfo {
        final short fFixedFacets;
        final short fPresentFacets;
        final XSFacets facetdata;
        final Element nodeAfterFacets;

        FacetInfo(XSFacets xSFacets, Element element, short s, short s2) {
        }
    }

    XSDAbstractTraverser(XSDHandler xSDHandler, XSAttributeChecker xSAttributeChecker) {
    }

    private boolean containsQName(XSSimpleType xSSimpleType) {
    }

    private static String escapeAttValue(String str, int i) {
    }

    private static String processAttValue(String str) {
    }

    void checkNotationType(String str, XSTypeDefinition xSTypeDefinition, Element element) {
    }

    protected XSParticleDecl checkOccurrences(XSParticleDecl xSParticleDecl, String str, Element element, int i, long j) {
    }

    void reportSchemaError(String str, Object[] objArr, Element element) {
    }

    void reset(SymbolTable symbolTable, boolean z, Locale locale) {
    }

    XSAnnotationImpl traverseAnnotationDecl(Element element, Object[] objArr, boolean z, XSDocumentInfo xSDocumentInfo) {
    }

    Element traverseAttrsAndAttrGrps(Element element, XSAttributeGroupDecl xSAttributeGroupDecl, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar, XSComplexTypeDecl xSComplexTypeDecl) {
    }

    FacetInfo traverseFacets(Element element, XSSimpleType xSSimpleType, XSDocumentInfo xSDocumentInfo) {
    }

    XSAnnotationImpl traverseSyntheticAnnotation(Element element, String str, Object[] objArr, boolean z, XSDocumentInfo xSDocumentInfo) {
    }
}
