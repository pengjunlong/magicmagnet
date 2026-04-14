package org.apache.xerces.dom;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Hashtable;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.events.EventTarget;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class NodeImpl implements Node, NodeList, EventTarget, Cloneable, Serializable {
    public static final short DOCUMENT_POSITION_CONTAINS = 8;
    public static final short DOCUMENT_POSITION_DISCONNECTED = 1;
    public static final short DOCUMENT_POSITION_FOLLOWING = 4;
    public static final short DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32;
    public static final short DOCUMENT_POSITION_IS_CONTAINED = 16;
    public static final short DOCUMENT_POSITION_PRECEDING = 2;
    public static final short ELEMENT_DEFINITION_NODE = 21;
    protected static final short FIRSTCHILD = 16;
    protected static final short HASSTRING = 128;
    protected static final short ID = 512;
    protected static final short IGNORABLEWS = 64;
    protected static final short NORMALIZED = 256;
    protected static final short OWNED = 8;
    protected static final short READONLY = 1;
    protected static final short SPECIFIED = 32;
    protected static final short SYNCCHILDREN = 4;
    protected static final short SYNCDATA = 2;
    public static final short TREE_POSITION_ANCESTOR = 4;
    public static final short TREE_POSITION_DESCENDANT = 8;
    public static final short TREE_POSITION_DISCONNECTED = 0;
    public static final short TREE_POSITION_EQUIVALENT = 16;
    public static final short TREE_POSITION_FOLLOWING = 2;
    public static final short TREE_POSITION_PRECEDING = 1;
    public static final short TREE_POSITION_SAME_NODE = 32;
    static final long serialVersionUID = -6316591992167219696L;
    protected short flags;
    protected NodeImpl ownerNode;

    protected NodeImpl(CoreDocumentImpl coreDocumentImpl) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public void addEventListener(String str, EventListener eventListener, boolean z) {
    }

    @Override // org.w3c.dom.Node
    public Node appendChild(Node node) throws DOMException {
    }

    protected void changed() {
    }

    protected int changes() {
    }

    @Override // org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.w3c.dom.Node
    public short compareDocumentPosition(Node node) throws DOMException {
    }

    public short compareTreePosition(Node node) {
    }

    public boolean dispatchEvent(Event event) {
    }

    @Override // org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
    }

    @Override // org.w3c.dom.Node
    public String getBaseURI() {
    }

    @Override // org.w3c.dom.Node
    public NodeList getChildNodes() {
    }

    protected Node getContainer() {
    }

    Node getElementAncestor(Node node) {
    }

    @Override // org.w3c.dom.Node
    public Object getFeature(String str, String str2) {
    }

    @Override // org.w3c.dom.Node
    public Node getFirstChild() {
    }

    @Override // org.w3c.dom.Node
    public Node getLastChild() {
    }

    public int getLength() {
    }

    @Override // org.w3c.dom.Node
    public String getLocalName() {
    }

    @Override // org.w3c.dom.Node
    public String getNamespaceURI() {
    }

    @Override // org.w3c.dom.Node
    public Node getNextSibling() {
    }

    @Override // org.w3c.dom.Node
    public abstract String getNodeName();

    protected int getNodeNumber() {
    }

    @Override // org.w3c.dom.Node
    public abstract short getNodeType();

    @Override // org.w3c.dom.Node
    public String getNodeValue() throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public Document getOwnerDocument() {
    }

    @Override // org.w3c.dom.Node
    public Node getParentNode() {
    }

    @Override // org.w3c.dom.Node
    public String getPrefix() {
    }

    @Override // org.w3c.dom.Node
    public Node getPreviousSibling() {
    }

    public boolean getReadOnly() {
    }

    @Override // org.w3c.dom.Node
    public String getTextContent() throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public Object getUserData(String str) {
    }

    protected Hashtable getUserDataRecord() {
    }

    @Override // org.w3c.dom.Node
    public boolean hasAttributes() {
    }

    @Override // org.w3c.dom.Node
    public boolean hasChildNodes() {
    }

    final boolean hasStringValue() {
    }

    @Override // org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) throws DOMException {
    }

    final boolean internalIsIgnorableWhitespace() {
    }

    @Override // org.w3c.dom.Node
    public boolean isDefaultNamespace(String str) {
    }

    @Override // org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
    }

    final boolean isFirstChild() {
    }

    final boolean isIdAttribute() {
    }

    final void isIgnorableWhitespace(boolean z) {
    }

    final boolean isNormalized() {
    }

    final boolean isOwned() {
    }

    final boolean isReadOnly() {
    }

    @Override // org.w3c.dom.Node
    public boolean isSameNode(Node node) {
    }

    final boolean isSpecified() {
    }

    @Override // org.w3c.dom.Node
    public boolean isSupported(String str, String str2) {
    }

    public Node item(int i) {
    }

    String lookupNamespacePrefix(String str, ElementImpl elementImpl) {
    }

    @Override // org.w3c.dom.Node
    public String lookupNamespaceURI(String str) {
    }

    @Override // org.w3c.dom.Node
    public String lookupPrefix(String str) {
    }

    final boolean needsSyncChildren() {
    }

    final boolean needsSyncData() {
    }

    @Override // org.w3c.dom.Node
    public void normalize() {
    }

    CoreDocumentImpl ownerDocument() {
    }

    NodeImpl parentNode() {
    }

    ChildNode previousSibling() {
    }

    @Override // org.w3c.dom.Node
    public Node removeChild(Node node) throws DOMException {
    }

    public void removeEventListener(String str, EventListener eventListener, boolean z) {
    }

    @Override // org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public void setNodeValue(String str) throws DOMException {
    }

    protected void setOwnerDocument(CoreDocumentImpl coreDocumentImpl) {
    }

    @Override // org.w3c.dom.Node
    public void setPrefix(String str) throws DOMException {
    }

    public void setReadOnly(boolean z, boolean z2) {
    }

    @Override // org.w3c.dom.Node
    public void setTextContent(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Node
    public Object setUserData(String str, Object obj, UserDataHandler userDataHandler) {
    }

    protected void synchronizeData() {
    }

    public String toString() {
    }

    void getTextContent(StringBuffer stringBuffer) throws DOMException {
    }

    public Object getUserData() {
    }

    final void hasStringValue(boolean z) {
    }

    final void isFirstChild(boolean z) {
    }

    final void isIdAttribute(boolean z) {
    }

    final void isNormalized(boolean z) {
    }

    final void isOwned(boolean z) {
    }

    final void isReadOnly(boolean z) {
    }

    final void isSpecified(boolean z) {
    }

    public final void needsSyncChildren(boolean z) {
    }

    final void needsSyncData(boolean z) {
    }

    public void setUserData(Object obj) {
    }

    public NodeImpl() {
    }
}
