package org.apache.xerces.dom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ParentNode extends ChildNode {
    static final long serialVersionUID = 2815829867152120872L;
    protected transient NodeListCache fNodeListCache;
    protected ChildNode firstChild;
    protected CoreDocumentImpl ownerDocument;

    /* renamed from: org.apache.xerces.dom.ParentNode$1 */
    class C17721 implements NodeList {
        final /* synthetic */ ParentNode this$0;

        C17721(ParentNode parentNode) {
        }

        @Override // org.w3c.dom.NodeList
        public int getLength() {
        }

        @Override // org.w3c.dom.NodeList
        public Node item(int i) {
        }
    }

    class UserDataRecord implements Serializable {
        private static final long serialVersionUID = 3258126977134310455L;
        Object fData;
        UserDataHandler fHandler;
        final /* synthetic */ ParentNode this$0;

        UserDataRecord(ParentNode parentNode, Object obj, UserDataHandler userDataHandler) {
        }
    }

    protected ParentNode(CoreDocumentImpl coreDocumentImpl) {
    }

    static /* synthetic */ int access$000(ParentNode parentNode) {
    }

    static /* synthetic */ Node access$100(ParentNode parentNode, int i) {
    }

    private int nodeListGetLength() {
    }

    private Node nodeListItem(int i) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    void checkNormalizationAfterInsert(ChildNode childNode) {
    }

    void checkNormalizationAfterRemove(ChildNode childNode) {
    }

    @Override // org.apache.xerces.dom.ChildNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public NodeList getChildNodes() {
    }

    protected final NodeList getChildNodesUnoptimized() {
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

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Document getOwnerDocument() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getTextContent() throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean hasChildNodes() {
    }

    final boolean hasTextContent(Node node) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) throws DOMException {
    }

    Node internalInsertBefore(Node node, Node node2, boolean z) throws DOMException {
    }

    Node internalRemoveChild(Node node, boolean z) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.NodeList
    public Node item(int i) {
    }

    final ChildNode lastChild() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void normalize() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    CoreDocumentImpl ownerDocument() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node removeChild(Node node) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void setOwnerDocument(CoreDocumentImpl coreDocumentImpl) {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    public void setReadOnly(boolean z, boolean z2) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setTextContent(String str) throws DOMException {
    }

    protected void synchronizeChildren() {
    }

    final void lastChild(ChildNode childNode) {
    }

    public ParentNode() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    void getTextContent(StringBuffer stringBuffer) throws DOMException {
    }
}
