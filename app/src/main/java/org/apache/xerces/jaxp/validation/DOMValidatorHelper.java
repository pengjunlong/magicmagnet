package org.apache.xerces.jaxp.validation;

import java.io.IOException;
import java.util.Enumeration;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.validation.EntityState;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.impl.xs.XMLSchemaValidator;
import org.apache.xerces.impl.xs.util.SimpleLocator;
import org.apache.xerces.util.NamespaceSupport;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLAttributesImpl;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLString;
import org.javax.xml.transform.Result;
import org.javax.xml.transform.Source;
import org.javax.xml.transform.dom.DOMResult;
import org.javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class DOMValidatorHelper implements ValidatorHelper, EntityState {
    private static final int CHUNK_MASK = 1023;
    private static final int CHUNK_SIZE = 1024;
    private static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final String NAMESPACE_CONTEXT = "http://apache.org/xml/properties/internal/namespace-context";
    private static final String SCHEMA_VALIDATOR = "http://apache.org/xml/properties/internal/validator/schema";
    private static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    private static final String VALIDATION_MANAGER = "http://apache.org/xml/properties/internal/validation-manager";
    final QName fAttributeQName;
    final XMLAttributesImpl fAttributes;
    private final char[] fCharBuffer;
    private final XMLSchemaValidatorComponentManager fComponentManager;
    private Node fCurrentElement;
    private final DOMNamespaceContext fDOMNamespaceContext;
    private final DOMResultAugmentor fDOMResultAugmentor;
    private final DOMResultBuilder fDOMResultBuilder;
    private DOMDocumentHandler fDOMValidatorHandler;
    final QName fElementQName;
    private NamedNodeMap fEntities;
    private final XMLErrorReporter fErrorReporter;
    private final NamespaceSupport fNamespaceContext;
    private Node fRoot;
    private final XMLSchemaValidator fSchemaValidator;
    private final SymbolTable fSymbolTable;
    final XMLString fTempString;
    private final ValidationManager fValidationManager;
    private final SimpleLocator fXMLLocator;

    final class DOMNamespaceContext implements NamespaceContext {
        protected boolean fDOMContextBuilt;
        protected String[] fNamespace;
        protected int fNamespaceSize;
        final /* synthetic */ DOMValidatorHelper this$0;

        DOMNamespaceContext(DOMValidatorHelper dOMValidatorHelper) {
        }

        private void declarePrefix0(String str, String str2) {
        }

        private void fillNamespaceContext() {
        }

        private String getURI0(String str) {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public boolean declarePrefix(String str, String str2) {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public Enumeration getAllPrefixes() {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public String getDeclaredPrefixAt(int i) {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public int getDeclaredPrefixCount() {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public String getPrefix(String str) {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public String getURI(String str) {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public void popContext() {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public void pushContext() {
        }

        @Override // org.apache.xerces.xni.NamespaceContext
        public void reset() {
        }
    }

    public DOMValidatorHelper(XMLSchemaValidatorComponentManager xMLSchemaValidatorComponentManager) {
    }

    static /* synthetic */ NamespaceSupport access$000(DOMValidatorHelper dOMValidatorHelper) {
    }

    static /* synthetic */ Node access$100(DOMValidatorHelper dOMValidatorHelper) {
    }

    static /* synthetic */ void access$200(DOMValidatorHelper dOMValidatorHelper, QName qName, Node node) {
    }

    static /* synthetic */ SymbolTable access$300(DOMValidatorHelper dOMValidatorHelper) {
    }

    private void beginNode(Node node) {
    }

    private void fillQName(QName qName, Node node) {
    }

    private void finishNode(Node node) {
    }

    private void processAttributes(NamedNodeMap namedNodeMap) {
    }

    private void sendCharactersToValidator(String str) {
    }

    private void setupDOMResultHandler(DOMSource dOMSource, DOMResult dOMResult) throws SAXException {
    }

    private void setupEntityMap(Document document) {
    }

    private boolean useIsSameNode(Node node) {
    }

    Node getCurrentElement() {
    }

    @Override // org.apache.xerces.impl.validation.EntityState
    public boolean isEntityDeclared(String str) {
    }

    @Override // org.apache.xerces.impl.validation.EntityState
    public boolean isEntityUnparsed(String str) {
    }

    @Override // org.apache.xerces.jaxp.validation.ValidatorHelper
    public void validate(Source source, Result result) throws SAXException, IOException {
    }

    private void validate(Node node) {
    }
}
