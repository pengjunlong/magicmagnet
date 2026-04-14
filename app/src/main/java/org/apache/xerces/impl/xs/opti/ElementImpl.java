package org.apache.xerces.impl.xs.opti;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ElementImpl extends DefaultElement {
    Attr[] attrs;
    int charOffset;
    int col;
    int column;
    String fAnnotation;
    String fSyntheticAnnotation;
    int line;
    int parentRow;
    int row;
    SchemaDOM schemaDOM;

    public ElementImpl(int i, int i2, int i3) {
    }

    private static boolean nsEquals(String str, String str2) {
    }

    public String getAnnotation() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public String getAttribute(String str) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public String getAttributeNS(String str, String str2) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public Attr getAttributeNode(String str) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public Attr getAttributeNodeNS(String str, String str2) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
    }

    public int getCharacterOffset() {
    }

    public int getColumnNumber() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public Node getFirstChild() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public Node getLastChild() {
    }

    public int getLineNumber() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public Node getNextSibling() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public Document getOwnerDocument() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public Node getParentNode() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public Node getPreviousSibling() {
    }

    public String getSyntheticAnnotation() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public String getTagName() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public boolean hasAttribute(String str) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public boolean hasAttributeNS(String str, String str2) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public boolean hasAttributes() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public boolean hasChildNodes() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultElement, org.w3c.dom.Element
    public void setAttribute(String str, String str2) {
    }

    public ElementImpl(int i, int i2) {
    }

    public ElementImpl(String str, String str2, String str3, String str4, int i, int i2, int i3) {
    }

    public ElementImpl(String str, String str2, String str3, String str4, int i, int i2) {
    }
}
