package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.xs.models.CMBuilder;
import org.apache.xerces.impl.xs.models.XSCMValidator;
import org.apache.xerces.impl.xs.util.XSObjectListImpl;
import org.apache.xerces.xs.XSAttributeUse;
import org.apache.xerces.xs.XSComplexTypeDefinition;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSParticle;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSTypeDefinition;
import org.apache.xerces.xs.XSWildcard;
import org.w3c.dom.TypeInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSComplexTypeDecl implements XSComplexTypeDefinition, TypeInfo {
    private static final short CT_HAS_TYPE_ID = 2;
    private static final short CT_IS_ABSTRACT = 1;
    private static final short CT_IS_ANONYMOUS = 4;
    static final int DERIVATION_ANY = 0;
    static final int DERIVATION_EXTENSION = 2;
    static final int DERIVATION_LIST = 8;
    static final int DERIVATION_RESTRICTION = 1;
    static final int DERIVATION_UNION = 4;
    XSObjectListImpl fAnnotations;
    XSAttributeGroupDecl fAttrGrp;
    XSTypeDefinition fBaseType;
    short fBlock;
    XSCMValidator fCMValidator;
    short fContentType;
    short fDerivedBy;
    short fFinal;
    short fMiscFlags;
    String fName;
    private XSNamespaceItem fNamespaceItem;
    XSParticleDecl fParticle;
    String fTargetNamespace;
    XSCMValidator fUPACMValidator;
    XSSimpleType fXSSimpleType;

    private boolean isDerivedByAny(String str, String str2, int i, XSTypeDefinition xSTypeDefinition) {
    }

    private boolean isDerivedByExtension(String str, String str2, int i, XSTypeDefinition xSTypeDefinition) {
    }

    private boolean isDerivedByRestriction(String str, String str2, int i, XSTypeDefinition xSTypeDefinition) {
    }

    void appendTypeInfo(StringBuffer stringBuffer) {
    }

    public boolean containsTypeID() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean derivedFrom(String str, String str2, short s) {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean derivedFromType(XSTypeDefinition xSTypeDefinition, short s) {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public boolean getAbstract() {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean getAnonymous() {
    }

    public XSAttributeGroupDecl getAttrGrp() {
    }

    public XSAttributeUse getAttributeUse(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public XSObjectList getAttributeUses() {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public XSWildcard getAttributeWildcard() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public XSTypeDefinition getBaseType() {
    }

    public XSCMValidator getContentModel(CMBuilder cMBuilder) {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public short getContentType() {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public short getDerivationMethod() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public short getFinal() {
    }

    public short getFinalSet() {
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

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public XSParticle getParticle() {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public short getProhibitedSubstitutions() {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public XSSimpleTypeDefinition getSimpleType() {
    }

    public String getTargetNamespace() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public short getTypeCategory() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeName() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeNamespace() {
    }

    public boolean isDOMDerivedFrom(String str, String str2, int i) {
    }

    @Override // org.w3c.dom.TypeInfo
    public boolean isDerivedFrom(String str, String str2, int i) {
    }

    @Override // org.apache.xerces.xs.XSTypeDefinition
    public boolean isFinal(short s) {
    }

    @Override // org.apache.xerces.xs.XSComplexTypeDefinition
    public boolean isProhibitedSubstitution(short s) {
    }

    public void reset() {
    }

    public void setContainsTypeID() {
    }

    public void setIsAbstractType() {
    }

    public void setIsAnonymous() {
    }

    public void setName(String str) {
    }

    void setNamespaceItem(XSNamespaceItem xSNamespaceItem) {
    }

    public void setValues(String str, String str2, XSTypeDefinition xSTypeDefinition, short s, short s2, short s3, short s4, boolean z, XSAttributeGroupDecl xSAttributeGroupDecl, XSSimpleType xSSimpleType, XSParticleDecl xSParticleDecl, XSObjectListImpl xSObjectListImpl) {
    }

    public String toString() {
    }

    public synchronized XSCMValidator getContentModel(CMBuilder cMBuilder, boolean z) {
    }
}
