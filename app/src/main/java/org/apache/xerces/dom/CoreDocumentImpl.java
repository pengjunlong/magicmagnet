package org.apache.xerces.dom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
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
import org.w3c.dom.Entity;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Notation;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CoreDocumentImpl extends ParentNode implements Document {
    private static final int[] kidOK = null;
    static final long serialVersionUID = 0;
    protected String actualEncoding;
    protected boolean allowGrammarAccess;
    protected int changes;
    protected ElementImpl docElement;
    protected DocumentTypeImpl docType;
    private int documentNumber;
    transient DOMNormalizer domNormalizer;
    protected String encoding;
    protected boolean errorChecking;
    transient DOMConfigurationImpl fConfiguration;
    protected String fDocumentURI;
    transient NodeListCache fFreeNLCache;
    transient Object fXPathEvaluator;
    protected Hashtable identifiers;
    private int nodeCounter;
    private Map nodeTable;
    protected boolean standalone;
    protected Map userData;
    protected String version;
    private boolean xml11Version;
    protected boolean xmlVersionChanged;

    public CoreDocumentImpl() {
    }

    public static final boolean isValidQName(String str, String str2, boolean z) {
    }

    public static final boolean isXMLName(String str, boolean z) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private ElementImpl replaceRenameElement(ElementImpl elementImpl, String str, String str2) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public void abort() {
    }

    protected void addEventListener(NodeImpl nodeImpl, String str, EventListener eventListener, boolean z) {
    }

    @Override // org.w3c.dom.Document
    public Node adoptNode(Node node) {
    }

    protected void callUserDataHandlers(Node node, Node node2, short s) {
    }

    protected boolean canRenameElements(String str, String str2, ElementImpl elementImpl) {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void changed() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected int changes() {
    }

    protected final void checkDOMNSErr(String str, String str2) {
    }

    protected final void checkNamespaceWF(String str, int i, int i2) {
    }

    protected final void checkQName(String str, String str2) {
    }

    protected final void clearIdentifiers() {
    }

    public Object clone() throws CloneNotSupportedException {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.ChildNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    protected void copyEventListeners(NodeImpl nodeImpl, NodeImpl nodeImpl2) {
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

    public DocumentType createDocumentType(String str, String str2, String str3) throws DOMException {
    }

    public Element createElement(String str) throws DOMException {
    }

    public ElementDefinitionImpl createElementDefinition(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Element createElementNS(String str, String str2) throws DOMException {
    }

    public Entity createEntity(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public EntityReference createEntityReference(String str) throws DOMException {
    }

    public Notation createNotation(String str) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public ProcessingInstruction createProcessingInstruction(String str, String str2) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public Text createTextNode(String str) {
    }

    void deletedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    protected boolean dispatchEvent(NodeImpl nodeImpl, Event event) {
    }

    void freeNodeListCache(NodeListCache nodeListCache) {
    }

    public boolean getAsync() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getBaseURI() {
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

    public String getEncoding() {
    }

    public boolean getErrorChecking() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Object getFeature(String str, String str2) {
    }

    public Element getIdentifier(String str) {
    }

    public Enumeration getIdentifiers() {
    }

    @Override // org.w3c.dom.Document
    public DOMImplementation getImplementation() {
    }

    @Override // org.w3c.dom.Document
    public String getInputEncoding() {
    }

    boolean getMutationEvents() {
    }

    NodeListCache getNodeListCache(ParentNode parentNode) {
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

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public final Document getOwnerDocument() {
    }

    public boolean getStandalone() {
    }

    @Override // org.w3c.dom.Document
    public boolean getStrictErrorChecking() {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getTextContent() throws DOMException {
    }

    public Object getUserData(Node node, String str) {
    }

    protected Hashtable getUserDataRecord(Node node) {
    }

    public String getVersion() {
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

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) throws DOMException {
    }

    void insertedNode(NodeImpl nodeImpl, NodeImpl nodeImpl2, boolean z) {
    }

    void insertedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    void insertingNode(NodeImpl nodeImpl, boolean z) {
    }

    protected boolean isKidOK(Node node, Node node2) {
    }

    boolean isNormalizeDocRequired() {
    }

    boolean isXML11Version() {
    }

    boolean isXMLVersionChanged() {
    }

    public boolean load(String str) {
    }

    public boolean loadXML(String str) {
    }

    void modifiedAttrValue(AttrImpl attrImpl, String str) {
    }

    void modifiedCharacterData(NodeImpl nodeImpl, String str, String str2, boolean z) {
    }

    void modifyingCharacterData(NodeImpl nodeImpl, boolean z) {
    }

    @Override // org.w3c.dom.Document
    public void normalizeDocument() {
    }

    public void putIdentifier(String str, Element element) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node removeChild(Node node) throws DOMException {
    }

    protected void removeEventListener(NodeImpl nodeImpl, String str, EventListener eventListener, boolean z) {
    }

    public void removeIdentifier(String str) {
    }

    Hashtable removeUserDataTable(Node node) {
    }

    void removedAttrNode(AttrImpl attrImpl, NodeImpl nodeImpl, String str) {
    }

    void removedNode(NodeImpl nodeImpl, boolean z) {
    }

    void removingNode(NodeImpl nodeImpl, NodeImpl nodeImpl2, boolean z) {
    }

    @Override // org.w3c.dom.Document
    public Node renameNode(Node node, String str, String str2) throws DOMException {
    }

    void renamedAttrNode(Attr attr, Attr attr2) {
    }

    void renamedElement(Element element, Element element2) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) throws DOMException {
    }

    void replacedCharacterData(NodeImpl nodeImpl, String str, String str2) {
    }

    void replacedNode(NodeImpl nodeImpl) {
    }

    void replacedText(CharacterDataImpl characterDataImpl) {
    }

    void replacingData(NodeImpl nodeImpl) {
    }

    void replacingNode(NodeImpl nodeImpl) {
    }

    public String saveXML(Node node) throws DOMException {
    }

    public void setAsync(boolean z) {
    }

    void setAttrNode(AttrImpl attrImpl, AttrImpl attrImpl2) {
    }

    @Override // org.w3c.dom.Document
    public void setDocumentURI(String str) {
    }

    public void setEncoding(String str) {
    }

    public void setErrorChecking(boolean z) {
    }

    public void setInputEncoding(String str) {
    }

    void setMutationEvents(boolean z) {
    }

    public void setStandalone(boolean z) {
    }

    @Override // org.w3c.dom.Document
    public void setStrictErrorChecking(boolean z) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setTextContent(String str) throws DOMException {
    }

    public Object setUserData(Node node, String str, Object obj, UserDataHandler userDataHandler) {
    }

    void setUserDataTable(Node node, Hashtable hashtable) {
    }

    public void setVersion(String str) {
    }

    public void setXmlEncoding(String str) {
    }

    @Override // org.w3c.dom.Document
    public void setXmlStandalone(boolean z) throws DOMException {
    }

    @Override // org.w3c.dom.Document
    public void setXmlVersion(String str) {
    }

    protected void undeferChildren(Node node) {
    }

    public CoreDocumentImpl(boolean z) {
    }

    private Node importNode(Node node, boolean z, boolean z2, HashMap hashMap) throws DOMException {
    }

    public Attr createAttributeNS(String str, String str2, String str3) throws DOMException {
    }

    public Element createElementNS(String str, String str2, String str3) throws DOMException {
    }

    protected void cloneNode(CoreDocumentImpl coreDocumentImpl, boolean z) {
    }

    protected int getNodeNumber(Node node) {
    }

    void callUserDataHandlers(Node node, Node node2, short s, Hashtable hashtable) {
    }

    protected Object getUserData(NodeImpl nodeImpl) {
    }

    public CoreDocumentImpl(DocumentType documentType) {
    }

    public CoreDocumentImpl(DocumentType documentType, boolean z) {
    }

    protected void setUserData(NodeImpl nodeImpl, Object obj) {
    }
}
