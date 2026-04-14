package org.apache.xerces.parsers;

import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDTDContentModelHandler;
import org.apache.xerces.xni.XMLDTDHandler;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLDTDContentModelSource;
import org.apache.xerces.xni.parser.XMLDTDSource;
import org.apache.xerces.xni.parser.XMLDocumentSource;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMStringList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSParser;
import org.w3c.dom.ls.LSParserFilter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMParserImpl extends AbstractDOMParser implements LSParser, DOMConfiguration {
    protected static final boolean DEBUG = false;
    protected static final String DISALLOW_DOCTYPE_DECL_FEATURE = "http://apache.org/xml/features/disallow-doctype-decl";
    protected static final String DYNAMIC_VALIDATION = "http://apache.org/xml/features/validation/dynamic";
    protected static final String HONOUR_ALL_SCHEMALOCATIONS = "http://apache.org/xml/features/honour-all-schemaLocations";
    protected static final String NAMESPACES = "http://xml.org/sax/features/namespaces";
    protected static final String NAMESPACE_GROWTH = "http://apache.org/xml/features/namespace-growth";
    protected static final String NORMALIZE_DATA = "http://apache.org/xml/features/validation/schema/normalized-value";
    protected static final String PSVI_AUGMENT = "http://apache.org/xml/features/validation/schema/augment-psvi";
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String TOLERATE_DUPLICATES = "http://apache.org/xml/features/internal/tolerate-duplicates";
    protected static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    protected static final String XMLSCHEMA = "http://apache.org/xml/features/validation/schema";
    protected static final String XMLSCHEMA_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";
    private AbortHandler abortHandler;
    private boolean abortNow;
    private Thread currentThread;
    protected boolean fBusy;
    protected boolean fNamespaceDeclarations;
    private boolean fNullFilterInUse;
    private DOMStringList fRecognizedParameters;
    private String fSchemaLocation;
    protected String fSchemaType;

    private static final class AbortHandler implements XMLDocumentHandler, XMLDTDHandler, XMLDTDContentModelHandler {
        private XMLDocumentSource documentSource;
        private XMLDTDContentModelSource dtdContentSource;
        private XMLDTDSource dtdSource;

        private AbortHandler() {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void any(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void attributeDecl(String str, String str2, String str3, String[] strArr, String str4, XMLString xMLString, XMLString xMLString2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void doctypeDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void element(String str, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void elementDecl(String str, String str2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void empty(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void endAttlist(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void endCDATA(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void endConditional(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void endContentModel(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void endDTD(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void endDocument(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void endElement(QName qName, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void endExternalSubset(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void endGeneralEntity(String str, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void endGroup(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void endParameterEntity(String str, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void externalEntityDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public XMLDTDContentModelSource getDTDContentModelSource() {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public XMLDTDSource getDTDSource() {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public XMLDocumentSource getDocumentSource() {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void ignoredCharacters(XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void internalEntityDecl(String str, XMLString xMLString, XMLString xMLString2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void notationDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void occurrence(short s, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void pcdata(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void separator(short s, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void setDTDContentModelSource(XMLDTDContentModelSource xMLDTDContentModelSource) {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void setDTDSource(XMLDTDSource xMLDTDSource) {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void setDocumentSource(XMLDocumentSource xMLDocumentSource) {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void startAttlist(String str, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void startCDATA(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void startConditional(short s, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void startContentModel(String str, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void startDTD(XMLLocator xMLLocator, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void startDocument(XMLLocator xMLLocator, String str, NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void startExternalSubset(XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void startGeneralEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
        public void startGroup(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void startParameterEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void textDecl(String str, String str2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDTDHandler
        public void unparsedEntityDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.xni.XMLDocumentHandler
        public void xmlDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
        }

        /* synthetic */ AbortHandler(C18071 c18071) {
        }
    }

    static final class NullLSParserFilter implements LSParserFilter {
        static final NullLSParserFilter INSTANCE = null;

        private NullLSParserFilter() {
        }

        @Override // org.w3c.dom.ls.LSParserFilter
        public short acceptNode(Node node) {
        }

        @Override // org.w3c.dom.ls.LSParserFilter
        public int getWhatToShow() {
        }

        @Override // org.w3c.dom.ls.LSParserFilter
        public short startElement(Element element) {
        }
    }

    public DOMParserImpl(String str, String str2) {
    }

    private static DOMException newFeatureNotFoundError(String str) {
    }

    private static DOMException newFeatureNotSupportedError(String str) {
    }

    private static DOMException newInvalidStateError() {
    }

    private static DOMException newTypeMismatchError(String str) {
    }

    private void restoreHandlers() {
    }

    @Override // org.apache.xerces.parsers.AbstractDOMParser, org.w3c.dom.ls.LSParser
    public void abort() {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public boolean canSetParameter(String str, Object obj) {
    }

    XMLInputSource dom2xmlInputSource(LSInput lSInput) {
    }

    @Override // org.w3c.dom.ls.LSParser
    public boolean getAsync() {
    }

    @Override // org.w3c.dom.ls.LSParser
    public boolean getBusy() {
    }

    @Override // org.w3c.dom.ls.LSParser
    public DOMConfiguration getDomConfig() {
    }

    @Override // org.w3c.dom.ls.LSParser
    public LSParserFilter getFilter() {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public Object getParameter(String str) throws DOMException {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public DOMStringList getParameterNames() {
    }

    @Override // org.w3c.dom.ls.LSParser
    public Document parse(LSInput lSInput) throws LSException {
    }

    @Override // org.w3c.dom.ls.LSParser
    public Document parseURI(String str) throws LSException {
    }

    @Override // org.w3c.dom.ls.LSParser
    public Node parseWithContext(LSInput lSInput, Node node, short s) throws DOMException, LSException {
    }

    @Override // org.apache.xerces.parsers.AbstractDOMParser, org.apache.xerces.parsers.AbstractXMLDocumentParser, org.apache.xerces.parsers.XMLParser
    public void reset() {
    }

    @Override // org.w3c.dom.ls.LSParser
    public void setFilter(LSParserFilter lSParserFilter) {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public void setParameter(String str, Object obj) throws DOMException {
    }

    @Override // org.apache.xerces.parsers.AbstractDOMParser, org.apache.xerces.parsers.AbstractXMLDocumentParser, org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) {
    }

    public DOMParserImpl(XMLParserConfiguration xMLParserConfiguration) {
    }

    public DOMParserImpl(SymbolTable symbolTable) {
    }

    public DOMParserImpl(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool) {
    }
}
