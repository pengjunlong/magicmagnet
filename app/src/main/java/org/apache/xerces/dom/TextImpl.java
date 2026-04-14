package org.apache.xerces.dom;

import org.w3c.dom.CharacterData;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TextImpl extends CharacterDataImpl implements CharacterData, Text {
    static final long serialVersionUID = -5294980852957403469L;

    public TextImpl() {
    }

    private boolean canModifyNext(Node node) {
    }

    private boolean canModifyPrev(Node node) {
    }

    private boolean getWholeTextBackward(Node node, StringBuffer stringBuffer, Node node2) {
    }

    private boolean getWholeTextForward(Node node, StringBuffer stringBuffer, Node node2) {
    }

    private boolean hasTextOnlyChildren(Node node) {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public String getNodeName() {
    }

    @Override // org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public short getNodeType() {
    }

    @Override // org.w3c.dom.Text
    public String getWholeText() {
    }

    protected void insertTextContent(StringBuffer stringBuffer) throws DOMException {
    }

    @Override // org.w3c.dom.Text
    public boolean isElementContentWhitespace() {
    }

    public boolean isIgnorableWhitespace() {
    }

    public String removeData() {
    }

    public void replaceData(String str) {
    }

    @Override // org.w3c.dom.Text
    public Text replaceWholeText(String str) throws DOMException {
    }

    public void setIgnorableWhitespace(boolean z) {
    }

    public void setValues(CoreDocumentImpl coreDocumentImpl, String str) {
    }

    @Override // org.w3c.dom.Text
    public Text splitText(int i) throws DOMException {
    }

    public TextImpl(CoreDocumentImpl coreDocumentImpl, String str) {
    }
}
