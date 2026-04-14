package org.apache.xerces.jaxp.validation;

import java.util.Iterator;
import org.apache.xerces.util.JAXPNamespaceContextWrapper;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLDocumentSource;
import org.javax.xml.namespace.NamespaceContext;
import org.javax.xml.stream.XMLEventFactory;
import org.javax.xml.stream.XMLEventWriter;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.XMLStreamReader;
import org.javax.xml.stream.events.Characters;
import org.javax.xml.stream.events.Comment;
import org.javax.xml.stream.events.DTD;
import org.javax.xml.stream.events.EndDocument;
import org.javax.xml.stream.events.EntityReference;
import org.javax.xml.stream.events.ProcessingInstruction;
import org.javax.xml.stream.events.StartDocument;
import org.javax.xml.transform.stax.StAXResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class StAXEventResultBuilder implements StAXDocumentHandler {
    private static final Iterator EMPTY_COLLECTION_ITERATOR = null;
    private final QName fAttrName;
    private final XMLEventFactory fEventFactory;
    private XMLEventWriter fEventWriter;
    private boolean fIgnoreChars;
    private boolean fInCDATA;
    private final JAXPNamespaceContextWrapper fNamespaceContext;
    private final StAXValidatorHelper fStAXValidatorHelper;

    /* renamed from: org.apache.xerces.jaxp.validation.StAXEventResultBuilder$1 */
    static class C18051 implements Iterator {
        C18051() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    final class AttributeIterator implements Iterator {
        XMLAttributes fAttributes;
        int fEnd;
        int fIndex;
        final /* synthetic */ StAXEventResultBuilder this$0;

        AttributeIterator(StAXEventResultBuilder stAXEventResultBuilder, XMLAttributes xMLAttributes, int i) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    final class NamespaceIterator implements Iterator {
        int fEnd;
        int fIndex;
        NamespaceContext fNC;
        final /* synthetic */ StAXEventResultBuilder this$0;

        NamespaceIterator(StAXEventResultBuilder stAXEventResultBuilder, int i) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public StAXEventResultBuilder(StAXValidatorHelper stAXValidatorHelper, JAXPNamespaceContextWrapper jAXPNamespaceContextWrapper) {
    }

    static /* synthetic */ QName access$000(StAXEventResultBuilder stAXEventResultBuilder) {
    }

    static /* synthetic */ XMLEventFactory access$100(StAXEventResultBuilder stAXEventResultBuilder) {
    }

    static /* synthetic */ JAXPNamespaceContextWrapper access$200(StAXEventResultBuilder stAXEventResultBuilder) {
    }

    private Iterator getAttributeIterator(XMLAttributes xMLAttributes, int i) {
    }

    private Iterator getNamespaceIterator() {
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
    public void startDocument(XMLLocator xMLLocator, String str, org.apache.xerces.xni.NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
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
    public void endDocument(EndDocument endDocument) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void entityReference(EntityReference entityReference) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void processingInstruction(ProcessingInstruction processingInstruction) throws XMLStreamException {
    }

    @Override // org.apache.xerces.jaxp.validation.StAXDocumentHandler
    public void startDocument(StartDocument startDocument) throws XMLStreamException {
    }
}
