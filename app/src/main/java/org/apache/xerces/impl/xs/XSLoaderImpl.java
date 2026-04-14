package org.apache.xerces.impl.xs;

import org.apache.xerces.impl.xs.util.XSGrammarPool;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xs.LSInputList;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSLoader;
import org.apache.xerces.xs.XSModel;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMStringList;
import org.w3c.dom.ls.LSInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class XSLoaderImpl implements XSLoader, DOMConfiguration {
    private final XSGrammarPool fGrammarPool;
    private final XMLSchemaLoader fSchemaLoader;

    private static final class XSGrammarMerger extends XSGrammarPool {
        private void mergeSchemaGrammars(SchemaGrammar schemaGrammar, SchemaGrammar schemaGrammar2) {
        }

        private SchemaGrammar toSchemaGrammar(Grammar grammar) {
        }

        @Override // org.apache.xerces.util.XMLGrammarPoolImpl
        public boolean containsGrammar(XMLGrammarDescription xMLGrammarDescription) {
        }

        @Override // org.apache.xerces.util.XMLGrammarPoolImpl
        public Grammar getGrammar(XMLGrammarDescription xMLGrammarDescription) {
        }

        @Override // org.apache.xerces.util.XMLGrammarPoolImpl
        public void putGrammar(Grammar grammar) {
        }

        @Override // org.apache.xerces.util.XMLGrammarPoolImpl, org.apache.xerces.xni.grammars.XMLGrammarPool
        public Grammar retrieveGrammar(XMLGrammarDescription xMLGrammarDescription) {
        }

        @Override // org.apache.xerces.util.XMLGrammarPoolImpl, org.apache.xerces.xni.grammars.XMLGrammarPool
        public Grammar[] retrieveInitialGrammarSet(String str) {
        }
    }

    @Override // org.w3c.dom.DOMConfiguration
    public boolean canSetParameter(String str, Object obj) {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public DOMConfiguration getConfig() {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public Object getParameter(String str) throws DOMException {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public DOMStringList getParameterNames() {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel load(LSInput lSInput) {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel loadInputList(LSInputList lSInputList) {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel loadURI(String str) {
    }

    @Override // org.apache.xerces.xs.XSLoader
    public XSModel loadURIList(StringList stringList) {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public void setParameter(String str, Object obj) throws DOMException {
    }
}
