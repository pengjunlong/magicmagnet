package org.apache.xerces.dom;

import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ChildNode extends NodeImpl {
    static final long serialVersionUID = -6112455738802414002L;
    protected ChildNode nextSibling;
    protected ChildNode previousSibling;

    protected ChildNode(CoreDocumentImpl coreDocumentImpl) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node getNextSibling() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node getParentNode() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node getPreviousSibling() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    final NodeImpl parentNode() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    final ChildNode previousSibling() {
    }

    public ChildNode() {
    }
}
