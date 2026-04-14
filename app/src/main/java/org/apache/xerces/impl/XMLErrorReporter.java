package org.apache.xerces.impl;

import java.util.Hashtable;
import java.util.Locale;
import org.apache.xerces.util.ErrorHandlerProxy;
import org.apache.xerces.util.MessageFormatter;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.parser.XMLComponent;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.xml.sax.ErrorHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLErrorReporter implements XMLComponent {
    protected static final String CONTINUE_AFTER_FATAL_ERROR = "http://apache.org/xml/features/continue-after-fatal-error";
    protected static final String ERROR_HANDLER = "http://apache.org/xml/properties/internal/error-handler";
    private static final Boolean[] FEATURE_DEFAULTS = null;
    private static final Object[] PROPERTY_DEFAULTS = null;
    private static final String[] RECOGNIZED_FEATURES = null;
    private static final String[] RECOGNIZED_PROPERTIES = null;
    public static final short SEVERITY_ERROR = 1;
    public static final short SEVERITY_FATAL_ERROR = 2;
    public static final short SEVERITY_WARNING = 0;
    protected boolean fContinueAfterFatalError;
    protected XMLErrorHandler fDefaultErrorHandler;
    protected XMLErrorHandler fErrorHandler;
    protected Locale fLocale;
    protected XMLLocator fLocator;
    protected Hashtable fMessageFormatters;
    private ErrorHandler fSaxProxy;

    /* renamed from: org.apache.xerces.impl.XMLErrorReporter$1 */
    class C17831 extends ErrorHandlerProxy {
        final /* synthetic */ XMLErrorReporter this$0;

        C17831(XMLErrorReporter xMLErrorReporter) {
        }

        @Override // org.apache.xerces.util.ErrorHandlerProxy
        protected XMLErrorHandler getErrorHandler() {
        }
    }

    public XMLErrorHandler getErrorHandler() {
    }

    public boolean getFeature(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Boolean getFeatureDefault(String str) {
    }

    public Locale getLocale() {
    }

    public MessageFormatter getMessageFormatter(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public Object getPropertyDefault(String str) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedFeatures() {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public String[] getRecognizedProperties() {
    }

    public ErrorHandler getSAXErrorHandler() {
    }

    public void putMessageFormatter(String str, MessageFormatter messageFormatter) {
    }

    public MessageFormatter removeMessageFormatter(String str) {
    }

    public String reportError(String str, String str2, Object[] objArr, short s) throws XNIException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void reset(XMLComponentManager xMLComponentManager) throws XNIException {
    }

    public void setDocumentLocator(XMLLocator xMLLocator) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    public void setLocale(Locale locale) {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponent
    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public String reportError(String str, String str2, Object[] objArr, short s, Exception exc) throws XNIException {
    }

    public String reportError(XMLLocator xMLLocator, String str, String str2, Object[] objArr, short s) throws XNIException {
    }

    public String reportError(XMLLocator xMLLocator, String str, String str2, Object[] objArr, short s, Exception exc) throws XNIException {
    }
}
