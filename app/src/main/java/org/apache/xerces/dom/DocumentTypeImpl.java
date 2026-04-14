package org.apache.xerces.dom;

import java.util.Hashtable;
import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.UserDataHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DocumentTypeImpl extends ParentNode implements DocumentType {
    static final long serialVersionUID = 7751299192316526485L;
    private int doctypeNumber;
    protected NamedNodeMapImpl elements;
    protected NamedNodeMapImpl entities;
    protected String internalSubset;
    protected String name;
    protected NamedNodeMapImpl notations;
    protected String publicID;
    protected String systemID;
    private Hashtable userData;

    public DocumentTypeImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.ChildNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    public NamedNodeMap getElements() {
    }

    @Override // org.w3c.dom.DocumentType
    public NamedNodeMap getEntities() {
    }

    @Override // org.w3c.dom.DocumentType
    public String getInternalSubset() {
    }

    @Override // org.w3c.dom.DocumentType
    public String getName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected int getNodeNumber() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public short getNodeType() {
    }

    @Override // org.w3c.dom.DocumentType
    public NamedNodeMap getNotations() {
    }

    @Override // org.w3c.dom.DocumentType
    public String getPublicId() {
    }

    @Override // org.w3c.dom.DocumentType
    public String getSystemId() {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getTextContent() throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Object getUserData(String str) {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected Hashtable getUserDataRecord() {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
    }

    public void setInternalSubset(String str) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl
    protected void setOwnerDocument(CoreDocumentImpl coreDocumentImpl) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl
    public void setReadOnly(boolean z, boolean z2) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setTextContent(String str) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Object setUserData(String str, Object obj, UserDataHandler userDataHandler) {
    }

    public DocumentTypeImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2, String str3) {
    }
}
