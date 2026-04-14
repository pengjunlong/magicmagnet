package org.apache.xml.serialize;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.w3c.dom.Element;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HTMLSerializer extends BaseMarkupSerializer {
    public static final String XHTMLNamespace = "http://www.w3.org/1999/xhtml";
    private boolean _xhtml;
    private String fUserXHTMLNamespace;

    protected HTMLSerializer(boolean z, OutputFormat outputFormat) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer, org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    public void endElementIO(String str, String str2, String str3) throws IOException {
    }

    protected String escapeURI(String str) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected String getEntityRef(int i) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void serializeElement(Element element) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer, org.apache.xml.serialize.Serializer
    public void setOutputFormat(OutputFormat outputFormat) {
    }

    public void setXHTMLNamespace(String str) {
    }

    protected void startDocument(String str) throws IOException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    @Override // org.xml.sax.DocumentHandler
    public void endElement(String str) throws SAXException {
    }

    public HTMLSerializer() {
    }

    public HTMLSerializer(OutputFormat outputFormat) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void characters(String str) throws IOException {
    }

    public HTMLSerializer(Writer writer, OutputFormat outputFormat) {
    }

    public HTMLSerializer(OutputStream outputStream, OutputFormat outputFormat) {
    }

    @Override // org.xml.sax.DocumentHandler
    public void startElement(String str, AttributeList attributeList) throws SAXException {
    }
}
