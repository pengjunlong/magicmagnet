package org.apache.xerces.xs;

import org.w3c.dom.ls.LSInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSImplementation {
    LSInputList createLSInputList(LSInput[] lSInputArr);

    StringList createStringList(String[] strArr);

    XSLoader createXSLoader(StringList stringList) throws XSException;

    StringList getRecognizedVersions();
}
