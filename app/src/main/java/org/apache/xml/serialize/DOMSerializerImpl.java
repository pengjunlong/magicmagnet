package org.apache.xml.serialize;

import org.apache.xerces.dom.DOMErrorImpl;
import org.apache.xerces.dom.DOMLocatorImpl;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMStringList;
import org.w3c.dom.Node;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.w3c.dom.ls.LSSerializerFilter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMSerializerImpl implements LSSerializer, DOMConfiguration {
    protected static final short CDATA = 8;
    protected static final short COMMENTS = 32;
    protected static final short DISCARDDEFAULT = 64;
    protected static final short DOM_ELEMENT_CONTENT_WHITESPACE = 1024;
    protected static final short ENTITIES = 4;
    protected static final short INFOSET = 128;
    protected static final short NAMESPACES = 1;
    protected static final short NSDECL = 512;
    protected static final short PRETTY_PRINT = 2048;
    protected static final short SPLITCDATA = 16;
    protected static final short WELLFORMED = 2;
    protected static final short XMLDECL = 256;
    private final DOMErrorImpl fError;
    private DOMErrorHandler fErrorHandler;
    private final DOMLocatorImpl fLocator;
    private DOMStringList fRecognizedParameters;
    protected short features;
    private XMLSerializer serializer;
    private XML11Serializer xml11Serializer;

    static class DocumentMethods {
        private static java.lang.reflect.Method fgDocumentGetInputEncodingMethod = null;
        private static java.lang.reflect.Method fgDocumentGetXmlEncodingMethod = null;
        private static java.lang.reflect.Method fgDocumentGetXmlVersionMethod = null;
        private static boolean fgDocumentMethodsAvailable = false;

        private DocumentMethods() {
        }

        static /* synthetic */ boolean access$000() {
        }

        static /* synthetic */ java.lang.reflect.Method access$100() {
        }

        static /* synthetic */ java.lang.reflect.Method access$200() {
        }

        static /* synthetic */ java.lang.reflect.Method access$300() {
        }
    }

    private String _getInputEncoding(Node node) {
    }

    private String _getXmlEncoding(Node node) {
    }

    private String _getXmlVersion(Node node) {
    }

    private void copySettings(XMLSerializer xMLSerializer, XMLSerializer xMLSerializer2) {
    }

    private void initSerializer(XMLSerializer xMLSerializer) {
    }

    private void prepareForSerialization(XMLSerializer xMLSerializer, Node node) {
    }

    private void verify(Node node, boolean z, boolean z2) {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public boolean canSetParameter(String str, Object obj) {
    }

    @Override // org.w3c.dom.ls.LSSerializer
    public DOMConfiguration getDomConfig() {
    }

    public LSSerializerFilter getFilter() {
    }

    @Override // org.w3c.dom.ls.LSSerializer
    public String getNewLine() {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public Object getParameter(String str) throws DOMException {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public DOMStringList getParameterNames() {
    }

    public void setFilter(LSSerializerFilter lSSerializerFilter) {
    }

    @Override // org.w3c.dom.ls.LSSerializer
    public void setNewLine(String str) {
    }

    @Override // org.w3c.dom.DOMConfiguration
    public void setParameter(String str, Object obj) throws DOMException {
    }

    @Override // org.w3c.dom.ls.LSSerializer
    public boolean write(Node node, LSOutput lSOutput) throws LSException {
    }

    @Override // org.w3c.dom.ls.LSSerializer
    public String writeToString(Node node) throws DOMException, LSException {
    }

    @Override // org.w3c.dom.ls.LSSerializer
    public boolean writeToURI(Node node, String str) throws LSException {
    }
}
