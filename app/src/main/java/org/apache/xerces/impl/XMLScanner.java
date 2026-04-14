package org.apache.xerces.impl;

import java.io.IOException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLResourceIdentifierImpl;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class XMLScanner implements XMLComponent {
    protected static final boolean DEBUG_ATTR_NORMALIZATION = false;
    protected static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    protected static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String NAMESPACES = "http://xml.org/sax/features/namespaces";
    protected static final String NOTIFY_CHAR_REFS = "http://apache.org/xml/features/scanner/notify-char-refs";
    protected static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String VALIDATION = "http://xml.org/sax/features/validation";
    protected static final String fAmpSymbol = null;
    protected static final String fAposSymbol = null;
    protected static final String fEncodingSymbol = null;
    protected static final String fGtSymbol = null;
    protected static final String fLtSymbol = null;
    protected static final String fQuotSymbol = null;
    protected static final String fStandaloneSymbol = null;
    protected static final String fVersionSymbol = null;
    protected String fCharRefLiteral;
    protected int fEntityDepth;
    protected XMLEntityManager fEntityManager;
    protected XMLEntityScanner fEntityScanner;
    protected XMLErrorReporter fErrorReporter;
    protected boolean fNamespaces;
    protected boolean fNotifyCharRefs;
    protected boolean fParserSettings;
    protected boolean fReportEntity;
    protected final XMLResourceIdentifierImpl fResourceIdentifier;
    protected boolean fScanningAttribute;
    private final XMLString fString;
    private final XMLStringBuffer fStringBuffer;
    private final XMLStringBuffer fStringBuffer2;
    private final XMLStringBuffer fStringBuffer3;
    protected SymbolTable fSymbolTable;
    protected boolean fValidation;

    private void init() {
    }

    public void endEntity(String str, Augmentations augmentations) throws XNIException {
    }

    public boolean getFeature(String str) throws XMLConfigurationException {
    }

    protected String getVersionNotSupportedKey() {
    }

    protected boolean isInvalid(int i) {
    }

    protected boolean isInvalidLiteral(int i) {
    }

    protected int isUnchangedByNormalization(XMLString xMLString) {
    }

    protected boolean isValidNCName(int i) {
    }

    protected boolean isValidNameChar(int i) {
    }

    protected boolean isValidNameStartChar(int i) {
    }

    protected boolean isValidNameStartHighSurrogate(int i) {
    }

    protected void normalizeWhitespace(XMLString xMLString) {
    }

    protected void reportFatalError(String str, Object[] objArr) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    protected boolean scanAttributeValue(XMLString xMLString, XMLString xMLString2, String str, boolean z, String str2) throws IOException, XNIException {
    }

    protected int scanCharReferenceValue(XMLStringBuffer xMLStringBuffer, XMLStringBuffer xMLStringBuffer2) throws IOException, XNIException {
    }

    protected void scanComment(XMLStringBuffer xMLStringBuffer) throws IOException, XNIException {
    }

    protected void scanExternalID(String[] strArr, boolean z) throws IOException, XNIException {
    }

    protected void scanPI() throws IOException, XNIException {
    }

    protected void scanPIData(String str, XMLString xMLString) throws IOException, XNIException {
    }

    public String scanPseudoAttribute(boolean z, XMLString xMLString) throws IOException, XNIException {
    }

    protected boolean scanPubidLiteral(XMLString xMLString) throws IOException, XNIException {
    }

    protected boolean scanSurrogates(XMLStringBuffer xMLStringBuffer) throws IOException, XNIException {
    }

    protected void scanXMLDeclOrTextDecl(boolean z, String[] strArr) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public void startEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    protected boolean versionSupported(String str) {
    }

    protected void normalizeWhitespace(XMLString xMLString, int i) {
    }

    protected void reset() {
    }
}
