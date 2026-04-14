package org.apache.xerces.dom;

import java.io.InputStream;
import java.io.Reader;
import org.w3c.dom.ls.LSInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMInputImpl implements LSInput {
    protected String fBaseSystemId;
    protected InputStream fByteStream;
    protected boolean fCertifiedText;
    protected Reader fCharStream;
    protected String fData;
    protected String fEncoding;
    protected String fPublicId;
    protected String fSystemId;

    public DOMInputImpl() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public String getBaseURI() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public InputStream getByteStream() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public boolean getCertifiedText() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public Reader getCharacterStream() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public String getEncoding() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public String getPublicId() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public String getStringData() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public String getSystemId() {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setBaseURI(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setByteStream(InputStream inputStream) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setCertifiedText(boolean z) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setCharacterStream(Reader reader) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setEncoding(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setPublicId(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setStringData(String str) {
    }

    @Override // org.w3c.dom.ls.LSInput
    public void setSystemId(String str) {
    }

    public DOMInputImpl(String str, String str2, String str3) {
    }

    public DOMInputImpl(String str, String str2, String str3, InputStream inputStream, String str4) {
    }

    public DOMInputImpl(String str, String str2, String str3, Reader reader, String str4) {
    }

    public DOMInputImpl(String str, String str2, String str3, String str4, String str5) {
    }
}
