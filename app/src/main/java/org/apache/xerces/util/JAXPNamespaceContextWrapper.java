package org.apache.xerces.util;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import org.apache.xerces.xni.NamespaceContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class JAXPNamespaceContextWrapper implements NamespaceContext {
    private final Vector fAllPrefixes;
    private int[] fContext;
    private int fCurrentContext;
    private org.javax.xml.namespace.NamespaceContext fNamespaceContext;
    private List fPrefixes;
    private SymbolTable fSymbolTable;

    public JAXPNamespaceContextWrapper(SymbolTable symbolTable) {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public boolean declarePrefix(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public Enumeration getAllPrefixes() {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public String getDeclaredPrefixAt(int i) {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public int getDeclaredPrefixCount() {
    }

    public List getDeclaredPrefixes() {
    }

    public org.javax.xml.namespace.NamespaceContext getNamespaceContext() {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public String getPrefix(String str) {
    }

    public SymbolTable getSymbolTable() {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public String getURI(String str) {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public void popContext() {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public void pushContext() {
    }

    @Override // org.apache.xerces.xni.NamespaceContext
    public void reset() {
    }

    public void setDeclaredPrefixes(List list) {
    }

    public void setNamespaceContext(org.javax.xml.namespace.NamespaceContext namespaceContext) {
    }

    public void setSymbolTable(SymbolTable symbolTable) {
    }
}
