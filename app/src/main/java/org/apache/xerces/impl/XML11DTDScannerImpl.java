package org.apache.xerces.impl;

import java.io.IOException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XML11DTDScannerImpl extends XMLDTDScannerImpl {
    private final XMLStringBuffer fStringBuffer;

    public XML11DTDScannerImpl() {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected String getVersionNotSupportedKey() {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean isInvalid(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean isInvalidLiteral(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected int isUnchangedByNormalization(XMLString xMLString) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean isValidNCName(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean isValidNameChar(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean isValidNameStartChar(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean isValidNameStartHighSurrogate(int i) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected void normalizeWhitespace(XMLString xMLString) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean scanPubidLiteral(XMLString xMLString) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean versionSupported(String str) {
    }

    public XML11DTDScannerImpl(SymbolTable symbolTable, XMLErrorReporter xMLErrorReporter, XMLEntityManager xMLEntityManager) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected void normalizeWhitespace(XMLString xMLString, int i) {
    }
}
