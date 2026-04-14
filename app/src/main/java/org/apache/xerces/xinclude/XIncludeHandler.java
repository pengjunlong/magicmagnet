package org.apache.xerces.xinclude;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.util.IntStack;
import org.apache.xerces.util.ParserConfigurationSettings;
import org.apache.xerces.util.SecurityManager;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.URI;
import org.apache.xerces.util.XMLLocatorWrapper;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDTDHandler;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLDTDFilter;
import org.apache.xerces.xni.parser.XMLDTDSource;
import org.apache.xerces.xni.parser.XMLDocumentFilter;
import org.apache.xerces.xni.parser.XMLDocumentSource;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.apache.xerces.xpointer.XPointerProcessor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XIncludeHandler implements XMLComponent, XMLDocumentFilter, XMLDTDFilter {
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS = "http://xml.org/sax/features/allow-dtd-events-after-endDTD";
    protected static final String BUFFER_SIZE = "http://apache.org/xml/properties/input-buffer-size";
    public static final String CURRENT_BASE_URI = "currentBaseURI";
    protected static final String DYNAMIC_VALIDATION = "http://apache.org/xml/features/validation/dynamic";
    protected static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final Boolean[] FEATURE_DEFAULTS = null;
    public static final String HTTP_ACCEPT = "Accept";
    public static final String HTTP_ACCEPT_LANGUAGE = "Accept-Language";
    private static final int INITIAL_SIZE = 8;
    protected static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private static final QName NEW_NS_ATTR_QNAME = null;
    protected static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final String SCHEMA_VALIDATION = "http://apache.org/xml/features/validation/schema";
    protected static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    private static final int STATE_EXPECT_FALLBACK = 3;
    private static final int STATE_IGNORE = 2;
    private static final int STATE_NORMAL_PROCESSING = 1;
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String VALIDATION = "http://xml.org/sax/features/validation";
    public static final String XINCLUDE_ATTR_ACCEPT = null;
    public static final String XINCLUDE_ATTR_ACCEPT_LANGUAGE = null;
    public static final String XINCLUDE_ATTR_ENCODING = null;
    public static final String XINCLUDE_ATTR_HREF = null;
    public static final String XINCLUDE_ATTR_PARSE = null;
    private static final String XINCLUDE_BASE = null;
    public static final String XINCLUDE_DEFAULT_CONFIGURATION = "org.apache.xerces.parsers.XIncludeParserConfiguration";
    public static final String XINCLUDE_FALLBACK = null;
    protected static final String XINCLUDE_FIXUP_BASE_URIS = "http://apache.org/xml/features/xinclude/fixup-base-uris";
    protected static final String XINCLUDE_FIXUP_LANGUAGE = "http://apache.org/xml/features/xinclude/fixup-language";
    public static final String XINCLUDE_INCLUDE = null;
    public static final String XINCLUDE_INCLUDED = null;
    private static final String XINCLUDE_LANG = null;
    public static final String XINCLUDE_NS_URI = null;
    public static final String XINCLUDE_PARSE_TEXT = null;
    public static final String XINCLUDE_PARSE_XML = null;
    private static final QName XML_BASE_QNAME = null;
    private static final QName XML_LANG_QNAME = null;
    public static final String XPOINTER = "xpointer";
    private static final char[] gAfterEscaping1 = null;
    private static final char[] gAfterEscaping2 = null;
    private static final char[] gHexChs = null;
    private static final boolean[] gNeedEscaping = null;
    protected final Stack fBaseURI;
    protected final IntStack fBaseURIScope;
    protected int fBufferSize;
    protected XMLParserConfiguration fChildConfig;
    protected final XMLResourceIdentifier fCurrentBaseURI;
    protected String fCurrentLanguage;
    protected XMLDTDHandler fDTDHandler;
    protected XMLDTDSource fDTDSource;
    private int fDepth;
    protected XMLLocator fDocLocation;
    protected XMLDocumentHandler fDocumentHandler;
    protected XMLDocumentSource fDocumentSource;
    protected XMLEntityResolver fEntityResolver;
    protected XMLErrorReporter fErrorReporter;
    protected final Stack fExpandedSystemID;
    private boolean fFixupBaseURIs;
    private boolean fFixupLanguage;
    boolean fHasIncludeReportedContent;
    protected String fHrefFromParent;
    private boolean fInDTD;
    private boolean fIsXML11;
    protected final IntStack fLanguageScope;
    protected final Stack fLanguageStack;
    protected final Stack fLiteralSystemID;
    protected XIncludeNamespaceSupport fNamespaceContext;
    private boolean fNeedCopyFeatures;
    private final ArrayList fNotations;
    protected String fParentRelativeURI;
    protected XIncludeHandler fParentXIncludeHandler;
    private int fResultDepth;
    private boolean[] fSawFallback;
    private boolean[] fSawInclude;
    protected SecurityManager fSecurityManager;
    private boolean fSeenRootElement;
    private boolean fSendUEAndNotationEvents;
    protected ParserConfigurationSettings fSettings;
    private int[] fState;
    protected SymbolTable fSymbolTable;
    private final ArrayList fUnparsedEntities;
    protected XIncludeTextReader fXInclude10TextReader;
    protected XIncludeTextReader fXInclude11TextReader;
    protected XMLParserConfiguration fXIncludeChildConfig;
    protected XMLLocatorWrapper fXIncludeLocator;
    protected XIncludeMessageFormatter fXIncludeMessageFormatter;
    protected XMLParserConfiguration fXPointerChildConfig;
    protected XPointerProcessor fXPtrProcessor;

    protected static class Notation {
        public Augmentations augmentations;
        public String baseURI;
        public String expandedSystemId;
        public String name;
        public String publicId;
        public String systemId;

        protected Notation() {
        }

        private boolean isEqual(String str, String str2) {
        }

        public boolean equals(Object obj) {
        }

        public boolean isDuplicate(Object obj) {
        }
    }

    protected static class UnparsedEntity {
        public Augmentations augmentations;
        public String baseURI;
        public String expandedSystemId;
        public String name;
        public String notation;
        public String publicId;
        public String systemId;

        protected UnparsedEntity() {
        }

        private boolean isEqual(String str, String str2) {
        }

        public boolean equals(Object obj) {
        }

        public boolean isDuplicate(Object obj) {
        }
    }

    private void checkMultipleRootElements() {
    }

    private void checkWhitespace(XMLString xMLString) {
    }

    private void copyFeatures1(Enumeration enumeration, String str, XMLComponentManager xMLComponentManager, ParserConfigurationSettings parserConfigurationSettings) {
    }

    private XMLInputSource createInputSource(String str, String str2, String str3, String str4, String str5) {
    }

    private String escapeHref(String str) {
    }

    private String getIncludeParentBaseURI() {
    }

    private int getIncludeParentDepth() {
    }

    private String getIncludeParentLanguage() {
    }

    private int getResultDepth() {
    }

    private boolean getRootElementProcessed() {
    }

    private boolean isEqual(String str, String str2) {
    }

    private boolean isValidInHTTPHeader(String str) {
    }

    private void reportError(String str, Object[] objArr, short s, Exception exc) {
    }

    private int scopeOfBaseURI(int i) {
    }

    private int scopeOfLanguage(int i) {
    }

    private void setErrorReporter(XMLErrorReporter xMLErrorReporter) {
    }

    private void setRootElementProcessed(boolean z) {
    }

    protected void addNotation(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) {
    }

    protected void addUnparsedEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void attributeDecl(String str, String str2, String str3, String[] strArr, String str4, XMLString xMLString, XMLString xMLString2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected void checkAndSendNotation(Notation notation) {
    }

    protected void checkAndSendUnparsedEntity(UnparsedEntity unparsedEntity) {
    }

    protected void checkNotation(String str) {
    }

    protected void checkUnparsedEntity(String str) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected void copyFeatures(XMLComponentManager xMLComponentManager, ParserConfigurationSettings parserConfigurationSettings) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void doctypeDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void elementDecl(String str, String str2, Augmentations augmentations) throws XNIException {
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

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void endParameterEntity(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void externalEntityDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
    }

    public String getBaseURI(int i) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDSource
    public XMLDTDHandler getDTDHandler() {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public XMLDTDSource getDTDSource() {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentSource
    public XMLDocumentHandler getDocumentHandler() {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public XMLDocumentSource getDocumentSource() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    public String getLanguage(int i) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Object getPropertyDefault(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    protected String getRelativeBaseURI() throws URI.MalformedURIException {
    }

    public String getRelativeURI(int i) throws URI.MalformedURIException {
    }

    protected boolean getSawFallback(int i) {
    }

    protected boolean getSawInclude(int i) {
    }

    protected int getState(int i) {
    }

    protected void handleFallbackElement() {
    }

    protected boolean handleIncludeElement(XMLAttributes xMLAttributes) throws XNIException {
    }

    protected boolean hasXIncludeNamespace(QName qName) {
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

    protected boolean isFallbackElement(QName qName) {
    }

    protected boolean isIncludeElement(QName qName) {
    }

    protected boolean isRootDocument() {
    }

    protected boolean isTopLevelIncludedItem() {
    }

    protected boolean isTopLevelIncludedItemViaFallback() {
    }

    protected boolean isTopLevelIncludedItemViaInclude() {
    }

    protected Augmentations modifyAugmentations(Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void notationDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
    }

    protected XMLAttributes processAttributes(XMLAttributes xMLAttributes) {
    }

    protected void processXMLBaseAttributes(XMLAttributes xMLAttributes) {
    }

    protected void processXMLLangAttributes(XMLAttributes xMLAttributes) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected void reportFatalError(String str) {
    }

    protected void reportResourceError(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XNIException {
    }

    protected void restoreBaseURI() {
    }

    public String restoreLanguage() {
    }

    protected boolean sameBaseURIAsIncludeParent() {
    }

    protected boolean sameLanguageAsIncludeParent() {
    }

    protected void saveBaseURI() {
    }

    protected void saveLanguage(String str) {
    }

    protected boolean searchForRecursiveIncludes(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDSource
    public void setDTDHandler(XMLDTDHandler xMLDTDHandler) {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void setDTDSource(XMLDTDSource xMLDTDSource) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentSource
    public void setDocumentHandler(XMLDocumentHandler xMLDocumentHandler) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void setDocumentSource(XMLDocumentSource xMLDocumentSource) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    protected void setHref(String str) {
    }

    protected void setParent(XIncludeHandler xIncludeHandler) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    protected void setSawFallback(int i, boolean z) {
    }

    protected void setSawInclude(int i, boolean z) {
    }

    protected void setState(int i) {
    }

    protected void setXIncludeLocator(XMLLocatorWrapper xMLLocatorWrapper) {
    }

    protected void setupCurrentBaseURI(XMLLocator xMLLocator) {
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

    protected int getState() {
    }

    protected Augmentations modifyAugmentations(Augmentations augmentations, boolean z) {
    }

    protected void reportFatalError(String str, Object[] objArr) {
    }

    protected void reportResourceError(String str, Object[] objArr) {
    }

    protected void reportFatalError(String str, Object[] objArr, Exception exc) {
    }

    protected void reportResourceError(String str, Object[] objArr, Exception exc) {
    }

    private void copyFeatures1(Enumeration enumeration, String str, XMLComponentManager xMLComponentManager, XMLParserConfiguration xMLParserConfiguration) {
    }

    protected void copyFeatures(XMLComponentManager xMLComponentManager, XMLParserConfiguration xMLParserConfiguration) {
    }
}
