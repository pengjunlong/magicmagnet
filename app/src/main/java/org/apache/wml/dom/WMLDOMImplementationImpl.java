package org.apache.wml.dom;

import org.apache.wml.WMLDOMImplementation;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DOMImplementationImpl;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class WMLDOMImplementationImpl extends DOMImplementationImpl implements WMLDOMImplementation {
    static final DOMImplementationImpl singleton = null;

    public static DOMImplementation getDOMImplementation() {
    }

    @Override // org.apache.xerces.dom.DOMImplementationImpl, org.apache.xerces.dom.CoreDOMImplementationImpl
    protected CoreDocumentImpl createDocument(DocumentType documentType) {
    }
}
