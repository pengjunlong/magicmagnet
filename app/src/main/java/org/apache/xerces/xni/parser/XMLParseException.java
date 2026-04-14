package org.apache.xerces.xni.parser;

import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLParseException extends XNIException {
    static final long serialVersionUID = 1732959359448549967L;
    protected String fBaseSystemId;
    protected int fCharacterOffset;
    protected int fColumnNumber;
    protected String fExpandedSystemId;
    protected int fLineNumber;
    protected String fLiteralSystemId;
    protected String fPublicId;

    public XMLParseException(XMLLocator xMLLocator, String str) {
    }

    public String getBaseSystemId() {
    }

    public int getCharacterOffset() {
    }

    public int getColumnNumber() {
    }

    public String getExpandedSystemId() {
    }

    public int getLineNumber() {
    }

    public String getLiteralSystemId() {
    }

    public String getPublicId() {
    }

    @Override // java.lang.Throwable
    public String toString() {
    }

    public XMLParseException(XMLLocator xMLLocator, String str, Exception exc) {
    }
}
