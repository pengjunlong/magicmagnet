package org.apache.xerces.impl.xs.traversers;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.xerces.impl.xs.opti.SchemaDOMParser;
import org.apache.xerces.util.JAXPNamespaceContextWrapper;
import org.apache.xerces.util.StAXLocationWrapper;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLAttributesImpl;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.javax.xml.stream.XMLEventReader;
import org.javax.xml.stream.XMLStreamException;
import org.javax.xml.stream.XMLStreamReader;
import org.javax.xml.stream.events.EndElement;
import org.javax.xml.stream.events.StartElement;
import org.w3c.dom.Document;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class StAXSchemaParser {
    private static final int CHUNK_MASK = 1023;
    private static final int CHUNK_SIZE = 1024;
    private final QName fAttributeQName;
    private final XMLAttributesImpl fAttributes;
    private final char[] fCharBuffer;
    private final ArrayList fDeclaredPrefixes;
    private int fDepth;
    private final QName fElementQName;
    private final StAXLocationWrapper fLocationWrapper;
    private final JAXPNamespaceContextWrapper fNamespaceContext;
    private SchemaDOMParser fSchemaDOMParser;
    private final XMLStringBuffer fStringBuffer;
    private SymbolTable fSymbolTable;
    private final XMLString fTempString;

    private void addNamespaceDeclarations() {
    }

    private void fillDeclaredPrefixes(StartElement startElement) {
    }

    private void fillProcessingInstruction(String str) {
    }

    private void fillQName(QName qName, org.javax.xml.namespace.QName qName2) {
    }

    private void fillXMLAttributes(StartElement startElement) {
    }

    private void sendCharactersToSchemaParser(String str, boolean z) {
    }

    public Document getDocument() {
    }

    public void parse(XMLEventReader xMLEventReader) throws XMLStreamException, XNIException {
    }

    public void reset(SchemaDOMParser schemaDOMParser, SymbolTable symbolTable) {
    }

    private void fillDeclaredPrefixes(EndElement endElement) {
    }

    final void fillQName(QName qName, String str, String str2, String str3) {
    }

    private void fillDeclaredPrefixes(Iterator it) {
    }

    private void fillDeclaredPrefixes(XMLStreamReader xMLStreamReader) {
    }

    private void fillXMLAttributes(XMLStreamReader xMLStreamReader) {
    }

    public void parse(XMLStreamReader xMLStreamReader) throws XMLStreamException, XNIException {
    }
}
