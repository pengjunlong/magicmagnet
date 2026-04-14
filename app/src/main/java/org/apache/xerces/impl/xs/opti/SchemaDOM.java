package org.apache.xerces.impl.xs.opti;

import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLString;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SchemaDOM extends DefaultDocument {
    static final int relationsColResizeFactor = 10;
    static final int relationsRowResizeFactor = 15;
    int currLoc;
    private StringBuffer fAnnotationBuffer;
    boolean hidden;
    boolean inCDATA;
    int nextFreeLoc;
    ElementImpl parent;
    NodeImpl[][] relations;

    private static String escapeAttValue(String str, int i) {
    }

    public static void indent(int i) {
    }

    private static String processAttValue(String str) {
    }

    private void processElement(QName qName, XMLAttributes xMLAttributes, ElementImpl elementImpl) {
    }

    private void resizeRelations() {
    }

    public static void traverse(Node node, int i) {
    }

    void characters(XMLString xMLString) {
    }

    void charactersRaw(String str) {
    }

    void comment(XMLString xMLString) {
    }

    public ElementImpl emptyElement(QName qName, XMLAttributes xMLAttributes, int i, int i2, int i3) {
    }

    void endAnnotation(QName qName, ElementImpl elementImpl) {
    }

    void endAnnotationCDATA() {
    }

    void endAnnotationElement(QName qName) {
    }

    public void endElement() {
    }

    void endSyntheticAnnotationElement(QName qName, boolean z) {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultDocument, org.w3c.dom.Document
    public Element getDocumentElement() {
    }

    @Override // org.apache.xerces.impl.xs.opti.DefaultDocument, org.w3c.dom.Document
    public DOMImplementation getImplementation() {
    }

    public void printDOM() {
    }

    void processingInstruction(String str, XMLString xMLString) {
    }

    public void reset() {
    }

    void startAnnotation(QName qName, XMLAttributes xMLAttributes, NamespaceContext namespaceContext) {
    }

    void startAnnotationCDATA() {
    }

    void startAnnotationElement(QName qName, XMLAttributes xMLAttributes) {
    }

    public ElementImpl startElement(QName qName, XMLAttributes xMLAttributes, int i, int i2, int i3) {
    }

    void endAnnotationElement(String str) {
    }

    void endSyntheticAnnotationElement(String str, boolean z) {
    }

    void startAnnotation(String str, XMLAttributes xMLAttributes, NamespaceContext namespaceContext) {
    }

    void startAnnotationElement(String str, XMLAttributes xMLAttributes) {
    }

    public ElementImpl emptyElement(QName qName, XMLAttributes xMLAttributes, int i, int i2) {
    }

    public ElementImpl startElement(QName qName, XMLAttributes xMLAttributes, int i, int i2) {
    }

    private void resizeRelations(int i) {
    }
}
