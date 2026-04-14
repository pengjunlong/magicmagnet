package org.apache.xml.serialize;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.xerces.dom.DOMErrorImpl;
import org.w3c.dom.DOMError;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.LSSerializerFilter;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BaseMarkupSerializer implements ContentHandler, DocumentHandler, LexicalHandler, DTDHandler, DeclHandler, DOMSerializer, Serializer {
    protected String _docTypePublicId;
    protected String _docTypeSystemId;
    private int _elementStateCount;
    private ElementState[] _elementStates;
    protected EncodingInfo _encodingInfo;
    protected OutputFormat _format;
    protected boolean _indenting;
    private OutputStream _output;
    private Vector _preRoot;
    protected Hashtable _prefixes;
    private boolean _prepared;
    protected Printer _printer;
    protected boolean _started;
    private Writer _writer;
    protected Node fCurrentNode;
    protected final DOMErrorImpl fDOMError;
    protected DOMErrorHandler fDOMErrorHandler;
    protected LSSerializerFilter fDOMFilter;
    protected final StringBuffer fStrBuffer;
    protected short features;

    protected BaseMarkupSerializer(OutputFormat outputFormat) {
    }

    @Override // org.apache.xml.serialize.Serializer
    public ContentHandler asContentHandler() throws IOException {
    }

    @Override // org.apache.xml.serialize.Serializer
    public DOMSerializer asDOMSerializer() throws IOException {
    }

    @Override // org.apache.xml.serialize.Serializer
    public DocumentHandler asDocumentHandler() throws IOException {
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void attributeDecl(String str, String str2, String str3, String str4, String str5) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    protected void checkUnboundNamespacePrefixedNode(Node node) throws IOException {
    }

    protected void cleanup() {
    }

    final void clearDocumentState() {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i, int i2) throws SAXException {
    }

    protected ElementState content() throws IOException {
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void elementDecl(String str, String str2) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() {
    }

    @Override // org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void endDocument() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) {
    }

    public void endNonEscaping() {
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    public void endPreserving() {
    }

    protected ElementState enterElementState(String str, String str2, String str3, boolean z) {
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void externalEntityDecl(String str, String str2, String str3) throws SAXException {
    }

    protected void fatalError(String str) throws IOException {
    }

    protected ElementState getElementState() {
    }

    protected abstract String getEntityRef(int i);

    protected String getPrefix(String str) {
    }

    @Override // org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void internalEntityDecl(String str, String str2) throws SAXException {
    }

    protected boolean isDocumentState() {
    }

    protected ElementState leaveElementState() {
    }

    protected DOMError modifyDOMError(String str, short s, String str2, Node node) {
    }

    @Override // org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) throws SAXException {
    }

    protected void prepare() throws IOException {
    }

    protected void printCDATAText(String str) throws IOException {
    }

    protected void printDoctypeURL(String str) throws IOException {
    }

    protected void printEscaped(int i) throws IOException {
    }

    final void printHex(int i) throws IOException {
    }

    protected void printText(char[] cArr, int i, int i2, boolean z, boolean z2) throws IOException {
    }

    @Override // org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
    }

    public void processingInstructionIO(String str, String str2) throws IOException {
    }

    public boolean reset() {
    }

    @Override // org.apache.xml.serialize.DOMSerializer
    public void serialize(Element element) throws IOException {
    }

    protected abstract void serializeElement(Element element) throws IOException;

    protected void serializeNode(Node node) throws IOException {
    }

    protected void serializePreRoot() throws IOException {
    }

    @Override // org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.apache.xml.serialize.Serializer
    public void setOutputByteStream(OutputStream outputStream) {
    }

    @Override // org.apache.xml.serialize.Serializer
    public void setOutputCharStream(Writer writer) {
    }

    @Override // org.apache.xml.serialize.Serializer
    public void setOutputFormat(OutputFormat outputFormat) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public final void startDTD(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) {
    }

    public void startNonEscaping() {
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    public void startPreserving() {
    }

    protected void surrogates(int i, int i2, boolean z) throws IOException {
    }

    @Override // org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    public void comment(String str) throws IOException {
    }

    protected void printText(String str, boolean z, boolean z2) throws IOException {
    }

    @Override // org.apache.xml.serialize.DOMSerializer
    public void serialize(DocumentFragment documentFragment) throws IOException {
    }

    protected void printEscaped(String str) throws IOException {
    }

    @Override // org.apache.xml.serialize.DOMSerializer
    public void serialize(Document document) throws IOException {
    }

    protected void characters(String str) throws IOException {
    }
}
