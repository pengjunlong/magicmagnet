package org.apache.xerces.impl.xpath.regex;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class RegexParser {
    protected static final int S_INBRACKETS = 1;
    protected static final int S_INXBRACKETS = 2;
    protected static final int S_NORMAL = 0;
    static final int T_BACKSOLIDUS = 10;
    static final int T_CARET = 11;
    static final int T_CHAR = 0;
    static final int T_COMMENT = 21;
    static final int T_CONDITION = 23;
    static final int T_DOLLAR = 12;
    static final int T_DOT = 8;
    static final int T_EOF = 1;
    static final int T_INDEPENDENT = 18;
    static final int T_LBRACKET = 9;
    static final int T_LOOKAHEAD = 14;
    static final int T_LOOKBEHIND = 16;
    static final int T_LPAREN = 6;
    static final int T_LPAREN2 = 13;
    static final int T_MODIFIERS = 22;
    static final int T_NEGATIVELOOKAHEAD = 15;
    static final int T_NEGATIVELOOKBEHIND = 17;
    static final int T_OR = 2;
    static final int T_PLUS = 4;
    static final int T_POSIX_CHARCLASS_START = 20;
    static final int T_QUESTION = 5;
    static final int T_RPAREN = 7;
    static final int T_SET_OPERATIONS = 19;
    static final int T_STAR = 3;
    static final int T_XMLSCHEMA_CC_SUBTRACTION = 24;
    int chardata;
    int context;
    boolean hasBackReferences;
    int nexttoken;
    int offset;
    int options;
    int parenOpened;
    int parennumber;
    Vector references;
    String regex;
    int regexlen;
    ResourceBundle resources;

    static class ReferencePosition {
        int position;
        int refNumber;

        ReferencePosition(int i, int i2) {
        }
    }

    public RegexParser() {
    }

    protected static final void addCaseInsensitiveChar(RangeToken rangeToken, int i) {
    }

    protected static final void addCaseInsensitiveCharRange(RangeToken rangeToken, int i, int i2) {
    }

    private static final int hexChar(int i) {
    }

    boolean checkQuestion(int i) {
    }

    int decodeEscaped() throws ParseException {
    }

    final ParseException ex(String str, int i) {
    }

    Token getTokenForShorthand(int i) {
    }

    protected final boolean isSet(int i) {
    }

    final void next() {
    }

    synchronized Token parse(String str, int i) throws ParseException {
    }

    Token parseAtom() throws ParseException {
    }

    protected RangeToken parseCharacterClass(boolean z) throws ParseException {
    }

    Token parseFactor() throws ParseException {
    }

    Token parseRegex() throws ParseException {
    }

    protected RangeToken parseSetOperations() throws ParseException {
    }

    Token parseTerm() throws ParseException {
    }

    Token processBackreference() throws ParseException {
    }

    Token processBacksolidus_A() throws ParseException {
    }

    Token processBacksolidus_B() throws ParseException {
    }

    Token processBacksolidus_C() throws ParseException {
    }

    Token processBacksolidus_I() throws ParseException {
    }

    Token processBacksolidus_X() throws ParseException {
    }

    Token processBacksolidus_Z() throws ParseException {
    }

    Token processBacksolidus_b() throws ParseException {
    }

    Token processBacksolidus_c() throws ParseException {
    }

    Token processBacksolidus_g() throws ParseException {
    }

    Token processBacksolidus_gt() throws ParseException {
    }

    Token processBacksolidus_i() throws ParseException {
    }

    Token processBacksolidus_lt() throws ParseException {
    }

    protected RangeToken processBacksolidus_pP(int i) throws ParseException {
    }

    Token processBacksolidus_z() throws ParseException {
    }

    int processCIinCharacterClass(RangeToken rangeToken, int i) {
    }

    Token processCaret() throws ParseException {
    }

    Token processCondition() throws ParseException {
    }

    Token processDollar() throws ParseException {
    }

    Token processIndependent() throws ParseException {
    }

    Token processLookahead() throws ParseException {
    }

    Token processLookbehind() throws ParseException {
    }

    Token processModifiers() throws ParseException {
    }

    Token processNegativelookahead() throws ParseException {
    }

    Token processNegativelookbehind() throws ParseException {
    }

    Token processParen() throws ParseException {
    }

    Token processParen2() throws ParseException {
    }

    Token processPlus(Token token) throws ParseException {
    }

    Token processQuestion(Token token) throws ParseException {
    }

    Token processStar(Token token) throws ParseException {
    }

    final int read() {
    }

    protected final void setContext(int i) {
    }

    public void setLocale(Locale locale) {
    }

    public RegexParser(Locale locale) {
    }
}
