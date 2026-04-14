package org.apache.xerces.dom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NamedNodeMapImpl implements NamedNodeMap, Serializable {
    protected static final short CHANGED = 2;
    protected static final short HASDEFAULTS = 4;
    protected static final short READONLY = 1;
    static final long serialVersionUID = -7039242451046758020L;
    protected short flags;
    protected List nodes;
    protected NodeImpl ownerNode;

    protected NamedNodeMapImpl(NodeImpl nodeImpl) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    protected int addItem(Node node) {
    }

    final boolean changed() {
    }

    protected void cloneContent(NamedNodeMapImpl namedNodeMapImpl) {
    }

    public NamedNodeMapImpl cloneMap(NodeImpl nodeImpl) {
    }

    protected int findNamePoint(String str, int i) {
    }

    protected Object getItem(int i) {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public int getLength() {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node getNamedItem(String str) {
    }

    protected int getNamedItemIndex(String str, String str2) {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node getNamedItemNS(String str, String str2) {
    }

    boolean getReadOnly() {
    }

    final boolean hasDefaults() {
    }

    final boolean isReadOnly() {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node item(int i) {
    }

    protected boolean precedes(Node node, Node node2) {
    }

    public void removeAll() {
    }

    protected void removeItem(int i) {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node removeNamedItem(String str) throws DOMException {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node removeNamedItemNS(String str, String str2) throws DOMException {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node setNamedItem(Node node) throws DOMException {
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node setNamedItemNS(Node node) throws DOMException {
    }

    protected void setOwnerDocument(CoreDocumentImpl coreDocumentImpl) {
    }

    void setReadOnly(boolean z, boolean z2) {
    }

    final void changed(boolean z) {
    }

    final void hasDefaults(boolean z) {
    }

    final void isReadOnly(boolean z) {
    }

    protected ArrayList cloneMap(ArrayList arrayList) {
    }

    protected int findNamePoint(String str, String str2) {
    }
}
