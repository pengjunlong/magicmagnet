package org.apache.xerces.jaxp.validation;

import org.apache.xerces.util.JAXPNamespaceContextWrapper;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLDocumentSource;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.XMLStreamReader;
import org.javax.xml.stream.XMLStreamWriter;
import org.javax.xml.stream.events.Characters;
import org.javax.xml.stream.events.Comment;
import org.javax.xml.stream.events.DTD;
import org.javax.xml.stream.events.EndDocument;
import org.javax.xml.stream.events.EntityReference;
import org.javax.xml.stream.events.ProcessingInstruction;
import org.javax.xml.stream.events.StartDocument;
import org.javax.xml.transform.stax.StAXResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class StAXStreamResultBuilder implements StAXDocumentHandler {
    private final QName fAttrName;
    private boolean fIgnoreChars;
    private boolean fInCDATA;
    private final JAXPNamespaceContextWrapper fNamespaceContext;
    private XMLStreamWriter fStreamWriter;

    public StAXStreamResultBuilder(JAXPNamespaceContextWrapper jAXPNamespaceContextWrapper) {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void cdata(Characters characters) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void characters(Characters characters) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void comment(XMLStreamReader xMLStreamReader) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void doctypeDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void doctypeDecl(DTD dtd) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endDocument(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void endDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endElement(QName qName, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endGeneralEntity(String str, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void entityReference(XMLStreamReader xMLStreamReader) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public XMLDocumentSource getDocumentSource() {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void processingInstruction(XMLStreamReader xMLStreamReader) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void setDocumentSource(XMLDocumentSource xMLDocumentSource) {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void setIgnoringCharacters(boolean z) {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void setStAXResult(StAXResult stAXResult) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startDocument(XMLLocator xMLLocator, String str, NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void startDocument(XMLStreamReader xMLStreamReader) throws XMLStreamException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startGeneralEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void textDecl(String str, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void xmlDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void comment(Comment comment) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void entityReference(EntityReference entityReference) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void endDocument(EndDocument endDocument) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void startDocument(StartDocument startDocument) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void processingInstruction(ProcessingInstruction processingInstruction) throws XMLStreamException {
    }
}
