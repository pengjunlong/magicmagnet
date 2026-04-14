package org.apache.wml.dom;

import java.util.Hashtable;
import org.apache.wml.WMLDocument;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.ElementImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class WMLDocumentImpl extends DocumentImpl implements WMLDocument {
    private static final Class[] _elemClassSigWML = null;
    private static Hashtable _elementTypesWML = null;
    private static final long serialVersionUID = -6582904849512384104L;

    public WMLDocumentImpl(DocumentType documentType) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    protected boolean canRenameElements(String str, String str2, ElementImpl elementImpl) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl, org.w3c.dom.Document
    public Element createElement(String str) throws DOMException {
    }
}
