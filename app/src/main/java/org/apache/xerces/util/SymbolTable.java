package org.apache.xerces.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SymbolTable {
    protected static final int TABLE_SIZE = 101;
    protected Entry[] fBuckets;
    protected transient int fCount;
    protected float fLoadFactor;
    protected int fTableSize;
    protected int fThreshold;

    public SymbolTable(int i, float f) {
    }

    public String addSymbol(String str) {
    }

    public boolean containsSymbol(String str) {
    }

    public int hash(String str) {
    }

    protected void rehash() {
    }

    public int hash(char[] cArr, int i, int i2) {
    }

    protected static final class Entry {
        public final char[] characters;
        public Entry next;
        public final String symbol;

        public Entry(String str, Entry entry) {
        }

        public Entry(char[] cArr, int i, int i2, Entry entry) {
        }
    }

    public boolean containsSymbol(char[] cArr, int i, int i2) {
    }

    public SymbolTable(int i) {
    }

    public SymbolTable() {
    }

    public String addSymbol(char[] cArr, int i, int i2) {
    }
}
