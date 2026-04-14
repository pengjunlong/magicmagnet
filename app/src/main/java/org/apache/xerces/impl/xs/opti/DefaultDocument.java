package org.apache.xerces.impl.xs.opti;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DefaultDocument extends NodeImpl implements Document {
    private String fDocumentURI;

    @Override // org.w3c.dom.Document
    public Node adoptNode(Node node) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Attr createAttribute(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Attr createAttributeNS(String str, String str2) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public CDATASection createCDATASection(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Comment createComment(String str) {
    }

    @Override // org.w3c.dom.Document
    public DocumentFragment createDocumentFragment() {
    }

    @Override // org.w3c.dom.Document
    public Element createElement(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Element createElementNS(String str, String str2) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public EntityReference createEntityReference(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public ProcessingInstruction createProcessingInstruction(String str, String str2) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Text createTextNode(String str) {
    }

    @Override // org.w3c.dom.Document
    public DocumentType getDoctype() {
    }

    @Override // org.w3c.dom.Document
    public Element getDocumentElement() {
    }

    @Override // org.w3c.dom.Document
    public String getDocumentURI() {
    }

    @Override // org.w3c.dom.Document
    public DOMConfiguration getDomConfig() {
    }

    @Override // org.w3c.dom.Document
    public Element getElementById(String str) {
    }

    @Override // org.w3c.dom.Document
    public NodeList getElementsByTagName(String str) {
    }

    @Override // org.w3c.dom.Document
    public NodeList getElementsByTagNameNS(String str, String str2) {
    }

    @Override // org.w3c.dom.Document
    public DOMImplementation getImplementation() {
    }

    @Override // org.w3c.dom.Document
    public String getInputEncoding() {
    }

    @Override // org.apache.xerces.impl.xs.opti.NodeImpl, org.apache.xerces.impl.xs.opti.DefaultNode, org.w3c.dom.Node
    public String getNodeName() {
    }

    @Override // org.w3c.dom.Document
    public boolean getStrictErrorChecking() {
    }

    @Override // org.w3c.dom.Document
    public String getXmlEncoding() {
    }

    @Override // org.w3c.dom.Document
    public boolean getXmlStandalone() {
    }

    @Override // org.w3c.dom.Document
    public String getXmlVersion() {
    }

    @Override // org.w3c.dom.Document
    public Node importNode(Node node, boolean z) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public void normalizeDocument() {
    }

    @Override // org.w3c.dom.Document
    public Node renameNode(Node node, String str, String str2) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public void setDocumentURI(String str) {
    }

    @Override // org.w3c.dom.Document
    public void setStrictErrorChecking(boolean z) {
    }

    @Override // org.w3c.dom.Document
    public void setXmlStandalone(boolean z) {
    }

    @Override // org.w3c.dom.Document
    public void setXmlVersion(String str) throws DOMException {
    }
}
