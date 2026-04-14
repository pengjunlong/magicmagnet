package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.impl.xs.identity.IdentityConstraint;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSComplexTypeDefinition;
import org.apache.xerces.xs.XSElementDeclaration;
import org.apache.xerces.xs.XSNamedMap;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSTypeDefinition;
import org.apache.xerces.xs.XSValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSElementDecl implements XSElementDeclaration {
    private static final short ABSTRACT = 8;
    private static final short CONSTRAINT_MASK = 3;
    static final int INITIAL_SIZE = 2;
    private static final short NILLABLE = 4;
    public static final short SCOPE_ABSENT = 0;
    public static final short SCOPE_GLOBAL = 1;
    public static final short SCOPE_LOCAL = 2;
    public XSObjectList fAnnotations;
    public short fBlock;
    public ValidatedInfo fDefault;
    private String fDescription;
    XSComplexTypeDecl fEnclosingCT;
    public short fFinal;
    int fIDCPos;
    IdentityConstraint[] fIDConstraints;
    short fMiscFlags;
    public String fName;
    private XSNamespaceItem fNamespaceItem;
    public short fScope;
    public XSElementDecl fSubGroup;
    public String fTargetNamespace;
    public XSTypeDefinition fType;
    public QName fUnresolvedTypeName;

    static final IdentityConstraint[] resize(IdentityConstraint[] identityConstraintArr, int i) {
    }

    public void addIDConstraint(IdentityConstraint identityConstraint) {
    }

    public boolean equals(Object obj) {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public boolean getAbstract() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public Object getActualVC() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public short getActualVCType() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSAnnotation getAnnotation() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public short getConstraintType() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public String getConstraintValue() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public short getDisallowedSubstitutions() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSComplexTypeDefinition getEnclosingCTDefinition() {
    }

    public IdentityConstraint[] getIDConstraints() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSNamedMap getIdentityConstraints() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
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

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public boolean getNillable() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public short getScope() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSElementDeclaration getSubstitutionGroupAffiliation() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public short getSubstitutionGroupExclusions() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSTypeDefinition getTypeDefinition() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public XSValue getValueConstraintValue() {
    }

    public int hashCode() {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public boolean isDisallowedSubstitution(short s) {
    }

    @Override // org.apache.xerces.xs.XSElementDeclaration
    public boolean isSubstitutionGroupExclusion(short s) {
    }

    public void reset() {
    }

    public void setConstraintType(short s) {
    }

    public void setIsAbstract() {
    }

    public void setIsGlobal() {
    }

    public void setIsLocal(XSComplexTypeDecl xSComplexTypeDecl) {
    }

    public void setIsNillable() {
    }

    void setNamespaceItem(XSNamespaceItem xSNamespaceItem) {
    }

    public String toString() {
    }
}
