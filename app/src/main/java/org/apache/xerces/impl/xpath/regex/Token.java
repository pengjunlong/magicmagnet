package org.apache.xerces.impl.xpath.regex;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class Token implements Serializable {
    static final int ANCHOR = 8;
    static final int BACKREFERENCE = 12;
    static final int CHAR = 0;
    static final int CHAR_FINAL_QUOTE = 30;
    static final int CHAR_INIT_QUOTE = 29;
    static final int CHAR_LETTER = 31;
    static final int CHAR_MARK = 32;
    static final int CHAR_NUMBER = 33;
    static final int CHAR_OTHER = 35;
    static final int CHAR_PUNCTUATION = 36;
    static final int CHAR_SEPARATOR = 34;
    static final int CHAR_SYMBOL = 37;
    static final int CLOSURE = 3;
    static final int CONCAT = 1;
    static final int CONDITION = 26;
    static final boolean COUNTTOKENS = true;
    static final int DOT = 11;
    static final int EMPTY = 7;
    static final int FC_ANY = 2;
    static final int FC_CONTINUE = 0;
    static final int FC_TERMINAL = 1;
    static final int INDEPENDENT = 24;
    static final int LOOKAHEAD = 20;
    static final int LOOKBEHIND = 22;
    static final int MODIFIERGROUP = 25;
    static final int NEGATIVELOOKAHEAD = 21;
    static final int NEGATIVELOOKBEHIND = 23;
    private static final int NONBMP_BLOCK_START = 84;
    static final int NONGREEDYCLOSURE = 9;
    static final int NRANGE = 5;
    static final int PAREN = 6;
    static final int RANGE = 4;
    static final int STRING = 10;
    static final int UNION = 2;
    static final int UTF16_MAX = 1114111;
    private static final String[] blockNames = null;
    static final String blockRanges = "\u0000\u007f\u0080ÿĀſƀɏɐʯʰ˿̀ͯͰϿЀӿ\u0530֏\u0590\u05ff\u0600ۿ܀ݏހ\u07bfऀॿঀ\u09ff\u0a00\u0a7f\u0a80૿\u0b00\u0b7f\u0b80\u0bffఀ౿ಀ\u0cffഀൿ\u0d80\u0dff\u0e00\u0e7f\u0e80\u0effༀ\u0fffက႟Ⴀჿᄀᇿሀ\u137fᎠ\u13ff᐀ᙿ\u1680\u169fᚠ\u16ffក\u17ff᠀\u18afḀỿἀ\u1fff\u2000\u206f⁰\u209f₠\u20cf⃐\u20ff℀⅏⅐\u218f←⇿∀⋿⌀⏿␀\u243f⑀\u245f①⓿─╿▀▟■◿☀⛿✀➿⠀⣿⺀\u2eff⼀\u2fdf⿰⿿\u3000〿\u3040ゟ゠ヿ\u3100ㄯ\u3130\u318f㆐㆟ㆠㆿ㈀㋿㌀㏿㐀䶵一鿿ꀀ\ua48f꒐\ua4cf가힣\ue000\uf8ff豈\ufaffﬀﭏﭐ﷿︠︯︰﹏﹐\ufe6fﹰ\ufefe\ufeff\ufeff\uff00\uffef";
    private static final Hashtable categories = null;
    private static final Hashtable categories2 = null;
    private static final String[] categoryNames = null;
    static final int[] nonBMPBlockRanges = null;
    static Hashtable nonxs = null;
    private static final long serialVersionUID = 8484976002585487481L;
    static Token token_0to9 = null;
    private static Token token_ccs = null;
    static Token token_dot = null;
    static Token token_empty = null;
    private static Token token_grapheme = null;
    static Token token_linebeginning = null;
    static Token token_linebeginning2 = null;
    static Token token_lineend = null;
    static Token token_not_0to9 = null;
    static Token token_not_spaces = null;
    static Token token_not_wordchars = null;
    static Token token_not_wordedge = null;
    static Token token_spaces = null;
    static Token token_stringbeginning = null;
    static Token token_stringend = null;
    static Token token_stringend2 = null;
    static Token token_wordbeginning = null;
    static Token token_wordchars = null;
    static Token token_wordedge = null;
    static Token token_wordend = null;
    static int tokens = 0;
    static final String viramaString = "्্੍્୍்్್്ฺ྄";
    final int type;

    static class CharToken extends Token {
        private static final long serialVersionUID = -4394272816279496989L;
        final int chardata;

        CharToken(int i, int i2) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int getChar() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        boolean match(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class ClosureToken extends Token {
        private static final long serialVersionUID = 1308971930673997452L;
        final Token child;
        int max;
        int min;

        ClosureToken(int i, Token token) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        Token getChild(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        final int getMax() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        final int getMin() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        final void setMax(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        final void setMin(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int size() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class ConcatToken extends Token {
        private static final long serialVersionUID = 8717321425541346381L;
        final Token child;
        final Token child2;

        ConcatToken(Token token, Token token2) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        Token getChild(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int size() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class ConditionToken extends Token {
        private static final long serialVersionUID = 4353765277910594411L;
        final Token condition;
        final Token no;
        final int refNumber;
        final Token yes;

        ConditionToken(int i, Token token, Token token2, Token token3) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        Token getChild(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int size() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class FixedStringContainer {
        int options;
        Token token;

        FixedStringContainer() {
        }
    }

    static class ModifierToken extends Token {
        private static final long serialVersionUID = -9114536559696480356L;
        final int add;
        final Token child;
        final int mask;

        ModifierToken(Token token, int i, int i2) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        Token getChild(int i) {
        }

        int getOptions() {
        }

        int getOptionsMask() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int size() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class ParenToken extends Token {
        private static final long serialVersionUID = -5938014719827987704L;
        final Token child;
        final int parennumber;

        ParenToken(int i, Token token, int i2) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        Token getChild(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int getParenNumber() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int size() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class StringToken extends Token {
        private static final long serialVersionUID = -4614366944218504172L;
        final int refNumber;
        String string;

        StringToken(int i, String str, int i2) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int getReferenceNumber() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        String getString() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    static class UnionToken extends Token {
        private static final long serialVersionUID = -2568843945989489861L;
        Vector children;

        UnionToken(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        void addChild(Token token) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        Token getChild(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        int size() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Token
        public String toString(int i) {
        }
    }

    protected Token(int i) {
    }

    static Token complementRanges(Token token) {
    }

    private static CharToken createAnchor(int i) {
    }

    static StringToken createBackReference(int i) {
    }

    static CharToken createChar(int i) {
    }

    static ClosureToken createClosure(Token token) {
    }

    static ConcatToken createConcat(Token token, Token token2) {
    }

    static ConditionToken createCondition(int i, Token token, Token token2, Token token3) {
    }

    static Token createEmpty() {
    }

    static ParenToken createLook(int i, Token token) {
    }

    static ModifierToken createModifierGroup(Token token, int i, int i2) {
    }

    static ClosureToken createNGClosure(Token token) {
    }

    static RangeToken createNRange() {
    }

    static ParenToken createParen(Token token, int i) {
    }

    static RangeToken createRange() {
    }

    static StringToken createString(String str) {
    }

    static UnionToken createUnion() {
    }

    static synchronized Token getCombiningCharacterSequence() {
    }

    static synchronized Token getGraphemePattern() {
    }

    protected static RangeToken getRange(String str, boolean z) {
    }

    protected static boolean isRegisterNonXS(String str) {
    }

    private static final boolean isSet(int i, int i2) {
    }

    private final boolean isShorterThan(Token token) {
    }

    protected static void registerNonXS(String str) {
    }

    private static void setAlias(String str, String str2, boolean z) {
    }

    void addChild(Token token) {
    }

    protected void addRange(int i, int i2) {
    }

    final int analyzeFirstCharacter(RangeToken rangeToken, int i) {
    }

    protected void compactRanges() {
    }

    final void findFixedString(FixedStringContainer fixedStringContainer, int i) {
    }

    int getChar() {
    }

    Token getChild(int i) {
    }

    int getMax() {
    }

    final int getMaxLength() {
    }

    int getMin() {
    }

    final int getMinLength() {
    }

    int getParenNumber() {
    }

    int getReferenceNumber() {
    }

    String getString() {
    }

    protected void intersectRanges(Token token) {
    }

    boolean match(int i) {
    }

    protected void mergeRanges(Token token) {
    }

    void setMax(int i) {
    }

    void setMin(int i) {
    }

    int size() {
    }

    protected void sortRanges() {
    }

    protected void subtractRanges(Token token) {
    }

    public String toString() {
    }

    public String toString(int i) {
    }

    static UnionToken createConcat() {
    }

    protected static RangeToken getRange(String str, boolean z, boolean z2) {
    }
}
