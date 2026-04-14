package org.apache.xerces.jaxp.validation;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.grammars.XMLGrammarPool;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SoftReferenceGrammarPool implements XMLGrammarPool {
    protected static final int TABLE_SIZE = 11;
    protected static final Grammar[] ZERO_LENGTH_GRAMMAR_ARRAY = null;
    protected int fGrammarCount;
    protected Entry[] fGrammars;
    protected boolean fPoolIsLocked;
    protected final ReferenceQueue fReferenceQueue;

    static final class Entry {
        public int bucket;
        public XMLGrammarDescription desc;
        public SoftGrammarReference grammar;
        public int hash;
        public Entry next;
        public Entry prev;

        protected Entry(int i, int i2, XMLGrammarDescription xMLGrammarDescription, Grammar grammar, Entry entry, ReferenceQueue referenceQueue) {
        }

        protected void clear() {
        }
    }

    static final class SoftGrammarReference extends SoftReference {
        public Entry entry;

        protected SoftGrammarReference(Entry entry, Grammar grammar, ReferenceQueue referenceQueue) {
        }
    }

    public SoftReferenceGrammarPool() {
    }

    private void clean() {
    }

    private Grammar removeEntry(Entry entry) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
    public void cacheGrammars(String str, Grammar[] grammarArr) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
    public void clear() {
    }

    public boolean containsGrammar(XMLGrammarDescription xMLGrammarDescription) {
    }

    public boolean equals(XMLGrammarDescription xMLGrammarDescription, XMLGrammarDescription xMLGrammarDescription2) {
    }

    public Grammar getGrammar(XMLGrammarDescription xMLGrammarDescription) {
    }

    public int hashCode(XMLGrammarDescription xMLGrammarDescription) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
    public void lockPool() {
    }

    public void putGrammar(Grammar grammar) {
    }

    public Grammar removeGrammar(XMLGrammarDescription xMLGrammarDescription) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
    public Grammar retrieveGrammar(XMLGrammarDescription xMLGrammarDescription) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
    public Grammar[] retrieveInitialGrammarSet(String str) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarPool
    public void unlockPool() {
    }

    public SoftReferenceGrammarPool(int i) {
    }
}
