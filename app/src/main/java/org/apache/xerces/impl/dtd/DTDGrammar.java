package org.apache.xerces.impl.dtd;

import java.util.Hashtable;
import org.apache.xerces.impl.dtd.models.CMNode;
import org.apache.xerces.impl.dtd.models.ContentModelValidator;
import org.apache.xerces.impl.dv.DatatypeValidator;
import org.apache.xerces.impl.validation.EntityState;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLDTDContentModelHandler;
import org.apache.xerces.xni.XMLDTDHandler;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.parser.XMLDTDContentModelSource;
import org.apache.xerces.xni.parser.XMLDTDSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DTDGrammar implements XMLDTDHandler, XMLDTDContentModelHandler, EntityState, Grammar {
    private static final int CHUNK_MASK = 255;
    private static final int CHUNK_SHIFT = 8;
    private static final int CHUNK_SIZE = 256;
    private static final boolean DEBUG = false;
    private static final int INITIAL_CHUNK_COUNT = 4;
    private static final short LIST_FLAG = 128;
    private static final short LIST_MASK = -129;
    public static final int TOP_LEVEL_SCOPE = -1;
    protected final XMLAttributeDecl fAttributeDecl;
    private int fAttributeDeclCount;
    private DatatypeValidator[][] fAttributeDeclDatatypeValidator;
    private short[][] fAttributeDeclDefaultType;
    private String[][] fAttributeDeclDefaultValue;
    private String[][][] fAttributeDeclEnumeration;
    private int[][] fAttributeDeclIsExternal;
    private QName[][] fAttributeDeclName;
    private int[][] fAttributeDeclNextAttributeDeclIndex;
    private String[][] fAttributeDeclNonNormalizedDefaultValue;
    private short[][] fAttributeDeclType;
    private XMLContentSpec fContentSpec;
    private int fContentSpecCount;
    private Object[][] fContentSpecOtherValue;
    private short[][] fContentSpecType;
    private Object[][] fContentSpecValue;
    protected int fCurrentAttributeIndex;
    protected int fCurrentElementIndex;
    protected XMLDTDContentModelSource fDTDContentModelSource;
    protected XMLDTDSource fDTDSource;
    private int fDepth;
    private XMLElementDecl fElementDecl;
    private ContentModelValidator[][] fElementDeclContentModelValidator;
    private int[][] fElementDeclContentSpecIndex;
    private int fElementDeclCount;
    private int[][] fElementDeclFirstAttributeDeclIndex;
    private int[][] fElementDeclIsExternal;
    private int[][] fElementDeclLastAttributeDeclIndex;
    private QName[][] fElementDeclName;
    Hashtable fElementDeclTab;
    private short[][] fElementDeclType;
    private QNameHashtable fElementIndexMap;
    private String[][] fEntityBaseSystemId;
    private int fEntityCount;
    private XMLEntityDecl fEntityDecl;
    private byte[][] fEntityInExternal;
    private QNameHashtable fEntityIndexMap;
    private byte[][] fEntityIsPE;
    private String[][] fEntityName;
    private String[][] fEntityNotation;
    private String[][] fEntityPublicId;
    private String[][] fEntitySystemId;
    private String[][] fEntityValue;
    private int fEpsilonIndex;
    protected XMLDTDDescription fGrammarDescription;
    private boolean fIsImmutable;
    private int fLeafCount;
    private boolean fMixed;
    private int[] fNodeIndexStack;
    private String[][] fNotationBaseSystemId;
    private int fNotationCount;
    private QNameHashtable fNotationIndexMap;
    private String[][] fNotationName;
    private String[][] fNotationPublicId;
    private String[][] fNotationSystemId;
    private short[] fOpStack;
    private int fPEDepth;
    private boolean[] fPEntityStack;
    private int[] fPrevNodeIndexStack;
    private final QName fQName;
    private final QName fQName2;
    protected boolean fReadingExternalDTD;
    private XMLSimpleType fSimpleType;
    private SymbolTable fSymbolTable;
    int nodeIndex;
    int prevNodeIndex;
    int valueIndex;

    private static class ChildrenList {
        public int length;
        public QName[] qname;
        public int[] type;
    }

    protected static final class QNameHashtable {
        private static final int HASHTABLE_SIZE = 101;
        private static final int INITIAL_BUCKET_SIZE = 4;
        private Object[][] fHashTable;

        protected QNameHashtable() {
        }

        public int get(String str) {
        }

        public void put(String str, int i) {
        }
    }

    public DTDGrammar(SymbolTable symbolTable, XMLDTDDescription xMLDTDDescription) {
    }

    private void appendContentSpec(XMLContentSpec xMLContentSpec, StringBuffer stringBuffer, boolean z, int i) {
    }

    private final CMNode buildSyntaxTree(int i, XMLContentSpec xMLContentSpec) {
    }

    private void contentSpecTree(int i, XMLContentSpec xMLContentSpec, ChildrenList childrenList) {
    }

    private synchronized ContentModelValidator createChildModel(int i) {
    }

    private void ensureAttributeDeclCapacity(int i) {
    }

    private void ensureContentSpecCapacity(int i) {
    }

    private void ensureElementDeclCapacity(int i) {
    }

    private void ensureEntityDeclCapacity(int i) {
    }

    private void ensureNotationDeclCapacity(int i) {
    }

    private void printAttribute(int i) {
    }

    private static byte[][] resize(byte[][] bArr, int i) {
    }

    protected int addContentSpecNode(short s, String str) {
    }

    protected void addContentSpecToElement(XMLElementDecl xMLElementDecl) {
    }

    protected int addUniqueLeafNode(String str) {
    }

    @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
    public void any(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void attributeDecl(String str, String str2, String str3, String[] strArr, String str4, XMLString xMLString, XMLString xMLString2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected int createAttributeDecl() {
    }

    protected int createContentSpec() {
    }

    protected int createElementDecl() {
    }

    protected int createEntityDecl() {
    }

    protected int createNotationDecl() {
    }

    public void element(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void elementDecl(String str, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
    public void empty(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void endAttlist(Augmentations augmentations) throws XNIException {
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

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void endExternalSubset(Augmentations augmentations) throws XNIException {
    }

    public void endGroup(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void endParameterEntity(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void externalEntityDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
    }

    public boolean getAttributeDecl(int i, XMLAttributeDecl xMLAttributeDecl) {
    }

    public int getAttributeDeclIndex(int i, String str) {
    }

    public boolean getAttributeDeclIsExternal(int i) {
    }

    public boolean getContentSpec(int i, XMLContentSpec xMLContentSpec) {
    }

    public String getContentSpecAsString(int i) {
    }

    public int getContentSpecIndex(int i) {
    }

    public short getContentSpecType(int i) {
    }

    @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
    public XMLDTDContentModelSource getDTDContentModelSource() {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public XMLDTDSource getDTDSource() {
    }

    protected ContentModelValidator getElementContentModelValidator(int i) {
    }

    public boolean getElementDecl(int i, XMLElementDecl xMLElementDecl) {
    }

    public int getElementDeclIndex(String str) {
    }

    public boolean getElementDeclIsExternal(int i) {
    }

    QName getElementDeclName(int i) {
    }

    public boolean getEntityDecl(int i, XMLEntityDecl xMLEntityDecl) {
    }

    public int getEntityDeclIndex(String str) {
    }

    public int getFirstAttributeDeclIndex(int i) {
    }

    public int getFirstElementDeclIndex() {
    }

    @Override // org.apache.xerces.xni.grammars.Grammar
    public XMLGrammarDescription getGrammarDescription() {
    }

    public int getNextAttributeDeclIndex(int i) {
    }

    public int getNextElementDeclIndex(int i) {
    }

    public boolean getNotationDecl(int i, XMLNotationDecl xMLNotationDecl) {
    }

    public int getNotationDeclIndex(String str) {
    }

    public SymbolTable getSymbolTable() {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void ignoredCharacters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected void initializeContentModelStack() {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void internalEntityDecl(String str, XMLString xMLString, XMLString xMLString2, Augmentations augmentations) throws XNIException {
    }

    public boolean isCDATAAttribute(QName qName, QName qName2) {
    }

    @Override // org.apache.xerces.impl.validation.EntityState
    public boolean isEntityDeclared(String str) {
    }

    @Override // org.apache.xerces.impl.validation.EntityState
    public boolean isEntityUnparsed(String str) {
    }

    boolean isImmutable() {
    }

    public boolean isNamespaceAware() {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void notationDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
    }

    public void occurrence(short s, Augmentations augmentations) throws XNIException {
    }

    public void pcdata(Augmentations augmentations) throws XNIException {
    }

    public void printAttributes(int i) {
    }

    public void printElements() {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected void putElementNameMapping(QName qName, int i, int i2) {
    }

    public void separator(short s, Augmentations augmentations) throws XNIException {
    }

    protected void setAttributeDecl(int i, int i2, XMLAttributeDecl xMLAttributeDecl) {
    }

    protected void setContentSpec(int i, XMLContentSpec xMLContentSpec) {
    }

    protected void setContentSpecIndex(int i, int i2) {
    }

    @Override // org.apache.xerces.xni.XMLDTDContentModelHandler
    public void setDTDContentModelSource(XMLDTDContentModelSource xMLDTDContentModelSource) {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void setDTDSource(XMLDTDSource xMLDTDSource) {
    }

    protected void setElementDecl(int i, XMLElementDecl xMLElementDecl) {
    }

    protected void setEntityDecl(int i, XMLEntityDecl xMLEntityDecl) {
    }

    protected void setFirstAttributeDeclIndex(int i, int i2) {
    }

    protected void setNotationDecl(int i, XMLNotationDecl xMLNotationDecl) {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void startAttlist(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void startConditional(short s, Augmentations augmentations) throws XNIException {
    }

    public void startContentModel(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void startDTD(XMLLocator xMLLocator, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void startExternalSubset(XMLResourceIdentifier xMLResourceIdentifier, Augmentations augmentations) throws XNIException {
    }

    public void startGroup(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void startParameterEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void textDecl(String str, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDTDHandler
    public void unparsedEntityDecl(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    public int getElementDeclIndex(QName qName) {
    }

    private static short[][] resize(short[][] sArr, int i) {
    }

    protected int addContentSpecNode(short s, int i, int i2) {
    }

    private static int[][] resize(int[][] iArr, int i) {
    }

    private static DatatypeValidator[][] resize(DatatypeValidator[][] datatypeValidatorArr, int i) {
    }

    private static ContentModelValidator[][] resize(ContentModelValidator[][] contentModelValidatorArr, int i) {
    }

    private static Object[][] resize(Object[][] objArr, int i) {
    }

    private static QName[][] resize(QName[][] qNameArr, int i) {
    }

    private static String[][] resize(String[][] strArr, int i) {
    }

    private static String[][][] resize(String[][][] strArr, int i) {
    }
}
