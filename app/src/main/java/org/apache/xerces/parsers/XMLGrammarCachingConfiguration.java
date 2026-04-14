package org.apache.xerces.parsers;

import java.io.IOException;
import org.apache.xerces.impl.dtd.DTDGrammar;
import org.apache.xerces.impl.dtd.XMLDTDLoader;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.impl.xs.XMLSchemaLoader;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.apache.xerces.util.XMLGrammarPoolImpl;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLGrammarCachingConfiguration extends XIncludeAwareParserConfiguration {
    public static final int BIG_PRIME = 2039;
    protected static final String SCHEMA_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";
    protected static final XMLGrammarPoolImpl fStaticGrammarPool = null;
    protected static final SynchronizedSymbolTable fStaticSymbolTable = null;
    protected XMLDTDLoader fDTDLoader;
    protected XMLSchemaLoader fSchemaLoader;

    public XMLGrammarCachingConfiguration() {
    }

    @Override // org.apache.xerces.parsers.XML11Configuration, org.apache.xerces.util.ParserConfigurationSettings
    protected void checkFeature(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.parsers.XML11Configuration, org.apache.xerces.util.ParserConfigurationSettings
    protected void checkProperty(String str) throws XMLConfigurationException {
    }

    public void clearGrammarPool() {
    }

    public void lockGrammarPool() {
    }

    DTDGrammar parseDTD(XMLInputSource xMLInputSource) throws IOException {
    }

    public Grammar parseGrammar(String str, String str2) throws XNIException, IOException {
    }

    SchemaGrammar parseXMLSchema(XMLInputSource xMLInputSource) throws IOException {
    }

    public void unlockGrammarPool() {
    }

    public XMLGrammarCachingConfiguration(SymbolTable symbolTable) {
    }

    public XMLGrammarCachingConfiguration(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool) {
    }

    public Grammar parseGrammar(String str, XMLInputSource xMLInputSource) throws XNIException, IOException {
    }

    public XMLGrammarCachingConfiguration(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool, XMLComponentManager xMLComponentManager) {
    }
}
