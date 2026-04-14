package org.apache.xerces.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class CharacterDataImpl extends ChildNode {
    static final long serialVersionUID = 7931170150428474230L;
    private static transient NodeList singletonNodeList;
    protected String data;

    /* renamed from: org.apache.xerces.dom.CharacterDataImpl$1 */
    static class C17711 implements NodeList {
        C17711() {
        }

        @Override // org.w3c.dom.NodeList
        public int getLength() {
        }

        @Override // org.w3c.dom.NodeList
        public Node item(int i) {
        }
    }

    public CharacterDataImpl() {
    }

    public void appendData(String str) {
    }

    public void deleteData(int i, int i2) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public NodeList getChildNodes() {
    }

    public String getData() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.NodeList
    public int getLength() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeValue() {
    }

    public void insertData(int i, String str) throws DOMException {
    }

    void internalDeleteData(int i, int i2, boolean z) throws DOMException {
    }

    void internalInsertData(int i, String str, boolean z) throws DOMException {
    }

    public void replaceData(int i, int i2, String str) throws DOMException {
    }

    public void setData(String str) throws DOMException {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public void setNodeValue(String str) {
    }

    protected void setNodeValueInternal(String str) {
    }

    public String substringData(int i, int i2) throws DOMException {
    }

    protected CharacterDataImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }

    protected void setNodeValueInternal(String str, boolean z) {
    }
}
