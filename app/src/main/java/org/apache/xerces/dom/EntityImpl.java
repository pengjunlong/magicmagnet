package org.apache.xerces.dom;

import org.w3c.dom.Entity;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class EntityImpl extends ParentNode implements Entity {
    static final long serialVersionUID = -3575760943444303423L;
    protected String baseURI;
    protected String encoding;
    protected String inputEncoding;
    protected String name;
    protected String notationName;
    protected String publicId;
    protected String systemId;
    protected String version;

    public EntityImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }

    @Override // org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.ChildNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getBaseURI() {
    }

    @Override // org.w3c.dom.Entity
    public String getInputEncoding() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public short getNodeType() {
    }

    @Override // org.w3c.dom.Entity
    public String getNotationName() {
    }

    @Override // org.w3c.dom.Entity
    public String getPublicId() {
    }

    @Override // org.w3c.dom.Entity
    public String getSystemId() {
    }

    @Override // org.w3c.dom.Entity
    public String getXmlEncoding() {
    }

    @Override // org.w3c.dom.Entity
    public String getXmlVersion() {
    }

    public void setBaseURI(String str) {
    }

    public void setInputEncoding(String str) {
    }

    public void setNotationName(String str) {
    }

    public void setPublicId(String str) {
    }

    public void setSystemId(String str) {
    }

    public void setXmlEncoding(String str) {
    }

    public void setXmlVersion(String str) {
    }
}
