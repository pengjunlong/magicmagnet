package org.apache.xml.serialize;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.xerces.util.NamespaceSupport;
import org.apache.xerces.util.SymbolTable;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLSerializer extends BaseMarkupSerializer {
    protected static final boolean DEBUG = false;
    protected static final String PREFIX = "NS";
    protected NamespaceSupport fLocalNSBinder;
    protected NamespaceSupport fNSBinder;
    protected boolean fNamespacePrefixes;
    protected boolean fNamespaces;
    private boolean fPreserveSpace;
    protected SymbolTable fSymbolTable;

    public XMLSerializer() {
    }

    private Attributes extractNamespaces(Attributes attributes) throws SAXException {
    }

    private void printAttribute(String str, String str2, boolean z, Attr attr) throws IOException {
    }

    private void printNamespaceAttr(String str, String str2) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void checkUnboundNamespacePrefixedNode(Node node) throws IOException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    public void endElementIO(String str, String str2, String str3) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected String getEntityRef(int i) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void printEscaped(String str) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void printText(String str, boolean z, boolean z2) throws IOException {
    }

    protected void printXMLChar(int i) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    public boolean reset() {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void serializeElement(Element element) throws IOException {
    }

    public void setNamespaces(boolean z) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer, org.apache.xml.serialize.Serializer
    public void setOutputFormat(OutputFormat outputFormat) {
    }

    protected void startDocument(String str) throws IOException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    @Override // org.xml.sax.DocumentHandler
    public void endElement(String str) throws SAXException {
    }

    public XMLSerializer(OutputFormat outputFormat) {
    }

    public XMLSerializer(Writer writer, OutputFormat outputFormat) {
    }

    public XMLSerializer(OutputStream outputStream, OutputFormat outputFormat) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void printText(char[] cArr, int i, int i2, boolean z, boolean z2) throws IOException {
    }

    @Override // org.xml.sax.DocumentHandler
    public void startElement(String str, AttributeList attributeList) throws SAXException {
    }
}
