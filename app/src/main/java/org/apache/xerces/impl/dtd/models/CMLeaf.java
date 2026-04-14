package org.apache.xerces.impl.dtd.models;

import org.apache.xerces.xni.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CMLeaf extends CMNode {
    private final QName fElement;
    private int fPosition;

    public CMLeaf(QName qName, int i) {
    }

    @Override // org.apache.xerces.impl.dtd.models.CMNode
    protected void calcFirstPos(CMStateSet cMStateSet) {
    }

    @Override // org.apache.xerces.impl.dtd.models.CMNode
    protected void calcLastPos(CMStateSet cMStateSet) {
    }

    final QName getElement() {
    }

    final int getPosition() {
    }

    @Override // org.apache.xerces.impl.dtd.models.CMNode
    public boolean isNullable() {
    }

    final void setPosition(int i) {
    }

    public String toString() {
    }

    public CMLeaf(QName qName) {
    }
}
