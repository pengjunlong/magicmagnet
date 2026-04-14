package org.apache.xerces.dom;

import org.apache.xerces.xs.XSTypeDefinition;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ElementNSImpl extends ElementImpl {
    static final long serialVersionUID = -9142310625494392642L;
    static final String xmlURI = "http://www.w3.org/XML/1998/namespace";
    protected String localName;
    protected String namespaceURI;
    transient XSTypeDefinition type;

    protected ElementNSImpl() {
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

    @Override // org.apache.xerces.dom.ElementImpl, org.w3c.dom.TypeInfo
    public String getTypeName() {
    }

    @Override // org.apache.xerces.dom.ElementImpl, org.w3c.dom.TypeInfo
    public String getTypeNamespace() {
    }

    @Override // org.apache.xerces.dom.ElementImpl
    protected Attr getXMLBaseAttribute() {
    }

    @Override // org.apache.xerces.dom.ElementImpl, org.w3c.dom.TypeInfo
    public boolean isDerivedFrom(String str, String str2, int i) {
    }

    void rename(String str, String str2) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setPrefix(String str) throws DOMException {
    }

    public void setType(XSTypeDefinition xSTypeDefinition) {
    }

    protected ElementNSImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2) throws DOMException {
    }

    protected ElementNSImpl(CoreDocumentImpl coreDocumentImpl, String str, String str2, String str3) throws DOMException {
    }

    protected ElementNSImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }
}
