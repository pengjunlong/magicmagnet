package org.apache.xerces.impl;

import java.io.IOException;
import org.apache.xerces.util.XMLStringBuffer;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XML11DocumentScannerImpl extends XMLDocumentScannerImpl {
    private final XMLString fString;
    private final XMLStringBuffer fStringBuffer;
    private final XMLStringBuffer fStringBuffer2;
    private final XMLStringBuffer fStringBuffer3;

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
    protected boolean scanAttributeValue(XMLString xMLString, XMLString xMLString2, String str, boolean z, String str2) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLDocumentFragmentScannerImpl
    protected int scanContent() throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean scanPubidLiteral(XMLString xMLString) throws IOException, XNIException {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected boolean versionSupported(String str) {
    }

    @Override // org.apache.xerces.impl.XMLScanner
    protected void normalizeWhitespace(XMLString xMLString, int i) {
    }
}
