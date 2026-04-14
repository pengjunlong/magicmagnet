package org.apache.xerces.jaxp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import org.apache.xerces.impl.validation.ValidationManager;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.apache.xerces.xs.AttributePSVI;
import org.apache.xerces.xs.ElementPSVI;
import org.apache.xerces.xs.PSVIProvider;
import org.javax.xml.parsers.SAXParser;
import org.javax.xml.validation.Schema;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SAXParserImpl extends SAXParser implements JAXPConstants, PSVIProvider {
    private static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    private static final String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
    private static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    private static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    private static final String XINCLUDE_FEATURE = "http://apache.org/xml/features/xinclude";
    private static final String XMLSCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
    private final EntityResolver fInitEntityResolver;
    private final ErrorHandler fInitErrorHandler;
    private final ValidationManager fSchemaValidationManager;
    private final XMLComponent fSchemaValidator;
    private final XMLComponentManager fSchemaValidatorComponentManager;
    private final UnparsedEntityHandler fUnparsedEntityHandler;
    private final Schema grammar;
    private String schemaLanguage;
    private final JAXPSAXParser xmlReader;

    public static class JAXPSAXParser extends org.apache.xerces.parsers.SAXParser {
        private final HashMap fInitFeatures;
        private final HashMap fInitProperties;
        private final SAXParserImpl fSAXParser;

        public JAXPSAXParser() {
        }

        private void resetSchemaValidator() throws SAXException {
        }

        private void setSchemaValidatorFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        private void setSchemaValidatorProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        @Override // org.apache.xerces.parsers.AbstractSAXParser, org.xml.sax.XMLReader
        public synchronized boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        boolean getFeature0(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        @Override // org.apache.xerces.parsers.AbstractSAXParser, org.xml.sax.XMLReader
        public synchronized Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        Object getProperty0(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        XMLParserConfiguration getXMLParserConfiguration() {
        }

        @Override // org.apache.xerces.parsers.AbstractSAXParser, org.xml.sax.Parser, org.xml.sax.XMLReader
        public void parse(InputSource inputSource) throws SAXException, IOException {
        }

        synchronized void restoreInitState() throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        @Override // org.apache.xerces.parsers.AbstractSAXParser, org.xml.sax.XMLReader
        public synchronized void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        void setFeature0(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        @Override // org.apache.xerces.parsers.AbstractSAXParser, org.xml.sax.XMLReader
        public synchronized void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        void setProperty0(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        }

        JAXPSAXParser(SAXParserImpl sAXParserImpl) {
        }

        @Override // org.apache.xerces.parsers.AbstractSAXParser, org.xml.sax.Parser, org.xml.sax.XMLReader
        public void parse(String str) throws SAXException, IOException {
        }
    }

    SAXParserImpl(SAXParserFactoryImpl sAXParserFactoryImpl, Hashtable hashtable) throws SAXException {
    }

    static /* synthetic */ XMLComponent access$000(SAXParserImpl sAXParserImpl) {
    }

    static /* synthetic */ Schema access$100(SAXParserImpl sAXParserImpl) {
    }

    static /* synthetic */ String access$200(SAXParserImpl sAXParserImpl) {
    }

    static /* synthetic */ String access$202(SAXParserImpl sAXParserImpl, String str) {
    }

    static /* synthetic */ ValidationManager access$300(SAXParserImpl sAXParserImpl) {
    }

    static /* synthetic */ UnparsedEntityHandler access$400(SAXParserImpl sAXParserImpl) {
    }

    static /* synthetic */ XMLComponentManager access$500(SAXParserImpl sAXParserImpl) {
    }

    private void setFeatures(Hashtable hashtable) throws SAXNotSupportedException, SAXNotRecognizedException {
    }

    @Override // org.apache.xerces.xs.PSVIProvider
    public AttributePSVI getAttributePSVI(int i) {
    }

    @Override // org.apache.xerces.xs.PSVIProvider
    public AttributePSVI getAttributePSVIByName(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.PSVIProvider
    public ElementPSVI getElementPSVI() {
    }

    public Parser getParser() throws SAXException {
    }

    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    public Schema getSchema() {
    }

    public XMLReader getXMLReader() {
    }

    public boolean isNamespaceAware() {
    }

    public boolean isValidating() {
    }

    public boolean isXIncludeAware() {
    }

    public void parse(InputSource inputSource, DefaultHandler defaultHandler) throws SAXException, IOException {
    }

    public void reset() {
    }

    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    SAXParserImpl(SAXParserFactoryImpl sAXParserFactoryImpl, Hashtable hashtable, boolean z) throws SAXException {
    }

    public void parse(InputSource inputSource, HandlerBase handlerBase) throws SAXException, IOException {
    }
}
