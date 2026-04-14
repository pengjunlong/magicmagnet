package org.apache.xml.serialize;

import java.io.IOException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TextSerializer extends BaseMarkupSerializer {
    @Override // org.apache.xml.serialize.BaseMarkupSerializer, org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    public void comment(String str) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer, org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i, int i2) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected ElementState content() {
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    public void endElementIO(String str) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected String getEntityRef(int i) {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    public void processingInstructionIO(String str, String str2) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void serializeElement(Element element) throws IOException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected void serializeNode(Node node) throws IOException {
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

    @Override // org.xml.sax.DocumentHandler
    public void startElement(String str, AttributeList attributeList) throws SAXException {
    }

    protected void characters(String str, boolean z) throws IOException {
    }
}
