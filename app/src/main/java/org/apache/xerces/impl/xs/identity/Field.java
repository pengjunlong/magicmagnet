package org.apache.xerces.impl.xs.identity;

import org.apache.xerces.impl.xpath.XPathException;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xs.ShortList;
import org.apache.xerces.xs.XSTypeDefinition;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Field {
    protected final IdentityConstraint fIdentityConstraint;
    protected final XPath fXPath;

    protected class Matcher extends XPathMatcher {
        protected boolean fMayMatch;
        protected final ValueStore fStore;
        final /* synthetic */ Field this$0;

        public Matcher(Field field, XPath xPath, ValueStore valueStore) {
        }

        private ShortList convertToPrimitiveKind(ShortList shortList) {
        }

        private short convertToPrimitiveKind(short s) {
        }

        @Override // org.apache.xerces.impl.xs.identity.XPathMatcher
        protected void handleContent(XSTypeDefinition xSTypeDefinition, boolean z, Object obj, short s, ShortList shortList) {
        }

        @Override // org.apache.xerces.impl.xs.identity.XPathMatcher
        protected void matched(Object obj, short s, ShortList shortList, boolean z) {
        }
    }

    public static class XPath extends org.apache.xerces.impl.xpath.XPath {
        public XPath(String str, SymbolTable symbolTable, NamespaceContext namespaceContext) throws XPathException {
        }

        private static String fixupXPath(String str) {
        }

        private static String fixupXPath2(String str, int i, int i2) {
        }
    }

    public Field(XPath xPath, IdentityConstraint identityConstraint) {
    }

    public XPathMatcher createMatcher(ValueStore valueStore) {
    }

    public IdentityConstraint getIdentityConstraint() {
    }

    public org.apache.xerces.impl.xpath.XPath getXPath() {
    }

    public String toString() {
    }
}
