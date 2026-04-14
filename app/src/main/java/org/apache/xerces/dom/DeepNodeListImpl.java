package org.apache.xerces.dom;

import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeepNodeListImpl implements NodeList {
    protected int changes;
    protected boolean enableNS;
    protected ArrayList nodes;
    protected String nsName;
    protected NodeImpl rootNode;
    protected String tagName;

    public DeepNodeListImpl(NodeImpl nodeImpl, String str) {
    }

    @Override // org.w3c.dom.NodeList
    public int getLength() {
    }

    @Override // org.w3c.dom.NodeList
    public Node item(int i) {
    }

    protected Node nextMatchingElementAfter(Node node) {
    }

    public DeepNodeListImpl(NodeImpl nodeImpl, String str, String str2) {
    }
}
