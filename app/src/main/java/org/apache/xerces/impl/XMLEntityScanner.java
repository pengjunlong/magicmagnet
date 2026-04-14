package org.apache.xerces.impl;

import java.io.EOFException;
import java.io.IOException;
import org.apache.xerces.impl.XMLEntityManager;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLString;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLEntityScanner implements XMLLocator {
    private static final boolean DEBUG_BUFFER = false;
    private static final boolean DEBUG_ENCODINGS = false;
    private static final EOFException END_OF_DOCUMENT_ENTITY = null;
    protected int fBufferSize;
    protected XMLEntityManager.ScannedEntity fCurrentEntity;
    private XMLEntityManager fEntityManager;
    protected XMLErrorReporter fErrorReporter;
    protected SymbolTable fSymbolTable;

    /* renamed from: org.apache.xerces.impl.XMLEntityScanner$1 */
    static class C17821 extends EOFException {
        private static final long serialVersionUID = 980337771224675268L;

        C17821() {
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
        }
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final String getBaseSystemId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final int getCharacterOffset() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final int getColumnNumber() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final String getEncoding() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final String getExpandedSystemId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final int getLineNumber() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final String getLiteralSystemId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final String getPublicId() {
    }

    @Override // org.apache.xerces.xni.XMLLocator
    public final String getXMLVersion() {
    }

    public final boolean isExternal() {
    }

    final boolean load(int i, boolean z) throws IOException {
    }

    public int peekChar() throws IOException {
    }

    public final void reset(SymbolTable symbolTable, XMLEntityManager xMLEntityManager, XMLErrorReporter xMLErrorReporter) {
    }

    public int scanChar() throws IOException {
    }

    public int scanContent(XMLString xMLString) throws IOException {
    }

    public boolean scanData(String str, XMLStringBuffer xMLStringBuffer) throws IOException {
    }

    public int scanLiteral(int i, XMLString xMLString) throws IOException {
    }

    public String scanNCName() throws IOException {
    }

    public String scanName() throws IOException {
    }

    public String scanNmtoken() throws IOException {
    }

    public boolean scanQName(QName qName) throws IOException {
    }

    public final void setBufferSize(int i) {
    }

    public final void setCurrentEntity(XMLEntityManager.ScannedEntity scannedEntity) {
    }

    public final void setEncoding(String str) throws IOException {
    }

    public final void setXMLVersion(String str) {
    }

    public boolean skipChar(int i) throws IOException {
    }

    public final boolean skipDeclSpaces() throws IOException {
    }

    public boolean skipSpaces() throws IOException {
    }

    public boolean skipString(String str) throws IOException {
    }
}
