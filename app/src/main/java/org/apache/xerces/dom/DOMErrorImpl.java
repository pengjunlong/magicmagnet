package org.apache.xerces.dom;

import org.apache.xerces.xni.parser.XMLParseException;
import org.w3c.dom.DOMError;
import org.w3c.dom.DOMLocator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMErrorImpl implements DOMError {
    public Exception fException;
    public DOMLocatorImpl fLocator;
    public String fMessage;
    public Object fRelatedData;
    public short fSeverity;
    public String fType;

    public DOMErrorImpl() {
    }

    private DOMLocatorImpl createDOMLocator(XMLParseException xMLParseException) {
    }

    @Override // org.w3c.dom.DOMError
    public DOMLocator getLocation() {
    }

    @Override // org.w3c.dom.DOMError
    public String getMessage() {
    }

    @Override // org.w3c.dom.DOMError
    public Object getRelatedData() {
    }

    @Override // org.w3c.dom.DOMError
    public Object getRelatedException() {
    }

    @Override // org.w3c.dom.DOMError
    public short getSeverity() {
    }

    @Override // org.w3c.dom.DOMError
    public String getType() {
    }

    public void reset() {
    }

    public DOMErrorImpl(short s, XMLParseException xMLParseException) {
    }
}
