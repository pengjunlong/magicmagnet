package org.apache.xerces.impl.xs.identity;

import org.apache.xerces.impl.xs.XSAnnotationImpl;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSIDCDefinition;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class IdentityConstraint implements XSIDCDefinition {
    protected XSAnnotationImpl[] fAnnotations;
    protected final String fElementName;
    protected int fFieldCount;
    protected Field[] fFields;
    protected final String fIdentityConstraintName;
    protected final String fNamespace;
    protected int fNumAnnotations;
    protected Selector fSelector;
    protected short type;

    protected IdentityConstraint(String str, String str2, String str3) {
    }

    static final Field[] resize(Field[] fieldArr, int i) {
    }

    public void addAnnotation(XSAnnotationImpl xSAnnotationImpl) {
    }

    public void addField(Field field) {
    }

    public boolean equals(IdentityConstraint identityConstraint) {
    }

    @Override // org.apache.xerces.xs.XSIDCDefinition
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSIDCDefinition
    public short getCategory() {
    }

    public String getElementName() {
    }

    public Field getFieldAt(int i) {
    }

    public int getFieldCount() {
    }

    @Override // org.apache.xerces.xs.XSIDCDefinition
    public StringList getFieldStrs() {
    }

    public String getIdentityConstraintName() {
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

    @Override // org.apache.xerces.xs.XSIDCDefinition
    public XSIDCDefinition getRefKey() {
    }

    public Selector getSelector() {
    }

    @Override // org.apache.xerces.xs.XSIDCDefinition
    public String getSelectorStr() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    public void setSelector(Selector selector) {
    }

    public String toString() {
    }
}
