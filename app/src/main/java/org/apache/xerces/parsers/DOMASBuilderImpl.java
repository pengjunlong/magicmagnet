package org.apache.xerces.parsers;

import org.apache.xerces.dom.ASModelImpl;
import org.apache.xerces.dom3.as.ASModel;
import org.apache.xerces.dom3.as.DOMASBuilder;
import org.apache.xerces.dom3.as.DOMASException;
import org.apache.xerces.impl.xs.XSGrammarBucket;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.w3c.dom.ls.LSInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMASBuilderImpl extends DOMParserImpl implements DOMASBuilder {
    protected static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    protected static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    protected static final String SCHEMA_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";
    protected static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    protected ASModelImpl fAbstractSchema;
    protected XSGrammarBucket fGrammarBucket;

    public DOMASBuilderImpl() {
    }

    private void addGrammars(ASModelImpl aSModelImpl, XSGrammarBucket xSGrammarBucket) {
    }

    private void initGrammarBucket() {
    }

    private void initGrammarBucketRecurse(ASModelImpl aSModelImpl) {
    }

    private void initGrammarPool(ASModelImpl aSModelImpl, XMLGrammarPool xMLGrammarPool) {
    }

    @Override // org.apache.xerces.dom3.as.DOMASBuilder
    public ASModel getAbstractSchema() {
    }

    @Override // org.apache.xerces.dom3.as.DOMASBuilder
    public ASModel parseASInputSource(LSInput lSInput) throws DOMASException, Exception {
    }

    @Override // org.apache.xerces.dom3.as.DOMASBuilder
    public ASModel parseASURI(String str) throws DOMASException, Exception {
    }

    @Override // org.apache.xerces.dom3.as.DOMASBuilder
    public void setAbstractSchema(ASModel aSModel) {
    }

    public DOMASBuilderImpl(XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration) {
    }

    public DOMASBuilderImpl(SymbolTable symbolTable) {
    }

    public DOMASBuilderImpl(SymbolTable symbolTable, XMLGrammarPool xMLGrammarPool) {
    }

    ASModel parseASInputSource(XMLInputSource xMLInputSource) throws Exception {
    }
}
