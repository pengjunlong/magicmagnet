package org.apache.xerces.xpointer;

import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ShortHandPointer implements XPointerPart {
    private boolean fIsFragmentResolved;
    int fMatchingChildCount;
    private String fShortHandPointer;
    private SymbolTable fSymbolTable;

    public ShortHandPointer() {
    }

    private boolean hasMatchingIdentifier(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations, int i) throws XNIException {
    }

    public String getChildrenSchemaDeterminedID(XMLAttributes xMLAttributes, int i) throws XNIException {
    }

    public String getDTDDeterminedID(XMLAttributes xMLAttributes, int i) throws XNIException {
    }

    public String getSchemaDeterminedID(XMLAttributes xMLAttributes, int i) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public String getSchemeData() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public String getSchemeName() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public boolean isChildFragmentResolved() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public boolean isFragmentResolved() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public void parseXPointer(String str) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public boolean resolveXPointer(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations, int i) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public void setSchemeData(String str) {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public void setSchemeName(String str) {
    }

    public ShortHandPointer(SymbolTable symbolTable) {
    }
}
