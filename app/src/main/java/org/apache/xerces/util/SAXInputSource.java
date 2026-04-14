package org.apache.xerces.util;

import java.io.InputStream;
import java.io.Reader;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class SAXInputSource extends XMLInputSource {
    private InputSource fInputSource;
    private XMLReader fXMLReader;

    public SAXInputSource() {
    }

    public InputSource getInputSource() {
    }

    public XMLReader getXMLReader() {
    }

    @Override // org.apache.xerces.xni.parser.XMLInputSource
    public void setByteStream(InputStream inputStream) {
    }

    @Override // org.apache.xerces.xni.parser.XMLInputSource
    public void setCharacterStream(Reader reader) {
    }

    @Override // org.apache.xerces.xni.parser.XMLInputSource
    public void setEncoding(String str) {
    }

    public void setInputSource(InputSource inputSource) {
    }

    @Override // org.apache.xerces.xni.parser.XMLInputSource
    public void setPublicId(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLInputSource
    public void setSystemId(String str) {
    }

    public void setXMLReader(XMLReader xMLReader) {
    }

    public SAXInputSource(InputSource inputSource) {
    }

    public SAXInputSource(XMLReader xMLReader, InputSource inputSource) {
    }
}
