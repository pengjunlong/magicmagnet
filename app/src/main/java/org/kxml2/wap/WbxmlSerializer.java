package org.kxml2.wap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class WbxmlSerializer implements XmlSerializer {
    private int attrPage;
    Hashtable attrStartTable;
    Hashtable attrValueTable;
    Vector attributes;
    ByteArrayOutputStream buf;
    int depth;
    private String encoding;
    String name;
    String namespace;
    OutputStream out;
    String pending;
    Hashtable stringTable;
    ByteArrayOutputStream stringTableBuf;
    private int tagPage;
    Hashtable tagTable;

    static void writeInt(OutputStream outputStream, int i) throws IOException {
    }

    private void writeStr(String str) throws IOException {
    }

    private final void writeStrT(String str, boolean z) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException {
    }

    public void checkPending(boolean z) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() {
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
    public void ignorableWhitespace(String str) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) {
    }

    public void setAttrStartTable(int i, String[] strArr) {
    }

    public void setAttrValueTable(int i, String[] strArr) {
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
    public void setPrefix(String str, String str2) {
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
    }

    public void setTagTable(int i, String[] strArr) {
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

    void writeStrI(OutputStream outputStream, String str) throws IOException {
    }

    public void writeWapExtension(int i, Object obj) throws IOException {
    }
}
