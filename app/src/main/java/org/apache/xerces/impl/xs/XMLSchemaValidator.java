package org.apache.xerces.impl.xs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;
import javax.xml.namespace.QName;
import org.apache.xerces.impl.RevalidationHandler;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.validation.ConfigurableValidationState;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.impl.validation.ValidationState;
import org.apache.xerces.impl.xs.identity.Field;
import org.apache.xerces.impl.xs.identity.FieldActivator;
import org.apache.xerces.impl.xs.identity.IdentityConstraint;
import org.apache.xerces.impl.xs.identity.KeyRef;
import org.apache.xerces.impl.xs.identity.UniqueOrKey;
import org.apache.xerces.impl.xs.identity.ValueStore;
import org.apache.xerces.impl.xs.identity.XPathMatcher;
import org.apache.xerces.impl.xs.models.CMBuilder;
import org.apache.xerces.impl.xs.models.CMNodeFactory;
import org.apache.xerces.impl.xs.models.XSCMValidator;
import org.apache.xerces.util.AugmentationsImpl;
import org.apache.xerces.util.IntStack;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLDocumentFilter;
import org.apache.xerces.xni.parser.XMLDocumentSource;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSTypeDefinition;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLSchemaValidator implements XMLComponent, XMLDocumentFilter, FieldActivator, RevalidationHandler, XSElementDeclHelper {
    protected static final String ALLOW_JAVA_ENCODINGS = "http://apache.org/xml/features/allow-java-encodings";
    private static final int BUFFER_SIZE = 20;
    protected static final String CONTINUE_AFTER_FATAL_ERROR = "http://apache.org/xml/features/continue-after-fatal-error";
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_NORMALIZATION = false;
    protected static final String DYNAMIC_VALIDATION = "http://apache.org/xml/features/validation/dynamic";
    private static final Hashtable EMPTY_TABLE = null;
    protected static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    public static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    public static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final Boolean[] FEATURE_DEFAULTS = null;
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS = "http://apache.org/xml/features/generate-synthetic-annotations";
    protected static final String HONOUR_ALL_SCHEMALOCATIONS = "http://apache.org/xml/features/honour-all-schemaLocations";
    protected static final String IDENTITY_CONSTRAINT_CHECKING = "http://apache.org/xml/features/validation/identity-constraint-checking";
    protected static final int ID_CONSTRAINT_NUM = 1;
    protected static final String ID_IDREF_CHECKING = "http://apache.org/xml/features/validation/id-idref-checking";
    protected static final String IGNORE_XSI_TYPE = "http://apache.org/xml/features/validation/schema/ignore-xsi-type-until-elemdecl";
    static final int INC_STACK_SIZE = 8;
    static final int INITIAL_STACK_SIZE = 8;
    protected static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    protected static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";
    protected static final String NAMESPACE_GROWTH = "http://apache.org/xml/features/namespace-growth";
    protected static final String NORMALIZE_DATA = "http://apache.org/xml/features/validation/schema/normalized-value";
    protected static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final String ROOT_ELEMENT_DECL = "http://apache.org/xml/properties/validation/schema/root-element-declaration";
    protected static final String ROOT_TYPE_DEF = "http://apache.org/xml/properties/validation/schema/root-type-definition";
    protected static final String SCHEMA_AUGMENT_PSVI = "http://apache.org/xml/features/validation/schema/augment-psvi";
    protected static final String SCHEMA_DV_FACTORY = "http://apache.org/xml/properties/internal/validation/schema/dv-factory";
    protected static final String SCHEMA_ELEMENT_DEFAULT = "http://apache.org/xml/features/validation/schema/element-default";
    protected static final String SCHEMA_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";
    protected static final String SCHEMA_LOCATION = "http://apache.org/xml/properties/schema/external-schemaLocation";
    protected static final String SCHEMA_NONS_LOCATION = "http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation";
    protected static final String SCHEMA_VALIDATION = "http://apache.org/xml/features/validation/schema";
    protected static final String STANDARD_URI_CONFORMANT_FEATURE = "http://apache.org/xml/features/standard-uri-conformant";
    public static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String TOLERATE_DUPLICATES = "http://apache.org/xml/features/internal/tolerate-duplicates";
    protected static final String UNPARSED_ENTITY_CHECKING = "http://apache.org/xml/features/validation/unparsed-entity-checking";
    protected static final String USE_GRAMMAR_POOL_ONLY = "http://apache.org/xml/features/internal/validation/schema/use-grammar-pool-only";
    protected static final String VALIDATE_ANNOTATIONS = "http://apache.org/xml/features/validate-annotations";
    protected static final String VALIDATION = "http://xml.org/sax/features/validation";
    protected static final String VALIDATION_MANAGER = "http://apache.org/xml/properties/internal/validation-manager";
    public static final String XMLGRAMMAR_POOL = "http://apache.org/xml/properties/internal/grammar-pool";
    static final XSAttributeDecl XSI_NIL = null;
    static final XSAttributeDecl XSI_NONAMESPACESCHEMALOCATION = null;
    static final XSAttributeDecl XSI_SCHEMALOCATION = null;
    static final XSAttributeDecl XSI_TYPE = null;
    private boolean fAppendBuffer;
    protected boolean fAugPSVI;
    protected final AugmentationsImpl fAugmentations;
    private final StringBuffer fBuffer;
    private final CMBuilder fCMBuilder;
    private XSCMValidator[] fCMStack;
    private int[][] fCMStateStack;
    private int[] fCurrCMState;
    private XSCMValidator fCurrentCM;
    private XSElementDecl fCurrentElemDecl;
    protected ElementPSVImpl fCurrentPSVI;
    private XSTypeDefinition fCurrentType;
    protected XMLString fDefaultValue;
    protected boolean fDoValidation;
    protected XMLDocumentHandler fDocumentHandler;
    protected XMLDocumentSource fDocumentSource;
    protected boolean fDynamicValidation;
    private XSElementDecl[] fElemDeclStack;
    private int fElementDepth;
    private final XMLString fEmptyXMLStr;
    protected boolean fEntityRef;
    protected XMLEntityResolver fEntityResolver;
    protected final Hashtable fExpandedLocationPairs;
    protected String fExternalNoNamespaceSchema;
    protected String fExternalSchemas;
    private boolean fFirstChunk;
    protected boolean fFullChecking;
    private final XSGrammarBucket fGrammarBucket;
    protected XMLGrammarPool fGrammarPool;
    private boolean fIDCChecking;
    protected boolean fIdConstraint;
    private int fIgnoreXSITypeDepth;
    protected boolean fInCDATA;
    protected Object fJaxpSchemaSource;
    protected final Hashtable fLocationPairs;
    private XMLLocator fLocator;
    protected XPathMatcherStack fMatcherStack;
    private int fNFullValidationDepth;
    private int fNNoneValidationDepth;
    protected boolean fNamespaceGrowth;
    private boolean fNil;
    private boolean[] fNilStack;
    protected boolean fNormalizeData;
    private final XMLString fNormalizedStr;
    private XSNotationDecl fNotation;
    private XSNotationDecl[] fNotationStack;
    private final XSSimpleType fQNameDV;
    private QName fRootElementDeclQName;
    private XSElementDecl fRootElementDeclaration;
    private XSTypeDefinition fRootTypeDefinition;
    private QName fRootTypeQName;
    private boolean fSawCharacters;
    private boolean fSawText;
    private boolean[] fSawTextStack;
    protected boolean fSchemaDynamicValidation;
    protected boolean fSchemaElementDefault;
    private final XMLSchemaLoader fSchemaLoader;
    private String fSchemaType;
    private int fSkipValidationDepth;
    private ValidationState fState4ApplyDefault;
    private ValidationState fState4XsiType;
    private boolean fStrictAssess;
    private boolean[] fStrictAssessStack;
    private boolean[] fStringContent;
    private boolean fSubElement;
    private boolean[] fSubElementStack;
    private final SubstitutionGroupHandler fSubGroupHandler;
    protected SymbolTable fSymbolTable;
    private final org.apache.xerces.xni.QName fTempQName;
    private boolean fTrailing;
    private XSTypeDefinition[] fTypeStack;
    private boolean fUnionType;
    protected final ArrayList fUnparsedLocations;
    protected boolean fUseGrammarPoolOnly;
    private ValidatedInfo fValidatedInfo;
    protected ValidationManager fValidationManager;
    private String fValidationRoot;
    protected ConfigurableValidationState fValidationState;
    protected ValueStoreCache fValueStoreCache;
    private short fWhiteSpace;
    protected final XSDDescription fXSDDescription;
    protected final XSIErrorReporter fXSIErrorReporter;
    private final CMNodeFactory nodeFactory;

    protected class KeyRefValueStore extends ValueStoreBase {
        protected ValueStoreBase fKeyValueStore;
        final /* synthetic */ XMLSchemaValidator this$0;

        public KeyRefValueStore(XMLSchemaValidator xMLSchemaValidator, KeyRef keyRef, KeyValueStore keyValueStore) {
        }

        @Override // org.apache.xerces.impl.xs.XMLSchemaValidator.ValueStoreBase
        public void endDocument() {
        }

        @Override // org.apache.xerces.impl.xs.XMLSchemaValidator.ValueStoreBase
        public void endDocumentFragment() {
        }
    }

    protected class KeyValueStore extends ValueStoreBase {
        final /* synthetic */ XMLSchemaValidator this$0;

        public KeyValueStore(XMLSchemaValidator xMLSchemaValidator, UniqueOrKey uniqueOrKey) {
        }

        @Override // org.apache.xerces.impl.xs.XMLSchemaValidator.ValueStoreBase
        protected void checkDuplicateValues() {
        }
    }

    protected static final class LocalIDKey {
        public int fDepth;
        public IdentityConstraint fId;

        public LocalIDKey() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public LocalIDKey(IdentityConstraint identityConstraint, int i) {
        }
    }

    protected static final class ShortVector {
        private short[] fData;
        private int fLength;

        public ShortVector() {
        }

        private void ensureCapacity(int i) {
        }

        public void add(short s) {
        }

        public void clear() {
        }

        public boolean contains(short s) {
        }

        public int length() {
        }

        public short valueAt(int i) {
        }

        public ShortVector(int i) {
        }
    }

    protected class UniqueValueStore extends ValueStoreBase {
        final /* synthetic */ XMLSchemaValidator this$0;

        public UniqueValueStore(XMLSchemaValidator xMLSchemaValidator, UniqueOrKey uniqueOrKey) {
        }

        @Override // org.apache.xerces.impl.xs.XMLSchemaValidator.ValueStoreBase
        protected void checkDuplicateValues() {
        }
    }

    protected class ValueStoreCache {
        protected final HashMap fGlobalIDConstraintMap;
        protected final Stack fGlobalMapStack;
        protected final HashMap fIdentityConstraint2ValueStoreMap;
        final LocalIDKey fLocalId;
        protected final ArrayList fValueStores;
        final /* synthetic */ XMLSchemaValidator this$0;

        public ValueStoreCache(XMLSchemaValidator xMLSchemaValidator) {
        }

        public void endDocument() {
        }

        public void endElement() {
        }

        public ValueStoreBase getGlobalValueStoreFor(IdentityConstraint identityConstraint) {
        }

        public ValueStoreBase getValueStoreFor(IdentityConstraint identityConstraint, int i) {
        }

        public void initValueStoresFor(XSElementDecl xSElementDecl, FieldActivator fieldActivator) {
        }

        public void startDocument() {
        }

        public void startElement() {
        }

        public String toString() {
        }

        public void transplant(IdentityConstraint identityConstraint, int i) {
        }
    }

    protected static class XPathMatcherStack {
        protected IntStack fContextStack;
        protected XPathMatcher[] fMatchers;
        protected int fMatchersCount;

        private void ensureMatcherCapacity() {
        }

        public void addMatcher(XPathMatcher xPathMatcher) {
        }

        public void clear() {
        }

        public XPathMatcher getMatcherAt(int i) {
        }

        public int getMatcherCount() {
        }

        public void popContext() {
        }

        public void pushContext() {
        }

        public int size() {
        }
    }

    static /* synthetic */ int access$000(XMLSchemaValidator xMLSchemaValidator) {
    }

    static /* synthetic */ void access$100(XMLSchemaValidator xMLSchemaValidator, IdentityConstraint identityConstraint) {
    }

    private void activateSelectorFor(IdentityConstraint identityConstraint) {
    }

    private String expectedStr(Vector vector) {
    }

    private boolean hasSchemaComponent(SchemaGrammar schemaGrammar, short s, org.apache.xerces.xni.QName qName) {
    }

    private void normalizeWhitespace(XMLString xMLString, boolean z) {
    }

    private void setLocationHints(XSDDescription xSDDescription, String[] strArr, SchemaGrammar schemaGrammar) {
    }

    @Override // org.apache.xerces.impl.xs.identity.FieldActivator
    public XPathMatcher activateField(Field field, int i) {
    }

    void addDefaultAttributes(org.apache.xerces.xni.QName qName, XMLAttributes xMLAttributes, XSAttributeGroupDecl xSAttributeGroupDecl) {
    }

    @Override // org.apache.xerces.impl.RevalidationHandler
    public boolean characterData(String str, Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    void checkElementMatchesRootElementDecl(XSElementDecl xSElementDecl, org.apache.xerces.xni.QName qName) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void doctypeDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }

    public void elementDefault(String str) {
    }

    Object elementLocallyValidComplexType(org.apache.xerces.xni.QName qName, Object obj) {
    }

    Object elementLocallyValidType(org.apache.xerces.xni.QName qName, Object obj) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void emptyElement(org.apache.xerces.xni.QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endDocument(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endElement(org.apache.xerces.xni.QName qName, Augmentations augmentations) throws XNIException {
    }

    final Augmentations endElementPSVI(boolean z, SchemaGrammar[] schemaGrammarArr, Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endGeneralEntity(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.identity.FieldActivator
    public void endValueScopeFor(IdentityConstraint identityConstraint, int i) {
    }

    void ensureStackCapacity() {
    }

    SchemaGrammar findSchemaGrammar(short s, String str, org.apache.xerces.xni.QName qName, org.apache.xerces.xni.QName qName2, XMLAttributes xMLAttributes) {
    }

    XSTypeDefinition getAndCheckXsiType(org.apache.xerces.xni.QName qName, String str, XMLAttributes xMLAttributes) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDocumentSource
    public XMLDocumentHandler getDocumentHandler() {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public XMLDocumentSource getDocumentSource() {
    }

    Augmentations getEmptyAugs(Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    @Override // org.apache.xerces.impl.xs.XSElementDeclHelper
    public XSElementDecl getGlobalElementDecl(org.apache.xerces.xni.QName qName) {
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

    boolean getXsiNil(org.apache.xerces.xni.QName qName, String str) {
    }

    XMLString handleCharacters(XMLString xMLString) {
    }

    void handleEndDocument() {
    }

    Augmentations handleEndElement(org.apache.xerces.xni.QName qName, Augmentations augmentations) {
    }

    void handleIgnorableWhitespace(XMLString xMLString) {
    }

    void handleStartDocument(XMLLocator xMLLocator, String str) {
    }

    Augmentations handleStartElement(org.apache.xerces.xni.QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    void processAttributes(org.apache.xerces.xni.QName qName, XMLAttributes xMLAttributes, XSAttributeGroupDecl xSAttributeGroupDecl) {
    }

    void processElementContent(org.apache.xerces.xni.QName qName) {
    }

    void processOneAttribute(org.apache.xerces.xni.QName qName, XMLAttributes xMLAttributes, int i, XSAttributeDecl xSAttributeDecl, XSAttributeUseImpl xSAttributeUseImpl, AttributePSVImpl attributePSVImpl) {
    }

    void processRootElementDeclQName(QName qName, org.apache.xerces.xni.QName qName2) {
    }

    void processRootTypeQName(QName qName) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    void reportSchemaError(String str, Object[] objArr) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
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

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startDocument(XMLLocator xMLLocator, String str, NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(org.apache.xerces.xni.QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startGeneralEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.identity.FieldActivator
    public void startValueScopeFor(IdentityConstraint identityConstraint, int i) {
    }

    void storeLocations(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void textDecl(String str, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void xmlDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }

    protected final class XSIErrorReporter {
        int[] fContext;
        int fContextCount;
        XMLErrorReporter fErrorReporter;
        Vector fErrors;
        final /* synthetic */ XMLSchemaValidator this$0;

        protected XSIErrorReporter(XMLSchemaValidator xMLSchemaValidator) {
        }

        public String[] mergeContext() {
        }

        public String[] popContext() {
        }

        public void pushContext() {
        }

        public void reportError(String str, String str2, Object[] objArr, short s) throws XNIException {
        }

        public void reset(XMLErrorReporter xMLErrorReporter) {
        }

        public void reportError(XMLLocator xMLLocator, String str, String str2, Object[] objArr, short s) throws XNIException {
        }
    }

    protected abstract class ValueStoreBase implements ValueStore {
        protected int fFieldCount;
        protected Field[] fFields;
        protected IdentityConstraint fIdentityConstraint;
        private ShortList fItemValueType;
        public Vector fItemValueTypes;
        private int fItemValueTypesLength;
        protected ShortList[] fLocalItemValueTypes;
        protected short[] fLocalValueTypes;
        protected Object[] fLocalValues;
        final StringBuffer fTempBuffer;
        private boolean fUseItemValueTypeVector;
        private boolean fUseValueTypeVector;
        private short fValueType;
        public ShortVector fValueTypes;
        private int fValueTypesLength;
        public final Vector fValues;
        protected int fValuesCount;
        final /* synthetic */ XMLSchemaValidator this$0;

        protected ValueStoreBase(XMLSchemaValidator xMLSchemaValidator, IdentityConstraint identityConstraint) {
        }

        private void addItemValueType(ShortList shortList) {
        }

        private void addValueType(short s) {
        }

        private ShortList getItemValueTypeAt(int i) {
        }

        private short getValueTypeAt(int i) {
        }

        private boolean itemValueTypeContains(ShortList shortList) {
        }

        private boolean valueTypeContains(short s) {
        }

        @Override // org.apache.xerces.impl.xs.identity.ValueStore
        public void addValue(Field field, boolean z, Object obj, short s, ShortList shortList) {
        }

        public void append(ValueStoreBase valueStoreBase) {
        }

        protected void checkDuplicateValues() {
        }

        public void clear() {
        }

        public boolean contains() {
        }

        public void endDocument() {
        }

        public void endDocumentFragment() {
        }

        public void endValueScope() {
        }

        @Override // org.apache.xerces.impl.xs.identity.ValueStore
        public void reportError(String str, Object[] objArr) {
        }

        public void startValueScope() {
        }

        protected String toString(Object[] objArr) {
        }

        protected String toString(Vector vector, int i, int i2) {
        }

        public String toString() {
        }

        public int contains(ValueStoreBase valueStoreBase) {
        }
    }

    private void setLocationHints(XSDDescription xSDDescription, String[] strArr, StringList stringList) {
    }

    private void normalizeWhitespace(String str, boolean z) {
    }
}
