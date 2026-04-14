package org.kxml2.kdom;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Element extends Node {
    protected Vector attributes;
    protected String name;
    protected String namespace;
    protected Node parent;
    protected Vector prefixes;

    public void clear() {
    }

    @Override // org.kxml2.kdom.Node
    public Element createElement(String str, String str2) {
    }

    public int getAttributeCount() {
    }

    public String getAttributeName(int i) {
    }

    public String getAttributeNamespace(int i) {
    }

    public String getAttributeValue(int i) {
    }

    public String getAttributeValue(String str, String str2) {
    }

    public String getName() {
    }

    public String getNamespace() {
    }

    public int getNamespaceCount() {
    }

    public String getNamespacePrefix(int i) {
    }

    public String getNamespaceUri(int i) {
    }

    public String getNamespaceUri(String str) {
    }

    public Node getParent() {
    }

    public Node getRoot() {
    }

    public void init() {
    }

    @Override // org.kxml2.kdom.Node
    public void parse(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
    }

    public void setAttribute(String str, String str2, String str3) {
    }

    public void setName(String str) {
    }

    public void setNamespace(String str) {
    }

    protected void setParent(Node node) {
    }

    public void setPrefix(String str, String str2) {
    }

    @Override // org.kxml2.kdom.Node
    public void write(XmlSerializer xmlSerializer) throws IOException {
    }
}
