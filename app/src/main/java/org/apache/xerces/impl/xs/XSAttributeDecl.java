package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSAttributeDeclaration;
import org.apache.xerces.xs.XSComplexTypeDefinition;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSAttributeDecl implements XSAttributeDeclaration {
    public static final short SCOPE_ABSENT = 0;
    public static final short SCOPE_GLOBAL = 1;
    public static final short SCOPE_LOCAL = 2;
    XSObjectList fAnnotations;
    short fConstraintType;
    ValidatedInfo fDefault;
    XSComplexTypeDecl fEnclosingCT;
    String fName;
    private XSNamespaceItem fNamespaceItem;
    short fScope;
    String fTargetNamespace;
    XSSimpleType fType;
    public QName fUnresolvedTypeName;

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public Object getActualVC() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public short getActualVCType() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public XSAnnotation getAnnotation() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public short getConstraintType() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public String getConstraintValue() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public XSComplexTypeDefinition getEnclosingCTDefinition() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public ShortList getItemValueTypes() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getName() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getNamespace() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public XSNamespaceItem getNamespaceItem() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public short getScope() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public XSSimpleTypeDefinition getTypeDefinition() {
    }

    public ValidatedInfo getValInfo() {
    }

    @Override // org.apache.xerces.xs.XSAttributeDeclaration
    public XSValue getValueConstraintValue() {
    }

    public void reset() {
    }

    void setNamespaceItem(XSNamespaceItem xSNamespaceItem) {
    }

    public void setValues(String str, String str2, XSSimpleType xSSimpleType, short s, short s2, ValidatedInfo validatedInfo, XSComplexTypeDecl xSComplexTypeDecl, XSObjectList xSObjectList) {
    }
}
