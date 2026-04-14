package org.apache.xerces.impl.xs.traversers;

import org.apache.xerces.impl.xs.opti.SchemaDOMParser;
import org.apache.xerces.util.NamespaceSupport;
import org.apache.xerces.util.SAXLocatorWrapper;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLAttributesImpl;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLParseException;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SchemaContentHandler implements ContentHandler {
    private final QName fAttributeQName;
    private final XMLAttributesImpl fAttributes;
    private final QName fElementQName;
    private NamespaceSupport fNamespaceContext;
    private boolean fNamespacePrefixes;
    private boolean fNeedPushNSContext;
    private final SAXLocatorWrapper fSAXLocatorWrapper;
    private SchemaDOMParser fSchemaDOMParser;
    private final XMLStringBuffer fStringBuffer;
    private boolean fStringsInternalized;
    private SymbolTable fSymbolTable;
    private final XMLString fTempString;

    private void addNamespaceDeclarations(int i) {
    }

    static void convertToSAXException(XNIException xNIException) throws SAXException {
    }

    static void convertToSAXParseException(XMLParseException xMLParseException) throws SAXException {
    }

    private void fillQName(QName qName, String str, String str2, String str3) {
    }

    private void fillXMLAttributes(Attributes attributes) {
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    public Document getDocument() {
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    public void reset(SchemaDOMParser schemaDOMParser, SymbolTable symbolTable, boolean z, boolean z2) {
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }
}
