package org.apache.xerces.dom;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class DeferredAttrImpl extends AttrImpl implements DeferredNode {
    static final long serialVersionUID = 6903232312469148636L;
    protected transient int fNodeIndex;

    DeferredAttrImpl(DeferredDocumentImpl deferredDocumentImpl, int i) {
    }

    @Override // org.apache.xerces.dom.DeferredNode
    public int getNodeIndex() {
    }

    @Override // org.apache.xerces.dom.AttrImpl
    protected void synchronizeChildren() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void synchronizeData() {
    }
}
