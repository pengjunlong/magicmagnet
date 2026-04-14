package org.apache.xerces.xpointer;

import java.util.ArrayList;
import java.util.HashMap;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xinclude.XIncludeHandler;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLErrorHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class XPointerHandler extends XIncludeHandler implements XPointerProcessor {
    private final String ELEMENT_SCHEME_NAME;
    protected XMLErrorHandler fErrorHandler;
    protected boolean fFixupBase;
    protected boolean fFixupLang;
    protected boolean fFoundMatchingPtrPart;
    protected boolean fIsXPointerResolved;
    protected SymbolTable fSymbolTable;
    protected XMLErrorReporter fXPointerErrorReporter;
    protected XPointerPart fXPointerPart;
    protected ArrayList fXPointerParts;

    /* renamed from: org.apache.xerces.xpointer.XPointerHandler$1 */
    class C18291 extends Scanner {
        final /* synthetic */ XPointerHandler this$0;

        C18291(XPointerHandler xPointerHandler, SymbolTable symbolTable) {
        }

        @Override // org.apache.xerces.xpointer.XPointerHandler.Scanner
        protected void addToken(Tokens tokens, int i) throws XNIException {
        }
    }

    private class Scanner {
        private static final byte CHARTYPE_CARRET = 3;
        private static final byte CHARTYPE_CLOSE_PAREN = 5;
        private static final byte CHARTYPE_COLON = 10;
        private static final byte CHARTYPE_DIGIT = 9;
        private static final byte CHARTYPE_EQUAL = 11;
        private static final byte CHARTYPE_INVALID = 0;
        private static final byte CHARTYPE_LETTER = 12;
        private static final byte CHARTYPE_MINUS = 6;
        private static final byte CHARTYPE_NONASCII = 14;
        private static final byte CHARTYPE_OPEN_PAREN = 4;
        private static final byte CHARTYPE_OTHER = 1;
        private static final byte CHARTYPE_PERIOD = 7;
        private static final byte CHARTYPE_SLASH = 8;
        private static final byte CHARTYPE_UNDERSCORE = 13;
        private static final byte CHARTYPE_WHITESPACE = 2;
        private final byte[] fASCIICharMap;
        private SymbolTable fSymbolTable;
        final /* synthetic */ XPointerHandler this$0;

        /* synthetic */ Scanner(XPointerHandler xPointerHandler, SymbolTable symbolTable, C18291 c18291) {
        }

        static /* synthetic */ boolean access$400(Scanner scanner, SymbolTable symbolTable, Tokens tokens, String str, int i, int i2) throws XNIException {
        }

        private int scanData(String str, StringBuffer stringBuffer, int i, int i2) {
        }

        private boolean scanExpr(SymbolTable symbolTable, Tokens tokens, String str, int i, int i2) throws XNIException {
        }

        private int scanNCName(String str, int i, int i2) {
        }

        protected void addToken(Tokens tokens, int i) throws XNIException {
        }

        private Scanner(XPointerHandler xPointerHandler, SymbolTable symbolTable) {
        }
    }

    private final class Tokens {
        private static final int INITIAL_TOKEN_COUNT = 256;
        private static final int XPTRTOKEN_CLOSE_PAREN = 1;
        private static final int XPTRTOKEN_OPEN_PAREN = 0;
        private static final int XPTRTOKEN_SCHEMEDATA = 4;
        private static final int XPTRTOKEN_SCHEMENAME = 3;
        private static final int XPTRTOKEN_SHORTHAND = 2;
        private int fCurrentTokenIndex;
        private SymbolTable fSymbolTable;
        private int fTokenCount;
        private HashMap fTokenNames;
        private int[] fTokens;
        private final String[] fgTokenNames;
        final /* synthetic */ XPointerHandler this$0;

        /* synthetic */ Tokens(XPointerHandler xPointerHandler, SymbolTable symbolTable, C18291 c18291) {
        }

        static /* synthetic */ String access$200(Tokens tokens, int i) {
        }

        static /* synthetic */ boolean access$500(Tokens tokens) {
        }

        static /* synthetic */ int access$600(Tokens tokens) throws XNIException {
        }

        static /* synthetic */ int access$700(Tokens tokens) throws XNIException {
        }

        static /* synthetic */ void access$800(Tokens tokens, String str) {
        }

        static /* synthetic */ void access$900(Tokens tokens, int i) {
        }

        private void addToken(String str) {
        }

        private String getTokenString(int i) {
        }

        private boolean hasMore() {
        }

        private int nextToken() throws XNIException {
        }

        private String nextTokenAsString() throws XNIException {
        }

        private int peekToken() throws XNIException {
        }

        private void rewind() {
        }

        private Tokens(XPointerHandler xPointerHandler, SymbolTable symbolTable) {
        }

        private void addToken(int i) {
        }
    }

    public XPointerHandler() {
    }

    static /* synthetic */ void access$300(XPointerHandler xPointerHandler, String str, Object[] objArr) throws XNIException {
    }

    private void reportError(String str, Object[] objArr) throws XNIException {
    }

    private void reportWarning(String str, Object[] objArr) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void endCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void endElement(QName qName, Augmentations augmentations) throws XNIException {
    }

    public ArrayList getPointerParts() {
    }

    public XPointerPart getXPointerPart() {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected void init() {
    }

    protected void initErrorReporter() {
    }

    public boolean isChildFragmentResolved() throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerProcessor
    public boolean isFragmentResolved() throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerProcessor
    public boolean isXPointerResolved() throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerProcessor
    public void parseXPointer(String str) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerProcessor
    public boolean resolveXPointer(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations, int i) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.parser.XMLDocumentSource
    public void setDocumentHandler(XMLDocumentHandler xMLDocumentHandler) {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void startCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xinclude.XIncludeHandler, org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    public XPointerHandler(SymbolTable symbolTable, XMLErrorHandler xMLErrorHandler, XMLErrorReporter xMLErrorReporter) {
    }
}
