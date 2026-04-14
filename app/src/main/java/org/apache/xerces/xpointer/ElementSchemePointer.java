package org.apache.xerces.xpointer;

import java.util.HashMap;
import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLErrorHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ElementSchemePointer implements XPointerPart {
    private int[] fChildSequence;
    private int fCurrentChildDepth;
    private int fCurrentChildPosition;
    private int[] fCurrentChildSequence;
    protected XMLErrorHandler fErrorHandler;
    protected XMLErrorReporter fErrorReporter;
    int fFoundDepth;
    private boolean fIsElementFound;
    private boolean fIsFragmentResolved;
    private boolean fIsResolveElement;
    boolean fIsShortHand;
    private String fSchemeData;
    private String fSchemeName;
    private ShortHandPointer fShortHandPointer;
    private String fShortHandPointerName;
    private SymbolTable fSymbolTable;
    private boolean fWasOnlyEmptyElementFound;

    /* renamed from: org.apache.xerces.xpointer.ElementSchemePointer$1 */
    class C18281 extends Scanner {
        final /* synthetic */ ElementSchemePointer this$0;

        C18281(ElementSchemePointer elementSchemePointer, SymbolTable symbolTable) {
        }

        @Override // org.apache.xerces.xpointer.ElementSchemePointer.Scanner
        protected void addToken(Tokens tokens, int i) throws XNIException {
        }
    }

    private class Scanner {
        private static final byte CHARTYPE_DIGIT = 5;
        private static final byte CHARTYPE_INVALID = 0;
        private static final byte CHARTYPE_LETTER = 6;
        private static final byte CHARTYPE_MINUS = 2;
        private static final byte CHARTYPE_NONASCII = 8;
        private static final byte CHARTYPE_OTHER = 1;
        private static final byte CHARTYPE_PERIOD = 3;
        private static final byte CHARTYPE_SLASH = 4;
        private static final byte CHARTYPE_UNDERSCORE = 7;
        private final byte[] fASCIICharMap;
        private SymbolTable fSymbolTable;
        final /* synthetic */ ElementSchemePointer this$0;

        /* synthetic */ Scanner(ElementSchemePointer elementSchemePointer, SymbolTable symbolTable, C18281 c18281) {
        }

        static /* synthetic */ boolean access$300(Scanner scanner, SymbolTable symbolTable, Tokens tokens, String str, int i, int i2) throws XNIException {
        }

        private boolean scanExpr(SymbolTable symbolTable, Tokens tokens, String str, int i, int i2) throws XNIException {
        }

        private int scanNCName(String str, int i, int i2) {
        }

        protected void addToken(Tokens tokens, int i) throws XNIException {
        }

        private Scanner(ElementSchemePointer elementSchemePointer, SymbolTable symbolTable) {
        }
    }

    private final class Tokens {
        private static final int INITIAL_TOKEN_COUNT = 256;
        private static final int XPTRTOKEN_ELEM_CHILD = 1;
        private static final int XPTRTOKEN_ELEM_NCNAME = 0;
        private int fCurrentTokenIndex;
        private SymbolTable fSymbolTable;
        private int fTokenCount;
        private HashMap fTokenNames;
        private int[] fTokens;
        private final String[] fgTokenNames;
        final /* synthetic */ ElementSchemePointer this$0;

        /* synthetic */ Tokens(ElementSchemePointer elementSchemePointer, SymbolTable symbolTable, C18281 c18281) {
        }

        static /* synthetic */ String access$200(Tokens tokens, int i) {
        }

        static /* synthetic */ int access$400(Tokens tokens) {
        }

        static /* synthetic */ boolean access$500(Tokens tokens) {
        }

        static /* synthetic */ int access$600(Tokens tokens) throws XNIException {
        }

        static /* synthetic */ void access$700(Tokens tokens, int i) {
        }

        static /* synthetic */ void access$800(Tokens tokens, String str) {
        }

        private void addToken(String str) {
        }

        private Integer getToken(int i) {
        }

        private int getTokenCount() {
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

        private Tokens(ElementSchemePointer elementSchemePointer, SymbolTable symbolTable) {
        }

        private void addToken(int i) {
        }
    }

    public ElementSchemePointer() {
    }

    protected boolean checkMatch() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public String getSchemeData() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public String getSchemeName() {
    }

    protected void init() {
    }

    protected void initErrorReporter() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public boolean isChildFragmentResolved() {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public boolean isFragmentResolved() throws XNIException {
    }

    protected boolean matchChildSequence(QName qName, int i) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public void parseXPointer(String str) throws XNIException {
    }

    protected void reportError(String str, Object[] objArr) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public boolean resolveXPointer(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations, int i) throws XNIException {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public void setSchemeData(String str) {
    }

    @Override // org.apache.xerces.xpointer.XPointerPart
    public void setSchemeName(String str) {
    }

    public ElementSchemePointer(SymbolTable symbolTable) {
    }

    public ElementSchemePointer(SymbolTable symbolTable, XMLErrorReporter xMLErrorReporter) {
    }
}
