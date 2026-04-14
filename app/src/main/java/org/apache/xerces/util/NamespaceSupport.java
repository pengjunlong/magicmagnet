package org.apache.xerces.util;

import java.util.Enumeration;
import org.apache.xerces.xni.NamespaceContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NamespaceSupport implements NamespaceContext {
    protected int[] fContext;
    protected int fCurrentContext;
    protected String[] fNamespace;
    protected int fNamespaceSize;
    protected String[] fPrefixes;

    protected final class Prefixes implements Enumeration {
        private int counter;
        private String[] prefixes;
        private int size;
        final /* synthetic */ NamespaceSupport this$0;

        public Prefixes(NamespaceSupport namespaceSupport, String[] strArr, int i) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
        }

        public String toString() {
        }
    }

    public NamespaceSupport() {
    }

    public boolean containsPrefix(String str) {
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

    @Override // org.apache.xerces.xni.NamespaceContext
    public String getPrefix(String str) {
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

    public NamespaceSupport(NamespaceContext namespaceContext) {
    }
}
