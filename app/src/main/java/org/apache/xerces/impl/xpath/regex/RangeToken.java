package org.apache.xerces.impl.xpath.regex;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class RangeToken extends Token {
    private static final int MAPSIZE = 256;
    private static final long serialVersionUID = -553983121197679934L;
    boolean compacted;
    RangeToken icaseCache;
    int[] map;
    int nonMapIndex;
    int[] ranges;
    boolean sorted;

    RangeToken(int i) {
    }

    static Token complementRanges(Token token) {
    }

    private void createMap() {
    }

    private static String escapeCharInCharClass(int i) {
    }

    private final boolean isCompacted() {
    }

    private final boolean isSorted() {
    }

    private final void setCompacted() {
    }

    private final void setSorted(boolean z) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    protected void addRange(int i, int i2) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    protected void compactRanges() {
    }

    void dumpRanges() {
    }

    synchronized RangeToken getCaseInsensitiveToken() {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    protected void intersectRanges(Token token) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    boolean match(int i) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    protected void mergeRanges(Token token) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    protected void sortRanges() {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    protected void subtractRanges(Token token) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.Token
    public String toString(int i) {
    }
}
