package org.apache.xerces.parsers;

import java.io.IOException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMParser extends AbstractDOMParser {
    private static final String[] RECOGNIZED_PROPERTIES = null;
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected static final String USE_ENTITY_RESOLVER2 = "http://xml.org/sax/features/use-entity-resolver2";
    protected static final String XMLGRAMMAR_POOL = "http://apache.org/xml/properties/internal/grammar-pool";
    protected boolean fUseEntityResolver2;

    public DOMParser(XMLParserConfiguration xMLParserConfiguration) {
    }

    public EntityResolver getEntityResolver() {
    }

    public ErrorHandler getErrorHandler() {
    }

    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public XMLParserConfiguration getXMLParserConfiguration() {
    }

    public void parse(String str) throws SAXException, IOException {
    }

    public void setEntityResolver(EntityResolver entityResolver) {
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
    }

    public void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public DOMParser() {
    }

    public DOMParser(SymbolTable symbolTable) {
    }

    public DOMParser(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool) {
    }

    public void parse(InputSource inputSource) throws SAXException, IOException {
    }
}
