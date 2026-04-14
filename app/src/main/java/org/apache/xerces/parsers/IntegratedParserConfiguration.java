package org.apache.xerces.parsers;

import org.apache.xerces.impl.XMLDocumentScannerImpl;
import org.apache.xerces.impl.XMLNSDocumentScannerImpl;
import org.apache.xerces.impl.dtd.XMLDTDValidator;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLDocumentScanner;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class IntegratedParserConfiguration extends StandardParserConfiguration {
    protected XMLNSDocumentScannerImpl fNamespaceScanner;
    protected XMLDTDValidator fNonNSDTDValidator;
    protected XMLDocumentScannerImpl fNonNSScanner;

    public IntegratedParserConfiguration() {
    }

    @Override // org.apache.xerces.parsers.StandardParserConfiguration, org.apache.xerces.parsers.DTDConfiguration
    protected void configurePipeline() {
    }

    @Override // org.apache.xerces.parsers.DTDConfiguration
    protected XMLDTDValidator createDTDValidator() {
    }

    @Override // org.apache.xerces.parsers.DTDConfiguration
    protected XMLDocumentScanner createDocumentScanner() {
    }

    public IntegratedParserConfiguration(SymbolTable symbolTable) {
    }

    public IntegratedParserConfiguration(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool) {
    }

    public IntegratedParserConfiguration(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool, XMLComponentManager xMLComponentManager) {
    }
}
