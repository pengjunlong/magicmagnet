package org.apache.xerces.dom;

import java.util.ArrayList;
import java.util.Vector;
import org.apache.xerces.impl.RevalidationHandler;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLDocumentHandler;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLDocumentSource;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMNormalizer implements XMLDocumentHandler {
    protected static final boolean DEBUG = false;
    protected static final boolean DEBUG_EVENTS = false;
    protected static final boolean DEBUG_ND = false;
    public static final XMLString EMPTY_STRING = null;
    protected static final String PREFIX = "NS";
    public static final RuntimeException abort = null;
    private boolean fAllWhitespace;
    protected final XMLAttributesProxy fAttrProxy;
    private final QName fAttrQName;
    protected final ArrayList fAttributeList;
    protected DOMConfigurationImpl fConfiguration;
    protected Node fCurrentNode;
    protected CoreDocumentImpl fDocument;
    private final DOMErrorImpl fError;
    protected DOMErrorHandler fErrorHandler;
    protected final NamespaceContext fLocalNSBinder;
    protected final DOMLocatorImpl fLocator;
    protected final NamespaceContext fNamespaceContext;
    protected boolean fNamespaceValidation;
    final XMLString fNormalizedValue;
    protected boolean fPSVI;
    protected final QName fQName;
    protected SymbolTable fSymbolTable;
    protected RevalidationHandler fValidationHandler;

    protected final class XMLAttributesProxy implements XMLAttributes {
        protected AttributeMap fAttributes;
        protected final Vector fAugmentations;
        protected final Vector fDTDTypes;
        protected CoreDocumentImpl fDocument;
        protected ElementImpl fElement;
        final /* synthetic */ DOMNormalizer this$0;

        protected XMLAttributesProxy(DOMNormalizer dOMNormalizer) {
        }

        private String getReportableType(String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public int addAttribute(QName qName, String str, String str2) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public Augmentations getAugmentations(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public Augmentations getAugmentations(String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public Augmentations getAugmentations(String str, String str2) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public int getIndex(String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public int getIndex(String str, String str2) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public int getLength() {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getLocalName(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void getName(int i, QName qName) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getNonNormalizedValue(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getPrefix(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getQName(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getType(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getType(String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getType(String str, String str2) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getURI(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getValue(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getValue(String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public boolean isSpecified(int i) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void removeAllAttributes() {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void removeAttributeAt(int i) {
        }

        public void setAttributes(AttributeMap attributeMap, CoreDocumentImpl coreDocumentImpl, ElementImpl elementImpl) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void setAugmentations(int i, Augmentations augmentations) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void setName(int i, QName qName) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void setNonNormalizedValue(int i, String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void setSpecified(int i, boolean z) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void setType(int i, String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public void setValue(int i, String str) {
        }

        @Override // org.apache.xerces.xni.XMLAttributes
        public String getValue(String str, String str2) {
        }
    }

    public static final void isAttrValueWF(DOMErrorHandler dOMErrorHandler, DOMErrorImpl dOMErrorImpl, DOMLocatorImpl dOMLocatorImpl, NamedNodeMap namedNodeMap, Attr attr, String str, boolean z) {
    }

    public static final void isCDataWF(DOMErrorHandler dOMErrorHandler, DOMErrorImpl dOMErrorImpl, DOMLocatorImpl dOMLocatorImpl, String str, boolean z) {
    }

    public static final void isCommentWF(DOMErrorHandler dOMErrorHandler, DOMErrorImpl dOMErrorImpl, DOMLocatorImpl dOMLocatorImpl, String str, boolean z) {
    }

    public static final void isXMLCharWF(DOMErrorHandler dOMErrorHandler, DOMErrorImpl dOMErrorImpl, DOMLocatorImpl dOMLocatorImpl, String str, boolean z) {
    }

    private void processDTD(String str, String str2) {
    }

    public static final void reportDOMError(DOMErrorHandler dOMErrorHandler, DOMErrorImpl dOMErrorImpl, DOMLocatorImpl dOMLocatorImpl, String str, short s, String str2) {
    }

    protected final void addNamespaceDecl(String str, String str2, ElementImpl elementImpl) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void characters(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void comment(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void doctypeDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void emptyElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endDocument(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endElement(QName qName, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void endGeneralEntity(String str, Augmentations augmentations) throws XNIException {
    }

    protected final void expandEntityRef(Node node, Node node2) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public XMLDocumentSource getDocumentSource() {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void ignorableWhitespace(XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    protected final void namespaceFixUp(ElementImpl elementImpl, AttributeMap attributeMap) {
    }

    final String normalizeAttributeValue(String str, Attr attr) {
    }

    protected void normalizeDocument(CoreDocumentImpl coreDocumentImpl, DOMConfigurationImpl dOMConfigurationImpl) {
    }

    protected Node normalizeNode(Node node) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void processingInstruction(String str, XMLString xMLString, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void setDocumentSource(XMLDocumentSource xMLDocumentSource) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startCDATA(Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startDocument(XMLLocator xMLLocator, String str, NamespaceContext namespaceContext, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startElement(QName qName, XMLAttributes xMLAttributes, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void startGeneralEntity(String str, XMLResourceIdentifier xMLResourceIdentifier, String str2, Augmentations augmentations) throws XNIException {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void textDecl(String str, String str2, Augmentations augmentations) throws XNIException {
    }

    protected final void updateQName(Node node, QName qName) {
    }

    @Override // org.apache.xerces.xni.XMLDocumentHandler
    public void xmlDecl(String str, String str2, String str3, Augmentations augmentations) throws XNIException {
    }
}
