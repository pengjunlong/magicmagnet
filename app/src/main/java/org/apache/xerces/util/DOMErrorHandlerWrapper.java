package org.apache.xerces.util;

import java.io.PrintWriter;
import java.util.Hashtable;
import org.apache.xerces.dom.DOMErrorImpl;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLParseException;
import org.w3c.dom.DOMError;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.Node;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMErrorHandlerWrapper implements XMLErrorHandler, DOMErrorHandler {
    boolean eStatus;
    public Node fCurrentNode;
    protected final DOMErrorImpl fDOMError;
    protected DOMErrorHandler fDomErrorHandler;
    protected final XMLErrorCode fErrorCode;
    protected PrintWriter fOut;

    private static class DOMErrorTypeMap {
        private static Hashtable fgDOMErrorTypeTable;

        private DOMErrorTypeMap() {
        }

        public static String getDOMErrorType(XMLErrorCode xMLErrorCode) {
        }
    }

    public DOMErrorHandlerWrapper() {
    }

    private void printError(DOMError dOMError) {
    }

    @Override // org.apache.xerces.xni.parser.XMLErrorHandler
    public void error(String str, String str2, XMLParseException xMLParseException) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLErrorHandler
    public void fatalError(String str, String str2, XMLParseException xMLParseException) throws XNIException {
    }

    public DOMErrorHandler getErrorHandler() {
    }

    @Override // org.w3c.dom.DOMErrorHandler
    public boolean handleError(DOMError dOMError) {
    }

    public void setErrorHandler(DOMErrorHandler dOMErrorHandler) {
    }

    @Override // org.apache.xerces.xni.parser.XMLErrorHandler
    public void warning(String str, String str2, XMLParseException xMLParseException) throws XNIException {
    }

    public DOMErrorHandlerWrapper(DOMErrorHandler dOMErrorHandler) {
    }
}
