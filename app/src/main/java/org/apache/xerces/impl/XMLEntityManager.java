package org.apache.xerces.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.security.PrivilegedAction;
import java.util.Hashtable;
import java.util.Stack;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.util.SecurityManager;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.URI;
import org.apache.xerces.util.XMLResourceIdentifierImpl;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLEntityManager implements XMLComponent, XMLEntityResolver {
    protected static final String ALLOW_JAVA_ENCODINGS = "http://apache.org/xml/features/allow-java-encodings";
    protected static final String BUFFER_SIZE = "http://apache.org/xml/properties/input-buffer-size";
    private static final boolean DEBUG_BUFFER = false;
    private static final boolean DEBUG_ENCODINGS = false;
    private static final boolean DEBUG_ENTITIES = false;
    private static final boolean DEBUG_RESOLVER = false;
    public static final int DEFAULT_BUFFER_SIZE = 2048;
    public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 512;
    public static final int DEFAULT_XMLDECL_BUFFER_SIZE = 64;
    private static final String DTDEntity = null;
    protected static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String EXTERNAL_GENERAL_ENTITIES = "http://xml.org/sax/features/external-general-entities";
    protected static final String EXTERNAL_PARAMETER_ENTITIES = "http://xml.org/sax/features/external-parameter-entities";
    private static final Boolean[] FEATURE_DEFAULTS = null;
    private static PrivilegedAction GET_USER_DIR_SYSTEM_PROPERTY = null;
    protected static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    protected static final String STANDARD_URI_CONFORMANT = "http://apache.org/xml/features/standard-uri-conformant";
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String VALIDATION = "http://xml.org/sax/features/validation";
    protected static final String VALIDATION_MANAGER = "http://apache.org/xml/properties/internal/validation-manager";
    protected static final String WARN_ON_DUPLICATE_ENTITYDEF = "http://apache.org/xml/features/warn-on-duplicate-entitydef";
    private static final String XMLEntity = null;
    private static final char[] gAfterEscaping1 = null;
    private static final char[] gAfterEscaping2 = null;
    private static final char[] gHexChs = null;
    private static final boolean[] gNeedEscaping = null;
    private static String gUserDir;
    private static URI gUserDirURI;
    protected boolean fAllowJavaEncodings;
    protected int fBufferSize;
    private final CharacterBufferPool fCharacterBufferPool;
    protected ScannedEntity fCurrentEntity;
    protected Hashtable fDeclaredEntities;
    protected final Hashtable fEntities;
    private final Augmentations fEntityAugs;
    protected int fEntityExpansionCount;
    protected int fEntityExpansionLimit;
    protected XMLEntityHandler fEntityHandler;
    protected XMLEntityResolver fEntityResolver;
    protected XMLEntityScanner fEntityScanner;
    protected final Stack fEntityStack;
    protected XMLErrorReporter fErrorReporter;
    protected boolean fExternalGeneralEntities;
    protected boolean fExternalParameterEntities;
    protected boolean fHasPEReferences;
    protected boolean fInExternalSubset;
    private final ByteBufferPool fLargeByteBufferPool;
    protected Stack fReaderStack;
    private final XMLResourceIdentifierImpl fResourceIdentifier;
    protected SecurityManager fSecurityManager;
    private final ByteBufferPool fSmallByteBufferPool;
    protected boolean fStandalone;
    protected boolean fStrictURI;
    protected SymbolTable fSymbolTable;
    private byte[] fTempByteBuffer;
    protected boolean fValidation;
    protected ValidationManager fValidationManager;
    protected boolean fWarnDuplicateEntityDef;
    protected XMLEntityScanner fXML10EntityScanner;
    protected XMLEntityScanner fXML11EntityScanner;

    /* renamed from: org.apache.xerces.impl.XMLEntityManager$1 */
    static class C17811 implements PrivilegedAction {
        C17811() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    private static final class ByteBufferPool {
        private static final int DEFAULT_POOL_SIZE = 3;
        private int fBufferSize;
        private byte[][] fByteBufferPool;
        private int fDepth;
        private int fPoolSize;

        public ByteBufferPool(int i) {
        }

        public byte[] getBuffer() {
        }

        public void returnBuffer(byte[] bArr) {
        }

        public void setBufferSize(int i) {
        }

        public ByteBufferPool(int i, int i2) {
        }
    }

    private static final class CharacterBuffer {
        private final char[] ch;
        private final boolean isExternal;

        public CharacterBuffer(boolean z, int i) {
        }

        static /* synthetic */ char[] access$300(CharacterBuffer characterBuffer) {
        }

        static /* synthetic */ boolean access$500(CharacterBuffer characterBuffer) {
        }
    }

    private static final class CharacterBufferPool {
        private static final int DEFAULT_POOL_SIZE = 3;
        private CharacterBuffer[] fExternalBufferPool;
        private int fExternalBufferSize;
        private int fExternalTop;
        private CharacterBuffer[] fInternalBufferPool;
        private int fInternalBufferSize;
        private int fInternalTop;
        private int fPoolSize;

        public CharacterBufferPool(int i, int i2) {
        }

        private void init() {
        }

        public CharacterBuffer getBuffer(boolean z) {
        }

        public void returnBuffer(CharacterBuffer characterBuffer) {
        }

        public void setExternalBufferSize(int i) {
        }

        public CharacterBufferPool(int i, int i2, int i3) {
        }
    }

    private static class EncodingInfo {
        public static final EncodingInfo EBCDIC = null;
        public static final EncodingInfo UCS_4_BIG_ENDIAN = null;
        public static final EncodingInfo UCS_4_LITTLE_ENDIAN = null;
        public static final EncodingInfo UCS_4_UNUSUAL_BYTE_ORDER = null;
        public static final EncodingInfo UTF_16_BIG_ENDIAN = null;
        public static final EncodingInfo UTF_16_BIG_ENDIAN_WITH_BOM = null;
        public static final EncodingInfo UTF_16_LITTLE_ENDIAN = null;
        public static final EncodingInfo UTF_16_LITTLE_ENDIAN_WITH_BOM = null;
        public static final EncodingInfo UTF_8 = null;
        public static final EncodingInfo UTF_8_WITH_BOM = null;
        public final String encoding;
        public final boolean hasBOM;
        public final Boolean isBigEndian;

        private EncodingInfo(String str, Boolean bool, boolean z) {
        }
    }

    public class ScannedEntity extends Entity {
        public int baseCharOffset;
        public char[] ch;
        public int columnNumber;
        public int count;
        public String encoding;
        public XMLResourceIdentifier entityLocation;
        boolean externallySpecifiedEncoding;
        private byte[] fByteBuffer;
        private CharacterBuffer fCharacterBuffer;
        public boolean isExternal;
        public int lineNumber;
        public boolean literal;
        public boolean mayReadChunks;
        public int position;
        public Reader reader;
        public int startPosition;
        public InputStream stream;
        final /* synthetic */ XMLEntityManager this$0;
        public String xmlVersion;

        public ScannedEntity(XMLEntityManager xMLEntityManager, String str, XMLResourceIdentifier xMLResourceIdentifier, InputStream inputStream, Reader reader, byte[] bArr, String str2, boolean z, boolean z2, boolean z3) {
        }

        static /* synthetic */ CharacterBuffer access$000(ScannedEntity scannedEntity) {
        }

        static /* synthetic */ byte[] access$100(ScannedEntity scannedEntity) {
        }

        public int getCharacterOffset() {
        }

        public int getColumnNumber() {
        }

        public String getEncoding() {
        }

        public String getExpandedSystemId() {
        }

        public int getLineNumber() {
        }

        public String getLiteralSystemId() {
        }

        public String getXMLVersion() {
        }

        public boolean isEncodingExternallySpecified() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public final boolean isExternal() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public final boolean isUnparsed() {
        }

        public void setEncodingExternallySpecified(boolean z) {
        }

        public void setReader(InputStream inputStream, String str, Boolean bool) throws IOException {
        }

        public String toString() {
        }
    }

    public XMLEntityManager() {
    }

    public static void absolutizeAgainstUserDir(URI uri) throws URI.MalformedURIException {
    }

    static /* synthetic */ CharacterBufferPool access$200(XMLEntityManager xMLEntityManager) {
    }

    static /* synthetic */ byte[] access$400(XMLEntityManager xMLEntityManager) {
    }

    static /* synthetic */ byte[] access$402(XMLEntityManager xMLEntityManager, byte[] bArr) {
    }

    private Reader createASCIIReader(InputStream inputStream) {
    }

    private Reader createLatin1Reader(InputStream inputStream) {
    }

    public static OutputStream createOutputStream(String str) throws IOException {
    }

    private Reader createUTF16Reader(InputStream inputStream, boolean z) {
    }

    private Reader createUTF8Reader(InputStream inputStream) {
    }

    public static String expandSystemId(String str, String str2, boolean z) throws URI.MalformedURIException {
    }

    private static String expandSystemIdStrictOff(String str, String str2) throws URI.MalformedURIException {
    }

    private static String expandSystemIdStrictOn(String str, String str2) throws URI.MalformedURIException {
    }

    protected static String fixURI(String str) {
    }

    private static String getPathWithoutEscapes(String str) {
    }

    private static synchronized URI getUserDir() throws URI.MalformedURIException {
    }

    static final void print(ScannedEntity scannedEntity) {
    }

    public void addExternalEntity(String str, String str2, String str3, String str4) throws IOException {
    }

    public void addInternalEntity(String str, String str2) {
    }

    public void addUnparsedEntity(String str, String str2, String str3, String str4, String str5) {
    }

    public void closeReaders() {
    }

    protected Reader createReader(InputStream inputStream, String str, Boolean bool) throws IOException {
    }

    void endEntity() throws XNIException {
    }

    public void endExternalSubset() {
    }

    public ScannedEntity getCurrentEntity() {
    }

    public XMLResourceIdentifier getCurrentResourceIdentifier() {
    }

    Hashtable getDeclaredEntities() {
    }

    protected EncodingInfo getEncodingInfo(byte[] bArr, int i) {
    }

    public XMLEntityScanner getEntityScanner() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
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

    final boolean hasPEReferences() {
    }

    public boolean isDeclaredEntity(String str) {
    }

    public boolean isEntityDeclInExternalSubset(String str) {
    }

    public boolean isExternalEntity(String str) {
    }

    public boolean isStandalone() {
    }

    public boolean isUnparsedEntity(String str) {
    }

    final void notifyHasPEReferences() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLEntityResolver
    public XMLInputSource resolveEntity(XMLResourceIdentifier xMLResourceIdentifier) throws IOException, XNIException {
    }

    public void setEntityHandler(XMLEntityHandler xMLEntityHandler) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public void setScannerVersion(short s) {
    }

    public void setStandalone(boolean z) {
    }

    public String setupCurrentEntity(String str, XMLInputSource xMLInputSource, boolean z, boolean z2) throws IOException, XNIException {
    }

    public void startDTDEntity(XMLInputSource xMLInputSource) throws IOException, XNIException {
    }

    public void startDocumentEntity(XMLInputSource xMLInputSource) throws IOException, XNIException {
    }

    public void startEntity(String str, boolean z) throws IOException, XNIException {
    }

    public void startExternalSubset() {
    }

    public static abstract class Entity {
        public boolean inExternalSubset;
        public String name;

        public Entity() {
        }

        public void clear() {
        }

        public boolean isEntityDeclInExternalSubset() {
        }

        public abstract boolean isExternal();

        public abstract boolean isUnparsed();

        public void setValues(Entity entity) {
        }

        public Entity(String str, boolean z) {
        }
    }

    protected static class ExternalEntity extends Entity {
        public XMLResourceIdentifier entityLocation;
        public String notation;

        public ExternalEntity() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public void clear() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public final boolean isExternal() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public final boolean isUnparsed() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public void setValues(Entity entity) {
        }

        public ExternalEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, boolean z) {
        }

        public void setValues(ExternalEntity externalEntity) {
        }
    }

    protected static class InternalEntity extends Entity {
        public String text;

        public InternalEntity() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public void clear() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public final boolean isExternal() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public final boolean isUnparsed() {
        }

        @Override // org.apache.xerces.impl.XMLEntityManager.Entity
        public void setValues(Entity entity) {
        }

        public InternalEntity(String str, String str2, boolean z) {
        }

        public void setValues(InternalEntity internalEntity) {
        }
    }

    public XMLEntityManager(XMLEntityManager xMLEntityManager) {
    }

    protected final class RewindableInputStream extends InputStream {
        private byte[] fData;
        private int fEndOffset;
        private InputStream fInputStream;
        private int fLength;
        private int fMark;
        private int fOffset;
        private int fStartOffset;
        final /* synthetic */ XMLEntityManager this$0;

        public RewindableInputStream(XMLEntityManager xMLEntityManager, InputStream inputStream) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.InputStream
        public void mark(int i) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        public int readAndBuffer() throws IOException {
        }

        @Override // java.io.InputStream
        public void reset() {
        }

        public void rewind() {
        }

        public void setStartOffset(int i) {
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    public void reset() {
    }

    public void startEntity(String str, XMLInputSource xMLInputSource, boolean z, boolean z2) throws IOException, XNIException {
    }
}
