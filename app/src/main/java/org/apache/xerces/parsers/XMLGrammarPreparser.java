package org.apache.xerces.parsers;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Locale;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarLoader;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLGrammarPreparser {
    private static final String CONTINUE_AFTER_FATAL_ERROR = "http://apache.org/xml/features/continue-after-fatal-error";
    protected static final String ENTITY_RESOLVER = "http://apache.org/xml/properties/internal/entity-resolver";
    protected static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    protected static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String GRAMMAR_POOL = "http://apache.org/xml/properties/internal/grammar-pool";
    private static final Hashtable KNOWN_LOADERS = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected XMLEntityResolver fEntityResolver;
    protected final XMLErrorReporter fErrorReporter;
    protected XMLGrammarPool fGrammarPool;
    private final Hashtable fLoaders;
    protected Locale fLocale;
    private int fModCount;
    protected final SymbolTable fSymbolTable;

    static class XMLGrammarLoaderContainer {
        public final XMLGrammarLoader loader;
        public int modCount;

        public XMLGrammarLoaderContainer(XMLGrammarLoader xMLGrammarLoader) {
        }
    }

    public XMLGrammarPreparser() {
    }

    private void clearModCounts() {
    }

    public XMLEntityResolver getEntityResolver() {
    }

    public XMLErrorHandler getErrorHandler() {
    }

    public boolean getFeature(String str, String str2) {
    }

    public XMLGrammarPool getGrammarPool() {
    }

    public XMLGrammarLoader getLoader(String str) {
    }

    public Locale getLocale() {
    }

    public Object getProperty(String str, String str2) {
    }

    public Grammar preparseGrammar(String str, XMLInputSource xMLInputSource) throws XNIException, IOException {
    }

    public boolean registerPreparser(String str, XMLGrammarLoader xMLGrammarLoader) {
    }

    public void setEntityResolver(XMLEntityResolver xMLEntityResolver) {
    }

    public void setErrorHandler(XMLErrorHandler xMLErrorHandler) {
    }

    public void setFeature(String str, boolean z) {
    }

    public void setGrammarPool(XMLGrammarPool xMLGrammarPool) {
    }

    public void setLocale(Locale locale) {
    }

    public void setProperty(String str, Object obj) {
    }

    public XMLGrammarPreparser(SymbolTable symbolTable) {
    }
}
