package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.xs.util.XSObjectListImpl;
import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSAttributeGroupDefinition;
import org.apache.xerces.xs.XSAttributeUse;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSWildcard;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSAttributeGroupDecl implements XSAttributeGroupDefinition {
    private static final int INITIAL_SIZE = 5;
    public XSObjectList fAnnotations;
    int fAttrUseNum;
    protected XSObjectListImpl fAttrUses;
    XSAttributeUseImpl[] fAttributeUses;
    public XSWildcardDecl fAttributeWC;
    public String fIDAttrName;
    public String fName;
    private XSNamespaceItem fNamespaceItem;
    public String fTargetNamespace;

    static final XSAttributeUseImpl[] resize(XSAttributeUseImpl[] xSAttributeUseImplArr, int i) {
    }

    public String addAttributeUse(XSAttributeUseImpl xSAttributeUseImpl) {
    }

    @Override // org.apache.xerces.xs.XSAttributeGroupDefinition
    public XSAnnotation getAnnotation() {
    }

    @Override // org.apache.xerces.xs.XSAttributeGroupDefinition
    public XSObjectList getAnnotations() {
    }

    public XSAttributeUse getAttributeUse(String str, String str2) {
    }

    public XSAttributeUse getAttributeUseNoProhibited(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSAttributeGroupDefinition
    public XSObjectList getAttributeUses() {
    }

    @Override // org.apache.xerces.xs.XSAttributeGroupDefinition
    public XSWildcard getAttributeWildcard() {
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

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    public void removeProhibitedAttrs() {
    }

    public void replaceAttributeUse(XSAttributeUse xSAttributeUse, XSAttributeUseImpl xSAttributeUseImpl) {
    }

    public void reset() {
    }

    void setNamespaceItem(XSNamespaceItem xSNamespaceItem) {
    }

    public Object[] validRestrictionOf(String str, XSAttributeGroupDecl xSAttributeGroupDecl) {
    }
}
