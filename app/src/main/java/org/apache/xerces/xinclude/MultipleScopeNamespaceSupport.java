package org.apache.xerces.xinclude;

import java.util.Enumeration;
import org.apache.xerces.util.NamespaceSupport;
import org.apache.xerces.xni.NamespaceContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MultipleScopeNamespaceSupport extends NamespaceSupport {
    protected int fCurrentScope;
    protected int[] fScope;

    public MultipleScopeNamespaceSupport() {
    }

    @Override // org.apache.xerces.util.NamespaceSupport, org.apache.xerces.xni.NamespaceContext
    public Enumeration getAllPrefixes() {
    }

    @Override // org.apache.xerces.util.NamespaceSupport, org.apache.xerces.xni.NamespaceContext
    public String getPrefix(String str) {
    }

    public int getScopeForContext(int i) {
    }

    @Override // org.apache.xerces.util.NamespaceSupport, org.apache.xerces.xni.NamespaceContext
    public String getURI(String str) {
    }

    public void popScope() {
    }

    public void pushScope() {
    }

    @Override // org.apache.xerces.util.NamespaceSupport, org.apache.xerces.xni.NamespaceContext
    public void reset() {
    }

    public String getPrefix(String str, int i) {
    }

    public String getURI(String str, int i) {
    }

    public String getPrefix(String str, int i, int i2) {
    }

    public String getURI(String str, int i, int i2) {
    }

    public MultipleScopeNamespaceSupport(NamespaceContext namespaceContext) {
    }
}
