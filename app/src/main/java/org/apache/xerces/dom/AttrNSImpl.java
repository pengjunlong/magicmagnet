package org.apache.xerces.dom;

import org.w3c.dom.DOMException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AttrNSImpl extends AttrImpl {
    static final long serialVersionUID = -781906615369795414L;
    static final String xmlURI = "http://www.w3.org/XML/1998/namespace";
    static final String xmlnsURI = "http://www.w3.org/2000/xmlns/";
    protected String localName;
    protected String namespaceURI;

    public AttrNSImpl() {
    }

    private void setName(String str, String str2) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getLocalName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNamespaceURI() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getPrefix() {
    }

    @Override // org.apache.xerces.dom.AttrImpl, org.w3c.dom.TypeInfo
    public String getTypeName() {
    }

    @Override // org.apache.xerces.dom.AttrImpl, org.w3c.dom.TypeInfo
    public String getTypeNamespace() {
    }

    @Override // org.apache.xerces.dom.AttrImpl, org.w3c.dom.TypeInfo
    public boolean isDerivedFrom(String str, String str2, int i) {
    }

    void rename(String str, String str2) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setPrefix(String str) throws DOMException {
    }

    protected AttrNSImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2) {
    }

    public AttrNSImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2, String str3) {
    }

    protected AttrNSImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }
}
