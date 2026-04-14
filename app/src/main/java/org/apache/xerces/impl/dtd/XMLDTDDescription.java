package org.apache.xerces.impl.dtd;

import java.util.ArrayList;
import java.util.Vector;
import org.apache.xerces.util.XMLResourceIdentifierImpl;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLDTDDescription extends XMLResourceIdentifierImpl implements org.apache.xerces.xni.grammars.XMLDTDDescription {
    protected ArrayList fPossibleRoots;
    protected String fRootName;

    public XMLDTDDescription(XMLResourceIdentifier xMLResourceIdentifier, String str) {
    }

    public boolean equals(Object obj) {
    }

    @Override // org.apache.xerces.xni.grammars.XMLGrammarDescription
    public String getGrammarType() {
    }

    @Override // org.apache.xerces.xni.grammars.XMLDTDDescription
    public String getRootName() {
    }

    @Override // org.apache.xerces.util.XMLResourceIdentifierImpl
    public int hashCode() {
    }

    public void setPossibleRoots(ArrayList arrayList) {
    }

    public void setRootName(String str) {
    }

    public void setPossibleRoots(Vector vector) {
    }

    public XMLDTDDescription(String str, String str2, String str3, String str4, String str5) {
    }

    public XMLDTDDescription(XMLInputSource xMLInputSource) {
    }
}
