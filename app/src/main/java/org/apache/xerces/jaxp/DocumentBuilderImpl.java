package org.apache.xerces.jaxp;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.javax.xml.parsers.DocumentBuilder;
import org.javax.xml.validation.Schema;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DocumentBuilderImpl extends DocumentBuilder implements JAXPConstants {
    private static final String CREATE_CDATA_NODES_FEATURE = "http://apache.org/xml/features/create-cdata-nodes";
    private static final String CREATE_ENTITY_REF_NODES_FEATURE = "http://apache.org/xml/features/dom/create-entity-ref-nodes";
    private static final String INCLUDE_COMMENTS_FEATURE = "http://apache.org/xml/features/include-comments";
    private static final String INCLUDE_IGNORABLE_WHITESPACE = "http://apache.org/xml/features/dom/include-ignorable-whitespace";
    private static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    private static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    private static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    private static final String XINCLUDE_FEATURE = "http://apache.org/xml/features/xinclude";
    private static final String XMLSCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
    private final DOMParser domParser;
    private final EntityResolver fInitEntityResolver;
    private final ErrorHandler fInitErrorHandler;
    private final ValidationManager fSchemaValidationManager;
    private final XMLComponent fSchemaValidator;
    private final XMLComponentManager fSchemaValidatorComponentManager;
    private final UnparsedEntityHandler fUnparsedEntityHandler;
    private final Schema grammar;

    DocumentBuilderImpl(DocumentBuilderFactoryImpl documentBuilderFactoryImpl, Hashtable hashtable, Hashtable hashtable2) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    private void resetSchemaValidator() throws SAXException {
    }

    private void setDocumentBuilderFactoryAttributes(Hashtable hashtable) throws SAXNotSupportedException, SAXNotRecognizedException {
    }

    private void setFeatures(Hashtable hashtable) throws SAXNotSupportedException, SAXNotRecognizedException {
    }

    public DOMImplementation getDOMImplementation() {
    }

    DOMParser getDOMParser() {
    }

    public Schema getSchema() {
    }

    public boolean isNamespaceAware() {
    }

    public boolean isValidating() {
    }

    public boolean isXIncludeAware() {
    }

    public Document newDocument() {
    }

    public Document parse(InputSource inputSource) throws SAXException, IOException {
    }

    public void reset() {
    }

    public void setEntityResolver(EntityResolver entityResolver) {
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
    }

    DocumentBuilderImpl(DocumentBuilderFactoryImpl documentBuilderFactoryImpl, Hashtable hashtable, Hashtable hashtable2, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
    }
}
