package org.apache.xerces.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SoftReferenceSymbolTable extends SymbolTable {
    protected SREntry[] fBuckets;
    private final ReferenceQueue fReferenceQueue;

    public SoftReferenceSymbolTable(int i, float f) {
    }

    private void clean() {
    }

    private void removeEntry(SREntry sREntry) {
    }

    @Override // org.apache.xerces.util.SymbolTable
    public String addSymbol(String str) {
    }

    @Override // org.apache.xerces.util.SymbolTable
    public boolean containsSymbol(String str) {
    }

    @Override // org.apache.xerces.util.SymbolTable
    protected void rehash() {
    }

    protected static final class SREntry extends SoftReference {
        public int bucket;
        public SREntry next;
        public SREntry prev;

        public SREntry(String str, SREntry sREntry, int i, ReferenceQueue referenceQueue) {
        }

        private void initialize(SREntry sREntry, int i) {
        }

        public SREntry(String str, char[] cArr, int i, int i2, SREntry sREntry, int i3, ReferenceQueue referenceQueue) {
        }
    }

    protected static final class SREntryData {
        public final char[] characters;
        public final String symbol;

        public SREntryData(String str) {
        }

        public SREntryData(String str, char[] cArr, int i, int i2) {
        }
    }

    @Override // org.apache.xerces.util.SymbolTable
    public boolean containsSymbol(char[] cArr, int i, int i2) {
    }

    public SoftReferenceSymbolTable(int i) {
    }

    public SoftReferenceSymbolTable() {
    }

    @Override // org.apache.xerces.util.SymbolTable
    public String addSymbol(char[] cArr, int i, int i2) {
    }
}
