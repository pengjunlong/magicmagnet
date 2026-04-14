package org.apache.xerces.impl.xs.traversers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.dv.SchemaDVFactory;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.impl.xs.XSAttributeDecl;
import org.apache.xerces.impl.xs.XSAttributeGroupDecl;
import org.apache.xerces.impl.xs.XSComplexTypeDecl;
import org.apache.xerces.impl.xs.XSDDescription;
import org.apache.xerces.impl.xs.XSDeclarationPool;
import org.apache.xerces.impl.xs.XSElementDecl;
import org.apache.xerces.impl.xs.XSGrammarBucket;
import org.apache.xerces.impl.xs.XSGroupDecl;
import org.apache.xerces.impl.xs.XSModelGroupImpl;
import org.apache.xerces.impl.xs.XSNotationDecl;
import org.apache.xerces.impl.xs.XSParticleDecl;
import org.apache.xerces.impl.xs.identity.IdentityConstraint;
import org.apache.xerces.impl.xs.opti.SchemaDOMParser;
import org.apache.xerces.impl.xs.util.SimpleLocator;
import org.apache.xerces.impl.xs.util.XSInputSource;
import org.apache.xerces.parsers.XML11Configuration;
import org.apache.xerces.util.DOMInputSource;
import org.apache.xerces.util.ErrorHandlerWrapper;
import org.apache.xerces.util.SAXInputSource;
import org.apache.xerces.util.StAXInputSource;
import org.apache.xerces.util.SymbolHash;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParseException;
import org.apache.xerces.xs.XSAttributeDeclaration;
import org.apache.xerces.xs.XSAttributeGroupDefinition;
import org.apache.xerces.xs.XSAttributeUse;
import org.apache.xerces.xs.XSElementDeclaration;
import org.apache.xerces.xs.XSModelGroup;
import org.apache.xerces.xs.XSModelGroupDefinition;
import org.apache.xerces.xs.XSObject;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSParticle;
import org.apache.xerces.xs.XSSimpleTypeDefinition;
import org.apache.xerces.xs.XSTypeDefinition;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSDHandler {
    protected static final String ALLOW_JAVA_ENCODINGS = "http://apache.org/xml/features/allow-java-encodings";
    static final int ATTRIBUTEGROUP_TYPE = 2;
    static final int ATTRIBUTE_TYPE = 1;
    private static final String[] CIRCULAR_CODES = null;
    private static final String[] COMP_TYPE = null;
    protected static final String CONTINUE_AFTER_FATAL_ERROR = "http://apache.org/xml/features/continue-after-fatal-error";
    protected static final boolean DEBUG_NODE_POOL = false;
    protected static final String DISALLOW_DOCTYPE = "http://apache.org/xml/features/disallow-doctype-decl";
    static final int ELEMENT_TYPE = 3;
    private static final String[] ELE_ERROR_CODES = null;
    private static final Hashtable EMPTY_TABLE = null;
    protected static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    public static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    public static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS = "http://apache.org/xml/features/generate-synthetic-annotations";
    static final int GROUP_TYPE = 4;
    protected static final String HONOUR_ALL_SCHEMALOCATIONS = "http://apache.org/xml/features/honour-all-schemaLocations";
    static final int IDENTITYCONSTRAINT_TYPE = 5;
    private static final int INC_KEYREF_STACK_AMOUNT = 2;
    private static final int INC_STACK_SIZE = 10;
    private static final int INIT_KEYREF_STACK = 2;
    private static final int INIT_STACK_SIZE = 30;
    protected static final String JAXP_SCHEMA_SOURCE = "http://java.sun.com/xml/jaxp/properties/schemaSource";
    protected static final String LOCALE = "http://apache.org/xml/properties/locale";
    protected static final String NAMESPACE_GROWTH = "http://apache.org/xml/features/namespace-growth";
    private static final String NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    static final int NOTATION_TYPE = 6;
    private static final String[][] NS_ERROR_CODES = null;
    public static final String REDEF_IDENTIFIER = "_fn3dktizrknc9pi";
    protected static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    protected static final String STANDARD_URI_CONFORMANT_FEATURE = "http://apache.org/xml/features/standard-uri-conformant";
    protected static final String STRING_INTERNING = "http://xml.org/sax/features/string-interning";
    public static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String TOLERATE_DUPLICATES = "http://apache.org/xml/features/internal/tolerate-duplicates";
    static final int TYPEDECL_TYPE = 7;
    protected static final String VALIDATE_ANNOTATIONS = "http://apache.org/xml/features/validate-annotations";
    protected static final String VALIDATION = "http://xml.org/sax/features/validation";
    public static final String XMLGRAMMAR_POOL = "http://apache.org/xml/properties/internal/grammar-pool";
    protected static final String XMLSCHEMA_VALIDATION = "http://apache.org/xml/features/validation/schema";
    private int[] fAllContext;
    private Vector fAllTNSs;
    XML11Configuration fAnnotationValidator;
    private XSAttributeChecker fAttributeChecker;
    XSDAttributeGroupTraverser fAttributeGroupTraverser;
    XSDAttributeTraverser fAttributeTraverser;
    XSDComplexTypeTraverser fComplexTypeTraverser;
    SchemaDVFactory fDVFactory;
    protected XSDeclarationPool fDeclPool;
    private Hashtable fDependencyMap;
    private Hashtable fDoc2SystemId;
    private Hashtable fDoc2XSDocumentMap;
    XSDElementTraverser fElementTraverser;
    private XMLEntityResolver fEntityResolver;
    private XMLErrorReporter fErrorReporter;
    SymbolHash fGlobalAttrDecls;
    SymbolHash fGlobalAttrGrpDecls;
    SymbolHash fGlobalElemDecls;
    SymbolHash fGlobalGroupDecls;
    SymbolHash fGlobalIDConstraintDecls;
    SymbolHash fGlobalNotationDecls;
    SymbolHash fGlobalTypeDecls;
    private XSGrammarBucket fGrammarBucket;
    XSAnnotationGrammarPool fGrammarBucketAdapter;
    private XMLGrammarPool fGrammarPool;
    XSDGroupTraverser fGroupTraverser;
    Hashtable fHiddenNodes;
    private boolean fHonourAllSchemaLocations;
    private Hashtable fImportMap;
    private XSElementDecl[] fKeyrefElems;
    private String[][] fKeyrefNamespaceContext;
    private int fKeyrefStackPos;
    XSDKeyrefTraverser fKeyrefTraverser;
    private Element[] fKeyrefs;
    private XSDocumentInfo[] fKeyrefsMapXSDocumentInfo;
    private boolean fLastSchemaWasDuplicate;
    private String[][] fLocalElemNamespaceContext;
    private int fLocalElemStackPos;
    private Element[] fLocalElementDecl;
    private XSDocumentInfo[] fLocalElementDecl_schema;
    private Hashtable fLocationPairs;
    boolean fNamespaceGrowth;
    protected Hashtable fNotationRegistry;
    XSDNotationTraverser fNotationTraverser;
    private XSObject[] fParent;
    private XSParticleDecl[] fParticle;
    private Hashtable fRedefine2NSSupport;
    private Hashtable fRedefine2XSDMap;
    private Hashtable fRedefinedRestrictedAttributeGroupRegistry;
    private Hashtable fRedefinedRestrictedGroupRegistry;
    private Vector fReportedTNS;
    private XSDocumentInfo fRoot;
    private XSDDescription fSchemaGrammarDescription;
    SchemaDOMParser fSchemaParser;
    XSDSimpleTypeTraverser fSimpleTypeTraverser;
    StAXSchemaParser fStAXSchemaParser;
    private SymbolTable fSymbolTable;
    boolean fTolerateDuplicates;
    private Hashtable fTraversed;
    XSDUniqueOrKeyTraverser fUniqueOrKeyTraverser;
    private Hashtable fUnparsedAttributeGroupRegistry;
    private Hashtable fUnparsedAttributeGroupRegistrySub;
    private Hashtable fUnparsedAttributeRegistry;
    private Hashtable fUnparsedAttributeRegistrySub;
    private Hashtable fUnparsedElementRegistry;
    private Hashtable fUnparsedElementRegistrySub;
    private Hashtable fUnparsedGroupRegistry;
    private Hashtable fUnparsedGroupRegistrySub;
    private Hashtable fUnparsedIdentityConstraintRegistry;
    private Hashtable fUnparsedIdentityConstraintRegistrySub;
    private Hashtable fUnparsedNotationRegistry;
    private Hashtable fUnparsedNotationRegistrySub;
    private Hashtable[] fUnparsedRegistriesExt;
    private Hashtable fUnparsedTypeRegistry;
    private Hashtable fUnparsedTypeRegistrySub;
    private boolean fValidateAnnotations;
    XSDWildcardTraverser fWildCardTraverser;
    SchemaContentHandler fXSContentHandler;
    private Hashtable fXSDocumentInfoRegistry;
    private SimpleLocator xl;

    private static final class SAX2XNIUtil extends ErrorHandlerWrapper {
        private SAX2XNIUtil() {
        }

        public static XMLParseException createXMLParseException0(SAXParseException sAXParseException) {
        }

        public static XNIException createXNIException0(SAXException sAXException) {
        }
    }

    private static class XSAnnotationGrammarPool implements XMLGrammarPool {
        private XSGrammarBucket fGrammarBucket;
        private Grammar[] fInitialGrammarSet;

        private XSAnnotationGrammarPool() {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void cacheGrammars(String str, Grammar[] grammarArr) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void clear() {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void lockPool() {
        }

        public void refreshGrammars(XSGrammarBucket xSGrammarBucket) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public Grammar retrieveGrammar(XMLGrammarDescription xMLGrammarDescription) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public Grammar[] retrieveInitialGrammarSet(String str) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void unlockPool() {
        }

        /* synthetic */ XSAnnotationGrammarPool(C17981 c17981) {
        }
    }

    private static class XSDKey {
        String referNS;
        short referType;
        String systemId;

        XSDKey(String str, short s, String str2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public XSDHandler() {
    }

    private void addGlobalAttributeDecls(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGlobalAttributeGroupDecls(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGlobalComponent(XSObject xSObject, XSDDescription xSDDescription) {
    }

    private void addGlobalComponents(Vector vector, Hashtable hashtable) {
    }

    private void addGlobalElementDecls(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGlobalGroupDecls(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGlobalNotationDecls(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGlobalTypeDecls(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGrammarComponents(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addGrammars(Vector vector) {
    }

    private void addImportList(SchemaGrammar schemaGrammar, Vector vector, Vector vector2) {
    }

    private void addNamespaceDependency(String str, String str2, Vector vector) {
    }

    private void addNewGrammarComponents(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addNewGrammarLocations(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addNewImportedGrammars(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
    }

    private void addRelatedAttribute(XSAttributeDeclaration xSAttributeDeclaration, Vector vector, String str, Hashtable hashtable) {
    }

    private void addRelatedElement(XSElementDeclaration xSElementDeclaration, Vector vector, String str, Hashtable hashtable) {
    }

    private void addRelatedType(XSTypeDefinition xSTypeDefinition, Vector vector, String str, Hashtable hashtable) {
    }

    private boolean canAddComponent(XSObject xSObject, XSDDescription xSDDescription) {
    }

    private boolean canAddComponents(Vector vector) {
    }

    private int changeRedefineGroup(String str, String str2, String str3, Element element, XSDocumentInfo xSDocumentInfo) {
    }

    private boolean containedImportedGrammar(Vector vector, SchemaGrammar schemaGrammar) {
    }

    private void createAnnotationValidator() {
    }

    private SchemaGrammar createGrammarFrom(SchemaGrammar schemaGrammar) {
    }

    private void createTraversers() {
    }

    private String doc2SystemId(Element element) {
    }

    private String emptyString2Null(String str) {
    }

    private boolean existingGrammars(Vector vector) {
    }

    private Vector expandComponents(XSObject[] xSObjectArr, Hashtable hashtable) {
    }

    private Vector expandGrammars(SchemaGrammar[] schemaGrammarArr) {
    }

    private void expandImportList(String str, Vector vector) {
    }

    private void expandRelatedAttributeComponents(XSAttributeDeclaration xSAttributeDeclaration, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedAttributeGroupComponents(XSAttributeGroupDefinition xSAttributeGroupDefinition, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedAttributeUseComponents(XSAttributeUse xSAttributeUse, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedAttributeUsesComponents(XSObjectList xSObjectList, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedComplexTypeComponents(XSComplexTypeDecl xSComplexTypeDecl, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedComponents(XSObject xSObject, Vector vector, Hashtable hashtable) {
    }

    private void expandRelatedElementComponents(XSElementDeclaration xSElementDeclaration, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedModelGroupComponents(XSModelGroup xSModelGroup, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedModelGroupDefinitionComponents(XSModelGroupDefinition xSModelGroupDefinition, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedParticleComponents(XSParticle xSParticle, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedSimpleTypeComponents(XSSimpleTypeDefinition xSSimpleTypeDefinition, Vector vector, String str, Hashtable hashtable) {
    }

    private void expandRelatedTypeComponents(XSTypeDefinition xSTypeDefinition, Vector vector, String str, Hashtable hashtable) {
    }

    private Vector findDependentNamespaces(String str, Hashtable hashtable) {
    }

    private String findQName(String str, XSDocumentInfo xSDocumentInfo) {
    }

    private XSDocumentInfo findXSDocumentForDecl(XSDocumentInfo xSDocumentInfo, Element element, XSDocumentInfo xSDocumentInfo2) {
    }

    private XSAttributeDecl getGlobalAttributeDecl(String str) {
    }

    private XSAttributeGroupDecl getGlobalAttributeGroupDecl(String str) {
    }

    private XSElementDecl getGlobalElementDecl(String str) {
    }

    private XSGroupDecl getGlobalGroupDecl(String str) {
    }

    private XSNotationDecl getGlobalNotationDecl(String str) {
    }

    private XSTypeDefinition getGlobalTypeDecl(String str) {
    }

    private IdentityConstraint getIDConstraintDecl(String str) {
    }

    private Element getSchemaDocument(String str, XMLInputSource xMLInputSource, boolean z, short s, Element element) {
    }

    private Element getSchemaDocument0(XSDKey xSDKey, String str, Element element) {
    }

    private Element getSchemaDocument1(boolean z, boolean z2, XMLInputSource xMLInputSource, Element element, IOException iOException) {
    }

    private SchemaGrammar getSchemaGrammar(XSDDescription xSDDescription) {
    }

    private boolean isExistingGrammar(XSDDescription xSDDescription, boolean z) {
    }

    private final boolean needReportTNSError(String str) {
    }

    private boolean nonAnnotationContent(Element element) {
    }

    private String null2EmptyString(String str) {
    }

    private boolean removeParticle(XSModelGroupImpl xSModelGroupImpl, XSParticleDecl xSParticleDecl) {
    }

    private void renameRedefiningComponents(XSDocumentInfo xSDocumentInfo, Element element, String str, String str2, String str3) {
    }

    private void reportSharingError(String str, String str2) {
    }

    private Element resolveSchema(XSDDescription xSDDescription, boolean z, Element element, boolean z2) {
    }

    private XMLInputSource resolveSchemaSource(XSDDescription xSDDescription, boolean z, Element element, boolean z2) {
    }

    private void setSchemasVisible(XSDocumentInfo xSDocumentInfo) {
    }

    private void updateImportDependencies(Hashtable hashtable) {
    }

    private void updateImportList(Vector vector, Vector vector2) {
    }

    private void updateImportListFor(SchemaGrammar schemaGrammar) {
    }

    private void updateImportListWith(SchemaGrammar schemaGrammar) {
    }

    private void validateAnnotations(ArrayList arrayList) {
    }

    void addGlobalAttributeDecl(XSAttributeDecl xSAttributeDecl) {
    }

    void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl) {
    }

    void addGlobalElementDecl(XSElementDecl xSElementDecl) {
    }

    void addGlobalGroupDecl(XSGroupDecl xSGroupDecl) {
    }

    void addGlobalNotationDecl(XSNotationDecl xSNotationDecl) {
    }

    void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition) {
    }

    void addIDConstraintDecl(IdentityConstraint identityConstraint) {
    }

    protected void buildGlobalNameRegistries() {
    }

    void checkForDuplicateNames(String str, int i, Hashtable hashtable, Hashtable hashtable2, Element element, XSDocumentInfo xSDocumentInfo) {
    }

    protected XSDocumentInfo constructTrees(Element element, String str, XSDDescription xSDDescription, boolean z) {
    }

    public SimpleLocator element2Locator(Element element) {
    }

    void fillInLocalElemInfo(Element element, XSDocumentInfo xSDocumentInfo, int i, XSObject xSObject, XSParticleDecl xSParticleDecl) {
    }

    protected SchemaGrammar findGrammar(XSDDescription xSDDescription, boolean z) {
    }

    protected Object getGlobalDecl(XSDocumentInfo xSDocumentInfo, int i, QName qName, Element element) {
    }

    protected Object getGlobalDeclFromGrammar(SchemaGrammar schemaGrammar, int i, String str) {
    }

    SchemaGrammar getGrammar(String str) {
    }

    Object getGrpOrAttrGrpRedefinedByRestriction(int i, QName qName, XSDocumentInfo xSDocumentInfo, Element element) {
    }

    protected Hashtable getIDRegistry() {
    }

    protected Hashtable getIDRegistry_sub() {
    }

    public SchemaGrammar parseSchema(XMLInputSource xMLInputSource, XSDDescription xSDDescription, Hashtable hashtable) throws IOException {
    }

    void prepareForParse() {
    }

    void prepareForTraverse() {
    }

    void reportSchemaError(String str, Object[] objArr, Element element) {
    }

    void reportSchemaWarning(String str, Object[] objArr, Element element) {
    }

    public void reset(XMLComponentManager xMLComponentManager) {
    }

    protected void resolveKeyRefs() {
    }

    public String schemaDocument2SystemId(XSDocumentInfo xSDocumentInfo) {
    }

    public void setDVFactory(SchemaDVFactory schemaDVFactory) {
    }

    public void setDeclPool(XSDeclarationPool xSDeclarationPool) {
    }

    public void setGenerateSyntheticAnnotations(boolean z) {
    }

    protected void storeKeyRef(Element element, XSDocumentInfo xSDocumentInfo, XSElementDecl xSElementDecl) {
    }

    protected Object traverseGlobalDecl(int i, Element element, XSDocumentInfo xSDocumentInfo, SchemaGrammar schemaGrammar) {
    }

    void traverseLocalElements() {
    }

    protected void traverseSchemas(ArrayList arrayList) {
    }

    void reportSchemaError(String str, Object[] objArr, Element element, Exception exc) {
    }

    void reportSchemaWarning(String str, Object[] objArr, Element element, Exception exc) {
    }

    public boolean element2Locator(Element element, SimpleLocator simpleLocator) {
    }

    private void updateImportList(SchemaGrammar schemaGrammar, Vector vector, Vector vector2) {
    }

    protected Object getGlobalDeclFromGrammar(SchemaGrammar schemaGrammar, int i, String str, String str2) {
    }

    private Element getSchemaDocument(String str, SAXInputSource sAXInputSource, boolean z, short s, Element element) {
    }

    private Element resolveSchema(XMLInputSource xMLInputSource, XSDDescription xSDDescription, boolean z, Element element) {
    }

    void checkForDuplicateNames(String str, int i, Element element) {
    }

    protected Object getGlobalDecl(String str, int i) {
    }

    private Element getSchemaDocument(String str, DOMInputSource dOMInputSource, boolean z, short s, Element element) {
    }

    private Element getSchemaDocument(String str, StAXInputSource stAXInputSource, boolean z, short s, Element element) {
    }

    public XSDHandler(XSGrammarBucket xSGrammarBucket) {
    }

    private Element getSchemaDocument(XSInputSource xSInputSource, XSDDescription xSDDescription) {
    }
}
