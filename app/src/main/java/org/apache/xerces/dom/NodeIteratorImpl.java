package org.apache.xerces.dom;

import org.w3c.dom.Node;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NodeIteratorImpl implements NodeIterator {
    private Node fCurrentNode;
    private boolean fDetach;
    private DocumentImpl fDocument;
    private boolean fEntityReferenceExpansion;
    private boolean fForward;
    private NodeFilter fNodeFilter;
    private Node fRoot;
    private int fWhatToShow;

    public NodeIteratorImpl(DocumentImpl documentImpl, Node node, int i, NodeFilter nodeFilter, boolean z) {
    }

    boolean acceptNode(Node node) {
    }

    public void detach() {
    }

    public boolean getExpandEntityReferences() {
    }

    public NodeFilter getFilter() {
    }

    public Node getRoot() {
    }

    public int getWhatToShow() {
    }

    Node matchNodeOrParent(Node node) {
    }

    public Node nextNode() {
    }

    public Node previousNode() {
    }

    public void removeNode(Node node) {
    }

    Node previousNode(Node node) {
    }

    Node nextNode(Node node, boolean z) {
    }
}
