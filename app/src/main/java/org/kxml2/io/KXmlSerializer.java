package org.kxml2.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class KXmlSerializer implements XmlSerializer {
    private int auto;
    private int depth;
    private String[] elementStack;
    private String encoding;
    private boolean[] indent;
    private int[] nspCounts;
    private String[] nspStack;
    private boolean pending;
    private boolean unicode;
    private Writer writer;

    private final void check(boolean z) throws IOException {
    }

    private final String getPrefix(String str, boolean z, boolean z2) throws IOException {
    }

    private final void writeEscaped(String str, int i) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
    }
}
