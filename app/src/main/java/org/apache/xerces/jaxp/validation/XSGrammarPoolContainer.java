package org.apache.xerces.jaxp.validation;

import org.apache.xerces.xni.grammars.XMLGrammarPool;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSGrammarPoolContainer {
    Boolean getFeature(String str);

    XMLGrammarPool getGrammarPool();

    boolean isFullyComposed();
}
