package org.apache.xerces.jaxp.validation;

import org.apache.xerces.impl.xs.XMLSchemaLoader;
import org.apache.xerces.util.DOMEntityResolverWrapper;
import org.apache.xerces.util.ErrorHandlerWrapper;
import org.apache.xerces.util.SecurityManager;
import org.apache.xerces.util.XMLGrammarPoolImpl;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.javax.xml.transform.Source;
import org.javax.xml.validation.Schema;
import org.javax.xml.validation.SchemaFactory;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class XMLSchemaFactory extends SchemaFactory {
    private static final String JAXP_SOURCE_FEATURE_PREFIX = "http://javax.xml.transform";
    private static final String SCHEMA_FULL_CHECKING = "http://apache.org/xml/features/validation/schema-full-checking";
    private static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    private static final String USE_GRAMMAR_POOL_ONLY = "http://apache.org/xml/features/internal/validation/schema/use-grammar-pool-only";
    private static final String XMLGRAMMAR_POOL = "http://apache.org/xml/properties/internal/grammar-pool";
    private final DOMEntityResolverWrapper fDOMEntityResolverWrapper;
    private ErrorHandler fErrorHandler;
    private final ErrorHandlerWrapper fErrorHandlerWrapper;
    private LSResourceResolver fLSResourceResolver;
    private SecurityManager fSecurityManager;
    private boolean fUseGrammarPoolOnly;
    private final XMLGrammarPoolWrapper fXMLGrammarPoolWrapper;
    private final XMLSchemaLoader fXMLSchemaLoader;

    static class XMLGrammarPoolImplExtension extends XMLGrammarPoolImpl {
        public XMLGrammarPoolImplExtension() {
        }

        int getGrammarCount() {
        }

        public XMLGrammarPoolImplExtension(int i) {
        }
    }

    static class XMLGrammarPoolWrapper implements XMLGrammarPool {
        private XMLGrammarPool fGrammarPool;

        XMLGrammarPoolWrapper() {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void cacheGrammars(String str, Grammar[] grammarArr) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void clear() {
        }

        XMLGrammarPool getGrammarPool() {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void lockPool() {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public Grammar retrieveGrammar(XMLGrammarDescription xMLGrammarDescription) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public Grammar[] retrieveInitialGrammarSet(String str) {
        }

        void setGrammarPool(XMLGrammarPool xMLGrammarPool) {
        }

        @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
        public void unlockPool() {
        }
    }

    private void propagateFeatures(AbstractXMLSchema abstractXMLSchema) {
    }

    public ErrorHandler getErrorHandler() {
    }

    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public LSResourceResolver getResourceResolver() {
    }

    public boolean isSchemaLanguageSupported(String str) {
    }

    public Schema newSchema(Source[] sourceArr) throws SAXException {
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
    }

    public void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public void setResourceResolver(LSResourceResolver lSResourceResolver) {
    }

    public Schema newSchema() throws SAXException {
    }

    public Schema newSchema(XMLGrammarPool xMLGrammarPool) throws SAXException {
    }
}
