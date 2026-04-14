package org.apache.xerces.xni.parser;

import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XMLErrorHandler {
    void error(String str, String str2, XMLParseException xMLParseException) throws XNIException;

    void fatalError(String str, String str2, XMLParseException xMLParseException) throws XNIException;

    void warning(String str, String str2, XMLParseException xMLParseException) throws XNIException;
}
