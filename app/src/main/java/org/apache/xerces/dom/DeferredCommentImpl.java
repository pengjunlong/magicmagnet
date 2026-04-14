package org.apache.xerces.dom;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeferredCommentImpl extends CommentImpl implements DeferredNode {
    static final long serialVersionUID = 6498796371083589338L;
    protected transient int fNodeIndex;

    DeferredCommentImpl(DeferredDocumentImpl deferredDocumentImpl, int i) {
    }

    @Override // org.apache.xerces.dom.DeferredNode
    public int getNodeIndex() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void synchronizeData() {
    }
}
