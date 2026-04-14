package org.apache.xerces.impl.xs;

import java.lang.ref.SoftReference;
import java.util.Vector;
import org.apache.xerces.impl.dv.ValidatedInfo;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.xs.identity.IdentityConstraint;
import org.apache.xerces.impl.xs.util.SimpleLocator;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xerces.parsers.SAXParser;
import org.apache.xerces.util.SymbolHash;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.grammars.XSGrammar;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSAttributeDeclaration;
import org.apache.xerces.xs.XSAttributeGroupDefinition;
import org.apache.xerces.xs.XSElementDeclaration;
import org.apache.xerces.xs.XSIDCDefinition;
import org.apache.xerces.xs.XSModel;
import org.apache.xerces.xs.XSModelGroupDefinition;
import org.apache.xerces.xs.XSNamedMap;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSNotationDeclaration;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSParticle;
import org.apache.xerces.xs.XSTypeDefinition;
import org.apache.xerces.xs.XSWildcard;
import org.apache.xerces.xs.datatypes.ObjectList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SchemaGrammar implements XSGrammar, XSNamespaceItem {
    private static final int BASICSET_COUNT = 29;
    private static final int FULLSET_COUNT = 46;
    private static final boolean[] GLOBAL_COMP = null;
    private static final int GRAMMAR_XS = 1;
    private static final int GRAMMAR_XSI = 2;
    private static final int INC_SIZE = 16;
    private static final int INITIAL_SIZE = 16;
    private static final short MAX_COMP_IDX = 16;
    private static final int REDEFINED_GROUP_INIT_SIZE = 2;
    public static final BuiltinSchemaGrammar SG_SchemaNS = null;
    private static final BuiltinSchemaGrammar SG_SchemaNSExtended = null;
    public static final BuiltinSchemaGrammar SG_XSI = null;
    public static final XSSimpleType fAnySimpleType = null;
    public static final XSComplexTypeDecl fAnyType = null;
    SymbolHash fAllGlobalElemDecls;
    XSAnnotationImpl[] fAnnotations;
    private int fCTCount;
    private SimpleLocator[] fCTLocators;
    private XSComplexTypeDecl[] fComplexTypeDecls;
    private XSNamedMap[] fComponents;
    private ObjectList[] fComponentsExt;
    private SoftReference fDOMParser;
    private Vector fDocuments;
    boolean fFullChecked;
    SymbolHash fGlobalAttrDecls;
    SymbolHash fGlobalAttrDeclsExt;
    SymbolHash fGlobalAttrGrpDecls;
    SymbolHash fGlobalAttrGrpDeclsExt;
    SymbolHash fGlobalElemDecls;
    SymbolHash fGlobalElemDeclsExt;
    SymbolHash fGlobalGroupDecls;
    SymbolHash fGlobalGroupDeclsExt;
    SymbolHash fGlobalIDConstraintDecls;
    SymbolHash fGlobalIDConstraintDeclsExt;
    SymbolHash fGlobalNotationDecls;
    SymbolHash fGlobalNotationDeclsExt;
    SymbolHash fGlobalTypeDecls;
    SymbolHash fGlobalTypeDeclsExt;
    XSDDescription fGrammarDescription;
    Vector fImported;
    private boolean fIsImmutable;
    private Vector fLocations;
    int fNumAnnotations;
    private int fRGCount;
    private SimpleLocator[] fRGLocators;
    private XSGroupDecl[] fRedefinedGroupDecls;
    private SoftReference fSAXParser;
    private int fSubGroupCount;
    private XSElementDecl[] fSubGroups;
    private SymbolTable fSymbolTable;
    String fTargetNamespace;

    private static class BuiltinAttrDecl extends XSAttributeDecl {
        public BuiltinAttrDecl(String str, String str2, XSSimpleType xSSimpleType, short s) {
        }

        @Override // org.apache.xerces.impl.xs.XSAttributeDecl, org.apache.xerces.xs.XSAttributeDeclaration
        public XSAnnotation getAnnotation() {
        }

        @Override // org.apache.xerces.impl.xs.XSAttributeDecl, org.apache.xerces.xs.XSObject
        public XSNamespaceItem getNamespaceItem() {
        }

        @Override // org.apache.xerces.impl.xs.XSAttributeDecl
        public void reset() {
        }

        public void setValues(String str, String str2, XSSimpleType xSSimpleType, short s, short s2, ValidatedInfo validatedInfo, XSComplexTypeDecl xSComplexTypeDecl) {
        }
    }

    public static class BuiltinSchemaGrammar extends SchemaGrammar {
        private static final String EXTENDED_SCHEMA_FACTORY_CLASS = "org.apache.xerces.impl.dv.xs.ExtendedSchemaDVFactoryImpl";

        public BuiltinSchemaGrammar(int i, short s) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl, SimpleLocator simpleLocator) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public synchronized void addDocument(Object obj, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeDecl(XSAttributeDecl xSAttributeDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeDecl(XSAttributeDecl xSAttributeDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalElementDecl(XSElementDecl xSElementDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalElementDecl(XSElementDecl xSElementDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalElementDeclAll(XSElementDecl xSElementDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalGroupDecl(XSGroupDecl xSGroupDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalGroupDecl(XSGroupDecl xSGroupDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalNotationDecl(XSNotationDecl xSNotationDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalNotationDecl(XSNotationDecl xSNotationDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalSimpleTypeDecl(XSSimpleType xSSimpleType) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalSimpleTypeDecl(XSSimpleType xSSimpleType, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addRedefinedGroupDecl(XSGroupDecl xSGroupDecl, XSGroupDecl xSGroupDecl2, SimpleLocator simpleLocator) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        synchronized DOMParser getDOMParser() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar, org.apache.xerces.xni.grammars.Grammar
        public XMLGrammarDescription getGrammarDescription() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        synchronized SAXParser getSAXParser() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void setImportedGrammars(Vector vector) {
        }
    }

    public static final class Schema4Annotations extends SchemaGrammar {
        public static final Schema4Annotations INSTANCE = null;

        private Schema4Annotations() {
        }

        private XSElementDecl createAnnotationElementDecl(String str) {
        }

        private XSParticleDecl createAnyLaxWildcardParticle() {
        }

        private XSParticleDecl createChoiceElementParticle(XSElementDecl xSElementDecl) {
        }

        private XSParticleDecl createUnboundedAnyWildcardSequenceParticle() {
        }

        private XSParticleDecl createUnboundedModelGroupParticle() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl, SimpleLocator simpleLocator) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public synchronized void addDocument(Object obj, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeDecl(XSAttributeDecl xSAttributeDecl) {
        }

        public void addGlobalAttributeDecl(XSAttributeGroupDecl xSAttributeGroupDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalElementDecl(XSElementDecl xSElementDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalElementDecl(XSElementDecl xSElementDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalElementDeclAll(XSElementDecl xSElementDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalGroupDecl(XSGroupDecl xSGroupDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalGroupDecl(XSGroupDecl xSGroupDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalNotationDecl(XSNotationDecl xSNotationDecl) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalNotationDecl(XSNotationDecl xSNotationDecl, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalSimpleTypeDecl(XSSimpleType xSSimpleType) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalSimpleTypeDecl(XSSimpleType xSSimpleType, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition, String str) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void addRedefinedGroupDecl(XSGroupDecl xSGroupDecl, XSGroupDecl xSGroupDecl2, SimpleLocator simpleLocator) {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        synchronized DOMParser getDOMParser() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar, org.apache.xerces.xni.grammars.Grammar
        public XMLGrammarDescription getGrammarDescription() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        synchronized SAXParser getSAXParser() {
        }

        @Override // org.apache.xerces.impl.xs.SchemaGrammar
        public void setImportedGrammars(Vector vector) {
        }
    }

    private static class XSAnyType extends XSComplexTypeDecl {
        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl, org.apache.xerces.xs.XSComplexTypeDefinition
        public XSObjectList getAnnotations() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl
        public XSAttributeGroupDecl getAttrGrp() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl, org.apache.xerces.xs.XSComplexTypeDefinition
        public XSObjectList getAttributeUses() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl, org.apache.xerces.xs.XSComplexTypeDefinition
        public XSWildcard getAttributeWildcard() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl, org.apache.xerces.xs.XSObject
        public XSNamespaceItem getNamespaceItem() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl, org.apache.xerces.xs.XSComplexTypeDefinition
        public XSParticle getParticle() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl
        public void reset() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl
        public void setContainsTypeID() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl
        public void setIsAbstractType() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl
        public void setIsAnonymous() {
        }

        @Override // org.apache.xerces.impl.xs.XSComplexTypeDecl
        public void setName(String str) {
        }

        public void setValues(String str, String str2, XSTypeDefinition xSTypeDefinition, short s, short s2, short s3, short s4, boolean z, XSAttributeGroupDecl xSAttributeGroupDecl, XSSimpleType xSSimpleType, XSParticleDecl xSParticleDecl) {
        }
    }

    protected SchemaGrammar() {
    }

    public static SchemaGrammar getS4SGrammar(short s) {
    }

    static final XSComplexTypeDecl[] resize(XSComplexTypeDecl[] xSComplexTypeDeclArr, int i) {
    }

    public void addAnnotation(XSAnnotationImpl xSAnnotationImpl) {
    }

    public void addComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl, SimpleLocator simpleLocator) {
    }

    public synchronized void addDocument(Object obj, String str) {
    }

    public void addGlobalAttributeDecl(XSAttributeDecl xSAttributeDecl) {
    }

    public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl) {
    }

    public void addGlobalComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl) {
    }

    public void addGlobalElementDecl(XSElementDecl xSElementDecl) {
    }

    public void addGlobalElementDeclAll(XSElementDecl xSElementDecl) {
    }

    public void addGlobalGroupDecl(XSGroupDecl xSGroupDecl) {
    }

    public void addGlobalNotationDecl(XSNotationDecl xSNotationDecl) {
    }

    public void addGlobalSimpleTypeDecl(XSSimpleType xSSimpleType) {
    }

    public void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition) {
    }

    public final void addIDConstraintDecl(XSElementDecl xSElementDecl, IdentityConstraint identityConstraint) {
    }

    public void addRedefinedGroupDecl(XSGroupDecl xSGroupDecl, XSGroupDecl xSGroupDecl2, SimpleLocator simpleLocator) {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSAttributeDeclaration getAttributeDeclaration(String str) {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSAttributeGroupDefinition getAttributeGroup(String str) {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public synchronized XSNamedMap getComponents(short s) {
    }

    public synchronized ObjectList getComponentsExt(short s) {
    }

    synchronized DOMParser getDOMParser() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public StringList getDocumentLocations() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSElementDeclaration getElementDeclaration(String str) {
    }

    public final XSAttributeDecl getGlobalAttributeDecl(String str) {
    }

    public final XSAttributeGroupDecl getGlobalAttributeGroupDecl(String str) {
    }

    public final XSElementDecl getGlobalElementDecl(String str) {
    }

    public final XSGroupDecl getGlobalGroupDecl(String str) {
    }

    public final XSNotationDecl getGlobalNotationDecl(String str) {
    }

    public final XSTypeDefinition getGlobalTypeDecl(String str) {
    }

    @Override // org.apache.xerces.xni.grammars.Grammar
    public XMLGrammarDescription getGrammarDescription() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSIDCDefinition getIDCDefinition(String str) {
    }

    public final IdentityConstraint getIDConstraintDecl(String str) {
    }

    public Vector getImportedGrammars() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSModelGroupDefinition getModelGroupDefinition(String str) {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSNotationDeclaration getNotationDeclaration(String str) {
    }

    final SimpleLocator[] getRGLocators() {
    }

    final XSGroupDecl[] getRedefinedGroupDecls() {
    }

    synchronized SAXParser getSAXParser() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public String getSchemaNamespace() {
    }

    final XSElementDecl[] getSubstitutionGroups() {
    }

    public final String getTargetNamespace() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItem
    public XSTypeDefinition getTypeDefinition(String str) {
    }

    final SimpleLocator[] getUncheckedCTLocators() {
    }

    final XSComplexTypeDecl[] getUncheckedComplexTypeDecls() {
    }

    public final boolean hasIDConstraints() {
    }

    public boolean isImmutable() {
    }

    public boolean isNamespaceAware() {
    }

    public synchronized void removeDocument(int i) {
    }

    public synchronized void resetComponents() {
    }

    public void setImmutable(boolean z) {
    }

    public void setImportedGrammars(Vector vector) {
    }

    final void setUncheckedTypeNum(int i) {
    }

    @Override // org.apache.xerces.xni.grammars.XSGrammar
    public XSModel toXSModel() {
    }

    public final XSAttributeDecl getGlobalAttributeDecl(String str, String str2) {
    }

    public final XSAttributeGroupDecl getGlobalAttributeGroupDecl(String str, String str2) {
    }

    public final XSElementDecl getGlobalElementDecl(String str, String str2) {
    }

    public final XSGroupDecl getGlobalGroupDecl(String str, String str2) {
    }

    public final XSNotationDecl getGlobalNotationDecl(String str, String str2) {
    }

    public final XSTypeDefinition getGlobalTypeDecl(String str, String str2) {
    }

    public final IdentityConstraint getIDConstraintDecl(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.grammars.XSGrammar
    public XSModel toXSModel(XSGrammar[] xSGrammarArr) {
    }

    static final XSGroupDecl[] resize(XSGroupDecl[] xSGroupDeclArr, int i) {
    }

    public void addGlobalAttributeDecl(XSAttributeDecl xSAttributeDecl, String str) {
    }

    public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl xSAttributeGroupDecl, String str) {
    }

    public void addGlobalComplexTypeDecl(XSComplexTypeDecl xSComplexTypeDecl, String str) {
    }

    public void addGlobalElementDecl(XSElementDecl xSElementDecl, String str) {
    }

    public void addGlobalGroupDecl(XSGroupDecl xSGroupDecl, String str) {
    }

    public void addGlobalNotationDecl(XSNotationDecl xSNotationDecl, String str) {
    }

    public final void addIDConstraintDecl(XSElementDecl xSElementDecl, IdentityConstraint identityConstraint, String str) {
    }

    public void addGlobalSimpleTypeDecl(XSSimpleType xSSimpleType, String str) {
    }

    static final XSElementDecl[] resize(XSElementDecl[] xSElementDeclArr, int i) {
    }

    public void addGlobalTypeDecl(XSTypeDefinition xSTypeDefinition, String str) {
    }

    static final SimpleLocator[] resize(SimpleLocator[] simpleLocatorArr, int i) {
    }

    public SchemaGrammar(String str, XSDDescription xSDDescription, SymbolTable symbolTable) {
    }

    public SchemaGrammar(SchemaGrammar schemaGrammar) {
    }
}
