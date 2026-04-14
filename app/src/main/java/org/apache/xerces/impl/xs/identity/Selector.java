package org.apache.xerces.impl.xs.identity;

import org.apache.xerces.impl.xpath.XPathException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.XSTypeDefinition;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Selector {
    protected IdentityConstraint fIDConstraint;
    protected final IdentityConstraint fIdentityConstraint;
    protected final XPath fXPath;

    public class Matcher extends XPathMatcher {
        protected int fElementDepth;
        protected final FieldActivator fFieldActivator;
        protected final int fInitialDepth;
        protected int fMatchedDepth;
        final /* synthetic */ Selector this$0;

        public Matcher(Selector selector, XPath xPath, FieldActivator fieldActivator, int i) {
        }

        @Override // org.apache.xerces.impl.xs.identity.XPathMatcher
        public void endElement(QName qName, XSTypeDefinition xSTypeDefinition, boolean z, Object obj, short s, ShortList shortList) {
        }

        public IdentityConstraint getIdentityConstraint() {
        }

        public int getInitialDepth() {
        }

        @Override // org.apache.xerces.impl.xs.identity.XPathMatcher
        public void startDocumentFragment() {
        }

        @Override // org.apache.xerces.impl.xs.identity.XPathMatcher
        public void startElement(QName qName, XMLAttributes xMLAttributes) {
        }
    }

    public static class XPath extends org.apache.xerces.impl.xpath.XPath {
        public XPath(String str, SymbolTable symbolTable, NamespaceContext namespaceContext) throws XPathException {
        }

        private static String normalize(String str) {
        }
    }

    public Selector(XPath xPath, IdentityConstraint identityConstraint) {
    }

    public XPathMatcher createMatcher(FieldActivator fieldActivator, int i) {
    }

    public IdentityConstraint getIDConstraint() {
    }

    public org.apache.xerces.impl.xpath.XPath getXPath() {
    }

    public String toString() {
    }
}
