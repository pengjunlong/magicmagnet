package org.apache.xerces.dom;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.ElementTraversal;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ElementImpl extends ParentNode implements Element, ElementTraversal, TypeInfo {
    static final long serialVersionUID = 3717253516652722278L;
    protected AttributeMap attributes;
    protected String name;

    public ElementImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }

    private Node getNextLogicalSibling(Node node) {
    }

    private Node getPreviousLogicalSibling(Node node) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.ChildNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.w3c.dom.Element
    public String getAttribute(String str) {
    }

    @Override // org.w3c.dom.Element
    public String getAttributeNS(String str, String str2) {
    }

    @Override // org.w3c.dom.Element
    public Attr getAttributeNode(String str) {
    }

    @Override // org.w3c.dom.Element
    public Attr getAttributeNodeNS(String str, String str2) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getBaseURI() {
    }

    public final int getChildElementCount() {
    }

    protected NamedNodeMapImpl getDefaultAttributes() {
    }

    @Override // org.w3c.dom.Element
    public NodeList getElementsByTagName(String str) {
    }

    @Override // org.w3c.dom.Element
    public NodeList getElementsByTagNameNS(String str, String str2) {
    }

    public final Element getFirstElementChild() {
    }

    public final Element getLastElementChild() {
    }

    public final Element getNextElementSibling() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public short getNodeType() {
    }

    public final Element getPreviousElementSibling() {
    }

    @Override // org.w3c.dom.Element
    public TypeInfo getSchemaTypeInfo() {
    }

    @Override // org.w3c.dom.Element
    public String getTagName() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeName() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeNamespace() {
    }

    protected Attr getXMLBaseAttribute() {
    }

    protected int getXercesAttribute(String str, String str2) {
    }

    @Override // org.w3c.dom.Element
    public boolean hasAttribute(String str) {
    }

    @Override // org.w3c.dom.Element
    public boolean hasAttributeNS(String str, String str2) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean hasAttributes() {
    }

    @Override // org.w3c.dom.TypeInfo
    public boolean isDerivedFrom(String str, String str2, int i) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
    }

    void moveSpecifiedAttributes(ElementImpl elementImpl) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void normalize() {
    }

    protected void reconcileDefaultAttributes() {
    }

    @Override // org.w3c.dom.Element
    public void removeAttribute(String str) {
    }

    @Override // org.w3c.dom.Element
    public void removeAttributeNS(String str, String str2) {
    }

    @Override // org.w3c.dom.Element
    public Attr removeAttributeNode(Attr attr) throws DOMException {
    }

    void rename(String str) {
    }

    @Override // org.w3c.dom.Element
    public void setAttribute(String str, String str2) {
    }

    @Override // org.w3c.dom.Element
    public void setAttributeNS(String str, String str2, String str3) {
    }

    @Override // org.w3c.dom.Element
    public Attr setAttributeNode(Attr attr) throws DOMException {
    }

    @Override // org.w3c.dom.Element
    public Attr setAttributeNodeNS(Attr attr) throws DOMException {
    }

    @Override // org.w3c.dom.Element
    public void setIdAttribute(String str, boolean z) {
    }

    @Override // org.w3c.dom.Element
    public void setIdAttributeNS(String str, String str2, boolean z) {
    }

    @Override // org.w3c.dom.Element
    public void setIdAttributeNode(Attr attr, boolean z) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl
    protected void setOwnerDocument(CoreDocumentImpl coreDocumentImpl) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl
    public void setReadOnly(boolean z, boolean z2) {
    }

    protected int setXercesAttributeNode(Attr attr) {
    }

    protected void setupDefaultAttributes() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void synchronizeData() {
    }

    protected ElementImpl() {
    }

    private Element getFirstElementChild(Node node) {
    }

    private Element getLastElementChild(Node node) {
    }
}
