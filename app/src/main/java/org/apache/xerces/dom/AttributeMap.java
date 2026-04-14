package org.apache.xerces.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AttributeMap extends NamedNodeMapImpl {
    static final long serialVersionUID = 8872606282138665383L;

    protected AttributeMap(ElementImpl elementImpl, NamedNodeMapImpl namedNodeMapImpl) {
    }

    private final Node remove(AttrImpl attrImpl, int i, boolean z) {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl
    protected final int addItem(Node node) {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl
    protected void cloneContent(NamedNodeMapImpl namedNodeMapImpl) {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl
    public NamedNodeMapImpl cloneMap(NodeImpl nodeImpl) {
    }

    protected final Node internalRemoveNamedItem(String str, boolean z) {
    }

    protected final Node internalRemoveNamedItemNS(String str, String str2, boolean z) {
    }

    void moveSpecifiedAttributes(AttributeMap attributeMap) {
    }

    protected void reconcileDefaults(NamedNodeMapImpl namedNodeMapImpl) {
    }

    protected Node removeItem(Node node, boolean z) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl, org.w3c.dom.NamedNodeMap
    public Node removeNamedItem(String str) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl, org.w3c.dom.NamedNodeMap
    public Node removeNamedItemNS(String str, String str2) throws DOMException {
    }

    Node safeRemoveNamedItem(String str) {
    }

    Node safeRemoveNamedItemNS(String str, String str2) {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl, org.w3c.dom.NamedNodeMap
    public Node setNamedItem(Node node) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NamedNodeMapImpl, org.w3c.dom.NamedNodeMap
    public Node setNamedItemNS(Node node) throws DOMException {
    }
}
