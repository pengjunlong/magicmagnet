package org.apache.xerces.impl;

import java.io.IOException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLVersionDetector {
    protected static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    protected static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    private static final char[] XML11_VERSION = null;
    protected static final String fVersionSymbol = null;
    protected static final String fXMLSymbol = null;
    protected String fEncoding;
    protected XMLEntityManager fEntityManager;
    protected XMLErrorReporter fErrorReporter;
    private final char[] fExpectedVersionString;
    protected SymbolTable fSymbolTable;

    private void fixupCurrentEntity(XMLEntityManager xMLEntityManager, char[] cArr, int i) {
    }

    public short determineDocVersion(XMLInputSource xMLInputSource) throws IOException {
    }

    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    public void startDocumentParsing(XMLEntityHandler xMLEntityHandler, short s) {
    }
}
