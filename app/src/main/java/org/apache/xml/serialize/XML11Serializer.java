package org.apache.xml.serialize;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.xerces.util.NamespaceSupport;
import org.apache.xerces.util.SymbolTable;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XML11Serializer extends XMLSerializer {
    protected static final boolean DEBUG = false;
    protected static final String PREFIX = "NS";
    protected boolean fDOML1;
    protected NamespaceSupport fLocalNSBinder;
    protected NamespaceSupport fNSBinder;
    protected int fNamespaceCounter;
    protected boolean fNamespaces;
    protected SymbolTable fSymbolTable;

    public XML11Serializer() {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer, org.xml.sax.ContentHandler, org.xml.sax.DocumentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected final void printCDATAText(String str) throws IOException {
    }

    @Override // org.apache.xml.serialize.XMLSerializer, org.apache.xml.serialize.BaseMarkupSerializer
    protected void printEscaped(String str) throws IOException {
    }

    @Override // org.apache.xml.serialize.XMLSerializer, org.apache.xml.serialize.BaseMarkupSerializer
    protected void printText(String str, boolean z, boolean z2) throws IOException {
    }

    @Override // org.apache.xml.serialize.XMLSerializer
    protected final void printXMLChar(int i) throws IOException {
    }

    @Override // org.apache.xml.serialize.XMLSerializer, org.apache.xml.serialize.BaseMarkupSerializer
    public boolean reset() {
    }

    @Override // org.apache.xml.serialize.BaseMarkupSerializer
    protected final void surrogates(int i, int i2, boolean z) throws IOException {
    }

    public XML11Serializer(OutputFormat outputFormat) {
    }

    public XML11Serializer(Writer writer, OutputFormat outputFormat) {
    }

    public XML11Serializer(OutputStream outputStream, OutputFormat outputFormat) {
    }

    @Override // org.apache.xml.serialize.XMLSerializer, org.apache.xml.serialize.BaseMarkupSerializer
    protected void printText(char[] cArr, int i, int i2, boolean z, boolean z2) throws IOException {
    }
}
