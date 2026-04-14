package org.apache.xerces.xinclude;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XIncludeTextReader {
    private XMLErrorReporter fErrorReporter;
    private final XIncludeHandler fHandler;
    private Reader fReader;
    private XMLInputSource fSource;
    private XMLString fTempString;

    public XIncludeTextReader(XMLInputSource xMLInputSource, XIncludeHandler xIncludeHandler, int i) throws IOException {
    }

    private Reader createASCIIReader(InputStream inputStream) {
    }

    private Reader createLatin1Reader(InputStream inputStream) {
    }

    private Reader createUTF16Reader(InputStream inputStream, boolean z) {
    }

    private Reader createUTF8Reader(InputStream inputStream) {
    }

    public void close() throws IOException {
    }

    protected String consumeBOM(InputStream inputStream, String str) throws IOException {
    }

    protected String getEncodingName(InputStream inputStream) throws IOException {
    }

    protected Reader getReader(XMLInputSource xMLInputSource) throws IOException {
    }

    protected boolean isValid(int i) {
    }

    public void parse() throws IOException {
    }

    protected void setBufferSize(int i) {
    }

    public void setErrorReporter(XMLErrorReporter xMLErrorReporter) {
    }

    public void setInputSource(XMLInputSource xMLInputSource) {
    }

    protected String getEncodingName(byte[] bArr) {
    }
}
