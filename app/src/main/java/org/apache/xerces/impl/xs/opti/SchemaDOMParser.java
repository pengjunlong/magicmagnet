package org.apache.xerces.impl.xs.opti;

import java.io.IOException;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.w3c.dom.Document;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SchemaDOMParser extends DefaultXMLDocumentHandler {
    public static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    public static final String GENERATE_SYNTHETIC_ANNOTATION = "http://apache.org/xml/features/generate-synthetic-annotations";
    XMLParserConfiguration config;
    private int fAnnotationDepth;
    private ElementImpl fCurrentAnnotationElement;
    private int fDepth;
    private XMLAttributes fEmptyAttr;
    XMLErrorReporter fErrorReporter;
    private boolean fGenerateSyntheticAnnotation;
    private BooleanStack fHasNonSchemaAttributes;
    private int fInnerAnnotationDepth;
    protected XMLLocator fLocator;
    protected NamespaceContext fNamespaceContext;
    private BooleanStack fSawAnnotation;
    SchemaDOM schemaDOM;

    private static final class BooleanStack {
        private boolean[] fData;
        private int fDepth;

        private void ensureCapacity(int i) {
        }

        public void clear() {
        }

        public boolean pop() {
        }

        public void push(boolean z) {
        }

        public int size() {
        }
    }

    public SchemaDOMParser(XMLParserConfiguration xMLParserConfiguration) {
    }

    private boolean hasNonSchemaAttributes(QName qName, XMLAttributes xMLAttributes) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void endCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void endDocument(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void endElement(QName qName, Augmentations augmentations) throws XNIException {
    }

    public Document getDocument() {
    }

    public boolean getFeature(String str) {
    }

    public Object getProperty(String str) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    public void parse(XMLInputSource xMLInputSource) throws IOException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    public void reset() {
    }

    public void resetNodePool() {
    }

    public void setEntityResolver(XMLEntityResolver xMLEntityResolver) {
    }

    public void setFeature(String str, boolean z) {
    }

    public void setProperty(String str, Object obj) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void startCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void startDocument(XMLLocator xMLLocator, String str, NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultXMLDocumentHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }
}
