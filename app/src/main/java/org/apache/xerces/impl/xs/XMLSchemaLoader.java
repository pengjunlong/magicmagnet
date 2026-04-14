package org.apache.xerces.impl.xs;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Locale;
import java.util.WeakHashMap;
import org.apache.xerces.impl.XMLEntityManager;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.dv.SchemaDVFactory;
import org.apache.xerces.impl.xs.models.CMBuilder;
import org.apache.xerces.impl.xs.traversers.XSDHandler;
import org.apache.xerces.util.DOMEntityResolverWrapper;
import org.apache.xerces.util.DOMErrorHandlerWrapper;
import org.apache.xerces.util.ParserConfigurationSettings;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarLoader;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xs.LSInputList;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSLoader;
import org.apache.xerces.xs.XSModel;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMStringList;
import org.w3c.dom.ls.LSInput;
import org.xml.sax.InputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLSchemaLoader implements XMLGrammarLoader, XMLComponent, XSElementDeclHelper, XSLoader, DOMConfiguration {
    protected static final String ALLOW_JAVA_ENCODINGS = "http://apache.org/xml/features/allow-java-encodings";
    protected static final String AUGMENT_PSVI = "http://apache.org/xml/features/validation/schema/augment-psvi";
    protected static final String CONTINUE_AFTER_FATAL_ERROR = "http://apache.org/xml/features/continue-after-fatal-error";
    protected static final String DISALLOW_DOCTYPE = "http://apache.org/xml/features/disallow-doctype-decl";
    protected static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    public static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    public static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS = "http://apache.org/xml/features/generate-synthetic-annotations";
    protected static final String HONOUR_ALL_SCHEMALOCATIONS = "http://apache.org/xml/features/honour-all-schemaLocations";
    protected static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";
    protected static final String LOCALE = "http://apache.org/xml/properties/locale";
    protected static final String NAMESPACE_GROWTH = "http://apache.org/xml/features/namespace-growth";
    protected static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final String SCHEMA_DV_FACTORY = "http://apache.org/xml/properties/internal/validation/schema/dv-factory";
    protected static final String SCHEMA_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";
    protected static final String SCHEMA_LOCATION = "http://apache.org/xml/properties/schema/external-schemaLocation";
    protected static final String SCHEMA_NONS_LOCATION = "http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation";
    protected static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    protected static final String STANDARD_URI_CONFORMANT_FEATURE = "http://apache.org/xml/features/standard-uri-conformant";
    public static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String TOLERATE_DUPLICATES = "http://apache.org/xml/features/internal/tolerate-duplicates";
    protected static final String VALIDATE_ANNOTATIONS = "http://apache.org/xml/features/validate-annotations";
    public static final String XMLGRAMMAR_POOL = "http://apache.org/xml/properties/internal/grammar-pool";
    private CMBuilder fCMBuilder;
    private XSDeclarationPool fDeclPool;
    private SchemaDVFactory fDefaultSchemaDVFactory;
    private XMLEntityManager fEntityManager;
    private DOMErrorHandlerWrapper fErrorHandler;
    private XMLErrorReporter fErrorReporter;
    private String fExternalNoNSSchema;
    private String fExternalSchemas;
    private XSGrammarBucket fGrammarBucket;
    private XMLGrammarPool fGrammarPool;
    private boolean fIsCheckedFully;
    private WeakHashMap fJAXPCache;
    private boolean fJAXPProcessed;
    private Object fJAXPSource;
    private final ParserConfigurationSettings fLoaderConfig;
    private Locale fLocale;
    private DOMStringList fRecognizedParameters;
    private DOMEntityResolverWrapper fResourceResolver;
    private XSDHandler fSchemaHandler;
    private boolean fSettingsChanged;
    private SubstitutionGroupHandler fSubGroupHandler;
    private XMLEntityResolver fUserEntityResolver;
    private XSDDescription fXSDDescription;

    static class LocationArray {
        int length;
        String[] locations;

        LocationArray() {
        }

        public void addLocation(String str) {
        }

        public String getFirstLocation() {
        }

        public int getLength() {
        }

        public String[] getLocationArray() {
        }

        public void resize(int i, int i2) {
        }
    }

    public XMLSchemaLoader() {
    }

    private void initGrammarBucket() {
    }

    private boolean parserSettingsUpdated(XMLComponentManager xMLComponentManager) {
    }

    public static void processExternalHints(String str, String str2, Hashtable hashtable, XMLErrorReporter xMLErrorReporter) {
    }

    private void processJAXPSchemaSource(Hashtable hashtable) throws IOException {
    }

    public static XMLInputSource resolveDocument(XSDDescription xSDDescription, Hashtable hashtable, XMLEntityResolver xMLEntityResolver) throws IOException {
    }

    private static XMLInputSource saxToXMLInputSource(InputSource inputSource) {
    }

    public static boolean tokenizeSchemaLocationStr(String str, Hashtable hashtable, String str2) {
    }

    private XMLInputSource xsdToXMLInputSource(Object obj) {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public boolean canSetParameter(String str, Object obj) {
    }

    XMLInputSource dom2xmlInputSource(LSInput lSInput) {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public DOMConfiguration getConfig() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public XMLEntityResolver getEntityResolver() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public XMLErrorHandler getErrorHandler() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public boolean getFeature(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    @Override // org.apache.xerces.impl.xs.XSElementDeclHelper
    public XSElementDecl getGlobalElementDecl(QName qName) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public Locale getLocale() {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public Object getParameter(String str) throws DOMException {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public DOMStringList getParameterNames() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public Object getProperty(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Object getPropertyDefault(String str) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader, org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader, org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel load(LSInput lSInput) {
    }

    public void loadGrammar(XMLInputSource[] xMLInputSourceArr) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel loadInputList(LSInputList lSInputList) {
    }

    SchemaGrammar loadSchema(XSDDescription xSDDescription, XMLInputSource xMLInputSource, Hashtable hashtable) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel loadURI(String str) {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel loadURIList(StringList stringList) {
    }

    void reportDOMFatalError(Exception exc) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public void setEntityResolver(XMLEntityResolver xMLEntityResolver) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public void setErrorHandler(XMLErrorHandler xMLErrorHandler) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader, org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public void setLocale(Locale locale) {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public void setParameter(String str, Object obj) throws DOMException {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader, org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public XMLSchemaLoader(SymbolTable symbolTable) {
    }

    XMLSchemaLoader(XMLErrorReporter xMLErrorReporter, XSGrammarBucket xSGrammarBucket, SubstitutionGroupHandler substitutionGroupHandler, CMBuilder cMBuilder) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public Grammar loadGrammar(XMLInputSource xMLInputSource) throws IOException, XNIException {
    }

    XMLSchemaLoader(SymbolTable symbolTable, XMLErrorReporter xMLErrorReporter, XMLEntityManager xMLEntityManager, XSGrammarBucket xSGrammarBucket, SubstitutionGroupHandler substitutionGroupHandler, CMBuilder cMBuilder) {
    }
}
