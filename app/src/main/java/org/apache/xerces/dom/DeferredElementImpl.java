package org.apache.xerces.dom;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeferredElementImpl extends ElementImpl implements DeferredNode {
    static final long serialVersionUID = -7670981133940934842L;
    protected transient int fNodeIndex;

    DeferredElementImpl(DeferredDocumentImpl deferredDocumentImpl, int i) {
    }

    @Override // org.apache.xerces.dom.DeferredNode
    public final int getNodeIndex() {
    }

    @Override // org.apache.xerces.dom.ParentNode
    protected final void synchronizeChildren() {
    }

    @Override // org.apache.xerces.dom.ElementImpl, org.apache.xerces.dom.NodeImpl
    protected final void synchronizeData() {
    }
}
