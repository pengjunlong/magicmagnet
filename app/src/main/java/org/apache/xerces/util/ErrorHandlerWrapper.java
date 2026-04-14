package org.apache.xerces.util;

import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLParseException;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ErrorHandlerWrapper implements XMLErrorHandler {
    protected ErrorHandler fErrorHandler;

    /* renamed from: org.apache.xerces.util.ErrorHandlerWrapper$1 */
    static class C18191 implements XMLLocator {
        final /* synthetic */ int val$fColumnNumber;
        final /* synthetic */ String val$fExpandedSystemId;
        final /* synthetic */ int val$fLineNumber;
        final /* synthetic */ String val$fPublicId;

        C18191(String str, String str2, int i, int i2) {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public String getBaseSystemId() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public int getCharacterOffset() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public int getColumnNumber() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public String getEncoding() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public String getExpandedSystemId() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public int getLineNumber() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public String getLiteralSystemId() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public String getPublicId() {
        }

        @Override // org.apache.xerces.xni.XMLLocator
        public String getXMLVersion() {
        }
    }

    public ErrorHandlerWrapper() {
    }

    protected static SAXParseException createSAXParseException(XMLParseException xMLParseException) {
    }

    protected static XMLParseException createXMLParseException(SAXParseException sAXParseException) {
    }

    protected static XNIException createXNIException(SAXException sAXException) {
    }

    @Override // org.apache.xerces.xni.parser.XMLErrorHandler
    public void error(String str, String str2, XMLParseException xMLParseException) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLErrorHandler
    public void fatalError(String str, String str2, XMLParseException xMLParseException) throws XNIException {
    }

    public ErrorHandler getErrorHandler() {
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
    }

    @Override // org.apache.xerces.xni.parser.XMLErrorHandler
    public void warning(String str, String str2, XMLParseException xMLParseException) throws XNIException {
    }

    public ErrorHandlerWrapper(ErrorHandler errorHandler) {
    }
}
