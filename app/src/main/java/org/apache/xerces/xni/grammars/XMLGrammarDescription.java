package org.apache.xerces.xni.grammars;

import org.apache.xerces.xni.XMLResourceIdentifier;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XMLGrammarDescription extends XMLResourceIdentifier {
    public static final String XML_DTD = "http://www.w3.org/TR/REC-xml";
    public static final String XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

    String getGrammarType();
}
