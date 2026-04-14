package org.apache.xerces.dom;

import org.w3c.dom.Node;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TreeWalkerImpl implements TreeWalker {
    Node fCurrentNode;
    private boolean fEntityReferenceExpansion;
    NodeFilter fNodeFilter;
    Node fRoot;
    private boolean fUseIsSameNode;
    int fWhatToShow;

    public TreeWalkerImpl(Node node, int i, NodeFilter nodeFilter, boolean z) {
    }

    private boolean isSameNode(Node node, Node node2) {
    }

    private boolean useIsSameNode(Node node) {
    }

    short acceptNode(Node node) {
    }

    public Node firstChild() {
    }

    public Node getCurrentNode() {
    }

    public boolean getExpandEntityReferences() {
    }

    public NodeFilter getFilter() {
    }

    Node getFirstChild(Node node) {
    }

    Node getLastChild(Node node) {
    }

    Node getNextSibling(Node node) {
    }

    Node getParentNode(Node node) {
    }

    Node getPreviousSibling(Node node) {
    }

    public Node getRoot() {
    }

    public int getWhatToShow() {
    }

    public Node lastChild() {
    }

    public Node nextNode() {
    }

    public Node nextSibling() {
    }

    public Node parentNode() {
    }

    public Node previousNode() {
    }

    public Node previousSibling() {
    }

    public void setCurrentNode(Node node) {
    }

    public void setWhatShow(int i) {
    }

    Node getNextSibling(Node node, Node node2) {
    }

    Node getPreviousSibling(Node node, Node node2) {
    }
}
