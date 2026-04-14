package org.apache.xerces.impl.xpath.regex;

import java.io.Serializable;
import java.text.CharacterIterator;
import java.util.Locale;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class RegularExpression implements Serializable {
    static final int CARRIAGE_RETURN = 13;
    static final boolean DEBUG = false;
    static final int EXTENDED_COMMENT = 16;
    static final int IGNORE_CASE = 2;
    static final int LINE_FEED = 10;
    static final int LINE_SEPARATOR = 8232;
    static final int MULTIPLE_LINES = 8;
    static final int PARAGRAPH_SEPARATOR = 8233;
    static final int PROHIBIT_FIXED_STRING_OPTIMIZATION = 256;
    static final int PROHIBIT_HEAD_CHARACTER_OPTIMIZATION = 128;
    static final int SINGLE_LINE = 4;
    static final int SPECIAL_COMMA = 1024;
    static final int UNICODE_WORD_BOUNDARY = 64;
    static final int USE_UNICODE_CATEGORY = 32;
    private static final int WT_IGNORE = 0;
    private static final int WT_LETTER = 1;
    private static final int WT_OTHER = 2;
    static final int XMLSCHEMA_MODE = 512;
    private static final long serialVersionUID = 6242499334195006401L;
    transient Context context;
    transient RangeToken firstChar;
    transient String fixedString;
    transient boolean fixedStringOnly;
    transient int fixedStringOptions;
    transient BMPattern fixedStringTable;
    boolean hasBackReferences;
    transient int minlength;
    int nofparen;
    transient int numberOfClosures;
    transient Op operations;
    int options;
    String regex;
    Token tokentree;

    static final class CharArrayTarget extends ExpressionTarget {
        char[] target;

        CharArrayTarget(char[] cArr) {
        }

        private final boolean regionMatchesIgnoreCase(int i, int i2, String str, int i3) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        char charAt(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final boolean regionMatches(boolean z, int i, int i2, String str, int i3) {
        }

        final void resetTarget(char[] cArr) {
        }

        private final boolean regionMatches(int i, int i2, String str, int i3) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final boolean regionMatches(boolean z, int i, int i2, int i3, int i4) {
        }

        private final boolean regionMatches(int i, int i2, int i3, int i4) {
        }

        private final boolean regionMatchesIgnoreCase(int i, int i2, int i3, int i4) {
        }
    }

    static final class CharacterIteratorTarget extends ExpressionTarget {
        CharacterIterator target;

        CharacterIteratorTarget(CharacterIterator characterIterator) {
        }

        private final boolean regionMatchesIgnoreCase(int i, int i2, String str, int i3) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final char charAt(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final boolean regionMatches(boolean z, int i, int i2, String str, int i3) {
        }

        final void resetTarget(CharacterIterator characterIterator) {
        }

        private final boolean regionMatches(int i, int i2, String str, int i3) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final boolean regionMatches(boolean z, int i, int i2, int i3, int i4) {
        }

        private final boolean regionMatches(int i, int i2, int i3, int i4) {
        }

        private final boolean regionMatchesIgnoreCase(int i, int i2, int i3, int i4) {
        }
    }

    static final class ClosureContext {
        int currentIndex;
        int[] offsets;

        ClosureContext() {
        }

        private int[] expandOffsets() {
        }

        void addOffset(int i) {
        }

        boolean contains(int i) {
        }

        void reset() {
        }
    }

    static abstract class ExpressionTarget {
        ExpressionTarget() {
        }

        abstract char charAt(int i);

        abstract boolean regionMatches(boolean z, int i, int i2, int i3, int i4);

        abstract boolean regionMatches(boolean z, int i, int i2, String str, int i3);
    }

    static final class StringTarget extends ExpressionTarget {
        private String target;

        StringTarget(String str) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final char charAt(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final boolean regionMatches(boolean z, int i, int i2, String str, int i3) {
        }

        final void resetTarget(String str) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.RegularExpression.ExpressionTarget
        final boolean regionMatches(boolean z, int i, int i2, int i3, int i4) {
        }
    }

    public RegularExpression(String str) throws ParseException {
    }

    private synchronized void compile(Token token) {
    }

    private static final int getPreviousWordType(ExpressionTarget expressionTarget, int i, int i2, int i3, int i4) {
    }

    private static final int getWordType(ExpressionTarget expressionTarget, int i, int i2, int i3, int i4) {
    }

    private static final int getWordType0(char c, int i) {
    }

    private static final boolean isEOLChar(int i) {
    }

    private static final boolean isSet(int i, int i2) {
    }

    private static final boolean isWordChar(int i) {
    }

    private int match(Context context, Op op, int i, int i2, int i3) {
    }

    private boolean matchChar(int i, int i2, boolean z) {
    }

    private static final boolean matchIgnoreCase(int i, int i2) {
    }

    public boolean equals(Object obj) {
    }

    public int getNumberOfGroups() {
    }

    public String getOptions() {
    }

    public String getPattern() {
    }

    public int hashCode() {
    }

    boolean matchAnchor(ExpressionTarget expressionTarget, Op op, Context context, int i, int i2) {
    }

    public boolean matches(char[] cArr) {
    }

    void prepare() {
    }

    public void setPattern(String str) throws ParseException {
    }

    public String toString() {
    }

    public RegularExpression(String str, String str2) throws ParseException {
    }

    public boolean matches(char[] cArr, int i, int i2) {
    }

    public void setPattern(String str, Locale locale) throws ParseException {
    }

    private void setPattern(String str, int i, Locale locale) throws ParseException {
    }

    public boolean matches(char[] cArr, Match match) {
    }

    boolean equals(String str, int i) {
    }

    public boolean matches(char[] cArr, int i, int i2, Match match) {
    }

    private Op compile(Token token, Op op, boolean z) {
    }

    static final class Context {
        private CharArrayTarget charArrayTarget;
        private CharacterIteratorTarget characterIteratorTarget;
        ClosureContext[] closureContexts;
        boolean inuse;
        int length;
        int limit;
        Match match;
        int start;
        private StringTarget stringTarget;
        ExpressionTarget target;

        Context() {
        }

        private void resetCommon(int i) {
        }

        void reset(CharacterIterator characterIterator, int i, int i2, int i3) {
        }

        synchronized void setInUse(boolean z) {
        }

        void reset(String str, int i, int i2, int i3) {
        }

        void reset(char[] cArr, int i, int i2, int i3) {
        }
    }

    public RegularExpression(String str, String str2, Locale locale) throws ParseException {
    }

    public void setPattern(String str, String str2) throws ParseException {
    }

    public void setPattern(String str, String str2, Locale locale) throws ParseException {
    }

    RegularExpression(String str, Token token, int i, boolean z, int i2) {
    }

    public boolean matches(String str) {
    }

    public boolean matches(String str, int i, int i2) {
    }

    public boolean matches(String str, Match match) {
    }

    public boolean matches(String str, int i, int i2, Match match) {
    }

    public boolean matches(CharacterIterator characterIterator) {
    }

    public boolean matches(CharacterIterator characterIterator, Match match) {
    }
}
