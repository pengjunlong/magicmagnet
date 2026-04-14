package org.apache.xerces.dom;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeferredTextImpl extends TextImpl implements DeferredNode {
    static final long serialVersionUID = 2310613872100393425L;
    protected transient int fNodeIndex;

    DeferredTextImpl(DeferredDocumentImpl deferredDocumentImpl, int i) {
    }

    @Override // org.apache.xerces.dom.DeferredNode
    public int getNodeIndex() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void synchronizeData() {
    }
}
