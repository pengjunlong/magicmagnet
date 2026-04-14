package org.apache.xerces.xni.grammars;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XMLGrammarPool {
    void cacheGrammars(String str, Grammar[] grammarArr);

    void clear();

    void lockPool();

    Grammar retrieveGrammar(XMLGrammarDescription xMLGrammarDescription);

    Grammar[] retrieveInitialGrammarSet(String str);

    void unlockPool();
}
