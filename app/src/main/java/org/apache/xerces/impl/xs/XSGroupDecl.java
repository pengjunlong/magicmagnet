package org.apache.xerces.impl.xs;

import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSModelGroup;
import org.apache.xerces.xs.XSModelGroupDefinition;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSGroupDecl implements XSModelGroupDefinition {
    public XSObjectList fAnnotations;
    public XSModelGroupImpl fModelGroup;
    public String fName;
    private XSNamespaceItem fNamespaceItem;
    public String fTargetNamespace;

    @Override // org.apache.xerces.xs.XSModelGroupDefinition
    public XSAnnotation getAnnotation() {
    }

    @Override // org.apache.xerces.xs.XSModelGroupDefinition
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSModelGroupDefinition
    public XSModelGroup getModelGroup() {
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

    void setNamespaceItem(XSNamespaceItem xSNamespaceItem) {
    }
}
