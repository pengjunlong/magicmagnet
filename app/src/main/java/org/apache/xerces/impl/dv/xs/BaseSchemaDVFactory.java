package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.SchemaDVFactory;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.xs.XSDeclarationPool;
import org.apache.xerces.util.SymbolHash;
import org.apache.xerces.xs.XSObjectList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BaseSchemaDVFactory extends SchemaDVFactory {
    static final String URI_SCHEMAFORSCHEMA = "http://www.w3.org/2001/XMLSchema";
    protected XSDeclarationPool fDeclPool;

    protected static void createBuiltInTypes(SymbolHash symbolHash, XSSimpleTypeDecl xSSimpleTypeDecl) {
    }

    @Override // org.apache.xerces.impl.dv.SchemaDVFactory
    public XSSimpleType createTypeList(String str, String str2, short s, XSSimpleType xSSimpleType, XSObjectList xSObjectList) {
    }

    @Override // org.apache.xerces.impl.dv.SchemaDVFactory
    public XSSimpleType createTypeRestriction(String str, String str2, short s, XSSimpleType xSSimpleType, XSObjectList xSObjectList) {
    }

    @Override // org.apache.xerces.impl.dv.SchemaDVFactory
    public XSSimpleType createTypeUnion(String str, String str2, short s, XSSimpleType[] xSSimpleTypeArr, XSObjectList xSObjectList) {
    }

    public XSSimpleTypeDecl newXSSimpleTypeDecl() {
    }

    public void setDeclPool(XSDeclarationPool xSDeclarationPool) {
    }
}
