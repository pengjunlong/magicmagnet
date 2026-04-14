package org.apache.xerces.jaxp;

import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler;
import org.apache.xerces.util.AttributesProxy;
import org.apache.xerces.util.ErrorHandlerProxy;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.javax.xml.validation.TypeInfoProvider;
import org.javax.xml.validation.ValidatorHandler;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class JAXPValidatorComponent extends TeeXMLDocumentFilterImpl implements XMLComponent {
    private static final String ENTITY_MANAGER = "http://apache.org/xml/properties/internal/entity-manager";
    private static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final String SYMBOL_TABLE = "http://apache.org/xml/properties/internal/symbol-table";
    private static final TypeInfoProvider noInfoProvider = null;
    private XMLAttributes fCurrentAttributes;
    private Augmentations fCurrentAug;
    private XMLEntityResolver fEntityResolver;
    private XMLErrorReporter fErrorReporter;
    private SymbolTable fSymbolTable;
    private final SAX2XNI sax2xni;
    private final TypeInfoProvider typeInfoProvider;
    private final ValidatorHandler validator;
    private final XNI2SAX xni2sax;

    /* renamed from: org.apache.xerces.jaxp.JAXPValidatorComponent$1 */
    class C18011 extends ErrorHandlerProxy {
        final /* synthetic */ JAXPValidatorComponent this$0;

        C18011(JAXPValidatorComponent jAXPValidatorComponent) {
        }

        @Override // org.apache.xerces.util.ErrorHandlerProxy
        protected XMLErrorHandler getErrorHandler() {
        }
    }

    /* renamed from: org.apache.xerces.jaxp.JAXPValidatorComponent$2 */
    class C18022 implements LSResourceResolver {
        final /* synthetic */ JAXPValidatorComponent this$0;

        C18022(JAXPValidatorComponent jAXPValidatorComponent) {
        }

        @Override // org.w3c.dom.ls.LSResourceResolver
        public LSInput resolveResource(String str, String str2, String str3, String str4, String str5) {
        }
    }

    /* renamed from: org.apache.xerces.jaxp.JAXPValidatorComponent$3 */
    static class C18033 extends TypeInfoProvider {
        C18033() {
        }

        public TypeInfo getAttributeTypeInfo(int i) {
        }

        public TypeInfo getAttributeTypeInfo(String str) {
        }

        public TypeInfo getAttributeTypeInfo(String str, String str2) {
        }

        public TypeInfo getElementTypeInfo() {
        }

        public boolean isIdAttribute(int i) {
        }

        public boolean isSpecified(int i) {
        }
    }

    private static final class DraconianErrorHandler implements ErrorHandler {
        private static final DraconianErrorHandler ERROR_HANDLER_INSTANCE = null;

        private DraconianErrorHandler() {
        }

        public static DraconianErrorHandler getInstance() {
        }

        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
        }
    }

    public JAXPValidatorComponent(ValidatorHandler validatorHandler) {
    }

    static /* synthetic */ XMLErrorReporter access$200(JAXPValidatorComponent jAXPValidatorComponent) {
    }

    static /* synthetic */ XMLEntityResolver access$300(JAXPValidatorComponent jAXPValidatorComponent) {
    }

    static /* synthetic */ void access$400(JAXPValidatorComponent jAXPValidatorComponent, Attributes attributes) {
    }

    static /* synthetic */ XMLAttributes access$500(JAXPValidatorComponent jAXPValidatorComponent) {
    }

    static /* synthetic */ Augmentations access$600(JAXPValidatorComponent jAXPValidatorComponent) {
    }

    static /* synthetic */ Augmentations access$602(JAXPValidatorComponent jAXPValidatorComponent, Augmentations augmentations) {
    }

    static /* synthetic */ String access$700(JAXPValidatorComponent jAXPValidatorComponent, String str) {
    }

    private String symbolize(String str) {
    }

    private void updateAttributes(Attributes attributes) {
    }

    @Override // org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl, org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl, org.apache.xerces.xni.XMLDocumentHandler
    public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl, org.apache.xerces.xni.XMLDocumentHandler
    public void endElement(QName qName, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Object getPropertyDefault(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    @Override // org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl, org.apache.xerces.xni.XMLDocumentHandler
    public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl, org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    private static final class XNI2SAX extends DefaultXMLDocumentHandler {
        private final AttributesProxy fAttributesProxy;
        private ContentHandler fContentHandler;
        protected NamespaceContext fNamespaceContext;
        private String fVersion;

        private XNI2SAX() {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void endDocument(Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void endElement(QName qName, Augmentations augmentations) throws XNIException {
        }

        public ContentHandler getContentHandler() {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
        }

        public void setContentHandler(ContentHandler contentHandler) {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void startDocument(XMLLocator xMLLocator, String str, NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
        }

        @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
        public void xmlDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
        }

        /* synthetic */ XNI2SAX(C18011 c18011) {
        }
    }

    private final class SAX2XNI extends DefaultHandler {
        private final Augmentations fAugmentations;
        private final QName fQName;
        final /* synthetic */ JAXPValidatorComponent this$0;

        private SAX2XNI(JAXPValidatorComponent jAXPValidatorComponent) {
        }

        private Augmentations aug() {
        }

        private Augmentations elementAug() {
        }

        private XMLDocumentHandler handler() {
        }

        private QName toQName(String str, String str2, String str3) {
        }

        private SAXException toSAXException(XNIException xNIException) {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        }

        /* synthetic */ SAX2XNI(JAXPValidatorComponent jAXPValidatorComponent, C18011 c18011) {
        }
    }
}
