package org.apache.xerces.impl.xs;

import org.apache.xerces.util.NamespaceSupport;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.QName;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SchemaNamespaceSupport extends NamespaceSupport {
    private SchemaRootContext fSchemaRootContext;

    static final class SchemaRootContext {
        private final QName fAttributeQName;
        boolean fDOMContextBuilt;
        String[] fNamespace;
        int fNamespaceSize;
        private final Element fSchemaRoot;
        private final SymbolTable fSymbolTable;

        SchemaRootContext(Element element, SymbolTable symbolTable) {
        }

        private void declarePrefix(String str, String str2) {
        }

        private void fillQName(QName qName, Node node) {
        }

        void fillNamespaceContext() {
        }

        String getURI(String str) {
        }
    }

    public SchemaNamespaceSupport(Element element, SymbolTable symbolTable) {
    }

    public String[] getEffectiveLocalContext() {
    }

    @Override // org.apache.xerces.util.NamespaceSupport, org.apache.xerces.xni.NamespaceContext
    public String getURI(String str) {
    }

    public void makeGlobal() {
    }

    public void setEffectiveContext(String[] strArr) {
    }

    public SchemaNamespaceSupport(SchemaNamespaceSupport schemaNamespaceSupport) {
    }
}
