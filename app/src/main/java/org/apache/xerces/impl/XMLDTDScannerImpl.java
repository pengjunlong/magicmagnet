package org.apache.xerces.impl;

import java.io.IOException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.XMLDTDContentModelHandler;
import org.apache.xerces.xni.XMLDTDHandler;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLDTDScanner;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLDTDScannerImpl extends XMLScanner implements XMLDTDScanner, XMLEntityHandler {
    private static final boolean DEBUG_SCANNER_STATE = false;
    private static final Boolean[] FEATURE_DEFAULTS = null;
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final int SCANNER_STATE_END_OF_INPUT = 0;
    protected static final int SCANNER_STATE_MARKUP_DECL = 2;
    protected static final int SCANNER_STATE_TEXT_DECL = 1;
    private int fContentDepth;
    private int[] fContentStack;
    protected XMLDTDContentModelHandler fDTDContentModelHandler;
    protected XMLDTDHandler fDTDHandler;
    private String[] fEnumeration;
    private int fEnumerationCount;
    private int fExtEntityDepth;
    private final XMLStringBuffer fIgnoreConditionalBuffer;
    private int fIncludeSectDepth;
    private final XMLString fLiteral;
    private final XMLString fLiteral2;
    private int fMarkUpDepth;
    private int fPEDepth;
    private boolean[] fPEReport;
    private int[] fPEStack;
    protected int fScannerState;
    protected boolean fSeenExternalDTD;
    protected boolean fSeenPEReferences;
    protected boolean fStandalone;
    private boolean fStartDTDCalled;
    private final XMLString fString;
    private final XMLStringBuffer fStringBuffer;
    private final XMLStringBuffer fStringBuffer2;
    private final String[] fStrings;

    public XMLDTDScannerImpl() {
    }

    private final void ensureEnumerationSize(int i) {
    }

    private static String getScannerStateName(int i) {
    }

    private void init() {
    }

    private final boolean peekReportEntity() {
    }

    private final int popContentStack() {
    }

    private final int popPEStack() {
    }

    private final void pushContentStack(int i) {
    }

    private final void pushPEStack(int i, boolean z) {
    }

    private final String scanAttType(String str, String str2) throws IOException, XNIException {
    }

    private final void scanChildren(String str) throws IOException, XNIException {
    }

    private final void scanConditionalSect(int i) throws IOException, XNIException {
    }

    private final void scanEntityDecl() throws IOException, XNIException {
    }

    private final void scanMixed(String str) throws IOException, XNIException {
    }

    private final void scanNotationDecl() throws IOException, XNIException {
    }

    private int skipInvalidEnumerationValue() throws IOException {
    }

    private boolean skipSeparator(boolean z, boolean z2) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.impl.XMLEntityHandler
    public void endEntity(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDContentModelSource
    public XMLDTDContentModelHandler getDTDContentModelHandler() {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDSource
    public XMLDTDHandler getDTDHandler() {
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

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    protected final String scanAttDefaultDecl(String str, String str2, String str3, XMLString xMLString, XMLString xMLString2) throws IOException, XNIException {
    }

    protected final void scanAttlistDecl() throws IOException, XNIException {
    }

    protected final void scanComment() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDScanner
    public boolean scanDTDExternalSubset(boolean z) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDScanner
    public boolean scanDTDInternalSubset(boolean z, boolean z2, boolean z3) throws IOException, XNIException {
    }

    protected final boolean scanDecls(boolean z) throws IOException, XNIException {
    }

    protected final void scanElementDecl() throws IOException, XNIException {
    }

    protected final void scanEntityValue(XMLString xMLString, XMLString xMLString2) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected final void scanPIData(String str, XMLString xMLString) throws IOException, XNIException {
    }

    protected final boolean scanTextDecl() throws IOException, XNIException {
    }

    protected final boolean scanningInternalSubset() {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDContentModelSource
    public void setDTDContentModelHandler(XMLDTDContentModelHandler xMLDTDContentModelHandler) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDSource
    public void setDTDHandler(XMLDTDHandler xMLDTDHandler) {
    }

    @Override // org.apache.xerces.xni.parser.XMLDTDScanner
    public void setInputSource(XMLInputSource xMLInputSource) throws IOException {
    }

    protected final void setScannerState(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner, org.apache.xerces.impl.XMLEntityHandler
    public void startEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    protected void startPE(String str, boolean z) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    public void reset() {
    }

    public XMLDTDScannerImpl(SymbolTable symbolTable, XMLErrorReporter xMLErrorReporter, XMLEntityManager xMLEntityManager) {
    }
}
