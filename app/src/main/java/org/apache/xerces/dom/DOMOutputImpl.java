package org.apache.xerces.dom;

import java.io.OutputStream;
import java.io.Writer;
import org.w3c.dom.ls.LSOutput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMOutputImpl implements LSOutput {
    protected OutputStream fByteStream;
    protected Writer fCharStream;
    protected String fEncoding;
    protected String fSystemId;

    @Override // org.w3c.dom.ls.LSOutput
    public OutputStream getByteStream() {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public Writer getCharacterStream() {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public String getEncoding() {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public String getSystemId() {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public void setByteStream(OutputStream outputStream) {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public void setCharacterStream(Writer writer) {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public void setEncoding(String str) {
    }

    @Override // org.w3c.dom.ls.LSOutput
    public void setSystemId(String str) {
    }
}
