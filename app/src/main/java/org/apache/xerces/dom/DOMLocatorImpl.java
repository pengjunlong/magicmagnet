package org.apache.xerces.dom;

import org.w3c.dom.DOMLocator;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMLocatorImpl implements DOMLocator {
    public int fByteOffset;
    public int fColumnNumber;
    public int fLineNumber;
    public Node fRelatedNode;
    public String fUri;
    public int fUtf16Offset;

    public DOMLocatorImpl() {
    }

    @Override // org.w3c.dom.DOMLocator
    public int getByteOffset() {
    }

    @Override // org.w3c.dom.DOMLocator
    public int getColumnNumber() {
    }

    @Override // org.w3c.dom.DOMLocator
    public int getLineNumber() {
    }

    @Override // org.w3c.dom.DOMLocator
    public Node getRelatedNode() {
    }

    @Override // org.w3c.dom.DOMLocator
    public String getUri() {
    }

    @Override // org.w3c.dom.DOMLocator
    public int getUtf16Offset() {
    }

    public DOMLocatorImpl(int i, int i2, String str) {
    }

    public DOMLocatorImpl(int i, int i2, int i3, String str) {
    }

    public DOMLocatorImpl(int i, int i2, int i3, Node node, String str) {
    }

    public DOMLocatorImpl(int i, int i2, int i3, Node node, String str, int i4) {
    }
}
