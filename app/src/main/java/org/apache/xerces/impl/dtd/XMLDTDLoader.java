package org.apache.xerces.impl.dtd;

import java.io.IOException;
import java.util.Locale;
import org.apache.xerces.impl.XMLDTDScannerImpl;
import org.apache.xerces.impl.XMLEntityManager;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarLoader;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLDTDLoader extends XMLDTDProcessor implements XMLGrammarLoader {
    protected static final String BALANCE_SYNTAX_TREES = "http://apache.org/xml/features/validation/balance-syntax-trees";
    public static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    private static final String[] LOADER_RECOGNIZED_FEATURES = null;
    private static final String[] LOADER_RECOGNIZED_PROPERTIES = null;
    public static final String LOCALE = "http://apache.org/xml/properties/locale";
    protected static final String STANDARD_URI_CONFORMANT_FEATURE = "http://apache.org/xml/features/standard-uri-conformant";
    private boolean fBalanceSyntaxTrees;
    protected XMLDTDScannerImpl fDTDScanner;
    protected XMLEntityManager fEntityManager;
    protected XMLEntityResolver fEntityResolver;
    protected Locale fLocale;
    private boolean fStrictURI;

    public XMLDTDLoader() {
    }

    protected XMLDTDScannerImpl createDTDScanner(SymbolTable symbolTable, XMLErrorReporter xMLErrorReporter, XMLEntityManager xMLEntityManager) {
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

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public Locale getLocale() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public Object getProperty(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.impl.dtd.XMLDTDProcessor, org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.impl.dtd.XMLDTDProcessor, org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    protected short getScannerVersion() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public Grammar loadGrammar(XMLInputSource xMLInputSource) throws IOException, XNIException {
    }

    public void loadGrammarWithContext(XMLDTDValidator xMLDTDValidator, String str, String str2, String str3, String str4, String str5) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.dtd.XMLDTDProcessor
    protected void reset() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public void setEntityResolver(XMLEntityResolver xMLEntityResolver) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public void setErrorHandler(XMLErrorHandler xMLErrorHandler) {
    }

    @Override // org.apache.xerces.impl.dtd.XMLDTDProcessor, org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarLoader
    public void setLocale(Locale locale) {
    }

    @Override // org.apache.xerces.impl.dtd.XMLDTDProcessor, org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public XMLDTDLoader(SymbolTable symbolTable) {
    }

    public XMLDTDLoader(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool) {
    }

    XMLDTDLoader(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool, XMLErrorReporter xMLErrorReporter, XMLEntityResolver xMLEntityResolver) {
    }
}
