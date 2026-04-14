package org.apache.xerces.dom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AttrImpl extends NodeImpl implements Attr, TypeInfo {
    static final String DTD_URI = "http://www.w3.org/TR/REC-xml";
    static final long serialVersionUID = 7277707688218972102L;
    protected String name;
    transient Object type;
    protected Object value;

    protected AttrImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    void checkNormalizationAfterInsert(ChildNode childNode) {
    }

    void checkNormalizationAfterRemove(ChildNode childNode) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public NodeList getChildNodes() {
    }

    public Element getElement() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node getFirstChild() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node getLastChild() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.NodeList
    public int getLength() {
    }

    @Override // org.w3c.dom.Attr
    public String getName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public short getNodeType() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeValue() {
    }

    @Override // org.w3c.dom.Attr
    public Element getOwnerElement() {
    }

    @Override // org.w3c.dom.Attr
    public TypeInfo getSchemaTypeInfo() {
    }

    @Override // org.w3c.dom.Attr
    public boolean getSpecified() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeName() {
    }

    @Override // org.w3c.dom.TypeInfo
    public String getTypeNamespace() {
    }

    @Override // org.w3c.dom.Attr
    public String getValue() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean hasChildNodes() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) throws DOMException {
    }

    Node internalInsertBefore(Node node, Node node2, boolean z) throws DOMException {
    }

    Node internalRemoveChild(Node node, boolean z) throws DOMException {
    }

    @Override // org.w3c.dom.TypeInfo
    public boolean isDerivedFrom(String str, String str2, int i) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
    }

    @Override // org.w3c.dom.Attr
    public boolean isId() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.NodeList
    public Node item(int i) {
    }

    final ChildNode lastChild() {
    }

    protected void makeChildNode() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void normalize() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node removeChild(Node node) throws DOMException {
    }

    void rename(String str) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) throws DOMException {
    }

    public void setIdAttribute(boolean z) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setNodeValue(String str) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void setOwnerDocument(CoreDocumentImpl coreDocumentImpl) {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    public void setReadOnly(boolean z, boolean z2) {
    }

    public void setSpecified(boolean z) {
    }

    public void setType(Object obj) {
    }

    @Override // org.w3c.dom.Attr
    public void setValue(String str) {
    }

    protected void synchronizeChildren() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    public String toString() {
    }

    final void lastChild(ChildNode childNode) {
    }

    protected AttrImpl() {
    }
}
