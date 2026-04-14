package org.apache.xerces.impl.xs;

import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSNamespaceItem;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSAnnotationImpl implements XSAnnotation {
    private String fData;
    private SchemaGrammar fGrammar;

    public XSAnnotationImpl(String str, SchemaGrammar schemaGrammar) {
    }

    private synchronized void writeToDOM(Node node, short s) {
    }

    private synchronized void writeToSAX(ContentHandler contentHandler) {
    }

    @Override // org.apache.xerces.xs.XSAnnotation
    public String getAnnotationString() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getName() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getNamespace() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public XSNamespaceItem getNamespaceItem() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    @Override // org.apache.xerces.xs.XSAnnotation
    public boolean writeAnnotation(Object obj, short s) {
    }
}
